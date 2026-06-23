// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class DomainConfigVO extends TeaModel {
    // 操作类型
    /**
     * <strong>example:</strong>
     * <p>ADD</p>
     */
    @NameInMap("operate_type")
    public String operateType;

    // 产品域Code，例如OSS
    /**
     * <strong>example:</strong>
     * <p>test_r</p>
     */
    @NameInMap("domain_code")
    public String domainCode;

    // 版本
    /**
     * <strong>example:</strong>
     * <p>2023#test_r</p>
     */
    @NameInMap("domain_version")
    public String domainVersion;

    // 计量域中文名称
    /**
     * <strong>example:</strong>
     * <p>中文名</p>
     */
    @NameInMap("chinese_name")
    public String chineseName;

    // 计量域英文名称
    /**
     * <strong>example:</strong>
     * <p>english_name</p>
     */
    @NameInMap("english_name")
    public String englishName;

    // 计量域描述
    /**
     * <strong>example:</strong>
     * <p>计量域描述</p>
     */
    @NameInMap("domain_desc")
    public String domainDesc;

    // 渠道产品Code
    /**
     * <strong>example:</strong>
     * <p>serviceCode</p>
     */
    @NameInMap("service_code")
    public String serviceCode;

    // 商品code
    /**
     * <strong>example:</strong>
     * <p>商品code</p>
     */
    @NameInMap("commodity_code")
    public String commodityCode;

    // 推送类型
    /**
     * <strong>example:</strong>
     * <p>全量</p>
     */
    @NameInMap("push_type")
    public String pushType;

    // 计量数据维度
    /**
     * <strong>example:</strong>
     * <p>r</p>
     */
    @NameInMap("dimension")
    public String dimension;

    // 环境标识
    /**
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("env")
    public String env;

    // 计量说明
    /**
     * <strong>example:</strong>
     * <p>说明</p>
     */
    @NameInMap("memo")
    public String memo;

    // domainCode是否需要聚合
    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("need_aggregate")
    public String needAggregate;

    // 创建者
    /**
     * <strong>example:</strong>
     * <p>工号</p>
     */
    @NameInMap("creator")
    public String creator;

    // 修改者
    /**
     * <strong>example:</strong>
     * <p>工号</p>
     */
    @NameInMap("modifier")
    public String modifier;

    // 计量项list
    @NameInMap("domain_field_set")
    public java.util.List<DomainField> domainFieldSet;

    // 主键规则配置
    @NameInMap("primary_key_gen_rule")
    public PrimaryKeyGenRule primaryKeyGenRule;

    // 计量节点
    @NameInMap("domain_node_set")
    public java.util.List<DomainNode> domainNodeSet;

    // 计量域成员信息
    @NameInMap("meter_domain_member_set")
    public java.util.List<MeterDomainMember> meterDomainMemberSet;

    // DomainSLS配置
    @NameInMap("domain_sls")
    public DomainSls domainSls;

    public static DomainConfigVO build(java.util.Map<String, ?> map) throws Exception {
        DomainConfigVO self = new DomainConfigVO();
        return TeaModel.build(map, self);
    }

    public DomainConfigVO setOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }
    public String getOperateType() {
        return this.operateType;
    }

    public DomainConfigVO setDomainCode(String domainCode) {
        this.domainCode = domainCode;
        return this;
    }
    public String getDomainCode() {
        return this.domainCode;
    }

    public DomainConfigVO setDomainVersion(String domainVersion) {
        this.domainVersion = domainVersion;
        return this;
    }
    public String getDomainVersion() {
        return this.domainVersion;
    }

    public DomainConfigVO setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public DomainConfigVO setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public DomainConfigVO setDomainDesc(String domainDesc) {
        this.domainDesc = domainDesc;
        return this;
    }
    public String getDomainDesc() {
        return this.domainDesc;
    }

    public DomainConfigVO setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DomainConfigVO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public DomainConfigVO setPushType(String pushType) {
        this.pushType = pushType;
        return this;
    }
    public String getPushType() {
        return this.pushType;
    }

    public DomainConfigVO setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DomainConfigVO setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DomainConfigVO setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public DomainConfigVO setNeedAggregate(String needAggregate) {
        this.needAggregate = needAggregate;
        return this;
    }
    public String getNeedAggregate() {
        return this.needAggregate;
    }

    public DomainConfigVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public DomainConfigVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public DomainConfigVO setDomainFieldSet(java.util.List<DomainField> domainFieldSet) {
        this.domainFieldSet = domainFieldSet;
        return this;
    }
    public java.util.List<DomainField> getDomainFieldSet() {
        return this.domainFieldSet;
    }

    public DomainConfigVO setPrimaryKeyGenRule(PrimaryKeyGenRule primaryKeyGenRule) {
        this.primaryKeyGenRule = primaryKeyGenRule;
        return this;
    }
    public PrimaryKeyGenRule getPrimaryKeyGenRule() {
        return this.primaryKeyGenRule;
    }

    public DomainConfigVO setDomainNodeSet(java.util.List<DomainNode> domainNodeSet) {
        this.domainNodeSet = domainNodeSet;
        return this;
    }
    public java.util.List<DomainNode> getDomainNodeSet() {
        return this.domainNodeSet;
    }

    public DomainConfigVO setMeterDomainMemberSet(java.util.List<MeterDomainMember> meterDomainMemberSet) {
        this.meterDomainMemberSet = meterDomainMemberSet;
        return this;
    }
    public java.util.List<MeterDomainMember> getMeterDomainMemberSet() {
        return this.meterDomainMemberSet;
    }

    public DomainConfigVO setDomainSls(DomainSls domainSls) {
        this.domainSls = domainSls;
        return this;
    }
    public DomainSls getDomainSls() {
        return this.domainSls;
    }

}
