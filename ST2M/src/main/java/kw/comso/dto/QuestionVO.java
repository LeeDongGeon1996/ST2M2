package kw.comso.dto;

public class QuestionVO { //각 문제 하나하나를 저장하는 공간, 시험지 아님!!!
   int questionIDNum; // 각 문제의 고유번호
   int mulORSub; 
   // 이 문제가 객관식인지 주관식인지 선택하는 곳 (0, 1)로 구분하기? 추후에 정하자, mul-multiple=객관식, sub-subjective=주관식
   String passage; // 문제 지문을 저장함
   String imageLink; // 이미지가 저장되어 있는 링크를 저장
   String mulChoice; // 객관식 보기를 저장함
   String answer; //답 저장
   
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