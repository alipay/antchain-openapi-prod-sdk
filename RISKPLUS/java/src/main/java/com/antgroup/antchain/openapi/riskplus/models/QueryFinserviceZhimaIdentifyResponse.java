// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryFinserviceZhimaIdentifyResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    //  
    @NameInMap("data")
    public ZhimaQueryResp data;

    public static QueryFinserviceZhimaIdentifyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryFinserviceZhimaIdentifyResponse self = new QueryFinserviceZhimaIdentifyResponse();
        return TeaModel.build(map, self);
    }

    public QueryFinserviceZhimaIdentifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryFinserviceZhimaIdentifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryFinserviceZhimaIdentifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryFinserviceZhimaIdentifyResponse setData(ZhimaQueryResp data) {
        this.data = data;
        return this;
    }
    public ZhimaQueryResp getData() {
        return this.data;
    }

}
