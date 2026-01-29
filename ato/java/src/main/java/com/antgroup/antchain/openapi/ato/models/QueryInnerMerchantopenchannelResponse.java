// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerMerchantopenchannelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已经进件支付渠道信息
    @NameInMap("merchant_pay_channel_info_list")
    public java.util.List<MerchantPayChannelInfo> merchantPayChannelInfoList;

    public static QueryInnerMerchantopenchannelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerMerchantopenchannelResponse self = new QueryInnerMerchantopenchannelResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerMerchantopenchannelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerMerchantopenchannelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerMerchantopenchannelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerMerchantopenchannelResponse setMerchantPayChannelInfoList(java.util.List<MerchantPayChannelInfo> merchantPayChannelInfoList) {
        this.merchantPayChannelInfoList = merchantPayChannelInfoList;
        return this;
    }
    public java.util.List<MerchantPayChannelInfo> getMerchantPayChannelInfoList() {
        return this.merchantPayChannelInfoList;
    }

}
