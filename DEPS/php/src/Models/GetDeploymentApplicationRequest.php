<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetDeploymentApplicationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'applicationName' => 'application_name',
        'operationId' => 'operation_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetDeploymentApplicationRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['application_name'])){
            $model->applicationName = $map['application_name'];
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

    // 待查询的应用（服务）名称，必须是部署单中包含的应用（服务）
    /**
     * @var string
     */
    public $applicationName;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

}
