<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class IssueApplyInfo extends Model {
    protected $_name = [
        'cargoOrder' => 'cargo_order',
        'contractId' => 'contract_id',
        'expireDate' => 'expire_date',
        'freight' => 'freight',
        'outBizNo' => 'out_biz_no',
        'payOrder' => 'pay_order',
        'waybillId' => 'waybill_id',
        'driverDid' => 'driver_did',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->cargoOrder) {
            $res['cargo_order'] = $this->cargoOrder;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->freight) {
            $res['freight'] = $this->freight;
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
        return $res;
    }
    /**
     * @param array $map
     * @return IssueApplyInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['cargo_order'])){
            $model->cargoOrder = $map['cargo_order'];
        }
        if(isset($map['contract_id'])){
            $model->contractId = $map['contract_id'];
        }
        if(isset($map['expire_date'])){
            $model->expireDate = $map['expire_date'];
        }
        if(isset($map['freight'])){
            $model->freight = $map['freight'];
        }
        if(isset($map['out_biz_no'])){
            $model->outBizNo = $map['out_biz_no'];
        }
        if(isset($map['pay_order'])){
            $model->payOrder = $map['pay_order'];
        }
        if(isset($map['waybill_id'])){
            $model->waybillId = $map['waybill_id'];
        }
        if(isset($map['driver_did'])){
            $model->driverDid = $map['driver_did'];
        }
        return $model;
    }
    // 货源订单
    /**
     * @example 123123
     * @var string
     */
    public $cargoOrder;

    // 合同号（预留）
    /**
     * @example 123
     * @var string
     */
    public $contractId;

    // 凭证到期时间
    /**
     * @example 1581579336000
     * @var string
     */
    public $expireDate;

    // 支付单运费，运费最多精确到小数点后2位
    /**
     * @example 189.76
     * @var string
     */
    public $freight;

    // 全局唯一业务号
    /**
     * @example fa142b66cb1dece6a3
     * @var string
     */
    public $outBizNo;

    // 支付订单
    /**
     * @example 123123
     * @var string
     */
    public $payOrder;

    // 运单id
    /**
     * @example 123123
     * @var string
     */
    public $waybillId;

    // 司机did
    /**
     * @example did:mychain:11119abde09890ad6c40a5f9ba96fcb33ca134c6c29efdbbc743549e62c12222
     * @var string
     */
    public $driverDid;

}
