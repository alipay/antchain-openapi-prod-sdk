<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class CallbackRightsprodOperationRequest extends Model
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

    // 权益编码
    /**
     * @var string
     */
    public $rightsCode;

    // 券码
    /**
     * @var string
     */
    public $voucherCode;

    // 通知ID(幂等)
    /**
     * @var string
     */
    public $notifyId;

    // 业务类型
    // V_REFUND（退款）
    // V_EXPIRE（过期）
    // V_INVALID（作废）
    // V_USE（使用）
    /**
     * @var string
     */
    public $bizType;

    // 支付订单号
    /**
     * @var string
     */
    public $payOrderNo;

    // 券面额
    /**
     * @var string
     */
    public $faceAmount;

    // 流通金额（核销、退款时 金额）
    /**
     * @var string
     */
    public $fluxAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'rightsCode'        => 'rights_code',
        'voucherCode'       => 'voucher_code',
        'notifyId'          => 'notify_id',
        'bizType'           => 'biz_type',
        'payOrderNo'        => 'pay_order_no',
        'faceAmount'        => 'face_amount',
        'fluxAmount'        => 'flux_amount',
    ];

    public function validate()
    {
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('voucherCode', $this->voucherCode, true);
        Model::validateRequired('notifyId', $this->notifyId, true);
        Model::validateRequired('bizType', $this->bizType, true);
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
        if (null !== $this->rightsCode) {
            $res['rights_code'] = $this->rightsCode;
        }
        if (null !== $this->voucherCode) {
            $res['voucher_code'] = $this->voucherCode;
        }
        if (null !== $this->notifyId) {
            $res['notify_id'] = $this->notifyId;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->payOrderNo) {
            $res['pay_order_no'] = $this->payOrderNo;
        }
        if (null !== $this->faceAmount) {
            $res['face_amount'] = $this->faceAmount;
        }
        if (null !== $this->fluxAmount) {
            $res['flux_amount'] = $this->fluxAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackRightsprodOperationRequest
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
        if (isset($map['rights_code'])) {
            $model->rightsCode = $map['rights_code'];
        }
        if (isset($map['voucher_code'])) {
            $model->voucherCode = $map['voucher_code'];
        }
        if (isset($map['notify_id'])) {
            $model->notifyId = $map['notify_id'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['pay_order_no'])) {
            $model->payOrderNo = $map['pay_order_no'];
        }
        if (isset($map['face_amount'])) {
            $model->faceAmount = $map['face_amount'];
        }
        if (isset($map['flux_amount'])) {
            $model->fluxAmount = $map['flux_amount'];
        }

        return $model;
    }
}
