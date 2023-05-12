<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class RecoveryDTO extends Model
{
    // 客户端版本
    //
    /**
     * @example v4
     *
     * @var string
     */
    public $clientVersion;

    // 发起方组编号
    /**
     * @example 1
     *
     * @var string
     */
    public $groupId;

    // 主键id，更新时需要
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

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

    // 恢复条数/分/表
    /**
     * @example 100
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
        'clientVersion'     => 'client_version',
        'groupId'           => 'group_id',
        'id'                => 'id',
        'isAsyn'            => 'is_asyn',
        'isLoadTest'        => 'is_load_test',
        'isMix'             => 'is_mix',
        'recoveryLimit'     => 'recovery_limit',
        'recoveryThreadNum' => 'recovery_thread_num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clientVersion) {
            $res['client_version'] = $this->clientVersion;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
     * @return RecoveryDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['client_version'])) {
            $model->clientVersion = $map['client_version'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
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
        if (isset($map['recovery_limit'])) {
            $model->recoveryLimit = $map['recovery_limit'];
        }
        if (isset($map['recovery_thread_num'])) {
            $model->recoveryThreadNum = $map['recovery_thread_num'];
        }

        return $model;
    }
}
