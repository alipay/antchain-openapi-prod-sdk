// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetApplicationDetailResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用详情信息
    @NameInMap("data")
    public AppView data;

    public static GetApplicationDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationDetailResponse self = new GetApplicationDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetApplicationDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetApplicationDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetApplicationDetailResponse setData(AppView data) {
        this.data = data;
        return this;
    }
    public AppView getData() {
        return this.data;
    }

}
