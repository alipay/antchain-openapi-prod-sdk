// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.nftx.models;

import com.aliyun.tea.*;

public class UserAsset extends TeaModel {
    // NFT商品的商品编码
    @NameInMap("sku_id")
    @Validation(required = true)
    public Long skuId;

    // NFT资产的唯一编码
    @NameInMap("nft_id")
    @Validation(required = true)
    public String nftId;

    // NFT商品的名称
    @NameInMap("sku_name")
    @Validation(required = true)
    public String skuName;

    // NFT的创作者名称
    @NameInMap("author_name")
    @Validation(required = true)
    public String authorName;

    // NFT的发行方名称
    @NameInMap("issuer_name")
    @Validation(required = true)
    public String issuerName;

    // 缩略图url，带5分钟鉴权
    @NameInMap("mini_image_path")
    @Validation(required = true)
    public String miniImagePath;

    public static UserAsset build(java.util.Map<String, ?> map) throws Exception {
        UserAsset self = new UserAsset();
        return TeaModel.build(map, self);
    }

    public UserAsset setSkuId(Long skuId) {
        this.skuId = skuId;
        return this;
    }
    public Long getSkuId() {
        return this.skuId;
    }

    public UserAsset setNftId(String nftId) {
        this.nftId = nftId;
        return this;
    }
    public String getNftId() {
        return this.nftId;
    }

    public UserAsset setSkuName(String skuName) {
        this.skuName = skuName;
        return this;
    }
    public String getSkuName() {
        return this.skuName;
    }

    public UserAsset setAuthorName(String authorName) {
        this.authorName = authorName;
        return this;
    }
    public String getAuthorName() {
        return this.authorName;
    }

    public UserAsset setIssuerName(String issuerName) {
        this.issuerName = issuerName;
        return this;
    }
    public String getIssuerName() {
        return this.issuerName;
    }

    public UserAsset setMiniImagePath(String miniImagePath) {
        this.miniImagePath = miniImagePath;
        return this;
    }
    public String getMiniImagePath() {
        return this.miniImagePath;
    }

}
