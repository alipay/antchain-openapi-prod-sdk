// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class CreateAssetpledgeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 质押申请id
    @NameInMap("pledge_id")
    public String pledgeId;

    // 区块链信息
    @NameInMap("info")
    public BlockchainInfo info;

    // 时间戳
    @NameInMap("date")
    public Long date;

    // 请求标识
    @NameInMap("request_id")
    public String requestId;

    public static CreateAssetpledgeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetpledgeResponse self = new CreateAssetpledgeResponse();
        return TeaModel.build(map, self);
    }

    public CreateAssetpledgeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateAssetpledgeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateAssetpledgeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateAssetpledgeResponse setPledgeId(String pledgeId) {
        this.pledgeId = pledgeId;
        return this;
    }
    public String getPledgeId() {
        return this.pledgeId;
    }

    public CreateAssetpledgeResponse setInfo(BlockchainInfo info) {
        this.info = info;
        return this;
    }
    public BlockchainInfo getInfo() {
        return this.info;
    }

    public CreateAssetpledgeResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public CreateAssetpledgeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
