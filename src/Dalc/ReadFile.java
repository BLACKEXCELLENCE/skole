package Dalc;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadFile {
    
    private String filePath;
    
    public ReadFile(String filePath) {
        this.filePath=filePath;
    }
    
    public String[] openFile(int n) throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader textReader = new BufferedReader(fr);
        
        int numberOfLines = n;
        String[] textData = new String[numberOfLines];
        
        for (int i=0; i < numberOfLines; i++) {
            textData[i] = textReader.readLine();
        }
        
        textReader.close();
        return textData;
    }
    
    int readLine() throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader bf = new BufferedReader(fr);
        
        String aLine;
        int numberOfLines = 0;
        
        while ((aLine = bf.readLine()) != null) {
            numberOfLines++;
        }     
        bf.close();
        
        return numberOfLines;
    }
}