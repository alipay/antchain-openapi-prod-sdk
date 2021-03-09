// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppserviceDefaultResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // AppService
    @NameInMap("data")
    public AppService data;

    public static GetAppserviceDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppserviceDefaultResponse self = new GetAppserviceDefaultResponse();
        return TeaModel.build(map, self);
    }

    public GetAppserviceDefaultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppserviceDefaultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppserviceDefaultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppserviceDefaultResponse setData(AppService data) {
        this.data = data;
        return this;
    }
    public AppService getData() {
        return this.data;
    }

}
