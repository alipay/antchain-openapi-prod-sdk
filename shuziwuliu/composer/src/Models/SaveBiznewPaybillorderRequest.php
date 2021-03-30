<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewPaybillorderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 应付账单号
    //
    //
    /**
     * @var string
     */
    public $payBillOrderCode;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 应付方did [业务必填]
    //
    //
    /**
     * @var string
     */
    public $settleCompanyDid;

    // 收款方did [业务必填]
    //
    //
    /**
     * @var string
     */
    public $receiptClientDid;

    // 付款金额 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $payAmount;

    // 申请时间 （秒时间戳） [业务必填]
    //
    //
    /**
     * @var int
     */
    public $applyDate;

    // 账单到期时间（秒时间戳） [业务必填]
    /**
     * @var int
     */
    public $expireDate;

    // 账单状态  SETTLED 已结算 UNSETTLE 未结算 (业务必填)
    /**
     * @var string
     */
    public $settleStatus;

    // 应付资费项 (业务必填)
    /**
     * @var PayTariffInfo[]
     */
    public $payTariffList;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'payBillOrderCode'  => 'pay_bill_order_code',
        'forwarderDid'      => 'forwarder_did',
        'settleCompanyDid'  => 'settle_company_did',
        'receiptClientDid'  => 'receipt_client_did',
        'payAmount'         => 'pay_amount',
        'applyDate'         => 'apply_date',
        'expireDate'        => 'expire_date',
        'settleStatus'      => 'settle_status',
        'payTariffList'     => 'pay_tariff_list',
        'currency'          => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('payBillOrderCode', $this->payBillOrderCode, true);
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->payBillOrderCode) {
            $res['pay_bill_order_code'] = $this->payBillOrderCode;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->settleCompanyDid) {
            $res['settle_company_did'] = $this->settleCompanyDid;
        }
        if (null !== $this->receiptClientDid) {
            $res['receipt_client_did'] = $this->receiptClientDid;
        }
        if (null !== $this->payAmount) {
            $res['pay_amount'] = $this->payAmount;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
        }
        if (null !== $this->expireDate) {
            $res['expire_date'] = $this->expireDate;
        }
        if (null !== $this->settleStatus) {
            $res['settle_status'] = $this->settleStatus;
        }
        if (null !== $this->payTariffList) {
            $res['pay_tariff_list'] = [];
            if (null !== $this->payTariffList && \is_array($this->payTariffList)) {
                $n = 0;
                foreach ($this->payTariffList as $item) {
                    $res['pay_tariff_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveBiznewPaybillorderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['pay_bill_order_code'])) {
            $model->payBillOrderCode = $map['pay_bill_order_code'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['settle_company_did'])) {
            $model->settleCompanyDid = $map['settle_company_did'];
        }
        if (isset($map['receipt_client_did'])) {
            $model->receiptClientDid = $map['receipt_client_did'];
        }
        if (isset($map['pay_amount'])) {
            $model->payAmount = $map['pay_amount'];
        }
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }
        if (isset($map['expire_date'])) {
            $model->expireDate = $map['expire_date'];
        }
        if (isset($map['settle_status'])) {
            $model->settleStatus = $map['settle_status'];
        }
        if (isset($map['pay_tariff_list'])) {
            if (!empty($map['pay_tariff_list'])) {
                $model->payTariffList = [];
                $n                    = 0;
                foreach ($map['pay_tariff_list'] as $item) {
                    $model->payTariffList[$n++] = null !== $item ? PayTariffInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
