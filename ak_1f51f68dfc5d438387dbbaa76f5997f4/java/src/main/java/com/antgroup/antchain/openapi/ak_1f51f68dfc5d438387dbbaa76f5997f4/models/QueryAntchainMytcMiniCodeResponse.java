// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_1f51f68dfc5d438387dbbaa76f5997f4.models;

import com.aliyun.tea.*;

public class QueryAntchainMytcMiniCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 首次扫描信息
    @NameInMap("scan_info")
    public ScanHeadInfo scanInfo;

    // 溯源环节信息列表
    @NameInMap("phase_infos")
    public java.util.List<PhaseInfo> phaseInfos;

    public static QueryAntchainMytcMiniCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainMytcMiniCodeResponse self = new QueryAntchainMytcMiniCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainMytcMiniCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainMytcMiniCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainMytcMiniCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainMytcMiniCodeResponse setScanInfo(ScanHeadInfo scanInfo) {
        this.scanInfo = scanInfo;
        return this;
    }
    public ScanHeadInfo getScanInfo() {
        return this.scanInfo;
    }

    public QueryAntchainMytcMiniCodeResponse setPhaseInfos(java.util.List<PhaseInfo> phaseInfos) {
        this.phaseInfos = phaseInfos;
        return this;
    }
    public java.util.List<PhaseInfo> getPhaseInfos() {
        return this.phaseInfos;
    }

}
