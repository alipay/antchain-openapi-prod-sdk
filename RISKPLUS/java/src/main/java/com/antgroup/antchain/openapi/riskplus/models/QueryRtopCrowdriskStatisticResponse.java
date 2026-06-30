// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRtopCrowdriskStatisticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("level_distribution")
    public java.util.List<RtopLevelDistribution> levelDistribution;

    // 按地区统计
    @NameInMap("region_distribution")
    public java.util.List<RtopRegionalDistribution> regionDistribution;

    @NameInMap("type_distribution")
    public java.util.List<RtopTypeDistribution> typeDistribution;

    public static QueryRtopCrowdriskStatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRtopCrowdriskStatisticResponse self = new QueryRtopCrowdriskStatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryRtopCrowdriskStatisticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRtopCrowdriskStatisticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRtopCrowdriskStatisticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRtopCrowdriskStatisticResponse setLevelDistribution(java.util.List<RtopLevelDistribution> levelDistribution) {
        this.levelDistribution = levelDistribution;
        return this;
    }
    public java.util.List<RtopLevelDistribution> getLevelDistribution() {
        return this.levelDistribution;
    }

    public QueryRtopCrowdriskStatisticResponse setRegionDistribution(java.util.List<RtopRegionalDistribution> regionDistribution) {
        this.regionDistribution = regionDistribution;
        return this;
    }
    public java.util.List<RtopRegionalDistribution> getRegionDistribution() {
        return this.regionDistribution;
    }

    public QueryRtopCrowdriskStatisticResponse setTypeDistribution(java.util.List<RtopTypeDistribution> typeDistribution) {
        this.typeDistribution = typeDistribution;
        return this;
    }
    public java.util.List<RtopTypeDistribution> getTypeDistribution() {
        return this.typeDistribution;
    }

}
