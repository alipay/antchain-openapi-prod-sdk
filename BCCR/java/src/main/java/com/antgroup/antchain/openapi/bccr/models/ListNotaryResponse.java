// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bccr.models;

import com.aliyun.tea.*;

public class ListNotaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 公证处列表
    @NameInMap("notary_list")
    public java.util.List<NotaryPublicOffice> notaryList;

    public static ListNotaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNotaryResponse self = new ListNotaryResponse();
        return TeaModel.build(map, self);
    }

    public ListNotaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListNotaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListNotaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListNotaryResponse setNotaryList(java.util.List<NotaryPublicOffice> notaryList) {
        this.notaryList = notaryList;
        return this;
    }
    public java.util.List<NotaryPublicOffice> getNotaryList() {
        return this.notaryList;
    }

}
