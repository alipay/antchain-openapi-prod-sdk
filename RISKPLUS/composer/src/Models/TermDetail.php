<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class TermDetail extends Model
{
    // 期数
    /**
     * @example 1
     *
     * @var string
     */
    public $term;

    // 期供金额
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $termAmount;

    // 当期本金
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $termPrincipal;

    // 当期利息（分期产生的利息/手续费）
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $termFee;

    // 应还款日期
    /**
     * @example yyyy-MM-dd
     *
     * @var string
     */
    public $settleDate;

    // 罚息
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $penalty;

    // 担保费
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $guaranteeFee;

    // 违约金
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $liquidatedDamages;

    // 服务费
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $serverFee;

    // 减免金额
    /**
     * @example 1999.98
     *
     * @var int
     */
    public $deductAmount;
    protected $_name = [
        'term'              => 'term',
        'termAmount'        => 'term_amount',
        'termPrincipal'     => 'term_principal',
        'termFee'           => 'term_fee',
        'settleDate'        => 'settle_date',
        'penalty'           => 'penalty',
        'guaranteeFee'      => 'guarantee_fee',
        'liquidatedDamages' => 'liquidated_damages',
        'serverFee'         => 'server_fee',
        'deductAmount'      => 'deduct_amount',
    ];

    public function validate()
    {
        Model::validateRequired('term', $this->term, true);
        Model::validateRequired('termAmount', $this->termAmount, true);
        Model::validateRequired('termPrincipal', $this->termPrincipal, true);
        Model::validateRequired('termFee', $this->termFee, true);
        Model::validateRequired('settleDate', $this->settleDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->term) {
            $res['term'] = $this->term;
        }
        if (null !== $this->termAmount) {
            $res['term_amount'] = $this->termAmount;
        }
        if (null !== $this->termPrincipal) {
            $res['term_principal'] = $this->termPrincipal;
        }
        if (null !== $this->termFee) {
            $res['term_fee'] = $this->termFee;
        }
        if (null !== $this->settleDate) {
            $res['settle_date'] = $this->settleDate;
        }
        if (null !== $this->penalty) {
            $res['penalty'] = $this->penalty;
        }
        if (null !== $this->guaranteeFee) {
            $res['guarantee_fee'] = $this->guaranteeFee;
        }
        if (null !== $this->liquidatedDamages) {
            $res['liquidated_damages'] = $this->liquidatedDamages;
        }
        if (null !== $this->serverFee) {
            $res['server_fee'] = $this->serverFee;
        }
        if (null !== $this->deductAmount) {
            $res['deduct_amount'] = $this->deductAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TermDetail
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['term'])) {
            $model->term = $map['term'];
        }
        if (isset($map['term_amount'])) {
            $model->termAmount = $map['term_amount'];
        }
        if (isset($map['term_principal'])) {
            $model->termPrincipal = $map['term_principal'];
        }
        if (isset($map['term_fee'])) {
            $model->termFee = $map['term_fee'];
        }
        if (isset($map['settle_date'])) {
            $model->settleDate = $map['settle_date'];
        }
        if (isset($map['penalty'])) {
            $model->penalty = $map['penalty'];
        }
        if (isset($map['guarantee_fee'])) {
            $model->guaranteeFee = $map['guarantee_fee'];
        }
        if (isset($map['liquidated_damages'])) {
            $model->liquidatedDamages = $map['liquidated_damages'];
        }
        if (isset($map['server_fee'])) {
            $model->serverFee = $map['server_fee'];
        }
        if (isset($map['deduct_amount'])) {
            $model->deductAmount = $map['deduct_amount'];
        }

        return $model;
    }
}
