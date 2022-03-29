// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ListSofamqAdmingroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // group list
    @NameInMap("data")
    public GroupPageDTO data;

    public static ListSofamqAdmingroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSofamqAdmingroupResponse self = new ListSofamqAdmingroupResponse();
        return TeaModel.build(map, self);
    }

    public ListSofamqAdmingroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSofamqAdmingroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSofamqAdmingroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSofamqAdmingroupResponse setData(GroupPageDTO data) {
        this.data = data;
        return this;
    }
    public GroupPageDTO getData() {
        return this.data;
    }

}
