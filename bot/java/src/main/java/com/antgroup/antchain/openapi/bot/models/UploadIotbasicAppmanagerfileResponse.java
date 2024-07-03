// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UploadIotbasicAppmanagerfileResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 上传应用文件解析结果，json字符串
    @NameInMap("data")
    public String data;

    public static UploadIotbasicAppmanagerfileResponse build(java.util.Map<String, ?> map) throws Exception {
        UploadIotbasicAppmanagerfileResponse self = new UploadIotbasicAppmanagerfileResponse();
        return TeaModel.build(map, self);
    }

    public UploadIotbasicAppmanagerfileResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public UploadIotbasicAppmanagerfileResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UploadIotbasicAppmanagerfileResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public UploadIotbasicAppmanagerfileResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UploadIotbasicAppmanagerfileResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
