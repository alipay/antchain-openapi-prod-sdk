<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class VerifyBillPaybillRequest extends Model
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

    // 应付资费项编号
    /**
     * @var string
     */
    public $payTariffCode;

    // 核销金额 业务必填
    /**
     * @var string
     */
    public $verifyAmount;

    // 核销应付资费项编号
    /**
     * @var string
     */
    public $verifyPayTariffCode;

    // 核销状态 WAIT_VERIFY-待核销，PART_VERIFY-部分核销，COMPLETE_VERIFY-完成核销
    // 业务必填
    /**
     * @var string
     */
    public $verifyStatus;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'action'              => 'action',
        'forwarderDid'        => 'forwarder_did',
        'payTariffCode'       => 'pay_tariff_code',
        'verifyAmount'        => 'verify_amount',
        'verifyPayTariffCode' => 'verify_pay_tariff_code',
        'verifyStatus'        => 'verify_status',
    ];

    public function validate()
    {
        Model::validateRequired('forwarderDid', $this->forwarderDid, true);
        Model::validateRequired('payTariffCode', $this->payTariffCode, true);
        Model::validateRequired('verifyPayTariffCode', $this->verifyPayTariffCode, true);
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
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->forwarderDid) {
            $res['forwarder_did'] = $this->forwarderDid;
        }
        if (null !== $this->payTariffCode) {
            $res['pay_tariff_code'] = $this->payTariffCode;
        }
        if (null !== $this->verifyAmount) {
            $res['verify_amount'] = $this->verifyAmount;
        }
        if (null !== $this->verifyPayTariffCode) {
            $res['verify_pay_tariff_code'] = $this->verifyPayTariffCode;
        }
        if (null !== $this->verifyStatus) {
            $res['verify_status'] = $this->verifyStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyBillPaybillRequest
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
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['forwarder_did'])) {
            $model->forwarderDid = $map['forwarder_did'];
        }
        if (isset($map['pay_tariff_code'])) {
            $model->payTariffCode = $map['pay_tariff_code'];
        }
        if (isset($map['verify_amount'])) {
            $model->verifyAmount = $map['verify_amount'];
        }
        if (isset($map['verify_pay_tariff_code'])) {
            $model->verifyPayTariffCode = $map['verify_pay_tariff_code'];
        }
        if (isset($map['verify_status'])) {
            $model->verifyStatus = $map['verify_status'];
        }

        return $model;
    }
}
