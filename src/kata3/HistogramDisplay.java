package kata3;


import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public HistogramDisplay(){
        super("HISTOGRAMA DE PRUEBA");
        setContentPane(createPanel());
        pack();
    }
    

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    public void execute(){
        setVisible(true);
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart= ChartFactory.createBarChart(
                "JFreeChartHistogram",  /*title*/
                "Dominios email",          /*Etiqueta horizontal*/
                "Numero de emails",     /*Etiqueta vertcial*/
                dataSet, 
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled
        );
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet= new DefaultCategoryDataset();
        dataSet.addValue(5, "", "gmail.com");
        dataSet.addValue(10, "", "ulpgc.com");
        dataSet.addValue(7, "", "ull.com");
        dataSet.addValue(2, "", "hotmail.com");
        return dataSet;
    }
}