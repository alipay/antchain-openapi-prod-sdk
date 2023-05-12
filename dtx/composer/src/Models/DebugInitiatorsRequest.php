<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class DebugInitiatorsRequest extends Model
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

    // 主事务记录表
    /**
     * @var string
     */
    public $activityTableName;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // 数据源名称
    /**
     * @var string
     */
    public $dsName;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 记录id
    /**
     * @var int
     */
    public $recoveryId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'activityTableName' => 'activity_table_name',
        'appName'           => 'app_name',
        'dsName'            => 'ds_name',
        'instanceId'        => 'instance_id',
        'recoveryId'        => 'recovery_id',
    ];

    public function validate()
    {
        Model::validateRequired('activityTableName', $this->activityTableName, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('dsName', $this->dsName, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('recoveryId', $this->recoveryId, true);
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
        if (null !== $this->activityTableName) {
            $res['activity_table_name'] = $this->activityTableName;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->dsName) {
            $res['ds_name'] = $this->dsName;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->recoveryId) {
            $res['recovery_id'] = $this->recoveryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DebugInitiatorsRequest
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
        if (isset($map['activity_table_name'])) {
            $model->activityTableName = $map['activity_table_name'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ds_name'])) {
            $model->dsName = $map['ds_name'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['recovery_id'])) {
            $model->recoveryId = $map['recovery_id'];
        }

        return $model;
    }
}
