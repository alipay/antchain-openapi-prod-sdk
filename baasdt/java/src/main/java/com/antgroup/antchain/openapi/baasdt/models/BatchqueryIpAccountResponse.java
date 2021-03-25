// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BatchqueryIpAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 批量查询商家信息
    @NameInMap("apply_infos")
    public java.util.List<IPMerchantApplyInfo> applyInfos;

    public static BatchqueryIpAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryIpAccountResponse self = new BatchqueryIpAccountResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryIpAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryIpAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryIpAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryIpAccountResponse setApplyInfos(java.util.List<IPMerchantApplyInfo> applyInfos) {
        this.applyInfos = applyInfos;
        return this;
    }
    public java.util.List<IPMerchantApplyInfo> getApplyInfos() {
        return this.applyInfos;
    }

}
