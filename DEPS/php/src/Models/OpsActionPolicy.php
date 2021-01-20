<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class OpsActionPolicy extends Model {
    protected $_name = [
        'opsActionType' => 'ops_action_type',
        'timeout' => 'timeout',
        'checkInterval' => 'check_interval',
        'retryTimes' => 'retry_times',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->opsActionType) {
            $res['ops_action_type'] = $this->opsActionType;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->checkInterval) {
            $res['check_interval'] = $this->checkInterval;
        }
        if (null !== $this->retryTimes) {
            $res['retry_times'] = $this->retryTimes;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return OpsActionPolicy
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['ops_action_type'])){
            $model->opsActionType = $map['ops_action_type'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        if(isset($map['check_interval'])){
            $model->checkInterval = $map['check_interval'];
        }
        if(isset($map['retry_times'])){
            $model->retryTimes = $map['retry_times'];
        }
        return $model;
    }
    // 运维动作类型
    /**
     * @example DISABLE_FAULT_ZONE_SLB_TRAFFIC
     * @var string
     */
    public $opsActionType;

    // 超时时间
    /**
     * @example 
     * @var int
     */
    public $timeout;

    // 检查间隔
    /**
     * @example 
     * @var int
     */
    public $checkInterval;

    // 重试次数
    /**
     * @example 
     * @var int
     */
    public $retryTimes;

}
