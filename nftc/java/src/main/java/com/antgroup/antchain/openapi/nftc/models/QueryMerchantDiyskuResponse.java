// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftc.models;

import com.aliyun.tea.*;

public class QueryMerchantDiyskuResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 生成的nftid结果
    @NameInMap("nft_id")
    public String nftId;

    // 获得时间
    @NameInMap("receive_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String receiveTime;

    // 发放状态
    // AUDIT_SUBMIT("审核中"),
    // AUDIT_SUCCESS("审核通过"),
    // AUDIT_FAIL("审核未通过"),
    // TRANSFER_UNKNOWN("发放结果未知"),
    // TRANSFER_SUCCESS("发放成功"),
    // TRANSFER_FAILED("发放失败"),
    // SHIELD("屏蔽"),
    // RECYCLE("回收"),
    @NameInMap("send_status")
    public String sendStatus;

    public static QueryMerchantDiyskuResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMerchantDiyskuResponse self = new QueryMerchantDiyskuResponse();
        return TeaModel.build(map, self);
    }

    public QueryMerchantDiyskuResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMerchantDiyskuResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMerchantDiyskuResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMerchantDiyskuResponse setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public QueryMerchantDiyskuResponse setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
        return this;
    }
    public String getReceiveTime() {
        return this.receiveTime;
    }

    public QueryMerchantDiyskuResponse setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }
    public String getSendStatus() {
        return this.sendStatus;
    }

}
