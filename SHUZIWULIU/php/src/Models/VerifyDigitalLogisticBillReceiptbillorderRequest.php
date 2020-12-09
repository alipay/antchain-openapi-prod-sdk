<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class VerifyDigitalLogisticBillReceiptbillorderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'action' => 'action',
        'forwarderDid' => 'forwarder_did',
        'receiptTariffCode' => 'receipt_tariff_code',
        'verifyAmount' => 'verify_amount',
        'verifyReceiptTariffCode' => 'verify_receipt_tariff_code',
        'verifyStatus' => 'verify_status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->receiptTariffCode) {
            $res['receipt_tariff_code'] = $this->receiptTariffCode;
        }
        if (null !== $this->verifyAmount) {
            $res['verify_amount'] = $this->verifyAmount;
        }
        if (null !== $this->verifyReceiptTariffCode) {
            $res['verify_receipt_tariff_code'] = $this->verifyReceiptTariffCode;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return VerifyDigitalLogisticBillReceiptbillorderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['forwarder_did'])){
            $model->forwarderDid = $map['forwarder_did'];
        }
        if(isset($map['receipt_tariff_code'])){
            $model->receiptTariffCode = $map['receipt_tariff_code'];
        }
        if(isset($map['verify_amount'])){
            $model->verifyAmount = $map['verify_amount'];
        }
        if(isset($map['verify_receipt_tariff_code'])){
            $model->verifyReceiptTariffCode = $map['verify_receipt_tariff_code'];
        }
        if(isset($map['verify_status'])){
            $model->verifyStatus = $map['verify_status'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * @var string
     */
    public $action;

    // 货代did
    /**
     * @var string
     */
    public $forwarderDid;

    // 应收资费项编号
    /**
     * @var string
     */
    public $receiptTariffCode;

    // 核销金额 业务必填
    /**
     * @var string
     */
    public $verifyAmount;

    // 核销应收资费项编号
    /**
     * @var string
     */
    public $verifyReceiptTariffCode;

    // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销 业务必填
    /**
     * @var string
     */
    public $verifyStatus;

}
