// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAuthCertClaimResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可验证声明id
    @NameInMap("vc_id")
    public String vcId;

    // 交易hash（仅上链成功后会有值）
    @NameInMap("tx_hash")
    public String txHash;

    // vc详情
    @NameInMap("vc_content")
    public String vcContent;

    // vc状态 0:未授权 1:已授权 2: 拒绝授权 3: 授权已撤销
    @NameInMap("status")
    public Long status;

    // 业务类型
    @NameInMap("biz_type")
    public String bizType;

    // 过期时间
    @NameInMap("expire")
    public Long expire;

    // 授权是否可撤销
    @NameInMap("revocable")
    public Boolean revocable;

    // 存证请求创建时间
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 存证上链时间（仅上链成功后会有值）
    @NameInMap("gmt_transmit")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtTransmit;

    public static QueryAuthCertClaimResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAuthCertClaimResponse self = new QueryAuthCertClaimResponse();
        return TeaModel.build(map, self);
    }

    public QueryAuthCertClaimResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAuthCertClaimResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAuthCertClaimResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAuthCertClaimResponse setVcId(String vcId) {
        this.vcId = vcId;
        return this;
    }
    public String getVcId() {
        return this.vcId;
    }

    public QueryAuthCertClaimResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryAuthCertClaimResponse setVcContent(String vcContent) {
        this.vcContent = vcContent;
        return this;
    }
    public String getVcContent() {
        return this.vcContent;
    }

    public QueryAuthCertClaimResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryAuthCertClaimResponse setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public QueryAuthCertClaimResponse setExpire(Long expire) {
        this.expire = expire;
        return this;
    }
    public Long getExpire() {
        return this.expire;
    }

    public QueryAuthCertClaimResponse setRevocable(Boolean revocable) {
        this.revocable = revocable;
        return this;
    }
    public Boolean getRevocable() {
        return this.revocable;
    }

    public QueryAuthCertClaimResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public QueryAuthCertClaimResponse setGmtTransmit(String gmtTransmit) {
        this.gmtTransmit = gmtTransmit;
        return this;
    }
    public String getGmtTransmit() {
        return this.gmtTransmit;
    }

}
