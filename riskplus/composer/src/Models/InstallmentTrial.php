<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class InstallmentTrial extends Model
{
    // 总期数
    /**
     * @example 12
     *
     * @var string
     */
    public $totalPeriod;

    // 分期应还总金额
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalAmount;

    // 总利息（分期产生的利息/手续费）
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalFee;

    // 期费率，精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * @example 0.1250
     *
     * @var int
     */
    public $feeRate;

    // 年利率，精确到小数点后四位0.1250，表示年利率为12.5%
    /**
     * @example 0.1250
     *
     * @var int
     */
    public $yearRate;

    // 月供列表
    /**
     * @example
     *
     * @var TermDetail[]
     */
    public $termDetailList;

    // 是否最优标识
    /**
     * @example true, false
     *
     * @var bool
     */
    public $optimal;

    // 总罚息
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalPenalty;

    // 总担保费
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalGuaranteeFee;

    // 总违约金
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalLiquidatedDamages;

    // 总服务费
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalServerFee;

    // 费率折扣，0.95：九五折；0：免息；1/null：不打折
    /**
     * @example 0.95
     *
     * @var int
     */
    public $discount;

    // 总减免金额
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $totalDeductAmount;
    protected $_name = [
        'totalPeriod'            => 'total_period',
        'totalAmount'            => 'total_amount',
        'totalFee'               => 'total_fee',
        'feeRate'                => 'fee_rate',
        'yearRate'               => 'year_rate',
        'termDetailList'         => 'term_detail_list',
        'optimal'                => 'optimal',
        'totalPenalty'           => 'total_penalty',
        'totalGuaranteeFee'      => 'total_guarantee_fee',
        'totalLiquidatedDamages' => 'total_liquidated_damages',
        'totalServerFee'         => 'total_server_fee',
        'discount'               => 'discount',
        'totalDeductAmount'      => 'total_deduct_amount',
    ];

    public function validate()
    {
        Model::validateRequired('totalPeriod', $this->totalPeriod, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('totalFee', $this->totalFee, true);
        Model::validateRequired('feeRate', $this->feeRate, true);
        Model::validateRequired('yearRate', $this->yearRate, true);
        Model::validateRequired('termDetailList', $this->termDetailList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalPeriod) {
            $res['total_period'] = $this->totalPeriod;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->totalFee) {
            $res['total_fee'] = $this->totalFee;
        }
        if (null !== $this->feeRate) {
            $res['fee_rate'] = $this->feeRate;
        }
        if (null !== $this->yearRate) {
            $res['year_rate'] = $this->yearRate;
        }
        if (null !== $this->termDetailList) {
            $res['term_detail_list'] = [];
            if (null !== $this->termDetailList && \is_array($this->termDetailList)) {
                $n = 0;
                foreach ($this->termDetailList as $item) {
                    $res['term_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->optimal) {
            $res['optimal'] = $this->optimal;
        }
        if (null !== $this->totalPenalty) {
            $res['total_penalty'] = $this->totalPenalty;
        }
        if (null !== $this->totalGuaranteeFee) {
            $res['total_guarantee_fee'] = $this->totalGuaranteeFee;
        }
        if (null !== $this->totalLiquidatedDamages) {
            $res['total_liquidated_damages'] = $this->totalLiquidatedDamages;
        }
        if (null !== $this->totalServerFee) {
            $res['total_server_fee'] = $this->totalServerFee;
        }
        if (null !== $this->discount) {
            $res['discount'] = $this->discount;
        }
        if (null !== $this->totalDeductAmount) {
            $res['total_deduct_amount'] = $this->totalDeductAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstallmentTrial
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_period'])) {
            $model->totalPeriod = $map['total_period'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['total_fee'])) {
            $model->totalFee = $map['total_fee'];
        }
        if (isset($map['fee_rate'])) {
            $model->feeRate = $map['fee_rate'];
        }
        if (isset($map['year_rate'])) {
            $model->yearRate = $map['year_rate'];
        }
        if (isset($map['term_detail_list'])) {
            if (!empty($map['term_detail_list'])) {
                $model->termDetailList = [];
                $n                     = 0;
                foreach ($map['term_detail_list'] as $item) {
                    $model->termDetailList[$n++] = null !== $item ? TermDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['optimal'])) {
            $model->optimal = $map['optimal'];
        }
        if (isset($map['total_penalty'])) {
            $model->totalPenalty = $map['total_penalty'];
        }
        if (isset($map['total_guarantee_fee'])) {
            $model->totalGuaranteeFee = $map['total_guarantee_fee'];
        }
        if (isset($map['total_liquidated_damages'])) {
            $model->totalLiquidatedDamages = $map['total_liquidated_damages'];
        }
        if (isset($map['total_server_fee'])) {
            $model->totalServerFee = $map['total_server_fee'];
        }
        if (isset($map['discount'])) {
            $model->discount = $map['discount'];
        }
        if (isset($map['total_deduct_amount'])) {
            $model->totalDeductAmount = $map['total_deduct_amount'];
        }

        return $model;
    }
}
