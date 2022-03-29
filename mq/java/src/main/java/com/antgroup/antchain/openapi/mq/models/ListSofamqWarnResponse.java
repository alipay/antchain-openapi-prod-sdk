// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqWarnResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询到的告警规则集合
    @NameInMap("data")
    public WarnPageDTO data;

    public static ListSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqWarnResponse self = new ListSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqWarnResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqWarnResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqWarnResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqWarnResponse setData(WarnPageDTO data) {
        this.data = data;
        return this;
    }
    public WarnPageDTO getData() {
        return this.data;
    }

}
