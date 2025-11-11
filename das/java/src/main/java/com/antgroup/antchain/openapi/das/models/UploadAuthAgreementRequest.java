// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class UploadAuthAgreementRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 被授权方企业信用代码
    @NameInMap("auth_enterprise_code")
    @Validation(required = true)
    public String authEnterpriseCode;

    public static UploadAuthAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadAuthAgreementRequest self = new UploadAuthAgreementRequest();
        return TeaModel.build(map, self);
    }

    public UploadAuthAgreementRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadAuthAgreementRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadAuthAgreementRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public UploadAuthAgreementRequest setAuthEnterpriseCode(String authEnterpriseCode) {
        this.authEnterpriseCode = authEnterpriseCode;
        return this;
    }
    public String getAuthEnterpriseCode() {
        return this.authEnterpriseCode;
    }

}
