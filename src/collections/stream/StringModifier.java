package collections.stream;

@FunctionalInterface
public interface StringModifier {
    String modify(String s);

    //    void xd();   dodanie meteody sprawia, ze ten interfejs nie jest funkcyjny!!
    default String xd() {
        return "XD";
    }
}
