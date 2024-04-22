<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class ExecThingServiceRequest extends Model
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

    // 场景码
    /**
     * @var string
     */
    public $scene;

    // 服务标识
    /**
     * @var string
     */
    public $identifier;

    // 可信设备唯一ID
    /**
     * @var int
     */
    public $trustiotEntityId;

    // 设备编号/资产ID
    /**
     * @var string
     */
    public $deviceId;

    // 物模型服务入参
    /**
     * @var string
     */
    public $inputData;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'scene'             => 'scene',
        'identifier'        => 'identifier',
        'trustiotEntityId'  => 'trustiot_entity_id',
        'deviceId'          => 'device_id',
        'inputData'         => 'input_data',
    ];

    public function validate()
    {
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('identifier', $this->identifier, true);
        Model::validateRequired('inputData', $this->inputData, true);
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->identifier) {
            $res['identifier'] = $this->identifier;
        }
        if (null !== $this->trustiotEntityId) {
            $res['trustiot_entity_id'] = $this->trustiotEntityId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->inputData) {
            $res['input_data'] = $this->inputData;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecThingServiceRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['identifier'])) {
            $model->identifier = $map['identifier'];
        }
        if (isset($map['trustiot_entity_id'])) {
            $model->trustiotEntityId = $map['trustiot_entity_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['input_data'])) {
            $model->inputData = $map['input_data'];
        }

        return $model;
    }
}
