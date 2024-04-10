// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetIotbasicProductinfoResponse extends TeaModel {
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

    // 产品信息，json字符串
    // productName:产品名称
    // productCode:产品code
    // createTime:产品创建时间
    // productKey:产品key，用于设备的接入认证信息
    // deviceTotalCount:产品下的设备总数
    // mqttHost:设备的接入域名
    @NameInMap("data")
    public String data;

    public static GetIotbasicProductinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIotbasicProductinfoResponse self = new GetIotbasicProductinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetIotbasicProductinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetIotbasicProductinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetIotbasicProductinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetIotbasicProductinfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetIotbasicProductinfoResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
