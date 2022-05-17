// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryAppportraitAlertcounttrendResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应用画像告警数趋势
    @NameInMap("data")
    public java.util.List<AppPortraitAlertCountTrend> data;

    public static QueryAppportraitAlertcounttrendResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppportraitAlertcounttrendResponse self = new QueryAppportraitAlertcounttrendResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppportraitAlertcounttrendResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppportraitAlertcounttrendResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppportraitAlertcounttrendResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppportraitAlertcounttrendResponse setData(java.util.List<AppPortraitAlertCountTrend> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AppPortraitAlertCountTrend> getData() {
        return this.data;
    }

}
