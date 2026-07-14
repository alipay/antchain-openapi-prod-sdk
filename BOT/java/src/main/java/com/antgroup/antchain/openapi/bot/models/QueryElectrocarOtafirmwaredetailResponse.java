// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarOtafirmwaredetailResponse extends TeaModel {
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

    // 固件包详情
    @NameInMap("firmware_detail")
    public IotxOTAFirmwareResponse firmwareDetail;

    // 响应编码
    @NameInMap("code")
    public String code;

    // 响应内容
    @NameInMap("message")
    public String message;

    public static QueryElectrocarOtafirmwaredetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarOtafirmwaredetailResponse self = new QueryElectrocarOtafirmwaredetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarOtafirmwaredetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarOtafirmwaredetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarOtafirmwaredetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarOtafirmwaredetailResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarOtafirmwaredetailResponse setFirmwareDetail(IotxOTAFirmwareResponse firmwareDetail) {
        this.firmwareDetail = firmwareDetail;
        return this;
    }
    public IotxOTAFirmwareResponse getFirmwareDetail() {
        return this.firmwareDetail;
    }

    public QueryElectrocarOtafirmwaredetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryElectrocarOtafirmwaredetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
