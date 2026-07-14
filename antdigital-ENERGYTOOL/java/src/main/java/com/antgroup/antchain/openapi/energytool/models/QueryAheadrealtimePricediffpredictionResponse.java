// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energytool.models;

import com.aliyun.tea.*;

public class QueryAheadrealtimePricediffpredictionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 全天价差方向预测准确率
    @NameInMap("pre_accuracy")
    public String preAccuracy;

    // 光伏价差方向预测准确率
    @NameInMap("pv_pre_accuracy")
    public String pvPreAccuracy;

    // 价差预测列表
    @NameInMap("price_diff_prediction_list")
    public java.util.List<AheadRealtimePriceDiffPredictionData> priceDiffPredictionList;

    public static QueryAheadrealtimePricediffpredictionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAheadrealtimePricediffpredictionResponse self = new QueryAheadrealtimePricediffpredictionResponse();
        return TeaModel.build(map, self);
    }

    public QueryAheadrealtimePricediffpredictionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAheadrealtimePricediffpredictionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAheadrealtimePricediffpredictionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAheadrealtimePricediffpredictionResponse setPreAccuracy(String preAccuracy) {
        this.preAccuracy = preAccuracy;
        return this;
    }
    public String getPreAccuracy() {
        return this.preAccuracy;
    }

    public QueryAheadrealtimePricediffpredictionResponse setPvPreAccuracy(String pvPreAccuracy) {
        this.pvPreAccuracy = pvPreAccuracy;
        return this;
    }
    public String getPvPreAccuracy() {
        return this.pvPreAccuracy;
    }

    public QueryAheadrealtimePricediffpredictionResponse setPriceDiffPredictionList(java.util.List<AheadRealtimePriceDiffPredictionData> priceDiffPredictionList) {
        this.priceDiffPredictionList = priceDiffPredictionList;
        return this;
    }
    public java.util.List<AheadRealtimePriceDiffPredictionData> getPriceDiffPredictionList() {
        return this.priceDiffPredictionList;
    }

}
