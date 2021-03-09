// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppgrayconfigsResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 开关配置清单
    @NameInMap("data")
    public java.util.List<MapStringToBooleanEntity> data;

    public static GetAppgrayconfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppgrayconfigsResponse self = new GetAppgrayconfigsResponse();
        return TeaModel.build(map, self);
    }

    public GetAppgrayconfigsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppgrayconfigsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppgrayconfigsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppgrayconfigsResponse setData(java.util.List<MapStringToBooleanEntity> data) {
        this.data = data;
        return this;
    }
    public java.util.List<MapStringToBooleanEntity> getData() {
        return this.data;
    }

}
