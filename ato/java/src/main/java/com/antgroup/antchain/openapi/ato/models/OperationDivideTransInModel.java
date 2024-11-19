// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class OperationDivideTransInModel extends TeaModel {
    // 分账收入方支付宝用户id, 支付宝2088id
    @NameInMap("trans_in_user_id")
    @Validation(required = true, maxLength = 64, minLength = 1)
    public String transInUserId;

    // 分账金额，单位为分
    // 
    @NameInMap("divide_amount")
    @Validation(required = true, minimum = 1)
    public Long divideAmount;

    // 分账描述
    @NameInMap("desc")
    @Validation(maxLength = 64, minLength = 1)
    public String desc;

    public static OperationDivideTransInModel build(java.util.Map<String, ?> map) throws Exception {
        OperationDivideTransInModel self = new OperationDivideTransInModel();
        return TeaModel.build(map, self);
    }

    public OperationDivideTransInModel setTransInUserId(String transInUserId) {
        this.transInUserId = transInUserId;
        return this;
    }
    public String getTransInUserId() {
        return this.transInUserId;
    }

    public OperationDivideTransInModel setDivideAmount(Long divideAmount) {
        this.divideAmount = divideAmount;
        return this;
    }
    public Long getDivideAmount() {
        return this.divideAmount;
    }

    public OperationDivideTransInModel setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

}
