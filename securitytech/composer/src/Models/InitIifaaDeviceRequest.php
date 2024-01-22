<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class InitIifaaDeviceRequest extends Model
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

    // 产商code
    /**
     * @var string
     */
    public $corpCode;

    // 设备类型
    /**
     * @var string
     */
    public $deviceType;

    // 设备信息
    /**
     * @var string
     */
    public $deviceInfo;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 用于加密回传数据的公钥
    /**
     * @var string
     */
    public $pubKey;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'corpCode'          => 'corp_code',
        'deviceType'        => 'device_type',
        'deviceInfo'        => 'device_info',
        'productCode'       => 'product_code',
        'pubKey'            => 'pub_key',
    ];

    public function validate()
    {
        Model::validateRequired('corpCode', $this->corpCode, true);
        Model::validateRequired('deviceType', $this->deviceType, true);
        Model::validateRequired('deviceInfo', $this->deviceInfo, true);
        Model::validateRequired('productCode', $this->productCode, true);
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
        if (null !== $this->corpCode) {
            $res['corp_code'] = $this->corpCode;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }
        if (null !== $this->deviceInfo) {
            $res['device_info'] = $this->deviceInfo;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->pubKey) {
            $res['pub_key'] = $this->pubKey;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitIifaaDeviceRequest
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
        if (isset($map['corp_code'])) {
            $model->corpCode = $map['corp_code'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }
        if (isset($map['device_info'])) {
            $model->deviceInfo = $map['device_info'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['pub_key'])) {
            $model->pubKey = $map['pub_key'];
        }

        return $model;
    }
}
