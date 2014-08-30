public interface Application{
    String getContenu(char col, int lig);
    void setContenu(char col, int lig, String s) throws ErreurFormule;
}
