// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.unicontact.models;

import com.aliyun.tea.*;

public class ImportInitUploadResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求结果
    @NameInMap("success")
    public Boolean success;

    // 场景结构体
    @NameInMap("upload_result")
    public StrategyUploadResult uploadResult;

    public static ImportInitUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        ImportInitUploadResponse self = new ImportInitUploadResponse();
        return TeaModel.build(map, self);
    }

    public ImportInitUploadResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ImportInitUploadResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ImportInitUploadResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ImportInitUploadResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ImportInitUploadResponse setUploadResult(StrategyUploadResult uploadResult) {
        this.uploadResult = uploadResult;
        return this;
    }
    public StrategyUploadResult getUploadResult() {
        return this.uploadResult;
    }

}
