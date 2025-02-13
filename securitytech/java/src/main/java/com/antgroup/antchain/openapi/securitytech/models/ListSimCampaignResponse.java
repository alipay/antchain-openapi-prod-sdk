// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class ListSimCampaignResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 营销活动列表
    @NameInMap("campaign_list")
    public java.util.List<SimCampaignInfo> campaignList;

    public static ListSimCampaignResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSimCampaignResponse self = new ListSimCampaignResponse();
        return TeaModel.build(map, self);
    }

    public ListSimCampaignResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListSimCampaignResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListSimCampaignResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListSimCampaignResponse setCampaignList(java.util.List<SimCampaignInfo> campaignList) {
        this.campaignList = campaignList;
        return this;
    }
    public java.util.List<SimCampaignInfo> getCampaignList() {
        return this.campaignList;
    }

}
