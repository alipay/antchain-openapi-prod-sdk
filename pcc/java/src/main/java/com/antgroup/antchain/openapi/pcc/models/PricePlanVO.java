// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.pcc.models;

import com.aliyun.tea.*;

public class PricePlanVO extends TeaModel {
    // 定价计划ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 商品CODE
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 定价对象CODE
    @NameInMap("price_object_code")
    @Validation(required = true)
    public String priceObjectCode;

    // 定价计划名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 定价计划类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 租户ID
    @NameInMap("tenant_id")
    public String tenantId;

    // 合同ID
    @NameInMap("contract_id")
    public String contractId;

    // 政策ID
    @NameInMap("policy_id")
    public String policyId;

    // 商务项目ID
    @NameInMap("business_project_id")
    public String businessProjectId;

    // 执行条件
    @NameInMap("execute_condition")
    public String executeCondition;

    // 优先级
    @NameInMap("priority")
    @Validation(required = true)
    public Long priority;

    // 价格匹配不到处理策略：抛异常，继续询价
    @NameInMap("no_match_rule")
    public String noMatchRule;

    // 计价模式：公式、阶梯、自定义
    @NameInMap("pricing_mode")
    public String pricingMode;

    // 计价方法：具体公式、阶梯方法、自定义
    @NameInMap("pricing_method")
    public String pricingMethod;

    // 阶梯区间类型，左开右闭/左闭右开
    @NameInMap("ladder_interval_type")
    public String ladderIntervalType;

    // 父定价计划ID
    @NameInMap("parent_price_plan_id")
    public Long parentPricePlanId;

