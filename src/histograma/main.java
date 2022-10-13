package histograma;

public class main {
    public static void main(String[] args) {
        //MODEL
        Histogram<String> histogram = new Histogram<>();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("eii.ulpgc.es");
        histogram.increment("gmail.com");
        
        //VIEW
        HistogramDisplay hist = new HistogramDisplay("HISTOGRAM DISPLAY",histogram);
        hist.execute();
    }
    
}
