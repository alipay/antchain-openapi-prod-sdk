<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class PayBillTariffParam extends Model {
    protected $_name = [
        'action' => 'action',
        'billAmount' => 'bill_amount',
        'payBillTariffCode' => 'pay_bill_tariff_code',
        'payTariffAmount' => 'pay_tariff_amount',
        'payTariffCode' => 'pay_tariff_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->billAmount) {
            $res['bill_amount'] = $this->billAmount;
        }
        if (null !== $this->payBillTariffCode) {
            $res['pay_bill_tariff_code'] = $this->payBillTariffCode;
        }
        if (null !== $this->payTariffAmount) {
            $res['pay_tariff_amount'] = $this->payTariffAmount;
        }
        if (null !== $this->payTariffCode) {
            $res['pay_tariff_code'] = $this->payTariffCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PayBillTariffParam
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['bill_amount'])){
            $model->billAmount = $map['bill_amount'];
        }
        if(isset($map['pay_bill_tariff_code'])){
            $model->payBillTariffCode = $map['pay_bill_tariff_code'];
        }
        if(isset($map['pay_tariff_amount'])){
            $model->payTariffAmount = $map['pay_tariff_amount'];
        }
        if(isset($map['pay_tariff_code'])){
            $model->payTariffCode = $map['pay_tariff_code'];
        }
        return $model;
    }
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @example UPDATE、DELETE、INSERT
     * @var string
     */
    public $action;

    // 账单金额 业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $billAmount;

    // 应付账单、应付资费项 多对多code
    /**
     * @example 暂无
     * @var string
     */
    public $payBillTariffCode;

    // 资费项金额 业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $payTariffAmount;

    // 应付资费项编号 业务必填
    /**
     * @example 暂无
     * @var string
     */
    public $payTariffCode;

}
