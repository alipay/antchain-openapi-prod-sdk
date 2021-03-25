<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class RetryInfo extends Model {
    protected $_name = [
        'action' => 'action',
        'checkInterval' => 'check_interval',
        'retryFailedOnly' => 'retry_failed_only',
        'retryTimes' => 'retry_times',
        'timeout' => 'timeout',
    ];
    public function validate() {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('checkInterval', $this->checkInterval, true);
        Model::validateRequired('retryFailedOnly', $this->retryFailedOnly, true);
        Model::validateRequired('retryTimes', $this->retryTimes, true);
        Model::validateRequired('timeout', $this->timeout, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->checkInterval) {
            $res['check_interval'] = $this->checkInterval;
        }
        if (null !== $this->retryFailedOnly) {
            $res['retry_failed_only'] = $this->retryFailedOnly;
        }
        if (null !== $this->retryTimes) {
            $res['retry_times'] = $this->retryTimes;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetryInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['action'])){
            $model->action = $map['action'];
        }
        if(isset($map['check_interval'])){
            $model->checkInterval = $map['check_interval'];
        }
        if(isset($map['retry_failed_only'])){
            $model->retryFailedOnly = $map['retry_failed_only'];
        }
        if(isset($map['retry_times'])){
            $model->retryTimes = $map['retry_times'];
        }
        if(isset($map['timeout'])){
            $model->timeout = $map['timeout'];
        }
        return $model;
    }
    // action
    /**
     * @example action
     * @var string
     */
    public $action;

    // check_interval
    /**
     * @example 
     * @var int
     */
    public $checkInterval;

    // retry_failed_only
    /**
     * @example true, false
     * @var bool
     */
    public $retryFailedOnly;

    // retry_times
    /**
     * @example 
     * @var int
     */
    public $retryTimes;

    // timeout
    /**
     * @example 
     * @var int
     */
    public $timeout;

}
