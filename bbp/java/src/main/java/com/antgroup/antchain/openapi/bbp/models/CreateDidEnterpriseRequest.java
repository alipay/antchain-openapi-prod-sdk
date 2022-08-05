// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bbp.models;

import com.aliyun.tea.*;

public class CreateDidEnterpriseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // 企业唯一编码
    @NameInMap("enterprise_code")
    @Validation(required = true)
    public String enterpriseCode;

    // 企业名称
    @NameInMap("enterprise_name")
    public String enterpriseName;

    // ORG_CERT 全国组织机构代码证书
    @NameInMap("cert_type")
    public String certType;

    public static CreateDidEnterpriseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDidEnterpriseRequest self = new CreateDidEnterpriseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDidEnterpriseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDidEnterpriseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDidEnterpriseRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public CreateDidEnterpriseRequest setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
        return this;
    }
    public String getEnterpriseCode() {
        return this.enterpriseCode;
    }

    public CreateDidEnterpriseRequest setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
        return this;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public CreateDidEnterpriseRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

}
