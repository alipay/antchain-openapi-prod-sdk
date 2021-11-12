// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class EnableDynamicslbResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // slb创建结果
    @NameInMap("success")
    public Boolean success;

    // 生成的slb公网地址
    @NameInMap("publicslbip")
    public String publicslbip;

    public static EnableDynamicslbResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDynamicslbResponse self = new EnableDynamicslbResponse();
        return TeaModel.build(map, self);
    }

    public EnableDynamicslbResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public EnableDynamicslbResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public EnableDynamicslbResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public EnableDynamicslbResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EnableDynamicslbResponse setPublicslbip(String publicslbip) {
        this.publicslbip = publicslbip;
        return this;
    }
    public String getPublicslbip() {
        return this.publicslbip;
    }

}
