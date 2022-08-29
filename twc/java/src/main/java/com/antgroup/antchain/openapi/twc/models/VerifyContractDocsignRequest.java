// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class VerifyContractDocsignRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 文件id
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 平台方用户注册id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    public static VerifyContractDocsignRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyContractDocsignRequest self = new VerifyContractDocsignRequest();
        return TeaModel.build(map, self);
    }

    public VerifyContractDocsignRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public VerifyContractDocsignRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public VerifyContractDocsignRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public VerifyContractDocsignRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
