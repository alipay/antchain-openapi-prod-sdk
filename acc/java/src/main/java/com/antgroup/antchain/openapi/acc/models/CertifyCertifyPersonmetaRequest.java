// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acc.models;

import com.aliyun.tea.*;

public class CertifyCertifyPersonmetaRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 自定义唯一id
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 租户类型
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 身份证号
    @NameInMap("user_cert_no")
    @Validation(required = true)
    public String userCertNo;

    public static CertifyCertifyPersonmetaRequest build(java.util.Map<String, ?> map) throws Exception {
        CertifyCertifyPersonmetaRequest self = new CertifyCertifyPersonmetaRequest();
        return TeaModel.build(map, self);
    }

    public CertifyCertifyPersonmetaRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CertifyCertifyPersonmetaRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CertifyCertifyPersonmetaRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public CertifyCertifyPersonmetaRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CertifyCertifyPersonmetaRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CertifyCertifyPersonmetaRequest setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo;
        return this;
    }
    public String getUserCertNo() {
        return this.userCertNo;
    }

}
