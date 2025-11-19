// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class QueryDciUserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证件类型
    @NameInMap("certificate_type")
    @Validation(required = true)
    public String certificateType;

    // 证件号
    @NameInMap("certificate_number")
    @Validation(required = true)
    public String certificateNumber;

    // 手机号
    @NameInMap("phone")
    public String phone;

    // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS：软件作品认证，如果不传默认为UGC
    @NameInMap("copyright_certification_type")
    public String copyrightCertificationType;

    public static QueryDciUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDciUserRequest self = new QueryDciUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryDciUserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryDciUserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryDciUserRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public QueryDciUserRequest setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
        return this;
    }
    public String getCertificateNumber() {
        return this.certificateNumber;
    }

    public QueryDciUserRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public QueryDciUserRequest setCopyrightCertificationType(String copyrightCertificationType) {
        this.copyrightCertificationType = copyrightCertificationType;
        return this;
    }
    public String getCopyrightCertificationType() {
        return this.copyrightCertificationType;
    }

}
