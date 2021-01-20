<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\RollbackInfo;

class RollbackPlanServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'planId' => 'plan_id',
        'rollbackInfo' => 'rollback_info',
        'service' => 'service',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->rollbackInfo) {
            $res['rollback_info'] = null !== $this->rollbackInfo ? $this->rollbackInfo->toMap() : null;
        }
        if (null !== $this->service) {
            $res['service'] = $this->service;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RollbackPlanServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['rollback_info'])){
            $model->rollbackInfo = RollbackInfo::fromMap($map['rollback_info']);
        }
        if(isset($map['service'])){
            $model->service = $map['service'];
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

    // 发布单ID
    /**
     * @var string
     */
    public $planId;

    // rollback_info
    /**
     * @var RollbackInfo
     */
    public $rollbackInfo;

    // 发布服务
    /**
     * @var string
     */
    public $service;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
