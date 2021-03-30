<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaasIssueApplyInfo extends Model
{
    // 货源订单
    /**
     * @example 123123
     *
     * @var string
     */
    public $cargoOrder;

    // 合同号
    /**
     * @example 123123
     *
     * @var string
     */
    public $contractId;

    // 全局唯一业务单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $outBizNo;

    // 支付单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $payOrder;

    // 运单号
    /**
     * @example 123123
     *
     * @var string
     */
    public $waybillId;

    // 司机did
    /**
     * @example 123123
     *
     * @var string
     */
    public $driverDid;

    // 发行费
    /**
     * @example 1.12
     *
     * @var string
     */
    public $freight;

    // 到期时间戳
    /**
     * @example 1593504406597
     *
     * @var string
     */
    public $expireDate;
    protected $_name = [
        'cargoOrder' => 'cargo_order',
        'contractId' => 'contract_id',
        'outBizNo'   => 'out_biz_no',
        'payOrder'   => 'pay_order',
        'waybillId'  => 'waybill_id',
        'driverDid'  => 'driver_did',
        'freight'    => 'freight',
        'expireDate' => 'expire_date',
    ];

    public function validate()
    {
        Model::validateRequired('outBizNo', $this->outBizNo, true);
        Model::validateRequired('payOrder', $this->payOrder, true);
        Model::validateRequired('waybillId', $this->waybillId, true);
        Model::validateRequired('driverDid', $this->driverDid, true);
        Model::validateRequired('freight', $this->freight, true);
        Model::validateRequired('expireDate', $this->expireDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->outBizNo) {
            $res['out_biz_no'] = $this->outBizNo;
        }
        if (null !== $this->payOrder) {
            $res['pay_order'] = $this->payOrder;
        }
        if (null !== $this->waybillId) {
            $res['waybill_id'] = $this->waybillId;
        }
        if (null !== $this->driverDid) {
            $res['driver_did'] = $this->driverDid;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaasIssueApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['cargo_order'])) {
            $model->cargoOrder = $map['cargo_order'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['out_biz_no'])) {
            $model->outBizNo = $map['out_biz_no'];
        }
        if (isset($map['pay_order'])) {
            $model->payOrder = $map['pay_order'];
        }
        if (isset($map['waybill_id'])) {
            $model->waybillId = $map['waybill_id'];
        }
        if (isset($map['driver_did'])) {
            $model->driverDid = $map['driver_did'];
        }
        if (isset($map['freight'])) {
            $model->freight = $map['freight'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }

        return $model;
    }
}
