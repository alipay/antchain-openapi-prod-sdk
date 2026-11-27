// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CommitSilentauthFileRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权流程ID（OFFLINE 发起的返回值）
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 授权书文件ID（盖章后上传取得）
    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 电子认证服务协议文件ID，平台开启拆分模式时必填
    @NameInMap("ca_agreement_file_id")
    public String caAgreementFileId;

    public static CommitSilentauthFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CommitSilentauthFileRequest self = new CommitSilentauthFileRequest();
        return TeaModel.build(map, self);
    }

    public CommitSilentauthFileRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CommitSilentauthFileRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CommitSilentauthFileRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public CommitSilentauthFileRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CommitSilentauthFileRequest setCaAgreementFileId(String caAgreementFileId) {
        this.caAgreementFileId = caAgreementFileId;
        return this;
    }
    public String getCaAgreementFileId() {
        return this.caAgreementFileId;
    }

}
