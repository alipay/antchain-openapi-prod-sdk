<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AGORAX\Models;

use AlibabaCloud\Tea\Model;

class SettleDetailInfo extends Model
{
    // 结算收款方账户类型
    /**
     * @example userId
     *
     * @var string
     */
    public $transInType;

    // 结算收款方
    /**
     * @example 1100001990
     *
     * @var string
     */
    public $transIn;

    // 结算汇总维度
    /**
     * @example A0001
     *
     * @var string
     */
    public $summaryDimension;

    // 结算主体类型
    /**
     * @example SecondMerchant
     *
     * @var string
     */
    public $settleEntityType;

    // 结算主体标识
    /**
     * @example 2088xxxxx
     *
     * @var string
     */
    public $settleEntityId;
    protected $_name = [
        'transInType'      => 'trans_in_type',
        'transIn'          => 'trans_in',
        'summaryDimension' => 'summary_dimension',
        'settleEntityType' => 'settle_entity_type',
        'settleEntityId'   => 'settle_entity_id',
    ];

    public function validate()
    {
        Model::validateRequired('transInType', $this->transInType, true);
        Model::validateRequired('transIn', $this->transIn, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->transInType) {
            $res['trans_in_type'] = $this->transInType;
        }
        if (null !== $this->transIn) {
            $res['trans_in'] = $this->transIn;
        }
        if (null !== $this->summaryDimension) {
            $res['summary_dimension'] = $this->summaryDimension;
        }
        if (null !== $this->settleEntityType) {
            $res['settle_entity_type'] = $this->settleEntityType;
        }
        if (null !== $this->settleEntityId) {
            $res['settle_entity_id'] = $this->settleEntityId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SettleDetailInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['trans_in_type'])) {
            $model->transInType = $map['trans_in_type'];
        }
        if (isset($map['trans_in'])) {
            $model->transIn = $map['trans_in'];
        }
        if (isset($map['summary_dimension'])) {
            $model->summaryDimension = $map['summary_dimension'];
        }
        if (isset($map['settle_entity_type'])) {
            $model->settleEntityType = $map['settle_entity_type'];
        }
        if (isset($map['settle_entity_id'])) {
            $model->settleEntityId = $map['settle_entity_id'];
        }

        return $model;
    }
}
