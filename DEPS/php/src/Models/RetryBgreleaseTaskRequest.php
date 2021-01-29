<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\RetryInfo;

class RetryBgreleaseTaskRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'arrangementId' => 'arrangement_id',
        'planId' => 'plan_id',
        'retryInfo' => 'retry_info',
        'taskId' => 'task_id',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('arrangementId', $this->arrangementId, true);
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('retryInfo', $this->retryInfo, true);
        Model::validateRequired('taskId', $this->taskId, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->retryInfo) {
            $res['retry_info'] = null !== $this->retryInfo ? $this->retryInfo->toMap() : null;
        }
        if (null !== $this->taskId) {
            $res['task_id'] = $this->taskId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetryBgreleaseTaskRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['retry_info'])){
            $model->retryInfo = RetryInfo::fromMap($map['retry_info']);
        }
        if(isset($map['task_id'])){
            $model->taskId = $map['task_id'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // 概览ID
    /**
     * @var string
     */
    public $arrangementId;

    // 发布单ID
    /**
     * @var string
     */
    public $planId;

    // retry_info
    /**
     * @var RetryInfo
     */
    public $retryInfo;

    // 任务ID
    /**
     * @var string
     */
    public $taskId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
