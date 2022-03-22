package utility;

public class curState {
    public enum state{SELECT, GENERATION, ASSCIATION, COMPOSITION, CLASS, USECASS, GROUP, UNGROUP, RENAME};
    public state currentState = state.SELECT;
}
