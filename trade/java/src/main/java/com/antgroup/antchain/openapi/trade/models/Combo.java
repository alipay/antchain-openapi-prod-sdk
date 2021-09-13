// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class Combo extends TeaModel {
    // 套餐名称
    @NameInMap("code")
    @Validation(required = true)
    public String code;

    // 套餐编码
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 套餐版本号
    @NameInMap("vid")
    @Validation(required = true)
    public String vid;

    // 套餐描述
    @NameInMap("description")
    @Validation(required = true)
    public String description;

    // 扩展信息，JSON结构，包含标签、个性化配置等数据
    @NameInMap("extends_config")
    @Validation(required = true)
    public String extendsConfig;

    // 状态
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 套餐内商品列表
    @NameInMap("commodities")
    @Validation(required = true)
    public java.util.List<ComboCommodity> commodities;

    public static Combo build(java.util.Map<String, ?> map) throws Exception {
        Combo self = new Combo();
        return TeaModel.build(map, self);
    }

    public Combo setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Combo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Combo setVid(String vid) {
        this.vid = vid;
        return this;
    }
    public String getVid() {
        return this.vid;
    }

    public Combo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Combo setExtendsConfig(String extendsConfig) {
        this.extendsConfig = extendsConfig;
        return this;
    }
    public String getExtendsConfig() {
        return this.extendsConfig;
    }

    public Combo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Combo setCommodities(java.util.List<ComboCommodity> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<ComboCommodity> getCommodities() {
        return this.commodities;
    }

}
