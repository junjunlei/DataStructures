package com.jdk.long_api;

/**
 * @author Jerry
 * @create 2020-09-02 15:00
 */
public enum  ProcessStatus {
    /**
     * 待提交，创建之后的默认状态
     */
    PENDING,
    /**
     * 变更中，审批之后变更
     */
    UPDATE,
    /**
     * 提交，不可编辑
     */
    SUBMIT,
    /**
     * 完成，生效状态
     */
    COMPLETE,
    /**
     * 拒绝，退回重新编辑
     */
    REJECT,
    /**
     * 处理异常
     */
    ERROR
}
