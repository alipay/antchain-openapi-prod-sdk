// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetApplicationPackageuploadpolicyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 发布包上传策略
    @NameInMap("data")
    public PackageUploadPolicy data;

    public static GetApplicationPackageuploadpolicyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationPackageuploadpolicyResponse self = new GetApplicationPackageuploadpolicyResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationPackageuploadpolicyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationPackageuploadpolicyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationPackageuploadpolicyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationPackageuploadpolicyResponse setData(PackageUploadPolicy data) {
        this.data = data;
        return this;
    }
    public PackageUploadPolicy getData() {
        return this.data;
    }

}
