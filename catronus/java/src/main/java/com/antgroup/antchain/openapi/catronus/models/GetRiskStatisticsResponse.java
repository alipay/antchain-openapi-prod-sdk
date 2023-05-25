// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class GetRiskStatisticsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 风险总数
    @NameInMap("total_risk_tasks_count")
    public Long totalRiskTasksCount;

    // 未修复风险数
    @NameInMap("unfixed_risk_tasks_count")
    public Long unfixedRiskTasksCount;

    // 未响应风险数
    @NameInMap("unconfirmed_risks_tasks_count")
    public Long unconfirmedRisksTasksCount;

    // 镜像漏洞风险数
    @NameInMap("image_risk_tasks_count")
    public Long imageRiskTasksCount;

    // 基线风险数
    @NameInMap("benchmark_risk_tasks_count")
    public Long benchmarkRiskTasksCount;

    // 运行时风险数
    @NameInMap("runtime_risk_tasks_count")
    public Long runtimeRiskTasksCount;

    public static GetRiskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatisticsResponse self = new GetRiskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskStatisticsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetRiskStatisticsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetRiskStatisticsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetRiskStatisticsResponse setTotalRiskTasksCount(Long totalRiskTasksCount) {
        this.totalRiskTasksCount = totalRiskTasksCount;
        return this;
    }
    public Long getTotalRiskTasksCount() {
        return this.totalRiskTasksCount;
    }

    public GetRiskStatisticsResponse setUnfixedRiskTasksCount(Long unfixedRiskTasksCount) {
        this.unfixedRiskTasksCount = unfixedRiskTasksCount;
        return this;
    }
    public Long getUnfixedRiskTasksCount() {
        return this.unfixedRiskTasksCount;
    }

    public GetRiskStatisticsResponse setUnconfirmedRisksTasksCount(Long unconfirmedRisksTasksCount) {
        this.unconfirmedRisksTasksCount = unconfirmedRisksTasksCount;
        return this;
    }
    public Long getUnconfirmedRisksTasksCount() {
        return this.unconfirmedRisksTasksCount;
    }

    public GetRiskStatisticsResponse setImageRiskTasksCount(Long imageRiskTasksCount) {
        this.imageRiskTasksCount = imageRiskTasksCount;
        return this;
    }
    public Long getImageRiskTasksCount() {
        return this.imageRiskTasksCount;
    }

    public GetRiskStatisticsResponse setBenchmarkRiskTasksCount(Long benchmarkRiskTasksCount) {
        this.benchmarkRiskTasksCount = benchmarkRiskTasksCount;
        return this;
    }
    public Long getBenchmarkRiskTasksCount() {
        return this.benchmarkRiskTasksCount;
    }

    public GetRiskStatisticsResponse setRuntimeRiskTasksCount(Long runtimeRiskTasksCount) {
        this.runtimeRiskTasksCount = runtimeRiskTasksCount;
        return this;
    }
    public Long getRuntimeRiskTasksCount() {
        return this.runtimeRiskTasksCount;
    }

}
