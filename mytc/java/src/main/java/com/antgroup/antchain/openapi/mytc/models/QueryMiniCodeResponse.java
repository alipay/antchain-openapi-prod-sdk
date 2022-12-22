// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryMiniCodeResponse extends TeaModel {
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

    public static QueryMiniCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMiniCodeResponse self = new QueryMiniCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryMiniCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMiniCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMiniCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMiniCodeResponse setScanInfo(ScanHeadInfo scanInfo) {
        this.scanInfo = scanInfo;
        return this;
    }
    public ScanHeadInfo getScanInfo() {
        return this.scanInfo;
    }

    public QueryMiniCodeResponse setPhaseInfos(java.util.List<PhaseInfo> phaseInfos) {
        this.phaseInfos = phaseInfos;
        return this;
    }
    public java.util.List<PhaseInfo> getPhaseInfos() {
        return this.phaseInfos;
    }

}
