package LoopPrograms;
public class MainDemo {
    public static void main(String[] args) {
        
        WhileLoopDemo wl=new WhileLoopDemo();
        wl.whileloop();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        DoWhileLoopDemo dwl=new DoWhileLoopDemo();
        dwl.dowhileloop();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        EnhancedForLoopDemo efl=new EnhancedForLoopDemo();
        efl.enhancedforloop();
        System.out.println("-   -   -   -   -   -   -   -   -   -");
        
        LabelledStatementDemo ls=new LabelledStatementDemo();
        ls.show2();
    }
}
