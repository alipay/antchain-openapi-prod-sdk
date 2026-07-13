// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class OTAModuleResponse extends TeaModel {
    // 主键id
    /**
     * <strong>example:</strong>
     * <p>636804107650338816</p>
     */
    @NameInMap("id")
    public String id;

    // 租户id
    /**
     * <strong>example:</strong>
     * <p>POPVPRVV</p>
     */
    @NameInMap("tenant_id")
    public String tenantId;

    // 可信物联唯一产品标识
    /**
     * <strong>example:</strong>
     * <p>B7uwSpw2dAaxhZ8nJt</p>
     */
    @NameInMap("trust_product_key")
    public String trustProductKey;

    // 产品名称
    /**
     * <strong>example:</strong>
     * <p>产品名称</p>
     */
    @NameInMap("product_name")
    public String productName;

    // 模块名称
    /**
     * <strong>example:</strong>
     * <p>CAT1_OTA</p>
     */
    @NameInMap("module_name")
    public String moduleName;

    // 模块别名
    /**
     * <strong>example:</strong>
     * <p>模块别名</p>
     */
    @NameInMap("alias_name")
    public String aliasName;

    // 模块描述
    /**
     * <strong>example:</strong>
     * <p>模块描述</p>
     */
    @NameInMap("description")
    public String description;

    // KYT模块唯一标识
    /**
     * <strong>example:</strong>
     * <p>2bace9c5bdd54b2781a5d325055ada57</p>
     */
    @NameInMap("mid")
    public String mid;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1773998631000</p>
     */
    @NameInMap("gmt_create")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1773998631000</p>
     */
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static OTAModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        OTAModuleResponse self = new OTAModuleResponse();
        return TeaModel.build(map, self);
    }

    public OTAModuleResponse setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public OTAModuleResponse setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public OTAModuleResponse setTrustProductKey(String trustProductKey) {
        this.trustProductKey = trustProductKey;
        return this;
    }
    public String getTrustProductKey() {
        return this.trustProductKey;
    }

    public OTAModuleResponse setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

    public OTAModuleResponse setModuleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }
    public String getModuleName() {
        return this.moduleName;
    }

    public OTAModuleResponse setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public OTAModuleResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public OTAModuleResponse setMid(String mid) {
        this.mid = mid;
        return this;
    }
    public String getMid() {
        return this.mid;
    }

    public OTAModuleResponse setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public OTAModuleResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
