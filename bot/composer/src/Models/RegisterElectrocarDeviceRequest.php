<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class RegisterElectrocarDeviceRequest extends Model
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

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 设备名称
    /**
     * @var string
     */
    public $nickName;

    // 产品key
    /**
     * @var string
     */
    public $trustProductKey;

    // 凭证申请参数
    /**
     * @var KytApplyParams
     */
    public $kytApplyParams;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceName'        => 'device_name',
        'nickName'          => 'nick_name',
        'trustProductKey'   => 'trust_product_key',
        'kytApplyParams'    => 'kyt_apply_params',
    ];

    public function validate()
    {
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validateRequired('nickName', $this->nickName, true);
        Model::validateRequired('trustProductKey', $this->trustProductKey, true);
        Model::validateRequired('kytApplyParams', $this->kytApplyParams, true);
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
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->trustProductKey) {
            $res['trust_product_key'] = $this->trustProductKey;
        }
        if (null !== $this->kytApplyParams) {
            $res['kyt_apply_params'] = null !== $this->kytApplyParams ? $this->kytApplyParams->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RegisterElectrocarDeviceRequest
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
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['trust_product_key'])) {
            $model->trustProductKey = $map['trust_product_key'];
        }
        if (isset($map['kyt_apply_params'])) {
            $model->kytApplyParams = KytApplyParams::fromMap($map['kyt_apply_params']);
        }

        return $model;
    }
}
