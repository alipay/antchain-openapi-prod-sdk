<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class OpenApiRoyaltyDetailInfoPojo extends Model
{
    // 分账比例
    /**
     * @example 2
     *
     * @var string
     */
    public $percentage;

    // 分账金额
    /**
     * @example 2
     *
     * @var string
     */
    public $amount;

    // 分账类型
    /**
     * @example transfer
     *
     * @var string
     */
    public $royaltyType;

    // 支出方账户类型
    /**
     * @example userId
     *
     * @var string
     */
    public $transOutType;

    // 支出方账户
    /**
     * @example 2088101126765726
     *
     * @var string
     */
    public $transOut;

    // 收入方账户类型
    /**
     * @example userId
     *
     * @var string
     */
    public $transInType;

    // 收入方账户
    /**
     * @example 2088101126708402
     *
     * @var string
     */
    public $transIn;

    // 分账描述
    /**
     * @example 分账给2088101126708402
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'percentage'   => 'percentage',
        'amount'       => 'amount',
        'royaltyType'  => 'royalty_type',
        'transOutType' => 'trans_out_type',
        'transOut'     => 'trans_out',
        'transInType'  => 'trans_in_type',
        'transIn'      => 'trans_in',
        'desc'         => 'desc',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->percentage) {
            $res['percentage'] = $this->percentage;
        }
        if (null !== $this->amount) {
            $res['amount'] = $this->amount;
        }
        if (null !== $this->royaltyType) {
            $res['royalty_type'] = $this->royaltyType;
        }
        if (null !== $this->transOutType) {
            $res['trans_out_type'] = $this->transOutType;
        }
        if (null !== $this->transOut) {
            $res['trans_out'] = $this->transOut;
        }
        if (null !== $this->transInType) {
            $res['trans_in_type'] = $this->transInType;
        }
        if (null !== $this->transIn) {
            $res['trans_in'] = $this->transIn;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenApiRoyaltyDetailInfoPojo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['percentage'])) {
            $model->percentage = $map['percentage'];
        }
        if (isset($map['amount'])) {
            $model->amount = $map['amount'];
        }
        if (isset($map['royalty_type'])) {
            $model->royaltyType = $map['royalty_type'];
        }
        if (isset($map['trans_out_type'])) {
            $model->transOutType = $map['trans_out_type'];
        }
        if (isset($map['trans_out'])) {
            $model->transOut = $map['trans_out'];
        }
        if (isset($map['trans_in_type'])) {
            $model->transInType = $map['trans_in_type'];
        }
        if (isset($map['trans_in'])) {
            $model->transIn = $map['trans_in'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
