<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class DisasterInfo extends Model
{
    // 同城灾备单元(组)
    /**
     * @example RZ02
     *
     * @var string
     */
    public $localFailoverTarget;

    // 异地灾备单元(组)
    /**
     * @example RZ02
     *
     * @var string
     */
    public $remoteFailoverTarget;

    // 逻辑单元&部署单元名称
    /**
     * @example RZ01
     *
     * @var string
     */
    public $source;

    // 容灾类型
    /**
     * @example CELL,CELL_GROUP
     *
     * @var string
     */
    public $type;

    // 正常容灾状态。
    /**
     * @example NORML
     *
     * @var string
     */
    public $disasterRecoveryState;

    // 压测容灾状态。
    /**
     * @example LDR
     *
     * @var string
     */
    public $pressDisasterRecoveryState;
    protected $_name = [
        'localFailoverTarget'        => 'local_failover_target',
        'remoteFailoverTarget'       => 'remote_failover_target',
        'source'                     => 'source',
        'type'                       => 'type',
        'disasterRecoveryState'      => 'disaster_recovery_state',
        'pressDisasterRecoveryState' => 'press_disaster_recovery_state',
    ];

    public function validate()
    {
        Model::validateRequired('localFailoverTarget', $this->localFailoverTarget, true);
        Model::validateRequired('remoteFailoverTarget', $this->remoteFailoverTarget, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('disasterRecoveryState', $this->disasterRecoveryState, true);
        Model::validateRequired('pressDisasterRecoveryState', $this->pressDisasterRecoveryState, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->localFailoverTarget) {
            $res['local_failover_target'] = $this->localFailoverTarget;
        }
        if (null !== $this->remoteFailoverTarget) {
            $res['remote_failover_target'] = $this->remoteFailoverTarget;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->disasterRecoveryState) {
            $res['disaster_recovery_state'] = $this->disasterRecoveryState;
        }
        if (null !== $this->pressDisasterRecoveryState) {
            $res['press_disaster_recovery_state'] = $this->pressDisasterRecoveryState;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisasterInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['local_failover_target'])) {
            $model->localFailoverTarget = $map['local_failover_target'];
        }
        if (isset($map['remote_failover_target'])) {
            $model->remoteFailoverTarget = $map['remote_failover_target'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['disaster_recovery_state'])) {
            $model->disasterRecoveryState = $map['disaster_recovery_state'];
        }
        if (isset($map['press_disaster_recovery_state'])) {
            $model->pressDisasterRecoveryState = $map['press_disaster_recovery_state'];
        }

        return $model;
    }
}
