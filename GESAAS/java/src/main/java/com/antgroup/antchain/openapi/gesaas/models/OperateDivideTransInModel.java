// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class OperateDivideTransInModel extends TeaModel {
    // 分账收入方支付宝用户id, 支付宝2088id
    /**
     * <strong>example:</strong>
     * <p>2088id</p>
     */
    @NameInMap("trans_in_user_id")
    @Validation(required = true)
    public String transInUserId;

    // 分账金额，单位为分 大于0
    /**
     * <strong>example:</strong>
     * <p>12324</p>
     */
    @NameInMap("divide_amount")
    @Validation(required = true)
    public Long divideAmount;

    public static OperateDivideTransInModel build(java.util.Map<String, ?> map) throws Exception {
        OperateDivideTransInModel self = new OperateDivideTransInModel();
        return TeaModel.build(map, self);
    }

    public OperateDivideTransInModel setTransInUserId(String transInUserId) {
        this.transInUserId = transInUserId;
        return this;
    }
    public String getTransInUserId() {
        return this.transInUserId;
    }

    public OperateDivideTransInModel setDivideAmount(Long divideAmount) {
        this.divideAmount = divideAmount;
        return this;
    }
    public Long getDivideAmount() {
        return this.divideAmount;
    }

}
