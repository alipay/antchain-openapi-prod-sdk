// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseClearingInfo extends TeaModel {
    // 还款批次
    @NameInMap("return_index")
    @Validation(required = true)
    public Long returnIndex;

    // 清分状态
    @NameInMap("clearing_state")
    @Validation(required = true)
    public Long clearingState;

    // 清分金额,精确到毫厘，即123400表示12.34元
    @NameInMap("clearing_money")
    @Validation(required = true)
    public Long clearingMoney;

    // 开始清分时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 结束清分时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 清分单号
    @NameInMap("clearing_order_id")
    @Validation(required = true)
    public String clearingOrderId;

    // 清分收款账号
    @NameInMap("clearing_account")
    @Validation(required = true)
    public String clearingAccount;

    // 清分额外说明
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    public static LeaseClearingInfo build(java.util.Map<String, ?> map) throws Exception {
        LeaseClearingInfo self = new LeaseClearingInfo();
        return TeaModel.build(map, self);
    }

    public LeaseClearingInfo setReturnIndex(Long returnIndex) {
        this.returnIndex = returnIndex;
        return this;
    }
    public Long getReturnIndex() {
        return this.returnIndex;
    }

    public LeaseClearingInfo setClearingState(Long clearingState) {
        this.clearingState = clearingState;
        return this;
    }
    public Long getClearingState() {
        return this.clearingState;
    }

    public LeaseClearingInfo setClearingMoney(Long clearingMoney) {
        this.clearingMoney = clearingMoney;
        return this;
    }
    public Long getClearingMoney() {
        return this.clearingMoney;
    }

    public LeaseClearingInfo setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public LeaseClearingInfo setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public LeaseClearingInfo setClearingOrderId(String clearingOrderId) {
        this.clearingOrderId = clearingOrderId;
        return this;
    }
    public String getClearingOrderId() {
        return this.clearingOrderId;
    }

    public LeaseClearingInfo setClearingAccount(String clearingAccount) {
        this.clearingAccount = clearingAccount;
        return this;
    }
    public String getClearingAccount() {
        return this.clearingAccount;
    }

    public LeaseClearingInfo setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

}
