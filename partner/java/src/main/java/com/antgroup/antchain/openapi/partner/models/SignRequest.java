// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.partner.models;

import com.aliyun.tea.*;

public class SignRequest extends TeaModel {
    // 合同类型
    @NameInMap("contract_type")
    @Validation(required = true)
    public String contractType;

    // 签约模式
    @NameInMap("seal_mode")
    @Validation(required = true)
    public String sealMode;

    public static SignRequest build(java.util.Map<String, ?> map) throws Exception {
        SignRequest self = new SignRequest();
        return TeaModel.build(map, self);
    }

    public SignRequest setContractType(String contractType) {
        this.contractType = contractType;
        return this;
    }
    public String getContractType() {
        return this.contractType;
    }

    public SignRequest setSealMode(String sealMode) {
        this.sealMode = sealMode;
        return this;
    }
    public String getSealMode() {
        return this.sealMode;
    }

}
