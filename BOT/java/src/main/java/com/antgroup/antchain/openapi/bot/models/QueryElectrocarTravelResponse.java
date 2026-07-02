// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarTravelResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 接口调用结果
    @NameInMap("success")
    public Boolean success;

    // 概览信息,
    // bean 定义：
    // 行程统计：TripStatisticsView
    // 行程列表：-
    // 行程详情：TripTraceView
    @NameInMap("over_view")
    public String overView;

    // 详情列表
    // bean 定义：
    // 行程统计：TripStatistics
    // 行程列表：TripView
    // 行程详情：TripTrace
    @NameInMap("detail_list")
    public java.util.List<String> detailList;

    public static QueryElectrocarTravelResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarTravelResponse self = new QueryElectrocarTravelResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarTravelResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarTravelResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarTravelResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarTravelResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryElectrocarTravelResponse setOverView(String overView) {
        this.overView = overView;
        return this;
    }
    public String getOverView() {
        return this.overView;
    }

    public QueryElectrocarTravelResponse setDetailList(java.util.List<String> detailList) {
        this.detailList = detailList;
        return this;
    }
    public java.util.List<String> getDetailList() {
        return this.detailList;
    }

}
