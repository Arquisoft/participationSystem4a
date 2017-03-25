package participationSystem.DBUpdate;

import participationSystem.ReportWriter.SingletonReporter;
import participationSystem.ReportWriter.WriteReport;

public class WReport implements WriteReport{

    @Override
    public void report(String... problemas) {
        //new WreportP().report(problemas);
    	SingletonReporter.getInstance().getWreportP().report(problemas);
    }
}
