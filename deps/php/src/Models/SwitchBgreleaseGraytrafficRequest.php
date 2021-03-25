<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SwitchBgreleaseGraytrafficRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appId' => 'app_id',
        'executorId' => 'executor_id',
        'executorName' => 'executor_name',
        'fromAliyun' => 'from_aliyun',
        'planId' => 'plan_id',
        'proportion' => 'proportion',
        'targetId' => 'target_id',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('planId', $this->planId, true);
        Model::validateRequired('proportion', $this->proportion, true);
        Model::validateRequired('targetId', $this->targetId, true);
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
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->executorId) {
            $res['executor_id'] = $this->executorId;
        }
        if (null !== $this->executorName) {
            $res['executor_name'] = $this->executorName;
        }
        if (null !== $this->fromAliyun) {
            $res['from_aliyun'] = $this->fromAliyun;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->proportion) {
            $res['proportion'] = $this->proportion;
        }
        if (null !== $this->targetId) {
            $res['target_id'] = $this->targetId;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SwitchBgreleaseGraytrafficRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['executor_id'])){
            $model->executorId = $map['executor_id'];
        }
        if(isset($map['executor_name'])){
            $model->executorName = $map['executor_name'];
        }
        if(isset($map['from_aliyun'])){
            $model->fromAliyun = $map['from_aliyun'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['proportion'])){
            $model->proportion = $map['proportion'];
        }
        if(isset($map['target_id'])){
            $model->targetId = $map['target_id'];
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

    // 应用ID
    /**
     * @var string
     */
    public $appId;

    // 执行人
    /**
     * @var string
     */
    public $executorId;

    // 执行人
    /**
     * @var string
     */
    public $executorName;

    // 来自阿里云用户
    /**
     * @var bool
     */
    public $fromAliyun;

    // 发布单ID
    /**
     * @var string
     */
    public $planId;

    // 比率
    /**
     * @var int
     */
    public $proportion;

    // 目标ID
    /**
     * @var string
     */
    public $targetId;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
