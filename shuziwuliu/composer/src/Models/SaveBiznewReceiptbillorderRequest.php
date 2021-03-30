<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class SaveBiznewReceiptbillorderRequest extends Model
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

    // 应收账单号
    //
    //
    /**
     * @var string
     */
    public $receiptBillOrderCode;

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

    // 收款金额 [业务必填]
    //
    //
    /**
     * @var string
     */
    public $receiptAmount;

    // 申请时间 (秒时间戳) [业务必填]
    /**
     * @var int
     */
    public $applyDate;

    // 账单到期日 (秒时间戳) [业务必填]
    //
    //
    /**
     * @var int
     */
    public $expireDate;

    // 账单状态  SETTLED 已结算 UNSETTLE 未结算  [业务必填]
    /**
     * @var string
     */
    public $settleStatus;

    // 应收资费项 [业务必填]
    //
    //
    /**
     * @var ReceiptTariffInfo[]
     */
    public $receiptTariffList;

    // 币种 [业务必填]
    /**
     * @var string
     */
    public $currency;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'receiptBillOrderCode' => 'receipt_bill_order_code',
        'forwarderDid'         => 'forwarder_did',
        'settleCompanyDid'     => 'settle_company_did',
        'receiptClientDid'     => 'receipt_client_did',
        'receiptAmount'        => 'receipt_amount',
        'applyDate'            => 'apply_date',
        'expireDate'           => 'expire_date',
        'settleStatus'         => 'settle_status',
        'receiptTariffList'    => 'receipt_tariff_list',
        'currency'             => 'currency',
    ];

    public function validate()
    {
        Model::validateRequired('receiptBillOrderCode', $this->receiptBillOrderCode, true);
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
        if (null !== $this->receiptBillOrderCode) {
            $res['receipt_bill_order_code'] = $this->receiptBillOrderCode;
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
        if (null !== $this->receiptAmount) {
            $res['receipt_amount'] = $this->receiptAmount;
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
        if (null !== $this->receiptTariffList) {
            $res['receipt_tariff_list'] = [];
            if (null !== $this->receiptTariffList && \is_array($this->receiptTariffList)) {
                $n = 0;
                foreach ($this->receiptTariffList as $item) {
                    $res['receipt_tariff_list'][$n++] = null !== $item ? $item->toMap() : $item;
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
     * @return SaveBiznewReceiptbillorderRequest
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
        if (isset($map['receipt_bill_order_code'])) {
            $model->receiptBillOrderCode = $map['receipt_bill_order_code'];
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
        if (isset($map['receipt_amount'])) {
            $model->receiptAmount = $map['receipt_amount'];
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
        if (isset($map['receipt_tariff_list'])) {
            if (!empty($map['receipt_tariff_list'])) {
                $model->receiptTariffList = [];
                $n                        = 0;
                foreach ($map['receipt_tariff_list'] as $item) {
                    $model->receiptTariffList[$n++] = null !== $item ? ReceiptTariffInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }

        return $model;
    }
}
