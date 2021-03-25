<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\RollbackInfo;

class RetryrollbackServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'id' => 'id',
        'rollbackInfo' => 'rollback_info',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('rollbackInfo', $this->rollbackInfo, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
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
     * @return RetryrollbackServiceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
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

    /**
     * @var string
     */
    public $tenant;

    // id
    /**
     * @var string
     */
    public $id;

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
