package thinking_in_java.io;


import java.io.*;

public class MemoryInput {
  public static void main(String[] args)
  throws IOException {
    StringReader in = new StringReader(
      BufferedInputFile.read("D:\\Design\\GitWorkspace\\thinking_in_java\\src\\thinking_in_java\\net\\mindview\\io\\MemoryInput.java"));
    int c;
    while((c = in.read()) != -1)
      System.out.print((char)c);
  }
} /* (Execute to see output) *///:~
