// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class ContractTextSignVerifySignatureInfo extends TeaModel {
    // 是否被篡改
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("is_modify")
    public Boolean isModify;

    public static ContractTextSignVerifySignatureInfo build(java.util.Map<String, ?> map) throws Exception {
        ContractTextSignVerifySignatureInfo self = new ContractTextSignVerifySignatureInfo();
        return TeaModel.build(map, self);
    }

    public ContractTextSignVerifySignatureInfo setIsModify(Boolean isModify) {
        this.isModify = isModify;
        return this;
    }
    public Boolean getIsModify() {
        return this.isModify;
    }

}
