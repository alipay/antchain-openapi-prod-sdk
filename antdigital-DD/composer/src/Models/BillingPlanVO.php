<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DD\Models\BillingFactorMeta;

class BillingPlanVO extends Model {
    protected $_name = [
        'billingRuleCode' => 'billing_rule_code',
        'domainCode' => 'domain_code',
        'productCode' => 'product_code',
        'offerCode' => 'offer_code',
        'billDimension' => 'bill_dimension',
        'enableResourcePackage' => 'enable_resource_package',
        'cumulateCycle' => 'cumulate_cycle',
        'transferType' => 'transfer_type',
        'payAcceptType' => 'pay_accept_type',
        'writeOffType' => 'write_off_type',
        'maxPriceYuan' => 'max_price_yuan',
        'billingfactorMetas' => 'billingfactor_metas',
        'acceptType' => 'accept_type',
        'collectPeriod' => 'collect_period',
        'outPaidType' => 'out_paid_type',
        'enableRightRowCharge' => 'enable_right_row_charge',
        'highPrecisionCumulativeType' => 'high_precision_cumulative_type',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->billingRuleCode) {
            $res['billing_rule_code'] = $this->billingRuleCode;
        }
        if (null !== $this->domainCode) {
            $res['domain_code'] = $this->domainCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->offerCode) {
            $res['offer_code'] = $this->offerCode;
        }
        if (null !== $this->billDimension) {
            $res['bill_dimension'] = $this->billDimension;
        }
        if (null !== $this->enableResourcePackage) {
            $res['enable_resource_package'] = $this->enableResourcePackage;
        }
        if (null !== $this->cumulateCycle) {
            $res['cumulate_cycle'] = $this->cumulateCycle;
        }
        if (null !== $this->transferType) {
            $res['transfer_type'] = $this->transferType;
        }
        if (null !== $this->payAcceptType) {
            $res['pay_accept_type'] = $this->payAcceptType;
        }
        if (null !== $this->writeOffType) {
            $res['write_off_type'] = $this->writeOffType;
        }
        if (null !== $this->maxPriceYuan) {
            $res['max_price_yuan'] = $this->maxPriceYuan;
        }
        if (null !== $this->billingfactorMetas) {
            $res['billingfactor_metas'] = [];
            if(null !== $this->billingfactorMetas && is_array($this->billingfactorMetas)){
                $n = 0;
                foreach($this->billingfactorMetas as $item){
                    $res['billingfactor_metas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->acceptType) {
            $res['accept_type'] = $this->acceptType;
        }
        if (null !== $this->collectPeriod) {
            $res['collect_period'] = $this->collectPeriod;
        }
        if (null !== $this->outPaidType) {
            $res['out_paid_type'] = $this->outPaidType;
        }
        if (null !== $this->enableRightRowCharge) {
            $res['enable_right_row_charge'] = $this->enableRightRowCharge;
        }
        if (null !== $this->highPrecisionCumulativeType) {
            $res['high_precision_cumulative_type'] = $this->highPrecisionCumulativeType;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BillingPlanVO
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['billing_rule_code'])){
            $model->billingRuleCode = $map['billing_rule_code'];
        }
        if(isset($map['domain_code'])){
            $model->domainCode = $map['domain_code'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        if(isset($map['offer_code'])){
            $model->offerCode = $map['offer_code'];
        }
        if(isset($map['bill_dimension'])){
            $model->billDimension = $map['bill_dimension'];
        }
        if(isset($map['enable_resource_package'])){
            $model->enableResourcePackage = $map['enable_resource_package'];
        }
        if(isset($map['cumulate_cycle'])){
            $model->cumulateCycle = $map['cumulate_cycle'];
        }
        if(isset($map['transfer_type'])){
            $model->transferType = $map['transfer_type'];
        }
        if(isset($map['pay_accept_type'])){
            $model->payAcceptType = $map['pay_accept_type'];
        }
        if(isset($map['write_off_type'])){
            $model->writeOffType = $map['write_off_type'];
        }
        if(isset($map['max_price_yuan'])){
            $model->maxPriceYuan = $map['max_price_yuan'];
        }
        if(isset($map['billingfactor_metas'])){
            if(!empty($map['billingfactor_metas'])){
                $model->billingfactorMetas = [];
                $n = 0;
                foreach($map['billingfactor_metas'] as $item) {
                    $model->billingfactorMetas[$n++] = null !== $item ? BillingFactorMeta::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['accept_type'])){
            $model->acceptType = $map['accept_type'];
        }
        if(isset($map['collect_period'])){
            $model->collectPeriod = $map['collect_period'];
        }
        if(isset($map['out_paid_type'])){
            $model->outPaidType = $map['out_paid_type'];
        }
        if(isset($map['enable_right_row_charge'])){
            $model->enableRightRowCharge = $map['enable_right_row_charge'];
        }
        if(isset($map['high_precision_cumulative_type'])){
            $model->highPrecisionCumulativeType = $map['high_precision_cumulative_type'];
        }
        return $model;
    }
    // 计费规则code
    /**
     * @example 计费规则code
     * @var string
     */
    public $billingRuleCode;

    // 计量域code
    /**
     * @example domain_code
     * @var string
     */
    public $domainCode;

    // 产品名称 -> 商品模型2.0中的渠道产品Code
    /**
     * @example DYC
     * @var string
     */
    public $productCode;

    // 商品名称 -> 商品模型2.0中的offerInnerCode
    /**
     * @example twc_post
     * @var string
     */
    public $offerCode;

    // 采集维度，主实例/逻辑实例，默认主实例
    /**
     * @example mterid#instanceId
     * @var string
     */
    public $billDimension;

    // 是否启用资源包，默认是
    /**
     * @example true, false
     * @var bool
     */
    public $enableResourcePackage;

    // 累计模式(月/年/指定时间)
    /**
     * @example month
     * @var string
     */
    public $cumulateCycle;

    // 转账类型(数字商品户解冻/文娱链户解冻/权益宝户解冻)，默认空
    /**
     * @example 文娱链户解冻
     * @var string
     */
    public $transferType;

    // 支付类型(代扣)，默认空
    /**
     * @example out
     * @var string
     */
    public $payAcceptType;

    // 核销类型(业务侧)，默认空
    /**
     * @example 核销类型(业务侧)，默认空
     * @var string
     */
    public $writeOffType;

    // 单次计价最大价格保护（元），默认1000000元
    /**
     * @example 100000000
     * @var string
     */
    public $maxPriceYuan;

    // 计费因子
    /**
     * @example 
     * @var BillingFactorMeta[]
     */
    public $billingfactorMetas;

    // 受理类型
    /**
     * @example send
     * @var string
     */
    public $acceptType;

    // 周期
    /**
     * @example 02
     * @var string
     */
    public $collectPeriod;

    // 外部支付类型
    /**
     * @example 02
     * @var string
     */
    public $outPaidType;

    // 是否立即出账
    /**
     * @example true,false
     * @var bool
     */
    public $enableRightRowCharge;

    // 高精度累计类型
    /**
     * @example HIGH_PRECISION_S_M
     * @var string
     */
    public $highPrecisionCumulativeType;

}
