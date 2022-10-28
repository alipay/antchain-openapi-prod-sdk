// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CheckIpCodebyphoneResponse extends TeaModel {
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

    // 暂不使用该值//扫描历史列表(仅展示最近扫描的50次信息)
    @NameInMap("scanned_list")
    public java.util.List<IPCodeScannedInfo> scannedList;

    // 数字凭证的详情，始终不为空，如果类型中的user_name为空，则数字凭证未领取，如果不为空，则数字凭证已领取
    @NameInMap("code_detail")
    public IPCodeScannedInfo codeDetail;

    // 首次扫码信息
    @NameInMap("first_scanned_info")
    public IPSimpleScannedInfo firstScannedInfo;

    // 扫码信息
    @NameInMap("scanned_info_list")
    public java.util.List<IPSimpleScannedInfo> scannedInfoList;

    public static CheckIpCodebyphoneResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckIpCodebyphoneResponse self = new CheckIpCodebyphoneResponse();
        return TeaModel.build(map, self);
    }

    public CheckIpCodebyphoneResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CheckIpCodebyphoneResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CheckIpCodebyphoneResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CheckIpCodebyphoneResponse setScannedCount(Long scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }
    public Long getScannedCount() {
        return this.scannedCount;
    }

    public CheckIpCodebyphoneResponse setScannedList(java.util.List<IPCodeScannedInfo> scannedList) {
        this.scannedList = scannedList;
        return this;
    }
    public java.util.List<IPCodeScannedInfo> getScannedList() {
        return this.scannedList;
    }

    public CheckIpCodebyphoneResponse setCodeDetail(IPCodeScannedInfo codeDetail) {
        this.codeDetail = codeDetail;
        return this;
    }
    public IPCodeScannedInfo getCodeDetail() {
        return this.codeDetail;
    }

    public CheckIpCodebyphoneResponse setFirstScannedInfo(IPSimpleScannedInfo firstScannedInfo) {
        this.firstScannedInfo = firstScannedInfo;
        return this;
    }
    public IPSimpleScannedInfo getFirstScannedInfo() {
        return this.firstScannedInfo;
    }

    public CheckIpCodebyphoneResponse setScannedInfoList(java.util.List<IPSimpleScannedInfo> scannedInfoList) {
        this.scannedInfoList = scannedInfoList;
        return this;
    }
    public java.util.List<IPSimpleScannedInfo> getScannedInfoList() {
        return this.scannedInfoList;
    }

}
