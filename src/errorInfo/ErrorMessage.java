package errorInfo;

class ErrorMessage {
    public final int OUTERR = 0;
    public final int INNER = 1;
    public final int DISKERR = 2;
    public final int INDEXRR = 3;


    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };

    Err getErrorInfo(int index) {
        if (index >= 0 && index < msgs.length) {
            return new Err(msgs[index]);
        }
        return new Err("Несуществующий код ошибки");
    }
}
