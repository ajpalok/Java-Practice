// You are creating a file indexing system for a search engine. Given an ArrayList of File objects, 
// where each File has attributes fileName, keywords (HashSet of strings), and size (in bytes), write a 
// program that searches for files based on keywords and ranks them in descending order of relevance. 
// The relevance of a file is determined by the number of matching keywords.

import java.util.*;

class File{
    String fileName;
    HashSet<String> keywords;
    byte size;

    public File(String fileName, HashSet<String> keywords, byte size){
        this.fileName = fileName;
        this.keywords = keywords;
        this.size = size;
    }
}

public class FileSearch{
    public static void main(String[] args) {
        ArrayList<File> fileList = new ArrayList<File>();
        
        HashSet<String> keywords1 = new HashSet<String>();
        keywords1.add("java");
        keywords1.add("programming");
        keywords1.add("oop");
        fileList.add(new File("File1", keywords1, (byte) 100));

        HashSet<String> keywords2 = new HashSet<String>();
        keywords2.add("java");
        keywords2.add("programming");
        keywords2.add("data structures");
        fileList.add(new File("File2", keywords2, (byte) 200));

        HashSet<String> keywords3 = new HashSet<String>();
        keywords3.add("data structures");
        keywords3.add("algorithms");
        fileList.add(new File("File3", keywords3, (byte) 300));

        HashSet<String> keywords4 = new HashSet<String>();
        keywords4.add("java");
        keywords4.add("searching");
        keywords4.add("sorting");
        fileList.add(new File("File4", keywords4, (byte) 400));

        HashSet<String> keywords5 = new HashSet<String>();
        keywords5.add("java");
        keywords5.add("programming");
        keywords5.add("graphs");
        fileList.add(new File("File5", keywords5, (byte) 500));

        Comparator<File> compare = new Comparator<>(){
            @Override
            public int compare(File f1, File f2){
                int count1 = 0;
                int count2 = 0;
                for(String keyword : f1.keywords){
                    if(f2.keywords.contains(keyword)){
                        count1++;
                    }
                }
                for(String keyword : f2.keywords){
                    if(f1.keywords.contains(keyword)){
                        count2++;
                    }
                }
                if(count1 == count2){
                    return Integer.compare(f2.size, f1.size);
                }
                return Integer.compare(count2, count1);
            }
        };

        Collections.sort(fileList, compare);
    }
}