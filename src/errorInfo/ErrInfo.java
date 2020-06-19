package errorInfo;

class ErrInfo {
    public static void main(String[] args) {
        ErrorMessage errorInfo = new ErrorMessage();
        Err err;
        err = errorInfo.getErrorInfo(errorInfo.DISKERR);
        System.out.println(err.msg);

        err = errorInfo.getErrorInfo(errorInfo.OUTERR);
        System.out.println(err.msg);
    }
}
