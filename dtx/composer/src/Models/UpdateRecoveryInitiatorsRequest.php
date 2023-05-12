<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class UpdateRecoveryInitiatorsRequest extends Model
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

    // action_mode
    /**
     * @var int
     */
    public $actionMode;

    // 1同库，2异库
    /**
     * @var int
     */
    public $activityMode;

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // biz_type
    /**
     * @var string
     */
    public $bizType;

    // 关联关系表的id，用于更新
    /**
     * @var int
     */
    public $bizTypeId;

    // Client 版本
    /**
     * @var string
     */
    public $clientVersion;

    // 记录id
    /**
     * @var int
     */
    public $id;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // 是否异步化
    /**
     * @var bool
     */
    public $isAsyn;

    // 是否压测任务
    /**
     * @var bool
     */
    public $isLoadTest;

    // 是否混合模式
    /**
     * @var bool
     */
    public $isMix;

    // 发起方数据源
    /**
     * @var InitiatorDatasource[]
     */
    public $recoveryDatasources;

    // 恢复条数/分/表
    /**
     * @var int
     */
    public $recoveryLimit;

    // 恢复线程数
    /**
     * @var int
     */
    public $recoveryThreadNum;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'actionMode'          => 'action_mode',
        'activityMode'        => 'activity_mode',
        'appName'             => 'app_name',
        'bizType'             => 'biz_type',
        'bizTypeId'           => 'biz_type_id',
        'clientVersion'       => 'client_version',
        'id'                  => 'id',
        'instanceId'          => 'instance_id',
        'isAsyn'              => 'is_asyn',
        'isLoadTest'          => 'is_load_test',
        'isMix'               => 'is_mix',
        'recoveryDatasources' => 'recovery_datasources',
        'recoveryLimit'       => 'recovery_limit',
        'recoveryThreadNum'   => 'recovery_thread_num',
    ];

    public function validate()
    {
        Model::validateRequired('actionMode', $this->actionMode, true);
        Model::validateRequired('activityMode', $this->activityMode, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('bizTypeId', $this->bizTypeId, true);
        Model::validateRequired('clientVersion', $this->clientVersion, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isAsyn', $this->isAsyn, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('isMix', $this->isMix, true);
        Model::validateRequired('recoveryDatasources', $this->recoveryDatasources, true);
        Model::validateRequired('recoveryLimit', $this->recoveryLimit, true);
        Model::validateRequired('recoveryThreadNum', $this->recoveryThreadNum, true);
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
        if (null !== $this->actionMode) {
            $res['action_mode'] = $this->actionMode;
        }
        if (null !== $this->activityMode) {
            $res['activity_mode'] = $this->activityMode;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->bizTypeId) {
            $res['biz_type_id'] = $this->bizTypeId;
        }
        if (null !== $this->clientVersion) {
            $res['client_version'] = $this->clientVersion;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->isAsyn) {
            $res['is_asyn'] = $this->isAsyn;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->isMix) {
            $res['is_mix'] = $this->isMix;
        }
        if (null !== $this->recoveryDatasources) {
            $res['recovery_datasources'] = [];
            if (null !== $this->recoveryDatasources && \is_array($this->recoveryDatasources)) {
                $n = 0;
                foreach ($this->recoveryDatasources as $item) {
                    $res['recovery_datasources'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->recoveryLimit) {
            $res['recovery_limit'] = $this->recoveryLimit;
        }
        if (null !== $this->recoveryThreadNum) {
            $res['recovery_thread_num'] = $this->recoveryThreadNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateRecoveryInitiatorsRequest
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
        if (isset($map['action_mode'])) {
            $model->actionMode = $map['action_mode'];
        }
        if (isset($map['activity_mode'])) {
            $model->activityMode = $map['activity_mode'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['biz_type_id'])) {
            $model->bizTypeId = $map['biz_type_id'];
        }
        if (isset($map['client_version'])) {
            $model->clientVersion = $map['client_version'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['is_asyn'])) {
            $model->isAsyn = $map['is_asyn'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['is_mix'])) {
            $model->isMix = $map['is_mix'];
        }
        if (isset($map['recovery_datasources'])) {
            if (!empty($map['recovery_datasources'])) {
                $model->recoveryDatasources = [];
                $n                          = 0;
                foreach ($map['recovery_datasources'] as $item) {
                    $model->recoveryDatasources[$n++] = null !== $item ? InitiatorDatasource::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['recovery_limit'])) {
            $model->recoveryLimit = $map['recovery_limit'];
        }
        if (isset($map['recovery_thread_num'])) {
            $model->recoveryThreadNum = $map['recovery_thread_num'];
        }

        return $model;
    }
}
