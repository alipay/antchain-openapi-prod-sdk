<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS_SPI\Models;

use AlibabaCloud\Tea\Model;

class CallbackRightsprodStatusRequest extends Model
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

    // 券变更状态
    // V_USE（使用）
    // V_REFUND（退款）
    // V_EXPIRE（过期）
    // V_INVALID（作废）
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'rightsCode'        => 'rights_code',
        'voucherCode'       => 'voucher_code',
        'status'            => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('rightsCode', $this->rightsCode, true);
        Model::validateRequired('voucherCode', $this->voucherCode, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CallbackRightsprodStatusRequest
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
