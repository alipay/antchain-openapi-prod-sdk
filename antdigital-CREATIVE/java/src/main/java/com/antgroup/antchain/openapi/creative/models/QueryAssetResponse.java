// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产ID
    @NameInMap("asset_id")
    public String assetId;

    // 资产状态
    @NameInMap("status")
    public String status;

    // 资产类型
    @NameInMap("asset_type")
    public String assetType;

    // 资产类型
    @NameInMap("asset_url")
    public String assetUrl;

    // 错误信息
    @NameInMap("error_message")
    public String errorMessage;

    // 错误码
    @NameInMap("error_code")
    public String errorCode;

    public static QueryAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAssetResponse self = new QueryAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAssetResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryAssetResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAssetResponse setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public QueryAssetResponse setAssetUrl(String assetUrl) {
        this.assetUrl = assetUrl;
        return this;
    }
    public String getAssetUrl() {
        return this.assetUrl;
    }

    public QueryAssetResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryAssetResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
