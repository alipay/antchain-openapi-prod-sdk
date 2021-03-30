// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class BatchcreateImportassetRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户id
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 物权信息列表
    @NameInMap("certificates")
    @Validation(required = true)
    public java.util.List<CertificateInfo> certificates;

    public static BatchcreateImportassetRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateImportassetRequest self = new BatchcreateImportassetRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateImportassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateImportassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateImportassetRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public BatchcreateImportassetRequest setCertificates(java.util.List<CertificateInfo> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CertificateInfo> getCertificates() {
        return this.certificates;
    }

}
