package kw.comso.dto;

public class QuestionVO { //�� ���� �ϳ��ϳ��� �����ϴ� ����, ������ �ƴ�!!!
   int questionIDNum; // �� ������ ������ȣ
   int mulORSub; 
   // �� ������ ���������� �ְ������� �����ϴ� �� (0, 1)�� �����ϱ�? ���Ŀ� ������, mul-multiple=������, sub-subjective=�ְ���
   String passage; // ���� ������ ������
   String imageLink; // �̹����� ����Ǿ� �ִ� ��ũ�� ����
   String mulChoice; // ������ ���⸦ ������
   String answer; //�� ����
   
   //setter
      public void setQuestionIDNum(int questionIDNum) {
         this.questionIDNum = questionIDNum;
      }
      
      public void setMulORSub(int mulORSub) {
         this.mulORSub = mulORSub;
      }
      
      public void setPassage(String passage) {
         this.passage = passage;
      }
      
      public void setImageLink(String imageLink) {
            this.imageLink = imageLink;
         }
      
      public void setMulChoice(String mulChoice) {
            this.mulChoice = mulChoice;
         }
      
      public void setAnswer(String answer) {
            this.answer = answer;
         }
   //getter
     
      public int setQuestionIDNum() {
          return this.questionIDNum;
      }
      
      public int setMulORSub() {
         return this.mulORSub;
      }
      
      public String setPassage() {
         return this.passage;
      }
      
      public String setImageLink() {
         return this.imageLink;
         }
      
      public String setMulChoice() {
         return this.mulChoice;
         }
      
      public String setAnswer() {
         return this.answer;
         }
}