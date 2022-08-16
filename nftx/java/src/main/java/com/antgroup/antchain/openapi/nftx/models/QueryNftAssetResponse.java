// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftAssetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 藏品ID
    @NameInMap("nft_id")
    public String nftId;

    // 藏品名称
    @NameInMap("sku_name")
    public String skuName;

    // 藏品SKU ID
    @NameInMap("sku_id")
    public Long skuId;

    // 此藏品对应的uniHash值
    @NameInMap("uni_hash")
    public String uniHash;

    // 藏品铸造时间
    @NameInMap("creation_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String creationTime;

    public static QueryNftAssetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNftAssetResponse self = new QueryNftAssetResponse();
        return TeaModel.build(map, self);
    }

    public QueryNftAssetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNftAssetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNftAssetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNftAssetResponse setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public QueryNftAssetResponse setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public QueryNftAssetResponse setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public QueryNftAssetResponse setUniHash(String uniHash) {
        this.uniHash = uniHash;
        return this;
    }
    public String getUniHash() {
        return this.uniHash;
    }

    public QueryNftAssetResponse setCreationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    public String getCreationTime() {
        return this.creationTime;
    }

}
