<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class UploadSimQrcodeRequest extends Model
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

    // 设备号
    /**
     * @var string
     */
    public $deviceId;

    // 登录态token
    /**
     * @var string
     */
    public $token;

    // 车型
    /**
     * @var string
     */
    public $vehicleModel;

    // 解析类型
    /**
     * @var string
     */
    public $parseType;

    // base64后的图象数据
    /**
     * @var string
     */
    public $base64Data;

    // 二维码解析后数据
    /**
     * @var string
     */
    public $qrcodeValue;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'token'             => 'token',
        'vehicleModel'      => 'vehicle_model',
        'parseType'         => 'parse_type',
        'base64Data'        => 'base64_data',
        'qrcodeValue'       => 'qrcode_value',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('vehicleModel', $this->vehicleModel, true);
        Model::validateRequired('parseType', $this->parseType, true);
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
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->vehicleModel) {
            $res['vehicle_model'] = $this->vehicleModel;
        }
        if (null !== $this->parseType) {
            $res['parse_type'] = $this->parseType;
        }
        if (null !== $this->base64Data) {
            $res['base64_data'] = $this->base64Data;
        }
        if (null !== $this->qrcodeValue) {
            $res['qrcode_value'] = $this->qrcodeValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadSimQrcodeRequest
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
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['vehicle_model'])) {
            $model->vehicleModel = $map['vehicle_model'];
        }
        if (isset($map['parse_type'])) {
            $model->parseType = $map['parse_type'];
        }
        if (isset($map['base64_data'])) {
            $model->base64Data = $map['base64_data'];
        }
        if (isset($map['qrcode_value'])) {
            $model->qrcodeValue = $map['qrcode_value'];
        }

        return $model;
    }
}
