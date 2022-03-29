// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class DeleteRmsPluginResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public Boolean data;

    // error_code
    @NameInMap("error_code")
    public String errorCode;

    // rid
    @NameInMap("rid")
    public String rid;

    // success
    @NameInMap("success")
    public Boolean success;

    public static DeleteRmsPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRmsPluginResponse self = new DeleteRmsPluginResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRmsPluginResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DeleteRmsPluginResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DeleteRmsPluginResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DeleteRmsPluginResponse setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteRmsPluginResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DeleteRmsPluginResponse setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public DeleteRmsPluginResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
