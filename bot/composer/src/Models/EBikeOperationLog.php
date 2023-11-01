<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class EBikeOperationLog extends Model
{
    // 日志时间
    /**
     * @example 2018-10-10 10:10
     *
     * @var string
     */
    public $time;

    // 租户
    /**
     * @example XXXXX
     *
     * @var string
     */
    public $tenant;

    // 小程序应用Id
    /**
     * @example 7006071575519
     *
     * @var string
     */
    public $appId;

    // 用户id
    /**
     * @example 700607
     *
     * @var string
     */
    public $userId;

    // 设备id
    /**
     * @example DEVICE700607157
     *
     * @var string
     */
    public $deviceId;

    // 操作时间
    /**
     * @example 2018-10-10 10:10:00
     *
     * @var string
     */
    public $operateTime;

    // 操作描述
    /**
     * @example 开锁成功
     *
     * @var string
     */
    public $operateDesc;

    // 操作是否成功
    /**
     * @example true, false
     *
     * @var bool
     */
    public $success;

    // 日志等级(info、warn、error)
    /**
     * @example info
     *
     * @var string
     */
    public $level;
    protected $_name = [
        'time'        => 'time',
        'tenant'      => 'tenant',
        'appId'       => 'app_id',
        'userId'      => 'user_id',
        'deviceId'    => 'device_id',
        'operateTime' => 'operate_time',
        'operateDesc' => 'operate_desc',
        'success'     => 'success',
        'level'       => 'level',
    ];

    public function validate()
    {
        Model::validateRequired('time', $this->time, true);
        Model::validateRequired('tenant', $this->tenant, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('operateTime', $this->operateTime, true);
        Model::validateRequired('operateDesc', $this->operateDesc, true);
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->deviceId) {
            $res['device_id'] = $this->deviceId;
        }
        if (null !== $this->operateTime) {
            $res['operate_time'] = $this->operateTime;
        }
        if (null !== $this->operateDesc) {
            $res['operate_desc'] = $this->operateDesc;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EBikeOperationLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['device_id'])) {
            $model->deviceId = $map['device_id'];
        }
        if (isset($map['operate_time'])) {
            $model->operateTime = $map['operate_time'];
        }
        if (isset($map['operate_desc'])) {
            $model->operateDesc = $map['operate_desc'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }

        return $model;
    }
}
