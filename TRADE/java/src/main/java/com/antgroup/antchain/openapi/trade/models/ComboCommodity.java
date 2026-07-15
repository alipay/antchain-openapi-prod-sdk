// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class ComboCommodity extends TeaModel {
    // 商品名称
    /**
     * <strong>example:</strong>
     * <p>测试商品</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
    /**
     * <strong>example:</strong>
     * <p>ZWZJFM00167122ABCDEF</p>
     */
    @NameInMap("unique_code")
    @Validation(required = true)
    public String uniqueCode;

    // 商品主数据编码
    /**
     * <strong>example:</strong>
     * <p>ZWZJFM00167122</p>
     */
    @NameInMap("inner_code")
    @Validation(required = true)
    public String innerCode;

    // 商品类型，资源包：attach
    /**
     * <strong>example:</strong>
     * <p>attach</p>
     */
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 付费方式，预付：PREPAY，按量付费：POSTPAY
    /**
     * <strong>example:</strong>
     * <p>PREPAY</p>
     */
    @NameInMap("charge_type")
    @Validation(required = true)
    public String chargeType;

    // 销售属性列表
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("attrs")
    @Validation(required = true)
    public java.util.List<CommodityAttribute> attrs;

    // 商品数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("quantity")
    @Validation(required = true)
    public Long quantity;

    // 扩展信息，JSON结构，包含标签、个性化配置等数据
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;name&quot;}</p>
     */
    @NameInMap("extends_config")
    @Validation(required = true)
    public String extendsConfig;

    public static ComboCommodity build(java.util.Map<String, ?> map) throws Exception {
        ComboCommodity self = new ComboCommodity();
        return TeaModel.build(map, self);
    }

    public ComboCommodity setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ComboCommodity setUniqueCode(String uniqueCode) {
        this.uniqueCode = uniqueCode;
        return this;
    }
    public String getUniqueCode() {
        return this.uniqueCode;
    }

    public ComboCommodity setInnerCode(String innerCode) {
        this.innerCode = innerCode;
        return this;
    }
    public String getInnerCode() {
        return this.innerCode;
    }

    public ComboCommodity setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ComboCommodity setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public ComboCommodity setAttrs(java.util.List<CommodityAttribute> attrs) {
        this.attrs = attrs;
        return this;
    }
    public java.util.List<CommodityAttribute> getAttrs() {
        return this.attrs;
    }

    public ComboCommodity setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public ComboCommodity setExtendsConfig(String extendsConfig) {
        this.extendsConfig = extendsConfig;
        return this;
    }
    public String getExtendsConfig() {
        return this.extendsConfig;
    }

}
