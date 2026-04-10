public interface CheckedExceptionHnadlerConsumer<Target,ExObj extends  Exception>{

    public  void accept(Target target)throws ExObj;
}
