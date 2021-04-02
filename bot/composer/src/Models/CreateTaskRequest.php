<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class CreateTaskRequest extends Model
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

    // 设备Id
    //
    //
    /**
     * @var string
     */
    public $deviceId;

    // 远程命令
    //
    //
    /**
     * @var string
     */
    public $cmd;

    // 附加信息
    //
    //
    /**
     * @var string
     */
    public $extra;

    // 场景码
    //
    //
    /**
     * @var string
     */
    public $scene;

    // 设备类型
    /**
     * @var string
     */
    public $deviceType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'deviceId'          => 'device_id',
        'cmd'               => 'cmd',
        'extra'             => 'extra',
        'scene'             => 'scene',
        'deviceType'        => 'device_type',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('cmd', $this->cmd, true);
        Model::validateRequired('extra', $this->extra, true);
        Model::validateRequired('scene', $this->scene, true);
        Model::validateRequired('deviceType', $this->deviceType, true);
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
        if (null !== $this->cmd) {
            $res['cmd'] = $this->cmd;
        }
        if (null !== $this->extra) {
            $res['extra'] = $this->extra;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->deviceType) {
            $res['device_type'] = $this->deviceType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTaskRequest
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
        if (isset($map['cmd'])) {
            $model->cmd = $map['cmd'];
        }
        if (isset($map['extra'])) {
            $model->extra = $map['extra'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['device_type'])) {
            $model->deviceType = $map['device_type'];
        }

        return $model;
    }
}
