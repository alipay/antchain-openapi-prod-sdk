// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.finmaterial.models;

import com.aliyun.tea.*;

public class QueryMcpAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 资产类别
    @NameInMap("asset_type")
    public String assetType;

    // 资产名称
    @NameInMap("asset_name")
    public String assetName;

    // 跟踪指数代码
    @NameInMap("track_index_code")
    public String trackIndexCode;

    // 跟踪指数简称
    @NameInMap("track_index_abbr")
    public String trackIndexAbbr;

    // 排序
    @NameInMap("sort_order")
    public Long sortOrder;

    public static QueryMcpAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMcpAssetResponse self = new QueryMcpAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryMcpAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMcpAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMcpAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMcpAssetResponse setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
    }

    public QueryMcpAssetResponse setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public QueryMcpAssetResponse setTrackIndexCode(String trackIndexCode) {
        this.trackIndexCode = trackIndexCode;
        return this;
    }
    public String getTrackIndexCode() {
        return this.trackIndexCode;
    }

    public QueryMcpAssetResponse setTrackIndexAbbr(String trackIndexAbbr) {
        this.trackIndexAbbr = trackIndexAbbr;
        return this;
    }
    public String getTrackIndexAbbr() {
        return this.trackIndexAbbr;
    }

    public QueryMcpAssetResponse setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public Long getSortOrder() {
        return this.sortOrder;
    }

}
