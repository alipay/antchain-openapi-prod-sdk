// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class AuthAntchainPdcpProjectDatasetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权至某个项目中的数据集信息
    @NameInMap("data")
    public AuthDataset data;

    public static AuthAntchainPdcpProjectDatasetResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthAntchainPdcpProjectDatasetResponse self = new AuthAntchainPdcpProjectDatasetResponse();
        return TeaModel.build(map, self);
    }

    public AuthAntchainPdcpProjectDatasetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthAntchainPdcpProjectDatasetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthAntchainPdcpProjectDatasetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthAntchainPdcpProjectDatasetResponse setData(AuthDataset data) {
        this.data = data;
        return this;
    }
    public AuthDataset getData() {
        return this.data;
    }

}
