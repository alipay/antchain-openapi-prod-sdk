<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class PricePlanVO extends Model
{
    // 定价计划ID
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 商品CODE
    /**
     * @example TAASFM00304790
     *
     * @var string
     */
    public $commodityCode;

    // 定价对象CODE
    /**
     * @example baasVer
     *
     * @var string
     */
    public $priceObjectCode;

    // 定价计划名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 定价计划类型
    /**
     * @example personalized
     *
     * @var string
     */
    public $type;

    // 租户ID
    /**
     * @example 20888888
     *
     * @var string
     */
    public $tenantId;

    // 合同ID
    /**
     * @example 233333
     *
     * @var string
     */
    public $contractId;

    // 政策ID
    /**
     * @example 11111
     *
     * @var string
     */
    public $policyId;

    // 商务项目ID
    /**
     * @example 111
     *
     * @var string
     */
    public $businessProjectId;

    // 执行条件
    /**
     * @example 123
     *
     * @var string
     */
    public $executeCondition;

    // 优先级
    /**
     * @example 1
     *
     * @var int
     */
    public $priority;

    // 价格匹配不到处理策略：抛异常，继续询价
    /**
     * @example test
     *
     * @var string
     */
    public $noMatchRule;

    // 计价模式：公式、阶梯、自定义
    /**
     * @example ladder
     *
     * @var string
     */
    public $pricingMode;

    // 计价方法：具体公式、阶梯方法、自定义
    /**
     * @example CUSTOM
     *
     * @var string
     */
    public $pricingMethod;

    // 阶梯区间类型，左开右闭/左闭右开
    /**
     * @example LOC
     *
     * @var string
     */
    public $ladderIntervalType;

    // 父定价计划ID
    /**
     * @example
     *
     * @var int
     */
    public $parentPricePlanId;

    // 定价计划状态，编辑中、预发生效、线上生效、失效
    /**
     * @example ONLINE
     *
     * @var string
     */
    public $status;

    // 生效起始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 生效结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 创建者
    /**
     * @example 196301
     *
     * @var string
     */
    public $creator;

    // 修改者
    /**
     * @example 196301
     *
     * @var string
     */
    public $modifier;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 是否是基础价格
    /**
     * @example Y
     *
     * @var string
     */
    public $basis;

    // 价格条件，多个以分号分隔
    /**
     * @example 1,2,3
     *
     * @var string
     */
    public $priceConditionCodes;

    // 价格安全区间，格式 min,max如0,100
    /**
     * @example 1,100
     *
     * @var string
     */
    public $priceSafeArea;

    // 关联模板
    /**
     * @example USAGE_AMOUNT_TEMPLATE
     *
     * @var string
     */
    public $templateCode;

    // 关联审批流程
    /**
     * @example 111111
     *
     * @var string
     */
    public $bpmsProcessId;

    // 定价策略
    /**
     * @example test
     *
     * @var string
     */
    public $strategy;

    // 定价阶段
    /**
     * @example PRE
     *
     * @var string
     */
    public $priceStage;

    // 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
    /**
     * @example
     *
     * @var PriceConstraintVO[]
     */
    public $priceConstraintVoList;

    // 价格限制策略
    /**
     * @example
     *
     * @var PriceLimitStrategyDTO[]
     */
    public $priceLimitStrategyDto;

    // 销售渠道
    /**
     * @example
     *
     * @var string[]
     */
    public $saleChannel;

    // 官网售卖折扣设置
    /**
     * @example 8
     *
     * @var string
     */
    public $officialSellDiscount;

    // 客户法详情
    /**
     * @example XXXX
     *
     * @var CustomerValueDetail
     */
    public $customerValueInfo;

    // 市场法详情
    /**
     * @example XXXX
     *
     * @var MarketInfo
     */
    public $marketInfo;

    // 成本法详情
    /**
     * @example XXX
     *
     * @var CostInfo
     */
    public $costInfo;
    protected $_name = [
        'id'                    => 'id',
        'commodityCode'         => 'commodity_code',
        'priceObjectCode'       => 'price_object_code',
        'name'                  => 'name',
        'type'                  => 'type',
        'tenantId'              => 'tenant_id',
        'contractId'            => 'contract_id',
        'policyId'              => 'policy_id',
        'businessProjectId'     => 'business_project_id',
        'executeCondition'      => 'execute_condition',
        'priority'              => 'priority',
        'noMatchRule'           => 'no_match_rule',
        'pricingMode'           => 'pricing_mode',
        'pricingMethod'         => 'pricing_method',
        'ladderIntervalType'    => 'ladder_interval_type',
        'parentPricePlanId'     => 'parent_price_plan_id',
        'status'                => 'status',
        'startTime'             => 'start_time',
        'endTime'               => 'end_time',
        'creator'               => 'creator',
        'modifier'              => 'modifier',
        'gmtCreate'             => 'gmt_create',
        'gmtModified'           => 'gmt_modified',
        'basis'                 => 'basis',
        'priceConditionCodes'   => 'price_condition_codes',
        'priceSafeArea'         => 'price_safe_area',
        'templateCode'          => 'template_code',
        'bpmsProcessId'         => 'bpms_process_id',
        'strategy'              => 'strategy',
        'priceStage'            => 'price_stage',
        'priceConstraintVoList' => 'price_constraint_vo_list',
        'priceLimitStrategyDto' => 'price_limit_strategy_dto',
        'saleChannel'           => 'sale_channel',
        'officialSellDiscount'  => 'official_sell_discount',
        'customerValueInfo'     => 'customer_value_info',
        'marketInfo'            => 'market_info',
        'costInfo'              => 'cost_info',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('priceObjectCode', $this->priceObjectCode, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('priority', $this->priority, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('priceSafeArea', $this->priceSafeArea, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->priceObjectCode) {
            $res['price_object_code'] = $this->priceObjectCode;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->policyId) {
            $res['policy_id'] = $this->policyId;
        }
        if (null !== $this->businessProjectId) {
            $res['business_project_id'] = $this->businessProjectId;
        }
        if (null !== $this->executeCondition) {
            $res['execute_condition'] = $this->executeCondition;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->noMatchRule) {
            $res['no_match_rule'] = $this->noMatchRule;
        }
        if (null !== $this->pricingMode) {
            $res['pricing_mode'] = $this->pricingMode;
        }
        if (null !== $this->pricingMethod) {
            $res['pricing_method'] = $this->pricingMethod;
        }
        if (null !== $this->ladderIntervalType) {
            $res['ladder_interval_type'] = $this->ladderIntervalType;
        }
        if (null !== $this->parentPricePlanId) {
            $res['parent_price_plan_id'] = $this->parentPricePlanId;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->basis) {
            $res['basis'] = $this->basis;
        }
        if (null !== $this->priceConditionCodes) {
            $res['price_condition_codes'] = $this->priceConditionCodes;
        }
        if (null !== $this->priceSafeArea) {
            $res['price_safe_area'] = $this->priceSafeArea;
        }
        if (null !== $this->templateCode) {
            $res['template_code'] = $this->templateCode;
        }
        if (null !== $this->bpmsProcessId) {
            $res['bpms_process_id'] = $this->bpmsProcessId;
        }
        if (null !== $this->strategy) {
            $res['strategy'] = $this->strategy;
        }
        if (null !== $this->priceStage) {
            $res['price_stage'] = $this->priceStage;
        }
        if (null !== $this->priceConstraintVoList) {
            $res['price_constraint_vo_list'] = [];
            if (null !== $this->priceConstraintVoList && \is_array($this->priceConstraintVoList)) {
                $n = 0;
                foreach ($this->priceConstraintVoList as $item) {
                    $res['price_constraint_vo_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->priceLimitStrategyDto) {
            $res['price_limit_strategy_dto'] = [];
            if (null !== $this->priceLimitStrategyDto && \is_array($this->priceLimitStrategyDto)) {
                $n = 0;
                foreach ($this->priceLimitStrategyDto as $item) {
                    $res['price_limit_strategy_dto'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->saleChannel) {
            $res['sale_channel'] = $this->saleChannel;
        }
        if (null !== $this->officialSellDiscount) {
            $res['official_sell_discount'] = $this->officialSellDiscount;
        }
        if (null !== $this->customerValueInfo) {
            $res['customer_value_info'] = null !== $this->customerValueInfo ? $this->customerValueInfo->toMap() : null;
        }
        if (null !== $this->marketInfo) {
            $res['market_info'] = null !== $this->marketInfo ? $this->marketInfo->toMap() : null;
        }
        if (null !== $this->costInfo) {
            $res['cost_info'] = null !== $this->costInfo ? $this->costInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PricePlanVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['price_object_code'])) {
            $model->priceObjectCode = $map['price_object_code'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['policy_id'])) {
            $model->policyId = $map['policy_id'];
        }
        if (isset($map['business_project_id'])) {
            $model->businessProjectId = $map['business_project_id'];
        }
        if (isset($map['execute_condition'])) {
            $model->executeCondition = $map['execute_condition'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['no_match_rule'])) {
            $model->noMatchRule = $map['no_match_rule'];
        }
        if (isset($map['pricing_mode'])) {
            $model->pricingMode = $map['pricing_mode'];
        }
        if (isset($map['pricing_method'])) {
            $model->pricingMethod = $map['pricing_method'];
        }
        if (isset($map['ladder_interval_type'])) {
            $model->ladderIntervalType = $map['ladder_interval_type'];
        }
        if (isset($map['parent_price_plan_id'])) {
            $model->parentPricePlanId = $map['parent_price_plan_id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['creator'])) {
            $model->creator = $map['creator'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['basis'])) {
            $model->basis = $map['basis'];
        }
        if (isset($map['price_condition_codes'])) {
            $model->priceConditionCodes = $map['price_condition_codes'];
        }
        if (isset($map['price_safe_area'])) {
            $model->priceSafeArea = $map['price_safe_area'];
        }
        if (isset($map['template_code'])) {
            $model->templateCode = $map['template_code'];
        }
        if (isset($map['bpms_process_id'])) {
            $model->bpmsProcessId = $map['bpms_process_id'];
        }
        if (isset($map['strategy'])) {
            $model->strategy = $map['strategy'];
        }
        if (isset($map['price_stage'])) {
            $model->priceStage = $map['price_stage'];
        }
        if (isset($map['price_constraint_vo_list'])) {
            if (!empty($map['price_constraint_vo_list'])) {
                $model->priceConstraintVoList = [];
                $n                            = 0;
                foreach ($map['price_constraint_vo_list'] as $item) {
                    $model->priceConstraintVoList[$n++] = null !== $item ? PriceConstraintVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['price_limit_strategy_dto'])) {
            if (!empty($map['price_limit_strategy_dto'])) {
                $model->priceLimitStrategyDto = [];
                $n                            = 0;
                foreach ($map['price_limit_strategy_dto'] as $item) {
                    $model->priceLimitStrategyDto[$n++] = null !== $item ? PriceLimitStrategyDTO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['sale_channel'])) {
            if (!empty($map['sale_channel'])) {
                $model->saleChannel = $map['sale_channel'];
            }
        }
        if (isset($map['official_sell_discount'])) {
            $model->officialSellDiscount = $map['official_sell_discount'];
        }
        if (isset($map['customer_value_info'])) {
            $model->customerValueInfo = CustomerValueDetail::fromMap($map['customer_value_info']);
        }
        if (isset($map['market_info'])) {
            $model->marketInfo = MarketInfo::fromMap($map['market_info']);
        }
        if (isset($map['cost_info'])) {
            $model->costInfo = CostInfo::fromMap($map['cost_info']);
        }

        return $model;
    }
}
