<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GrantDeviceEmpowerRequest extends Model
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

    // 设备ID 列表
    /**
     * @var string
     */
    public $deviceId;

    // 用户ID
    /**
     * @var string
     */
    public $userId;

    // 授权操作: ACCEPTED(接受)/REVOKED(撤销)
    /**
     * @var string
     */
    public $authStatus;

    // 授权时间戳（毫秒）
    /**
     * @var int
     */
    public $authTime;

    // 场景码   与科技所属人-统一社会信用代码 （technology_owner_id ）不能同时为空
    /**
     * @var string
     */
    public $scene;

    // 科技所属人-统一社会信用代码  与场景码（scene ）不能同时为空
    /**
     * @var string
     */
    public $technologyOwnerId;

    // 科技所属人-公司名称
    /**
     * @var string
     */
    public $technologyOwnerName;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'deviceId'            => 'device_id',
        'userId'              => 'user_id',
        'authStatus'          => 'auth_status',
        'authTime'            => 'auth_time',
        'scene'               => 'scene',
        'technologyOwnerId'   => 'technology_owner_id',
        'technologyOwnerName' => 'technology_owner_name',
    ];

    public function validate()
    {
        Model::validateRequired('deviceId', $this->deviceId, true);
        Model::validateRequired('authStatus', $this->authStatus, true);
        Model::validateRequired('authTime', $this->authTime, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->authStatus) {
            $res['auth_status'] = $this->authStatus;
        }
        if (null !== $this->authTime) {
            $res['auth_time'] = $this->authTime;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->technologyOwnerId) {
            $res['technology_owner_id'] = $this->technologyOwnerId;
        }
        if (null !== $this->technologyOwnerName) {
            $res['technology_owner_name'] = $this->technologyOwnerName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GrantDeviceEmpowerRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['auth_status'])) {
            $model->authStatus = $map['auth_status'];
        }
        if (isset($map['auth_time'])) {
            $model->authTime = $map['auth_time'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['technology_owner_id'])) {
            $model->technologyOwnerId = $map['technology_owner_id'];
        }
        if (isset($map['technology_owner_name'])) {
            $model->technologyOwnerName = $map['technology_owner_name'];
        }

        return $model;
    }
}
