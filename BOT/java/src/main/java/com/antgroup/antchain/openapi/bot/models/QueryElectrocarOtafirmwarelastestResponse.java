// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtafirmwarelastestResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否请求成功
    @NameInMap("success")
    public Boolean success;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应内容
    @NameInMap("message")
    public String message;

    // 响应数据
    @NameInMap("data")
    public IotxLatestPublishedFirmwareResponse data;

    public static QueryElectrocarOtafirmwarelastestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtafirmwarelastestResponse self = new QueryElectrocarOtafirmwarelastestResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtafirmwarelastestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarOtafirmwarelastestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarOtafirmwarelastestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarOtafirmwarelastestResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarOtafirmwarelastestResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarOtafirmwarelastestResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryElectrocarOtafirmwarelastestResponse setData(IotxLatestPublishedFirmwareResponse data) {
        this.data = data;
        return this;
    }
    public IotxLatestPublishedFirmwareResponse getData() {
        return this.data;
    }

}
