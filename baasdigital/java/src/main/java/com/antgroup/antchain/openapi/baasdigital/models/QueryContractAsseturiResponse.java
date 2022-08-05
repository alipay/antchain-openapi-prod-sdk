// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractAsseturiResponse extends TeaModel {
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

    // 客户端传入的权证id
    @NameInMap("asset_id")
    public String assetId;

    // 数字权证绑定的标准URI协议文件，权证信息
    @NameInMap("asset_uri")
    public String assetUri;

    public static QueryContractAsseturiResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractAsseturiResponse self = new QueryContractAsseturiResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractAsseturiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractAsseturiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractAsseturiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractAsseturiResponse setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public QueryContractAsseturiResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryContractAsseturiResponse setAssetUri(String assetUri) {
        this.assetUri = assetUri;
        return this;
    }
    public String getAssetUri() {
        return this.assetUri;
    }

}
