package kw.comso.dto;

import java.util.ArrayList;

public class TestPaperVO {
   int testPaperIDNum; // �� �������� ������ȣ
   ArrayList testInfo; // ������ ���� ������ ����Ǿ� ����, ��� ������ ����Ǿ� �ִ��� ���� ����
   
   //setter
      public void setTestPaperIDNum(int testPaperIDNum) {
         this.testPaperIDNum = testPaperIDNum;
      }
      
      public void setTestPaperIDNum(ArrayList testInfo) {
         this.testInfo = testInfo;
      }
      
    //getter
        
      public int testPaperIDNum() {
          return this.testPaperIDNum;
      }
      
      public ArrayList testInfo() {
         return this.testInfo;
      }

}