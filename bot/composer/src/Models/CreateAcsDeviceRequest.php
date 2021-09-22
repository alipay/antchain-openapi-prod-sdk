<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateAcsDeviceRequest extends Model
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

    // 设备ID
    /**
     * @var string
     */
    public $deviceId;

    // 场景码-对应acs iot管控后台项目code
    /**
     * @var string
     */
    public $scene;

    // 设备类型编码-对应acs iot管控后台设备类型编码
    /**
     * @var string
     */
    public $classCode;

    // 设备注册信息
    /**
     * @var string
     */
    public $content;

    // 设备注册信息 签名
    /**
     * @var string
     */
    public $signature;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 设备单价 单位：分
    /**
     * @var int
     */
    public $initialPrice;

    // 设备出厂时间
    /**
     * @var string
     */
    public $factoryTime;

    // 设备投放时间
    /**
     * @var string
     */
    public $releaseTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'scene'             => 'scene',
        'classCode'         => 'class_code',
        'content'           => 'content',
        'signature'         => 'signature',
        'deviceName'        => 'device_name',
        'initialPrice'      => 'initial_price',
        'factoryTime'       => 'factory_time',
        'releaseTime'       => 'release_time',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('classCode', $this->classCode, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('signature', $this->signature, true);
        Model::validateRequired('deviceName', $this->deviceName, true);
        Model::validatePattern('factoryTime', $this->factoryTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('releaseTime', $this->releaseTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->classCode) {
            $res['class_code'] = $this->classCode;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->signature) {
            $res['signature'] = $this->signature;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->initialPrice) {
            $res['initial_price'] = $this->initialPrice;
        }
        if (null !== $this->factoryTime) {
            $res['factory_time'] = $this->factoryTime;
        }
        if (null !== $this->releaseTime) {
            $res['release_time'] = $this->releaseTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAcsDeviceRequest
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
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['class_code'])) {
            $model->classCode = $map['class_code'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['signature'])) {
            $model->signature = $map['signature'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['initial_price'])) {
            $model->initialPrice = $map['initial_price'];
        }
        if (isset($map['factory_time'])) {
            $model->factoryTime = $map['factory_time'];
        }
        if (isset($map['release_time'])) {
            $model->releaseTime = $map['release_time'];
        }

        return $model;
    }
}
