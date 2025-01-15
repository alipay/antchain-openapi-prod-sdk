// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperationDivideTransInDetailInfo extends TeaModel {
    // 分账收入方名称
    @NameInMap("trans_in_name")
    public String transInName;

    // 分账收入方支付宝用户id, 支付宝2088id
    @NameInMap("trans_in_user_id")
    public String transInUserId;

    // 分账金额，单位为分
    @NameInMap("divide_amount")
    public Long divideAmount;

    // 分账描述
    @NameInMap("desc")
    public String desc;

    // INIT("INIT", "初始化"),
    // PROCESSING("PROCESSING", "处理中"),
    // FAILED("FAILED", "失败"),
    // SUCCESS("SUCCESS", "分账成功");
    @NameInMap("divide_status")
    public String divideStatus;

    public static OperationDivideTransInDetailInfo build(java.util.Map<String, ?> map) throws Exception {
        OperationDivideTransInDetailInfo self = new OperationDivideTransInDetailInfo();
        return TeaModel.build(map, self);
    }

    public OperationDivideTransInDetailInfo setTransInName(String transInName) {
        this.transInName = transInName;
        return this;
    }
    public String getTransInName() {
        return this.transInName;
    }

    public OperationDivideTransInDetailInfo setTransInUserId(String transInUserId) {
        this.transInUserId = transInUserId;
        return this;
    }
    public String getTransInUserId() {
        return this.transInUserId;
    }

    public OperationDivideTransInDetailInfo setDivideAmount(Long divideAmount) {
        this.divideAmount = divideAmount;
        return this;
    }
    public Long getDivideAmount() {
        return this.divideAmount;
    }

    public OperationDivideTransInDetailInfo setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public OperationDivideTransInDetailInfo setDivideStatus(String divideStatus) {
        this.divideStatus = divideStatus;
        return this;
    }
    public String getDivideStatus() {
        return this.divideStatus;
    }

}
