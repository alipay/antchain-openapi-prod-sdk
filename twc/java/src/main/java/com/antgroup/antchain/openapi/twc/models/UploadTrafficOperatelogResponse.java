// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class UploadTrafficOperatelogResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上传结果
    @NameInMap("upload_result")
    public Boolean uploadResult;

    public static UploadTrafficOperatelogResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadTrafficOperatelogResponse self = new UploadTrafficOperatelogResponse();
        return TeaModel.build(map, self);
    }

    public UploadTrafficOperatelogResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadTrafficOperatelogResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadTrafficOperatelogResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadTrafficOperatelogResponse setUploadResult(Boolean uploadResult) {
        this.uploadResult = uploadResult;
        return this;
    }
    public Boolean getUploadResult() {
        return this.uploadResult;
    }

}
