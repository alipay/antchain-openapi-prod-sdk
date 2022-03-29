// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetUnifiedalarmTplResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 告警规则模板详情
    @NameInMap("alarm_tpl")
    public UnifiedAlarmTplVO alarmTpl;

    public static GetUnifiedalarmTplResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUnifiedalarmTplResponse self = new GetUnifiedalarmTplResponse();
        return TeaModel.build(map, self);
    }

    public GetUnifiedalarmTplResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetUnifiedalarmTplResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetUnifiedalarmTplResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetUnifiedalarmTplResponse setAlarmTpl(UnifiedAlarmTplVO alarmTpl) {
        this.alarmTpl = alarmTpl;
        return this;
    }
    public UnifiedAlarmTplVO getAlarmTpl() {
        return this.alarmTpl;
    }

}
