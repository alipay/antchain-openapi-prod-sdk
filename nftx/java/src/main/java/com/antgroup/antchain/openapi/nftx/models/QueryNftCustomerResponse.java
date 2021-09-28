// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class QueryNftCustomerResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // NFT商品的商品编码
    @NameInMap("sku_id")
    public Long skuId;

    // NFT资产的唯一编码
    @NameInMap("nft_id")
    public String nftId;

    // NFT商品的名称
    @NameInMap("sku_name")
    public String skuName;

    // NFT的创作者名称
    @NameInMap("author_name")
    public String authorName;

    // NFT的发行方名称
    @NameInMap("issuer_name")
    public String issuerName;

    // 缩略图url，带5分钟鉴权
    @NameInMap("mini_image_path")
    public String miniImagePath;

    public static QueryNftCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryNftCustomerResponse self = new QueryNftCustomerResponse();
        return TeaModel.build(map, self);
    }

    public QueryNftCustomerResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryNftCustomerResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryNftCustomerResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryNftCustomerResponse setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public QueryNftCustomerResponse setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public QueryNftCustomerResponse setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public QueryNftCustomerResponse setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public QueryNftCustomerResponse setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public QueryNftCustomerResponse setMiniImagePath(String miniImagePath) {
        this.miniImagePath = miniImagePath;
        return this;
    }
    public String getMiniImagePath() {
        return this.miniImagePath;
    }

}
