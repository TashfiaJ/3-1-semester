#include<bits/stdc++.h>
using namespace std;
#define ll long long

vector<ll>g[10];
ll node, element, total_operation;
map<char,vector<string>>mp;
bool Cycle=false;
bool vis[10];

void dfs(ll node)
{
    if(Cycle)return;
    vis[node]=1;
    for(auto x: g[node])
    {   
        if(!vis[x])dfs(x);
        if(vis[node] && x!=node)
        {
            Cycle=true;
            return;
        }
    }
}

int main()
{   
    freopen("input.txt", "r", stdin);
    char c1, c2, c3;
    while(cin>>c1>>c2>>c3){
    string s="";
    s+=c1;
    s+=c2;
    mp[c3].push_back(s);}
    for(auto x: mp){
        for(ll i=0;i<x.second.size();i++)
        {   
            bool flag=false;
            for(ll j=i+1;j<x.second.size();j++)
            {   
                for(ll k=0;k<g[x.second[i][1]-'0'].size();k++)
                {
                    if(g[x.second[i][1]-'0'][k]==x.second[j][1]-'0')
                    {
                        flag=true;break;
                    }
                }
                if(!flag){
                if(x.second[i][0]=='r')
                {
                    if(x.second[j][0]=='w')
                    {
                        g[x.second[i][1]-'0'].push_back(x.second[j][1]-'0');
                        
                    }
                }
                else
                {
                    
                        g[x.second[i][1]-'0'].push_back(x.second[j][1]-'0');
                    
                }
            }}
        }
    }
    dfs(2);
    // for(ll i=1;i<=node;i++)
    // {
    //     if(!vis[i])
    //     {
    //         dfs(i);
    //     }
    // }
    if(Cycle)
    {
        cout<<"Cycle detected. Not conflict serializable\n";
    }
    else
    {
        cout<<"No cycle. Conflict serializable\n";
    }
}
