<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class UpdateCargowaybillBillRequest extends Model
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

    // 货主账单总额（两位小数）
    /**
     * @var string
     */
    public $billAmount;

    // 账单code（唯一标识）
    /**
     * @var string
     */
    public $billCode;

    // 账单生成时间(毫秒)
    /**
     * @var int
     */
    public $billCreateTime;

    // 账单期限
    /**
     * @var string
     */
    public $billDeadline;

    // 付款方did
    /**
     * @var string
     */
    public $billPayerDid;

    // 货源单号-货主运费列表
    /**
     * @var CargoAmount[]
     */
    public $cargoAmounts;

    // 币种
    /**
     * @var string
     */
    public $currency;

    // 账单到期日期
    /**
     * @var int
     */
    public $deadline;

    // 货主支付方式-支付金额列表
    /**
     * @var PayAmount[]
     */
    public $payAmounts;

    // 平台did
    /**
     * @var string
     */
    public $platformDid;

    // 预计货主付款日期
    /**
     * @var int
     */
    public $preConsignorPayDate;

    // 运单号-司机运费列表
    /**
     * @var WaybillAmount[]
     */
    public $waybillAmounts;

    // 运单上传状态，可填写：已完成、未完成
    /**
     * @var string
     */
    public $waybillUploadStatus;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'billAmount'          => 'bill_amount',
        'billCode'            => 'bill_code',
        'billCreateTime'      => 'bill_create_time',
        'billDeadline'        => 'bill_deadline',
        'billPayerDid'        => 'bill_payer_did',
        'cargoAmounts'        => 'cargo_amounts',
        'currency'            => 'currency',
        'deadline'            => 'deadline',
        'payAmounts'          => 'pay_amounts',
        'platformDid'         => 'platform_did',
        'preConsignorPayDate' => 'pre_consignor_pay_date',
        'waybillAmounts'      => 'waybill_amounts',
        'waybillUploadStatus' => 'waybill_upload_status',
    ];

    public function validate()
    {
        Model::validateRequired('billAmount', $this->billAmount, true);
        Model::validateRequired('billCode', $this->billCode, true);
        Model::validateRequired('billCreateTime', $this->billCreateTime, true);
        Model::validateRequired('billDeadline', $this->billDeadline, true);
        Model::validateRequired('billPayerDid', $this->billPayerDid, true);
        Model::validateRequired('cargoAmounts', $this->cargoAmounts, true);
        Model::validateRequired('currency', $this->currency, true);
        Model::validateRequired('deadline', $this->deadline, true);
        Model::validateRequired('payAmounts', $this->payAmounts, true);
        Model::validateRequired('platformDid', $this->platformDid, true);
        Model::validateRequired('preConsignorPayDate', $this->preConsignorPayDate, true);
        Model::validateRequired('waybillUploadStatus', $this->waybillUploadStatus, true);
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
        if (null !== $this->billAmount) {
            $res['bill_amount'] = $this->billAmount;
        }
        if (null !== $this->billCode) {
            $res['bill_code'] = $this->billCode;
        }
        if (null !== $this->billCreateTime) {
            $res['bill_create_time'] = $this->billCreateTime;
        }
        if (null !== $this->billDeadline) {
            $res['bill_deadline'] = $this->billDeadline;
        }
        if (null !== $this->billPayerDid) {
            $res['bill_payer_did'] = $this->billPayerDid;
        }
        if (null !== $this->cargoAmounts) {
            $res['cargo_amounts'] = [];
            if (null !== $this->cargoAmounts && \is_array($this->cargoAmounts)) {
                $n = 0;
                foreach ($this->cargoAmounts as $item) {
                    $res['cargo_amounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->currency) {
            $res['currency'] = $this->currency;
        }
        if (null !== $this->deadline) {
            $res['deadline'] = $this->deadline;
        }
        if (null !== $this->payAmounts) {
            $res['pay_amounts'] = [];
            if (null !== $this->payAmounts && \is_array($this->payAmounts)) {
                $n = 0;
                foreach ($this->payAmounts as $item) {
                    $res['pay_amounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->preConsignorPayDate) {
            $res['pre_consignor_pay_date'] = $this->preConsignorPayDate;
        }
        if (null !== $this->waybillAmounts) {
            $res['waybill_amounts'] = [];
            if (null !== $this->waybillAmounts && \is_array($this->waybillAmounts)) {
                $n = 0;
                foreach ($this->waybillAmounts as $item) {
                    $res['waybill_amounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->waybillUploadStatus) {
            $res['waybill_upload_status'] = $this->waybillUploadStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCargowaybillBillRequest
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
        if (isset($map['bill_amount'])) {
            $model->billAmount = $map['bill_amount'];
        }
        if (isset($map['bill_code'])) {
            $model->billCode = $map['bill_code'];
        }
        if (isset($map['bill_create_time'])) {
            $model->billCreateTime = $map['bill_create_time'];
        }
        if (isset($map['bill_deadline'])) {
            $model->billDeadline = $map['bill_deadline'];
        }
        if (isset($map['bill_payer_did'])) {
            $model->billPayerDid = $map['bill_payer_did'];
        }
        if (isset($map['cargo_amounts'])) {
            if (!empty($map['cargo_amounts'])) {
                $model->cargoAmounts = [];
                $n                   = 0;
                foreach ($map['cargo_amounts'] as $item) {
                    $model->cargoAmounts[$n++] = null !== $item ? CargoAmount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['currency'])) {
            $model->currency = $map['currency'];
        }
        if (isset($map['deadline'])) {
            $model->deadline = $map['deadline'];
        }
        if (isset($map['pay_amounts'])) {
            if (!empty($map['pay_amounts'])) {
                $model->payAmounts = [];
                $n                 = 0;
                foreach ($map['pay_amounts'] as $item) {
                    $model->payAmounts[$n++] = null !== $item ? PayAmount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['pre_consignor_pay_date'])) {
            $model->preConsignorPayDate = $map['pre_consignor_pay_date'];
        }
        if (isset($map['waybill_amounts'])) {
            if (!empty($map['waybill_amounts'])) {
                $model->waybillAmounts = [];
                $n                     = 0;
                foreach ($map['waybill_amounts'] as $item) {
                    $model->waybillAmounts[$n++] = null !== $item ? WaybillAmount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['waybill_upload_status'])) {
            $model->waybillUploadStatus = $map['waybill_upload_status'];
        }

        return $model;
    }
}
