package lec10.cpu;

class CPU {
    public int register = 0;
    public int[] memory = {5, 10, 0};


    private static final int LOAD = 1;
    private static final int SAVE = 2;
    private static final int ADD = 3;
    private static final int SUB = 4;
    private static final int HALT = 5;

    private int[][] program = {
            {LOAD, 0} ,      //register = memory[0] 메모리 0번째 있는 값을 이동
            {ADD, 1},       //register = register + memory[1]  : 메모리 1번값을 레지스터에 더한다
            {SAVE, 2},       // memory[2] = register :메모리 2번째 있는 값을 이동
            {HALT ,0}       // stop program execution
    };

    public void executeProgram() {
        int pc = 0;  //program counter
//무한반복문인 이유 // 돌다가 HALT 만나면 break되니까
        while (true) { //opcode : mov,add ,sub ,halt 명령어
            int opcode = program[pc][0];
            int operand = program[pc][1];
            //opearnd : 메모리 주소


            switch (opcode) {
                case LOAD :
                    register = memory[operand];
                    System.out.println("MOV: Loading memory[ "+operand + " ] (" + memory[0] + ") into register.");
                    break;

                case SAVE :
                    memory[operand] =register;
                    System.out.println("SAVE: Saving memory[ "+operand + " ] (" + memory[0] + ") into register.");

                case ADD:
                    register += memory[operand];
                    System.out.println("ADD: Adding memory [" + operand + "] (" + memory[operand]);
                    break;
                case SUB:
                    register -= memory[operand];
                    System.out.println("SUB: Subtrackting memory[" + operand + "] (" + memory[operand]);
                    break;
                case HALT:
                    System.out.println("HALT: Stopping program execution.);");
                default:
                    System.out.println("Unknown instruction. Halting.");
                    return;

            }

            pc++;

        }


    }


}
public class CpuMain {

    public static void main(String[] args) {
        CPU cpu = new CPU();

        cpu.executeProgram();
        System.out.println("Final memory state : memory[2] = " + cpu.memory[2]);

    }
}
