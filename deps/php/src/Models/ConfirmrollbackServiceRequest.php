<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class ConfirmrollbackServiceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'id' => 'id',
        'retryRollbacked' => 'retry_rollbacked',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('retryRollbacked', $this->retryRollbacked, true);
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
        if (null !== $this->retryRollbacked) {
            $res['retry_rollbacked'] = $this->retryRollbacked;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ConfirmrollbackServiceRequest
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
        if(isset($map['retry_rollbacked'])){
            $model->retryRollbacked = $map['retry_rollbacked'];
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

    // retry_rollbacked
    /**
     * @var bool
     */
    public $retryRollbacked;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
