// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class AssetInfo extends TeaModel {
    // 资产Id
    @NameInMap("asset_id")
    public String assetId;

    // 数据字典Id
    @NameInMap("template_id")
    public String templateId;

    // 资产内容
    @NameInMap("content")
    public String content;

    // 链信息
    @NameInMap("blockchain_info")
    public BlockchainInfo blockchainInfo;

    // 短码
    @NameInMap("qr_code")
    public String qrCode;

    public static AssetInfo build(java.util.Map<String, ?> map) throws Exception {
        AssetInfo self = new AssetInfo();
        return TeaModel.build(map, self);
    }

    public AssetInfo setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public AssetInfo setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public AssetInfo setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AssetInfo setBlockchainInfo(BlockchainInfo blockchainInfo) {
        this.blockchainInfo = blockchainInfo;
        return this;
    }
    public BlockchainInfo getBlockchainInfo() {
        return this.blockchainInfo;
    }

    public AssetInfo setQrCode(String qrCode) {
        this.qrCode = qrCode;
        return this;
    }
    public String getQrCode() {
        return this.qrCode;
    }

}
