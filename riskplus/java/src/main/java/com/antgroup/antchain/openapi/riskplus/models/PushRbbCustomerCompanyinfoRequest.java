// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class PushRbbCustomerCompanyinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 企业的统一社会信用代码
    @NameInMap("uc_code")
    public String ucCode;

    // 企业名称
    @NameInMap("company_name")
    public String companyName;

    // 企业信息的类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 企业信息的内容
    @NameInMap("content")
    public String content;

    public static PushRbbCustomerCompanyinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushRbbCustomerCompanyinfoRequest self = new PushRbbCustomerCompanyinfoRequest();
        return TeaModel.build(map, self);
    }

    public PushRbbCustomerCompanyinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PushRbbCustomerCompanyinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PushRbbCustomerCompanyinfoRequest setUcCode(String ucCode) {
        this.ucCode = ucCode;
        return this;
    }
    public String getUcCode() {
        return this.ucCode;
    }

    public PushRbbCustomerCompanyinfoRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public PushRbbCustomerCompanyinfoRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PushRbbCustomerCompanyinfoRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
