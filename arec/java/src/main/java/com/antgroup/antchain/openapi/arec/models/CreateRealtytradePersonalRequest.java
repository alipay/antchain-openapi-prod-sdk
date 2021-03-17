// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.arec.models;

import com.aliyun.tea.*;

public class CreateRealtytradePersonalRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 姓名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 证件类型详见 https://tech.antfin.com/docs/2/155166，默认为CRED_PSN_CH_IDCARD（身份证类型）
    @NameInMap("cert_type")
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 手机号码
    @NameInMap("telephone")
    @Validation(required = true)
    public String telephone;

    public static CreateRealtytradePersonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealtytradePersonalRequest self = new CreateRealtytradePersonalRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealtytradePersonalRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateRealtytradePersonalRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateRealtytradePersonalRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateRealtytradePersonalRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public CreateRealtytradePersonalRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public CreateRealtytradePersonalRequest setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

}
