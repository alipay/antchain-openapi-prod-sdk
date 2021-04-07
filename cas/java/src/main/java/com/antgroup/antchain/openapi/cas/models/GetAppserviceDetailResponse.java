// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetAppserviceDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
