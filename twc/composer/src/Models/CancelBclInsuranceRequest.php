<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CancelBclInsuranceRequest extends Model
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

    // 租赁宝plus订单id
    /**
     * @var string
     */
    public $orderId;

    // 保险单号
    /**
     * @var string
     */
    public $bclInsuranceRecordId;

    // 人保退保时必填
    /**
     * @var RenbaoExtInfo
     */
    public $renbaoExtInfo;

    // 保司code，枚举值 HZ_RENBAO: 杭州人保
    /**
     * @var string
     */
    public $insuranceCode;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'orderId'              => 'order_id',
        'bclInsuranceRecordId' => 'bcl_insurance_record_id',
        'renbaoExtInfo'        => 'renbao_ext_info',
        'insuranceCode'        => 'insurance_code',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('bclInsuranceRecordId', $this->bclInsuranceRecordId, true);
        Model::validateRequired('insuranceCode', $this->insuranceCode, true);
        Model::validateMaxLength('bclInsuranceRecordId', $this->bclInsuranceRecordId, 64);
        Model::validateMaxLength('insuranceCode', $this->insuranceCode, 32);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->bclInsuranceRecordId) {
            $res['bcl_insurance_record_id'] = $this->bclInsuranceRecordId;
        }
        if (null !== $this->renbaoExtInfo) {
            $res['renbao_ext_info'] = null !== $this->renbaoExtInfo ? $this->renbaoExtInfo->toMap() : null;
        }
        if (null !== $this->insuranceCode) {
            $res['insurance_code'] = $this->insuranceCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CancelBclInsuranceRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['bcl_insurance_record_id'])) {
            $model->bclInsuranceRecordId = $map['bcl_insurance_record_id'];
        }
        if (isset($map['renbao_ext_info'])) {
            $model->renbaoExtInfo = RenbaoExtInfo::fromMap($map['renbao_ext_info']);
        }
        if (isset($map['insurance_code'])) {
            $model->insuranceCode = $map['insurance_code'];
        }

        return $model;
    }
}
