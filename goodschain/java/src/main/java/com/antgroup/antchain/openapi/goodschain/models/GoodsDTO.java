// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.goodschain.models;

import com.aliyun.tea.*;

public class GoodsDTO extends TeaModel {
    // 商品id
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品模板id
    @NameInMap("template_id")
    @Validation(required = true)
    public String templateId;

    // 商品内容
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 二维码地址
    @NameInMap("qr_code")
    @Validation(required = true)
    public String qrCode;

    // 区块链信息
    @NameInMap("blockchain_info")
    @Validation(required = true)
    public BlockchainInfoDTO blockchainInfo;

    public static GoodsDTO build(java.util.Map<String, ?> map) throws Exception {
        GoodsDTO self = new GoodsDTO();
        return TeaModel.build(map, self);
    }

    public GoodsDTO setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public GoodsDTO setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public GoodsDTO setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public GoodsDTO setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

    public GoodsDTO setBlockchainInfo(BlockchainInfoDTO blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfoDTO getBlockchainInfo() {
        return this.blockchainInfo;
    }

}
