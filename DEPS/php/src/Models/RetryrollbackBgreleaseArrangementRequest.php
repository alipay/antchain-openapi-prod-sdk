<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\RollbackInfo;

class RetryrollbackBgreleaseArrangementRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'arrangementId' => 'arrangement_id',
        'planId' => 'plan_id',
        'rollbackInfo' => 'rollback_info',
        'workspace' => 'workspace',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->arrangementId) {
            $res['arrangement_id'] = $this->arrangementId;
        }
        if (null !== $this->planId) {
            $res['plan_id'] = $this->planId;
        }
        if (null !== $this->rollbackInfo) {
            $res['rollback_info'] = null !== $this->rollbackInfo ? $this->rollbackInfo->toMap() : null;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RetryrollbackBgreleaseArrangementRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['arrangement_id'])){
            $model->arrangementId = $map['arrangement_id'];
        }
        if(isset($map['plan_id'])){
            $model->planId = $map['plan_id'];
        }
        if(isset($map['rollback_info'])){
            $model->rollbackInfo = RollbackInfo::fromMap($map['rollback_info']);
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

    // rollback_info
    /**
     * @var RollbackInfo
     */
    public $rollbackInfo;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
