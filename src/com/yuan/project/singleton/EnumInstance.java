package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 枚举模式
 */
public enum  EnumInstance {

    /**
     * 实例
     */
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("enum method test");
        }
    };

    // 可以被外部调用
    protected abstract void printTest();


    /**
     * 数据
     *
     */
    private Object data;

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
    public Object getData(){
        return data;
    }
    public void setData(Object data){
        this.data = data;
    }
}
