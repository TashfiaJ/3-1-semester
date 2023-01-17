#include<bits/stdc++.h>
using namespace std;
#define ll long long
const ll N = 2e5+5;
vector<ll>g[N];
ll node, element, total_operation;
map<char,vector<string>>mp;
bool Cycle=false;
ll vis[N];
set<char>st;

void dfs(ll node)
{
    
    vis[node]=1;
    for(auto x: g[node])
    {   
        if(vis[x]==0)dfs(x);
        if(vis[x]==1)
        {
            Cycle=true;
            return;
        }
        if(vis[x]==2)continue;
    }
    vis[node]=2;
}

int main()
{   
    freopen("input.txt", "r", stdin);
    char c1, c2, c3;
    while(cin>>c1>>c2>>c3){
    string s="";
    s+=c1;
    s+=c2;
    mp[c3].push_back(s);
    st.insert(c2);}
    for(auto x: mp){
        for(ll i=0;i<x.second.size();i++)
        {   
            bool flag=false;
            for(ll j=i+1;j<x.second.size();j++)
            {   
                if((x.second[j][1]-'0')==(x.second[i][1]-'0'))
                {
                    flag=true;
                }
                if(!flag){
                for(ll k=0;k<g[x.second[i][1]-'0'].size();k++)
                {
                    if(g[x.second[i][1]-'0'][k]==x.second[j][1]-'0')
                    {
                        flag=true;break;
                    }
                }}
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
        element++;
    }
    node=st.size();
    for(ll i=1;i<=node;i++)
    {
        if(vis[i]==0)
        {
            dfs(i);
        }
    }
    if(Cycle)
    {
        cout<<"Cycle detected. Not conflict serializable\n";
    }
    else
    {
        cout<<"No cycle. Conflict serializable\n";
    }
}
