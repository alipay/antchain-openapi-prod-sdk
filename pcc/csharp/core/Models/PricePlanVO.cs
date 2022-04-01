// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 定价计划
    public class PricePlanVO : TeaModel {
        // 定价计划ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 商品CODE
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 定价对象CODE
        [NameInMap("price_object_code")]
        [Validation(Required=true)]
        public string PriceObjectCode { get; set; }

        // 定价计划名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 定价计划类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 合同ID
        [NameInMap("contract_id")]
        [Validation(Required=false)]
        public string ContractId { get; set; }

        // 政策ID
        [NameInMap("policy_id")]
        [Validation(Required=false)]
        public string PolicyId { get; set; }

        // 商务项目ID
        [NameInMap("business_project_id")]
        [Validation(Required=false)]
        public string BusinessProjectId { get; set; }

        // 执行条件
        [NameInMap("execute_condition")]
        [Validation(Required=false)]
        public string ExecuteCondition { get; set; }

        // 优先级
        [NameInMap("priority")]
        [Validation(Required=true)]
        public long? Priority { get; set; }

        // 价格匹配不到处理策略：抛异常，继续询价
        [NameInMap("no_match_rule")]
        [Validation(Required=false)]
        public string NoMatchRule { get; set; }

        // 计价模式：公式、阶梯、自定义
        [NameInMap("pricing_mode")]
        [Validation(Required=false)]
        public string PricingMode { get; set; }

        // 计价方法：具体公式、阶梯方法、自定义
        [NameInMap("pricing_method")]
        [Validation(Required=false)]
        public string PricingMethod { get; set; }

        // 阶梯区间类型，左开右闭/左闭右开
        [NameInMap("ladder_interval_type")]
        [Validation(Required=false)]
        public string LadderIntervalType { get; set; }

        // 父定价计划ID
        [NameInMap("parent_price_plan_id")]
        [Validation(Required=false)]
        public long? ParentPricePlanId { get; set; }

        // 定价计划状态，编辑中、预发生效、线上生效、失效
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 生效起始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 生效结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 创建者
        [NameInMap("creator")]
        [Validation(Required=false)]
        public string Creator { get; set; }

        // 修改者
        [NameInMap("modifier")]
        [Validation(Required=false)]
        public string Modifier { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 是否是基础价格
        [NameInMap("basis")]
        [Validation(Required=false)]
        public string Basis { get; set; }

        // 价格条件，多个以分号分隔
        [NameInMap("price_condition_codes")]
        [Validation(Required=false)]
        public string PriceConditionCodes { get; set; }

        // 价格安全区间，格式 min,max如0,100
        [NameInMap("price_safe_area")]
        [Validation(Required=true)]
        public string PriceSafeArea { get; set; }

        // 关联模板
        [NameInMap("template_code")]
        [Validation(Required=false)]
        public string TemplateCode { get; set; }

        // 关联审批流程
        [NameInMap("bpms_process_id")]
        [Validation(Required=false)]
        public string BpmsProcessId { get; set; }

        // 定价策略
        [NameInMap("strategy")]
        [Validation(Required=false)]
        public string Strategy { get; set; }

        // 定价阶段
        [NameInMap("price_stage")]
        [Validation(Required=false)]
        public string PriceStage { get; set; }

        // 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
        [NameInMap("price_constraint_vo_list")]
        [Validation(Required=false)]
        public List<PriceConstraintVO> PriceConstraintVoList { get; set; }

        // 价格限制策略
        [NameInMap("price_limit_strategy_dto")]
        [Validation(Required=false)]
        public List<PriceLimitStrategyDTO> PriceLimitStrategyDto { get; set; }

        // 销售渠道
        [NameInMap("sale_channel")]
        [Validation(Required=false)]
        public List<string> SaleChannel { get; set; }

        // 官网售卖折扣设置
        [NameInMap("official_sell_discount")]
        [Validation(Required=false)]
        public string OfficialSellDiscount { get; set; }

        // 客户法详情
        [NameInMap("customer_value_info")]
        [Validation(Required=false)]
        public CustomerValueDetail CustomerValueInfo { get; set; }

        // 市场法详情
        [NameInMap("market_info")]
        [Validation(Required=false)]
        public MarketInfo MarketInfo { get; set; }

        // 成本法详情
        [NameInMap("cost_info")]
        [Validation(Required=false)]
        public CostInfo CostInfo { get; set; }

    }

}
