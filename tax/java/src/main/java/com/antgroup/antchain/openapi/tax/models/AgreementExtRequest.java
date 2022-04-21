// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class AgreementExtRequest extends TeaModel {
    // 证书类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 是否盖章，true：是 false：否
    @NameInMap("is_seal")
    @Validation(required = true)
    public String isSeal;

    // 地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    public static AgreementExtRequest build(java.util.Map<String, ?> map) throws Exception {
        AgreementExtRequest self = new AgreementExtRequest();
        return TeaModel.build(map, self);
    }

    public AgreementExtRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AgreementExtRequest setIsSeal(String isSeal) {
        this.isSeal = isSeal;
        return this;
    }
    public String getIsSeal() {
        return this.isSeal;
    }

    public AgreementExtRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

}
