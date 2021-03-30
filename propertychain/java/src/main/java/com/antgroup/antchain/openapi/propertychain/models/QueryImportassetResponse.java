// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryImportassetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 物权信息
    @NameInMap("asset")
    public AssetInfo asset;

    // 时间
    @NameInMap("date")
    public Long date;

    // 请求id
    @NameInMap("request_id")
    public String requestId;

    public static QueryImportassetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryImportassetResponse self = new QueryImportassetResponse();
        return TeaModel.build(map, self);
    }

    public QueryImportassetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryImportassetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryImportassetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryImportassetResponse setAsset(AssetInfo asset) {
        this.asset = asset;
        return this;
    }
    public AssetInfo getAsset() {
        return this.asset;
    }

    public QueryImportassetResponse setDate(Long date) {
        this.date = date;
        return this;
    }
    public Long getDate() {
        return this.date;
    }

    public QueryImportassetResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
