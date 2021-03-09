// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppserviceDetailResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 应用服务详情
    @NameInMap("data")
    public AppServiceViewModel data;

    public static GetAppserviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppserviceDetailResponse self = new GetAppserviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetAppserviceDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppserviceDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppserviceDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppserviceDetailResponse setData(AppServiceViewModel data) {
        this.data = data;
        return this;
    }
    public AppServiceViewModel getData() {
        return this.data;
    }

}
