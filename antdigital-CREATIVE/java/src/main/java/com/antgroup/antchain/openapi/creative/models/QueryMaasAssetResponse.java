// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.creative.models;

import com.aliyun.tea.*;

public class QueryMaasAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产 ID
    @NameInMap("asset_id")
    public String assetId;

    // 状态
    @NameInMap("status")
    public String status;

    // 资产类型
    @NameInMap("asset_type")
    public String assetType;

    // 资产访问 URL，仅在已取得可访问地址时返回
    @NameInMap("url")
    public String url;

    // 素材名称，可选
    @NameInMap("name")
    public String name;

    // 创建时间，Unix 秒级时间戳，可选
    @NameInMap("created_at")
    public String createdAt;

    // 更新时间，Unix 秒级时间戳，可选
    @NameInMap("updated_at")
    public String updatedAt;

    // 处理失败时返回，包含 code / message
    @NameInMap("error")
    public Error error;

    public static QueryMaasAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMaasAssetResponse self = new QueryMaasAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryMaasAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMaasAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMaasAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMaasAssetResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public QueryMaasAssetResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryMaasAssetResponse setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public QueryMaasAssetResponse setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public QueryMaasAssetResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public QueryMaasAssetResponse setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public QueryMaasAssetResponse setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public QueryMaasAssetResponse setError(Error error) {
        this.error = error;
        return this;
    }
    public Error getError() {
        return this.error;
    }

}
