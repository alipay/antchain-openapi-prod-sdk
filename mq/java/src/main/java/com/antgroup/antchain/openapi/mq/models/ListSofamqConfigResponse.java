// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // configs
    @NameInMap("data")
    public ConfigPageDTO data;

    public static ListSofamqConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqConfigResponse self = new ListSofamqConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqConfigResponse setData(ConfigPageDTO data) {
        this.data = data;
        return this;
    }
    public ConfigPageDTO getData() {
        return this.data;
    }

}
