// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdiaiwork.models;

import com.aliyun.tea.*;

public class QueryAntdigitalCorlabFeatureminingPlanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // IV信息，包含每轮信息和特征挖掘报告下载链接
    @NameInMap("iv_info")
    public IvInfo ivInfo;

    // 最好模型效果报告
    @NameInMap("best_model_report")
    public BestModelReport bestModelReport;

    public static QueryAntdigitalCorlabFeatureminingPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalCorlabFeatureminingPlanResponse self = new QueryAntdigitalCorlabFeatureminingPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalCorlabFeatureminingPlanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalCorlabFeatureminingPlanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalCorlabFeatureminingPlanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalCorlabFeatureminingPlanResponse setIvInfo(IvInfo ivInfo) {
        this.ivInfo = ivInfo;
        return this;
    }
    public IvInfo getIvInfo() {
        return this.ivInfo;
    }

    public QueryAntdigitalCorlabFeatureminingPlanResponse setBestModelReport(BestModelReport bestModelReport) {
        this.bestModelReport = bestModelReport;
        return this;
    }
    public BestModelReport getBestModelReport() {
        return this.bestModelReport;
    }

}
