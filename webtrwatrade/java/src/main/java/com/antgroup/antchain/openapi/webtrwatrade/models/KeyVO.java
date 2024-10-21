// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class KeyVO extends TeaModel {
    // 密钥id
    @NameInMap("key_id")
    @Validation(required = true)
    public String keyId;

    // 密钥名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 创建类型
    // KEY_FILE：上传密钥文件
    // CREATE_NEW_KEY：系统创建密钥
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 钱包地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 关联项目数量
    @NameInMap("quantity")
    @Validation(required = true)
    public String quantity;

    // 创建时间
    @NameInMap("gmt_created")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreated;

    // 是否支持删除
    @NameInMap("delete_enable")
    @Validation(required = true)
    public Boolean deleteEnable;

    // 资产项目信息
    @NameInMap("asset_project_info")
    @Validation(required = true)
    public KeyProjectInfo assetProjectInfo;

    public static KeyVO build(java.util.Map<String, ?> map) throws Exception {
        KeyVO self = new KeyVO();
        return TeaModel.build(map, self);
    }

    public KeyVO setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public KeyVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public KeyVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public KeyVO setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public KeyVO setQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
    public String getQuantity() {
        return this.quantity;
    }

    public KeyVO setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public KeyVO setDeleteEnable(Boolean deleteEnable) {
        this.deleteEnable = deleteEnable;
        return this;
    }
    public Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public KeyVO setAssetProjectInfo(KeyProjectInfo assetProjectInfo) {
        this.assetProjectInfo = assetProjectInfo;
        return this;
    }
    public KeyProjectInfo getAssetProjectInfo() {
        return this.assetProjectInfo;
    }

}
