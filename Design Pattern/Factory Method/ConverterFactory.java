class ConverterFactory {
    public static Converter createConverter(String fromType, String toType) {
        if (fromType.equals("PDF") && toType.equals("Word")) {
            return new PDFToWordConverter();
        } else if (fromType.equals("Word") && toType.equals("PDF")) {
            return new WordToPDFConverter();
        }
        return null;
    }
}
