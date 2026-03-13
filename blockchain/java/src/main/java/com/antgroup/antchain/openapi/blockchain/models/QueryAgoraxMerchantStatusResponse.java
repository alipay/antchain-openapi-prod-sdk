// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryAgoraxMerchantStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请总体状态
    @NameInMap("status")
    public String status;

    // 二级商户id
    @NameInMap("smid")
    public String smid;

    // 失败原因说明
    @NameInMap("reason")
    public String reason;

    // 进件生成的卡编号
    @NameInMap("card_alias_no")
    public String cardAliasNo;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryAgoraxMerchantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAgoraxMerchantStatusResponse self = new QueryAgoraxMerchantStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAgoraxMerchantStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAgoraxMerchantStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAgoraxMerchantStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAgoraxMerchantStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAgoraxMerchantStatusResponse setSmid(String smid) {
        this.smid = smid;
        return this;
    }
    public String getSmid() {
        return this.smid;
    }

    public QueryAgoraxMerchantStatusResponse setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueryAgoraxMerchantStatusResponse setCardAliasNo(String cardAliasNo) {
        this.cardAliasNo = cardAliasNo;
        return this;
    }
    public String getCardAliasNo() {
        return this.cardAliasNo;
    }

    public QueryAgoraxMerchantStatusResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
