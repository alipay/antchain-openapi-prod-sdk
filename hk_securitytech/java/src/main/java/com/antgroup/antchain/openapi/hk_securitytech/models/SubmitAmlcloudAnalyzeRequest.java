// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.hk_securitytech.models;

import com.aliyun.tea.*;

public class SubmitAmlcloudAnalyzeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // biz_code
    @NameInMap("biz_code")
    @Validation(required = true)
    public String bizCode;

    // tenant_id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // tnt_inst_id
    @NameInMap("tnt_inst_id")
    @Validation(required = true)
    public String tntInstId;

    // extendData
    @NameInMap("extend_data")
    @Validation(required = true)
    public ExtendData extendData;

    public static SubmitAmlcloudAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitAmlcloudAnalyzeRequest self = new SubmitAmlcloudAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public SubmitAmlcloudAnalyzeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SubmitAmlcloudAnalyzeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SubmitAmlcloudAnalyzeRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public SubmitAmlcloudAnalyzeRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public SubmitAmlcloudAnalyzeRequest setTntInstId(String tntInstId) {
        this.tntInstId = tntInstId;
        return this;
    }
    public String getTntInstId() {
        return this.tntInstId;
    }

    public SubmitAmlcloudAnalyzeRequest setExtendData(ExtendData extendData) {
        this.extendData = extendData;
        return this;
    }
    public ExtendData getExtendData() {
        return this.extendData;
    }

}
