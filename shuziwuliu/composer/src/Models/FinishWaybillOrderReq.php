<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class FinishWaybillOrderReq extends Model
{
    // 运费
    /**
     * @example all_freight
     *
     * @var string
     */
    public $allFreight;

    // 回单押金
    /**
     * @example 100
     *
     * @var string
     */
    public $backFee;

    // 货主支付运费金额
    /**
     * @example consignor_freight_amount
     *
     * @var string
     */
    public $consignorFreightAmount;

    // 运费增项
    /**
     * @example freight_incr
     *
     * @var string
     */
    public $freightIncr;

    // 运费扣减
    /**
     * @example loss_fee
     *
     * @var string
     */
    public $lossFee;

    // 平台did
    /**
     * @example did:mychain:b6db2d812b1dac07a8c2a6201db3fff529f1ce7d78f58888fd791aec84dc8a8e
     *
     * @var string
     */
    public $platformDid;

    // 运单id
    /**
     * @example 运单id
     *
     * @var string
     */
    public $taxWaybillId;
    protected $_name = [
        'allFreight'             => 'all_freight',
        'backFee'                => 'back_fee',
        'consignorFreightAmount' => 'consignor_freight_amount',
        'freightIncr'            => 'freight_incr',
        'lossFee'                => 'loss_fee',
        'platformDid'            => 'platform_did',
        'taxWaybillId'           => 'tax_waybill_id',
    ];

    public function validate()
    {
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('taxWaybillId', $this->taxWaybillId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->allFreight) {
            $res['all_freight'] = $this->allFreight;
        }
        if (null !== $this->backFee) {
            $res['back_fee'] = $this->backFee;
        }
        if (null !== $this->consignorFreightAmount) {
            $res['consignor_freight_amount'] = $this->consignorFreightAmount;
        }
        if (null !== $this->freightIncr) {
            $res['freight_incr'] = $this->freightIncr;
        }
        if (null !== $this->lossFee) {
            $res['loss_fee'] = $this->lossFee;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->taxWaybillId) {
            $res['tax_waybill_id'] = $this->taxWaybillId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FinishWaybillOrderReq
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['all_freight'])) {
            $model->allFreight = $map['all_freight'];
        }
        if (isset($map['back_fee'])) {
            $model->backFee = $map['back_fee'];
        }
        if (isset($map['consignor_freight_amount'])) {
            $model->consignorFreightAmount = $map['consignor_freight_amount'];
        }
        if (isset($map['freight_incr'])) {
            $model->freightIncr = $map['freight_incr'];
        }
        if (isset($map['loss_fee'])) {
            $model->lossFee = $map['loss_fee'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['tax_waybill_id'])) {
            $model->taxWaybillId = $map['tax_waybill_id'];
        }

        return $model;
    }
}
