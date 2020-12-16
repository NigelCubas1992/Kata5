package kata5.control;

import kata5.model.Histogram;
import kata5.model.Mail;
import kata5.view.HistogramDisplay;
import kata5.view.MailHistogramBuilder;
import kata5.view.MailListReaderBD;

import java.sql.*;
import java.util.List;

public class Kata5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        List<Mail> mailList = MailListReaderBD.read();
        
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histo = new HistogramDisplay("Histogram", mailHistogram);
        histo.execute();
    }
}

