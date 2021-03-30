// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryWaybillStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 运单状态
    // 
    @NameInMap("status")
    public String status;

    // 轨迹核验结果
    @NameInMap("track_check_result")
    public TrackCheckResult trackCheckResult;

    public static QueryWaybillStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWaybillStatusResponse self = new QueryWaybillStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryWaybillStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWaybillStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWaybillStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWaybillStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryWaybillStatusResponse setTrackCheckResult(TrackCheckResult trackCheckResult) {
        this.trackCheckResult = trackCheckResult;
        return this;
    }
    public TrackCheckResult getTrackCheckResult() {
        return this.trackCheckResult;
    }

}
