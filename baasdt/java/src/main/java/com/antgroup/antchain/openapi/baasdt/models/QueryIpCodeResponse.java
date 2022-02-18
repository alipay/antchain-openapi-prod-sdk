// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpCodeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数字凭证信息
    @NameInMap("code_info")
    public IPCodeScannedInfo codeInfo;

    // 首次扫码信息
    @NameInMap("first_scanned_info")
    public IPSimpleScannedInfo firstScannedInfo;

    // 扫码信息
    @NameInMap("scanned_info_list")
    public java.util.List<IPSimpleScannedInfo> scannedInfoList;

    // 扫码次数
    @NameInMap("scanned_count")
    public Long scannedCount;

    public static QueryIpCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpCodeResponse self = new QueryIpCodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpCodeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpCodeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpCodeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpCodeResponse setCodeInfo(IPCodeScannedInfo codeInfo) {
        this.codeInfo = codeInfo;
        return this;
    }
    public IPCodeScannedInfo getCodeInfo() {
        return this.codeInfo;
    }

    public QueryIpCodeResponse setFirstScannedInfo(IPSimpleScannedInfo firstScannedInfo) {
        this.firstScannedInfo = firstScannedInfo;
        return this;
    }
    public IPSimpleScannedInfo getFirstScannedInfo() {
        return this.firstScannedInfo;
    }

    public QueryIpCodeResponse setScannedInfoList(java.util.List<IPSimpleScannedInfo> scannedInfoList) {
        this.scannedInfoList = scannedInfoList;
        return this;
    }
    public java.util.List<IPSimpleScannedInfo> getScannedInfoList() {
        return this.scannedInfoList;
    }

    public QueryIpCodeResponse setScannedCount(Long scannedCount) {
        this.scannedCount = scannedCount;
        return this;
    }
    public Long getScannedCount() {
        return this.scannedCount;
    }

}
