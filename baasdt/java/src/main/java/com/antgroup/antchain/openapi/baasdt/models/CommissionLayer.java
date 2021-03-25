// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CommissionLayer extends TeaModel {
    // 阶梯起始值，无结束值
    @NameInMap("start_num")
    @Validation(required = true)
    public String startNum;

    // 手续费费率
    @NameInMap("deduct_ratio")
    @Validation(required = true)
    public String deductRatio;

    // 固定的商品费率值
    @NameInMap("deduct_token")
    @Validation(required = true)
    public String deductToken;

    public static CommissionLayer build(java.util.Map<String, ?> map) throws Exception {
        CommissionLayer self = new CommissionLayer();
        return TeaModel.build(map, self);
    }

    public CommissionLayer setStartNum(String startNum) {
        this.startNum = startNum;
        return this;
    }
    public String getStartNum() {
        return this.startNum;
    }

    public CommissionLayer setDeductRatio(String deductRatio) {
        this.deductRatio = deductRatio;
        return this;
    }
    public String getDeductRatio() {
        return this.deductRatio;
    }

    public CommissionLayer setDeductToken(String deductToken) {
        this.deductToken = deductToken;
        return this;
    }
    public String getDeductToken() {
        return this.deductToken;
    }

}
