package commlink;

public class CommLinkDriver {
    public static void main(String[] args) {

        Communication com1 = new Communication(1,"AlphaBeta","10.12.2022",1);
        Communication com2 = new Communication(2,"Walkie","10.12.2022",2);
        Communication com3 = new Communication(3,"Target","10.12.2022",3);
        Communication com4 = new Communication(4,"Tangerine","10.12.2022",4);
        CommLinkedList comList = new CommLinkedList();
        comList.insertFirst(com1);
        comList.insertFirst(com2);
        comList.insertFirst(com3);
        comList.insertFirst(com4);
        comList.display();
        System.out.println("The size of the List is :" + comList.getSize());
    }
}
