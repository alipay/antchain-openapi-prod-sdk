<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class AppRecoveryVO extends Model
{
    // app
    /**
     * @example app
     *
     * @var string
     */
    public $appName;

    // 客户端模式
    /**
     * @example v4
     *
     * @var string
     */
    public $clientVersion;

    // 数据源数组
    /**
     * @example
     *
     * @var ActivityDsVO[]
     */
    public $dsArray;

    // 唯一id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 是否异步化
    /**
     * @example true
     *
     * @var bool
     */
    public $isAsyn;

    // 数据源配置是否在dds中
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isDds;

    // 压测
    /**
     * @example true
     *
     * @var bool
     */
    public $isLoadTest;

    // 是否混合模式
    /**
     * @example true
     *
     * @var bool
     */
    public $isMix;

    // 单条恢复数
    /**
     * @example 10
     *
     * @var int
     */
    public $recoveryLimit;

    // 恢复任务线程数
    /**
     * @example 10
     *
     * @var int
     */
    public $recoveryThreadNum;

    // 是否被使用
    /**
     * @example true, false
     *
     * @var bool
     */
    public $used;
    protected $_name = [
        'appName'           => 'app_name',
        'clientVersion'     => 'client_version',
        'dsArray'           => 'ds_array',
        'id'                => 'id',
        'isAsyn'            => 'is_asyn',
        'isDds'             => 'is_dds',
        'isLoadTest'        => 'is_load_test',
        'isMix'             => 'is_mix',
        'recoveryLimit'     => 'recovery_limit',
        'recoveryThreadNum' => 'recovery_thread_num',
        'used'              => 'used',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('clientVersion', $this->clientVersion, true);
        Model::validateRequired('dsArray', $this->dsArray, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('isAsyn', $this->isAsyn, true);
        Model::validateRequired('isDds', $this->isDds, true);
        Model::validateRequired('isLoadTest', $this->isLoadTest, true);
        Model::validateRequired('isMix', $this->isMix, true);
        Model::validateRequired('recoveryLimit', $this->recoveryLimit, true);
        Model::validateRequired('recoveryThreadNum', $this->recoveryThreadNum, true);
        Model::validateRequired('used', $this->used, true);
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
        if (null !== $this->dsArray) {
            $res['ds_array'] = [];
            if (null !== $this->dsArray && \is_array($this->dsArray)) {
                $n = 0;
                foreach ($this->dsArray as $item) {
                    $res['ds_array'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isAsyn) {
            $res['is_asyn'] = $this->isAsyn;
        }
        if (null !== $this->isDds) {
            $res['is_dds'] = $this->isDds;
        }
        if (null !== $this->isLoadTest) {
            $res['is_load_test'] = $this->isLoadTest;
        }
        if (null !== $this->isMix) {
            $res['is_mix'] = $this->isMix;
        }
        if (null !== $this->recoveryLimit) {
            $res['recovery_limit'] = $this->recoveryLimit;
        }
        if (null !== $this->recoveryThreadNum) {
            $res['recovery_thread_num'] = $this->recoveryThreadNum;
        }
        if (null !== $this->used) {
            $res['used'] = $this->used;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppRecoveryVO
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
        if (isset($map['ds_array'])) {
            if (!empty($map['ds_array'])) {
                $model->dsArray = [];
                $n              = 0;
                foreach ($map['ds_array'] as $item) {
                    $model->dsArray[$n++] = null !== $item ? ActivityDsVO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_asyn'])) {
            $model->isAsyn = $map['is_asyn'];
        }
        if (isset($map['is_dds'])) {
            $model->isDds = $map['is_dds'];
        }
        if (isset($map['is_load_test'])) {
            $model->isLoadTest = $map['is_load_test'];
        }
        if (isset($map['is_mix'])) {
            $model->isMix = $map['is_mix'];
        }
        if (isset($map['recovery_limit'])) {
            $model->recoveryLimit = $map['recovery_limit'];
        }
        if (isset($map['recovery_thread_num'])) {
            $model->recoveryThreadNum = $map['recovery_thread_num'];
        }
        if (isset($map['used'])) {
            $model->used = $map['used'];
        }

        return $model;
    }
}
