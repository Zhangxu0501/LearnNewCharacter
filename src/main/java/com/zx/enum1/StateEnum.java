package com.zx.enum1;
/**
 * Created by zx142489 on 2017/7/18.
 */
public  enum StateEnum {


    INITIAL(0,"初始化"),
    COMPLETED(1,"已完成"),
    DELETING(2,"删除中"),
    FAILED(3,"失败");
    /***
     * 动作
     */
    private int index;

    /**
     * 动作描述
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
