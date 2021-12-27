// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ExecSecurityRiskdataserviceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 反欺诈风险数据服务申请成功时返回的查询凭证（申请请求时存在）
    @NameInMap("risk_data_service_apply_id")
    public String riskDataServiceApplyId;

    // 反欺诈风险数据服务查询请求结果中风险详细信息字段（查询请求时存在）
    @NameInMap("risk_infos")
    public java.util.List<RiskInfo> riskInfos;

    // 请求响应业务唯一id
    @NameInMap("security_id")
    public String securityId;

    // 反欺诈风险数据服务查询成功时得到风险建议结果信息（查询请求时存在）
    @NameInMap("security_result_infos")
    public SecurityResultInfos securityResultInfos;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    public static ExecSecurityRiskdataserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecSecurityRiskdataserviceResponse self = new ExecSecurityRiskdataserviceResponse();
        return TeaModel.build(map, self);
    }

    public ExecSecurityRiskdataserviceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecSecurityRiskdataserviceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecSecurityRiskdataserviceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecSecurityRiskdataserviceResponse setRiskDataServiceApplyId(String riskDataServiceApplyId) {
        this.riskDataServiceApplyId = riskDataServiceApplyId;
        return this;
    }
    public String getRiskDataServiceApplyId() {
        return this.riskDataServiceApplyId;
    }

    public ExecSecurityRiskdataserviceResponse setRiskInfos(java.util.List<RiskInfo> riskInfos) {
        this.riskInfos = riskInfos;
        return this;
    }
    public java.util.List<RiskInfo> getRiskInfos() {
        return this.riskInfos;
    }

    public ExecSecurityRiskdataserviceResponse setSecurityId(String securityId) {
        this.securityId = securityId;
        return this;
    }
    public String getSecurityId() {
        return this.securityId;
    }

    public ExecSecurityRiskdataserviceResponse setSecurityResultInfos(SecurityResultInfos securityResultInfos) {
        this.securityResultInfos = securityResultInfos;
        return this;
    }
    public SecurityResultInfos getSecurityResultInfos() {
        return this.securityResultInfos;
    }

    public ExecSecurityRiskdataserviceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
