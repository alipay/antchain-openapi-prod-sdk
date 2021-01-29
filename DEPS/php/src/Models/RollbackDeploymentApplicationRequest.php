<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class RollbackDeploymentApplicationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'applicationName' => 'application_name',
        'operationId' => 'operation_id',
        'reason' => 'reason',
    ];
    public function validate() {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('operationId', $this->operationId, true);
        Model::validateRequired('reason', $this->reason, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RollbackDeploymentApplicationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
        }
        if(isset($map['operation_id'])){
            $model->operationId = $map['operation_id'];
        }
        if(isset($map['reason'])){
            $model->reason = $map['reason'];
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

    // 被回滚的应用（服务）名称，必须是部署单中包含的应用（服务）
    /**
     * @var string
     */
    public $applicationName;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

    // 回滚原因。长度不超过100个UTF-8字符
    /**
     * @var string
     */
    public $reason;

}
