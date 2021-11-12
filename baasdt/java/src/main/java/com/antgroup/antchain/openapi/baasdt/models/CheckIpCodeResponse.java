// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CheckIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 被扫描的次数(包含本次)
    @NameInMap("scanned_count")
    public Long scannedCount;

    // 扫描历史列表(仅展示最近扫描的50次信息)
    @NameInMap("scanned_list")
    public java.util.List<IPCodeScannedInfo> scannedList;

    // 正版码的详情，如果为空，则正版码未领取，如果不为空，则正版码已领取
    @NameInMap("code_detail")
    public IPCodeScannedInfo codeDetail;

    public static CheckIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIpCodeResponse self = new CheckIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public CheckIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckIpCodeResponse setScannedCount(Long scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }
    public Long getScannedCount() {
        return this.scannedCount;
    }

    public CheckIpCodeResponse setScannedList(java.util.List<IPCodeScannedInfo> scannedList) {
        this.scannedList = scannedList;
        return this;
    }
    public java.util.List<IPCodeScannedInfo> getScannedList() {
        return this.scannedList;
    }

    public CheckIpCodeResponse setCodeDetail(IPCodeScannedInfo codeDetail) {
        this.codeDetail = codeDetail;
        return this;
    }
    public IPCodeScannedInfo getCodeDetail() {
        return this.codeDetail;
    }

}
