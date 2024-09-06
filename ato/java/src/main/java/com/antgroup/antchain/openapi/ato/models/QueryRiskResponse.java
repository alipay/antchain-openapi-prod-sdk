// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 模型结果详情
    @NameInMap("models")
    public java.util.List<RiskModel> models;

    // 智租风控-风控模型结果
    @NameInMap("applet_model")
    public AppletRiskModel appletModel;

    public static QueryRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskResponse self = new QueryRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRiskResponse setModels(java.util.List<RiskModel> models) {
        this.models = models;
        return this;
    }
    public java.util.List<RiskModel> getModels() {
        return this.models;
    }

    public QueryRiskResponse setAppletModel(AppletRiskModel appletModel) {
        this.appletModel = appletModel;
        return this;
    }
    public AppletRiskModel getAppletModel() {
        return this.appletModel;
    }

}
