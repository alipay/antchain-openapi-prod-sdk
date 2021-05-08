// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class GetCpfCertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 证明文件ID
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 证明文件存储类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static GetCpfCertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCpfCertRequest self = new GetCpfCertRequest();
        return TeaModel.build(map, self);
    }

    public GetCpfCertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetCpfCertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetCpfCertRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public GetCpfCertRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
