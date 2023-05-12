<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class Initiator extends Model
{
    // 应用名
    /**
     * @example paycore
     *
     * @var string
     */
    public $appName;

    // 客户端版本
    /**
     * @example v4
     *
     * @var string
     */
    public $clientVersion;

    // 记录id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 环境唯一标识
    /**
     * @example prod;alipay
     *
     * @var string
     */
    public $instanceId;

    // 是否异步化
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isAsyn;

    // 是否压测任务
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isLoadTest;

    // 是否混合模式
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isMix;

    // 发起方数据源
    /**
     * @example
     *
     * @var InitiatorDatasource[]
     */
    public $recoveryDatasources;

    // 恢复条数/分/表
    /**
     * @example 1000
     *
     * @var int
     */
    public $recoveryLimit;

    // 恢复线程数
    /**
     * @example 20
     *
     * @var int
     */
    public $recoveryThreadNum;
    protected $_name = [
        'appName'             => 'app_name',
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
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('clientVersion', $this->clientVersion, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('isAsyn', $this->isAsyn, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('isMix', $this->isMix, true);
        Model::validateRequired('recoveryDatasources', $this->recoveryDatasources, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
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
     * @return Initiator
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
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
