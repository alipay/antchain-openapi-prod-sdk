// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListUnifiedresourceInstancetypeResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // instancetype详细信息，jsonstring
    @NameInMap("data")
    public String data;

    public static ListUnifiedresourceInstancetypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUnifiedresourceInstancetypeResponse self = new ListUnifiedresourceInstancetypeResponse();
        return TeaModel.build(map, self);
    }

    public ListUnifiedresourceInstancetypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListUnifiedresourceInstancetypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListUnifiedresourceInstancetypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListUnifiedresourceInstancetypeResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
