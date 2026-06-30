// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktCampaignTaskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 圈投计划id
    @NameInMap("campaign_id")
    public Long campaignId;

    // 圈投任务列表
    @NameInMap("campaign_task_list")
    public java.util.List<UmktCampaignTaskInfo> campaignTaskList;

    public static QueryUmktCampaignTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktCampaignTaskResponse self = new QueryUmktCampaignTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktCampaignTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktCampaignTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktCampaignTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktCampaignTaskResponse setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
        return this;
    }
    public Long getCampaignId() {
        return this.campaignId;
    }

    public QueryUmktCampaignTaskResponse setCampaignTaskList(java.util.List<UmktCampaignTaskInfo> campaignTaskList) {
        this.campaignTaskList = campaignTaskList;
        return this;
    }
    public java.util.List<UmktCampaignTaskInfo> getCampaignTaskList() {
        return this.campaignTaskList;
    }

}
