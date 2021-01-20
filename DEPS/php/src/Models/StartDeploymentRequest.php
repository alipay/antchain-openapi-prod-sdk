<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class StartDeploymentRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'operationId' => 'operation_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StartDeploymentRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['operation_id'])){
            $model->operationId = $map['operation_id'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

}