    // 定价计划状态，编辑中、预发生效、线上生效、失效
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 生效起始时间
    @NameInMap("start_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 生效结束时间
    @NameInMap("end_time")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // 创建者
    @NameInMap("creator")
    public String creator;

    // 修改者
    @NameInMap("modifier")
    public String modifier;

    // 创建时间
    @NameInMap("gmt_create")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtCreate;

    // 修改时间
    @NameInMap("gmt_modified")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    // 是否是基础价格
    @NameInMap("basis")
    public String basis;

    // 价格条件，多个以分号分隔
    @NameInMap("price_condition_codes")
    public String priceConditionCodes;

    // 价格安全区间，格式 min,max如0,100
    @NameInMap("price_safe_area")
    @Validation(required = true)
    public String priceSafeArea;

    // 关联模板
    @NameInMap("template_code")
    public String templateCode;

    // 关联审批流程
    @NameInMap("bpms_process_id")
    public String bpmsProcessId;

    // 定价策略
    @NameInMap("strategy")
    public String strategy;

    // 定价阶段
    @NameInMap("price_stage")
    public String priceStage;

    // 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
    @NameInMap("price_constraint_vo_list")
    public java.util.List<PriceConstraintVO> priceConstraintVoList;

    // 价格限制策略
    @NameInMap("price_limit_strategy_dto")
    public java.util.List<PriceLimitStrategyDTO> priceLimitStrategyDto;

    // 销售渠道
    @NameInMap("sale_channel")
    public java.util.List<String> saleChannel;

    // 官网售卖折扣设置
    @NameInMap("official_sell_discount")
    public String officialSellDiscount;

    // 客户法详情
    @NameInMap("customer_value_info")
    public CustomerValueDetail customerValueInfo;

    // 市场法详情
    @NameInMap("market_info")
    public MarketInfo marketInfo;

    // 成本法详情
    @NameInMap("cost_info")
    public CostInfo costInfo;

    public static PricePlanVO build(java.util.Map<String, ?> map) throws Exception {
        PricePlanVO self = new PricePlanVO();
        return TeaModel.build(map, self);
    }

    public PricePlanVO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public PricePlanVO setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public PricePlanVO setPriceObjectCode(String priceObjectCode) {
        this.priceObjectCode = priceObjectCode;
        return this;
    }
    public String getPriceObjectCode() {
        return this.priceObjectCode;
    }

    public PricePlanVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PricePlanVO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public PricePlanVO setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public PricePlanVO setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public PricePlanVO setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public PricePlanVO setBusinessProjectId(String businessProjectId) {
        this.businessProjectId = businessProjectId;
        return this;
    }
    public String getBusinessProjectId() {
        return this.businessProjectId;
    }

    public PricePlanVO setExecuteCondition(String executeCondition) {
        this.executeCondition = executeCondition;
        return this;
    }
    public String getExecuteCondition() {
        return this.executeCondition;
    }

    public PricePlanVO setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public PricePlanVO setNoMatchRule(String noMatchRule) {
        this.noMatchRule = noMatchRule;
        return this;
    }
    public String getNoMatchRule() {
        return this.noMatchRule;
    }

    public PricePlanVO setPricingMode(String pricingMode) {
        this.pricingMode = pricingMode;
        return this;
    }
    public String getPricingMode() {
        return this.pricingMode;
    }

    public PricePlanVO setPricingMethod(String pricingMethod) {
        this.pricingMethod = pricingMethod;
        return this;
    }
    public String getPricingMethod() {
        return this.pricingMethod;
    }

    public PricePlanVO setLadderIntervalType(String ladderIntervalType) {
        this.ladderIntervalType = ladderIntervalType;
        return this;
    }
    public String getLadderIntervalType() {
        return this.ladderIntervalType;
    }

    public PricePlanVO setParentPricePlanId(Long parentPricePlanId) {
        this.parentPricePlanId = parentPricePlanId;
        return this;
    }
    public Long getParentPricePlanId() {
        return this.parentPricePlanId;
    }

    public PricePlanVO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PricePlanVO setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public PricePlanVO setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public PricePlanVO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public PricePlanVO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public PricePlanVO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public PricePlanVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public PricePlanVO setBasis(String basis) {
        this.basis = basis;
        return this;
    }
    public String getBasis() {
        return this.basis;
    }

    public PricePlanVO setPriceConditionCodes(String priceConditionCodes) {
        this.priceConditionCodes = priceConditionCodes;
        return this;
    }
    public String getPriceConditionCodes() {
        return this.priceConditionCodes;
    }

    public PricePlanVO setPriceSafeArea(String priceSafeArea) {
        this.priceSafeArea = priceSafeArea;
        return this;
    }
    public String getPriceSafeArea() {
        return this.priceSafeArea;
    }

    public PricePlanVO setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public PricePlanVO setBpmsProcessId(String bpmsProcessId) {
        this.bpmsProcessId = bpmsProcessId;
        return this;
    }
    public String getBpmsProcessId() {
        return this.bpmsProcessId;
    }

    public PricePlanVO setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public PricePlanVO setPriceStage(String priceStage) {
        this.priceStage = priceStage;
        return this;
    }
    public String getPriceStage() {
        return this.priceStage;
    }

    public PricePlanVO setPriceConstraintVoList(java.util.List<PriceConstraintVO> priceConstraintVoList) {
        this.priceConstraintVoList = priceConstraintVoList;
        return this;
    }
    public java.util.List<PriceConstraintVO> getPriceConstraintVoList() {
        return this.priceConstraintVoList;
    }

    public PricePlanVO setPriceLimitStrategyDto(java.util.List<PriceLimitStrategyDTO> priceLimitStrategyDto) {
        this.priceLimitStrategyDto = priceLimitStrategyDto;
        return this;
    }
    public java.util.List<PriceLimitStrategyDTO> getPriceLimitStrategyDto() {
        return this.priceLimitStrategyDto;
    }

    public PricePlanVO setSaleChannel(java.util.List<String> saleChannel) {
        this.saleChannel = saleChannel;
        return this;
    }
    public java.util.List<String> getSaleChannel() {
        return this.saleChannel;
    }

    public PricePlanVO setOfficialSellDiscount(String officialSellDiscount) {
        this.officialSellDiscount = officialSellDiscount;
        return this;
    }
    public String getOfficialSellDiscount() {
        return this.officialSellDiscount;
    }

    public PricePlanVO setCustomerValueInfo(CustomerValueDetail customerValueInfo) {
        this.customerValueInfo = customerValueInfo;
        return this;
    }
    public CustomerValueDetail getCustomerValueInfo() {
        return this.customerValueInfo;
    }

    public PricePlanVO setMarketInfo(MarketInfo marketInfo) {
        this.marketInfo = marketInfo;
        return this;
    }
    public MarketInfo getMarketInfo() {
        return this.marketInfo;
    }

    public PricePlanVO setCostInfo(CostInfo costInfo) {
        this.costInfo = costInfo;
        return this;
    }
    public CostInfo getCostInfo() {
        return this.costInfo;
    }

}
