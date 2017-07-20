package com.zx.enum1;
/**
 * Created by zx142489 on 2017/7/18.
 */
public  enum StateEnum {


    INITIAL(0,"��ʼ��"),
    COMPLETED(1,"�����"),
    DELETING(2,"ɾ����"),
    FAILED(3,"ʧ��");
    /***
     * ����
     */
    private int index;

    /**
     * ��������
     */
    private String description;

    private StateEnum(int index, String description) {
        this.index = index ;
        this.description = description;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
