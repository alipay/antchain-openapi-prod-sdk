// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqSchemacompatibilityResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回系统支持的兼容性，key为兼容性的值，比如FULL，对应的value为前端下拉列表中展现的内容，比如“全兼容”
    @NameInMap("data")
    public java.util.List<Pair> data;

    public static ListSofamqSchemacompatibilityResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqSchemacompatibilityResponse self = new ListSofamqSchemacompatibilityResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqSchemacompatibilityResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqSchemacompatibilityResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqSchemacompatibilityResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqSchemacompatibilityResponse setData(java.util.List<Pair> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Pair> getData() {
        return this.data;
    }

}
