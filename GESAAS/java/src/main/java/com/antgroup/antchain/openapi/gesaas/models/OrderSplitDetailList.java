// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OrderSplitDetailList extends TeaModel {
    // 某笔分账状态：PROCESSING-处理中,SUCCESS-成功,CLOSE-关闭,FAILED-失败
    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("split_status")
    @Validation(required = true)
    public String splitStatus;

    // 分账金额，单位：分
    /**
     * <strong>example:</strong>
     * <p>990</p>
     */
    @NameInMap("split_amount")
    @Validation(required = true)
    public Long splitAmount;

    // 分账执行时间，格式为yyyy-MM-dd HH:mm:ss 
    // 条件返回：splitStatus=SUCCESS 返回
    /**
     * <strong>example:</strong>
     * <p>2021-07-30 12:00:00</p>
     */
    @NameInMap("execute_time")
    public String executeTime;

    // 分账转出账号
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_out_account")
    @Validation(required = true)
    public String transOutAccount;

    // 分账转入账号
    /**
     * <strong>example:</strong>
     * <p>2088101126765726</p>
     */
    @NameInMap("trans_in_account")
    @Validation(required = true)
    public String transInAccount;

    // 分账失败原因，条件返回：splitStatus=FAILED 返回
    /**
     * <strong>example:</strong>
     * <p>账户余额不足</p>
     */
    @NameInMap("split_failed_reason")
    public String splitFailedReason;

    public static OrderSplitDetailList build(java.util.Map<String, ?> map) throws Exception {
        OrderSplitDetailList self = new OrderSplitDetailList();
        return TeaModel.build(map, self);
    }

    public OrderSplitDetailList setSplitStatus(String splitStatus) {
        this.splitStatus = splitStatus;
        return this;
    }
    public String getSplitStatus() {
        return this.splitStatus;
    }

    public OrderSplitDetailList setSplitAmount(Long splitAmount) {
        this.splitAmount = splitAmount;
        return this;
    }
    public Long getSplitAmount() {
        return this.splitAmount;
    }

    public OrderSplitDetailList setExecuteTime(String executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public String getExecuteTime() {
        return this.executeTime;
    }

    public OrderSplitDetailList setTransOutAccount(String transOutAccount) {
        this.transOutAccount = transOutAccount;
        return this;
    }
    public String getTransOutAccount() {
        return this.transOutAccount;
    }

    public OrderSplitDetailList setTransInAccount(String transInAccount) {
        this.transInAccount = transInAccount;
        return this;
    }
    public String getTransInAccount() {
        return this.transInAccount;
    }

    public OrderSplitDetailList setSplitFailedReason(String splitFailedReason) {
        this.splitFailedReason = splitFailedReason;
        return this;
    }
    public String getSplitFailedReason() {
        return this.splitFailedReason;
    }

}
