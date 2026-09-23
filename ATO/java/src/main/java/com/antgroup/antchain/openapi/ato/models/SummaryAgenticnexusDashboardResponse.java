// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SummaryAgenticnexusDashboardResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回显目标领域: PREFILTER 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    @NameInMap("module")
    public String module;

    // 领域总结
    @NameInMap("summary")
    public String summary;

    public static SummaryAgenticnexusDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        SummaryAgenticnexusDashboardResponse self = new SummaryAgenticnexusDashboardResponse();
        return TeaModel.build(map, self);
    }

    public SummaryAgenticnexusDashboardResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SummaryAgenticnexusDashboardResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SummaryAgenticnexusDashboardResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SummaryAgenticnexusDashboardResponse setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public SummaryAgenticnexusDashboardResponse setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

}
