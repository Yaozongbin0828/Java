public class XiyoujiRenwu {
    PersonName name;
    float height, weight;
    String head;

    void speak(String s) {
        if (name == PersonName.猪八戒) {
            head = "美男头";
            height = 123.5f;
        } else if (name == PersonName.孙悟空) {
            head = "美女头";
        }
        System.out.println(s);
    }
}
