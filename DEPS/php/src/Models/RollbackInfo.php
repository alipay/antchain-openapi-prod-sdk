<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\Pair;

class RollbackInfo extends Model {
    protected $_name = [
        'groupAmount' => 'group_amount',
        'groupStrategy' => 'group_strategy',
        'reason' => 'reason',
        'subEntities' => 'sub_entities',
        'targetId' => 'target_id',
        'targetVersion' => 'target_version',
        'needBetaGroup' => 'need_beta_group',
        'envConfig' => 'env_config',
        'confirmSucceededRollback' => 'confirm_succeeded_rollback',
        'retryRollbacked' => 'retry_rollbacked',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->groupAmount) {
            $res['group_amount'] = $this->groupAmount;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->subEntities) {
            $res['sub_entities'] = $this->subEntities;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->targetVersion) {
            $res['target_version'] = $this->targetVersion;
        }
        if (null !== $this->needBetaGroup) {
            $res['need_beta_group'] = $this->needBetaGroup;
        }
        if (null !== $this->envConfig) {
            $res['env_config'] = [];
            if(null !== $this->envConfig && is_array($this->envConfig)){
                $n = 0;
                foreach($this->envConfig as $item){
                    $res['env_config'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->confirmSucceededRollback) {
            $res['confirm_succeeded_rollback'] = $this->confirmSucceededRollback;
        }
        if (null !== $this->retryRollbacked) {
            $res['retry_rollbacked'] = $this->retryRollbacked;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RollbackInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['group_amount'])){
            $model->groupAmount = $map['group_amount'];
        }
        if(isset($map['group_strategy'])){
            $model->groupStrategy = $map['group_strategy'];
        }
        if(isset($map['reason'])){
            $model->reason = $map['reason'];
        }
        if(isset($map['sub_entities'])){
            if(!empty($map['sub_entities'])){
                $model->subEntities = $map['sub_entities'];
            }
        }
        if(isset($map['target_id'])){
            $model->targetId = $map['target_id'];
        }
        if(isset($map['target_version'])){
            $model->targetVersion = $map['target_version'];
        }
        if(isset($map['need_beta_group'])){
            $model->needBetaGroup = $map['need_beta_group'];
        }
        if(isset($map['env_config'])){
            if(!empty($map['env_config'])){
                $model->envConfig = [];
                $n = 0;
                foreach($map['env_config'] as $item) {
                    $model->envConfig[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['confirm_succeeded_rollback'])){
            $model->confirmSucceededRollback = $map['confirm_succeeded_rollback'];
        }
        if(isset($map['retry_rollbacked'])){
            $model->retryRollbacked = $map['retry_rollbacked'];
        }
        return $model;
    }
    // group_amount
    /**
     * @example 
     * @var int
     */
    public $groupAmount;

    // group_strategy
    /**
     * @example group_strategy
     * @var string
     */
    public $groupStrategy;

    // reason
    /**
     * @example reason
     * @var string
     */
    public $reason;

    // sub_entities
    /**
     * @example 
     * @var string[]
     */
    public $subEntities;

    // target_id
    /**
     * @example target_id
     * @var string
     */
    public $targetId;

    // target_version
    /**
     * @example target_version
     * @var string
     */
    public $targetVersion;

    // need_beta_group
    /**
     * @example true, false
     * @var bool
     */
    public $needBetaGroup;

    // env_config
    /**
     * @example 
     * @var Pair[]
     */
    public $envConfig;

    // confirm_succeeded_rollback
    /**
     * @example true, false
     * @var bool
     */
    public $confirmSucceededRollback;

    // retry_rollbacked
    /**
     * @example true, false
     * @var bool
     */
    public $retryRollbacked;

}
