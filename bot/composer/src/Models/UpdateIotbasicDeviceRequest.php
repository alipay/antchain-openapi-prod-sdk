<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class UpdateIotbasicDeviceRequest extends Model
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

    // 设备did
    /**
     * @var string
     */
    public $deviceDid;

    // 设备名称
    /**
     * @var string
     */
    public $deviceName;

    // 安装位置
    /**
     * @var string
     */
    public $location;

    // 设备扩展信息
    /**
     * @var string
     */
    public $deviceExt;

    // 设备标签
    /**
     * @var string
     */
    public $nickName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceDid'         => 'device_did',
        'deviceName'        => 'device_name',
        'location'          => 'location',
        'deviceExt'         => 'device_ext',
        'nickName'          => 'nick_name',
    ];

    public function validate()
    {
        Model::validateRequired('deviceDid', $this->deviceDid, true);
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
        if (null !== $this->deviceDid) {
            $res['device_did'] = $this->deviceDid;
        }
        if (null !== $this->deviceName) {
            $res['device_name'] = $this->deviceName;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->deviceExt) {
            $res['device_ext'] = $this->deviceExt;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateIotbasicDeviceRequest
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
        if (isset($map['device_did'])) {
            $model->deviceDid = $map['device_did'];
        }
        if (isset($map['device_name'])) {
            $model->deviceName = $map['device_name'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['device_ext'])) {
            $model->deviceExt = $map['device_ext'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }

        return $model;
    }
}
