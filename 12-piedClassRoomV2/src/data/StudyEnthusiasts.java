
package data;

/**
 *
 * StudyEnthusiasts là hội những người ham học 
 * 1- ai học chăm chỉ thì vào hội
 * 2- ai vào cùng được ,vào thì phải ham học và nói rõ là mình ham học như nào
 * StudyEnthusiasts: vào hội là phải ham học 
 * Interface là class
 */
public interface StudyEnthusiasts {
//ai cũng vào được => không cần quan tâm thuộc tính 
//không lưu thuộc tính ở hội nhóm
//nếu có thuộc tính thì nó sẽ là đồ dùng chung của cả nhóm - final static-
//                                              có giá trị và ko chỉnh sửa
//              tức là sẽ đặt in hoa như 1 hằng số 
    String COLORSKIN = "Black";
//      public static final
//ko có thuộc tính nghĩa là ko có ngăn để rót giá trị vào => ko cần constructer
//                                                        => ko cần getter setter
    public double studyHard();//abstract method
    public void showHard();
//chỉ vá hay implement
  
}
//vào hội này thì phải làm nhiệm vụ cho tao 

