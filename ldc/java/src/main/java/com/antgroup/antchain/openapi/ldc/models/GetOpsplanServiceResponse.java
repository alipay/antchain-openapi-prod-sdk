// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GetOpsplanServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发布应用服务详情
    @NameInMap("data")
    public AppSimpleInfo data;

    public static GetOpsplanServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpsplanServiceResponse self = new GetOpsplanServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetOpsplanServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetOpsplanServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetOpsplanServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetOpsplanServiceResponse setData(AppSimpleInfo data) {
        this.data = data;
        return this;
    }
    public AppSimpleInfo getData() {
        return this.data;
    }

}
