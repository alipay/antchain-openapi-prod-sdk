// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UploadApplicationPackageResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 上传oss的bucket名称
    @NameInMap("bucket_name")
    public String bucketName;

    // 上传应用发布包的授权签名上传地址
    @NameInMap("signed_upload_url")
    public String signedUploadUrl;

    public static UploadApplicationPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadApplicationPackageResponse self = new UploadApplicationPackageResponse();
        return TeaModel.build(map, self);
    }

    public UploadApplicationPackageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadApplicationPackageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadApplicationPackageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadApplicationPackageResponse setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public UploadApplicationPackageResponse setSignedUploadUrl(String signedUploadUrl) {
        this.signedUploadUrl = signedUploadUrl;
        return this;
    }
    public String getSignedUploadUrl() {
        return this.signedUploadUrl;
    }

}
