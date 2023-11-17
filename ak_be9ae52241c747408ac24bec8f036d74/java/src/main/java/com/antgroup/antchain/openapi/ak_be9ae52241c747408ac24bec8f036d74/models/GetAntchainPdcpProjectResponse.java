// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class GetAntchainPdcpProjectResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 项目详情信息
    @NameInMap("data")
    public Project data;

    public static GetAntchainPdcpProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAntchainPdcpProjectResponse self = new GetAntchainPdcpProjectResponse();
        return TeaModel.build(map, self);
    }

    public GetAntchainPdcpProjectResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetAntchainPdcpProjectResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetAntchainPdcpProjectResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetAntchainPdcpProjectResponse setData(Project data) {
        this.data = data;
        return this;
    }
    public Project getData() {
        return this.data;
    }

}
