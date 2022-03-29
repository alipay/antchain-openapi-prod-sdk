// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetAppOverviewResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回结果
    @NameInMap("data")
    public AppOverviewDTO data;

    public static GetAppOverviewResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppOverviewResponse self = new GetAppOverviewResponse();
        return TeaModel.build(map, self);
    }

    public GetAppOverviewResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAppOverviewResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAppOverviewResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAppOverviewResponse setData(AppOverviewDTO data) {
        this.data = data;
        return this;
    }
    public AppOverviewDTO getData() {
        return this.data;
    }

}
