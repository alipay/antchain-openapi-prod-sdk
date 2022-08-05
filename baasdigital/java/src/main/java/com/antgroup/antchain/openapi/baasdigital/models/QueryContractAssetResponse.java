// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户端传入的请求唯一标识
    @NameInMap("trace_id")
    public String traceId;

    // 客户端传入的查询账户
    @NameInMap("account")
    public String account;

    // 目标账户拥有的权证列表
    @NameInMap("asset_id_list")
    public java.util.List<String> assetIdList;

    public static QueryContractAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAssetResponse self = new QueryContractAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractAssetResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryContractAssetResponse setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public QueryContractAssetResponse setAssetIdList(java.util.List<String> assetIdList) {
        this.assetIdList = assetIdList;
        return this;
    }
    public java.util.List<String> getAssetIdList() {
        return this.assetIdList;
    }

}
