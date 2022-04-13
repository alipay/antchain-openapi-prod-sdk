<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryDeploymentRollbackableRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 部署单id
    /**
     * @var string
     */
    public $operationId;

    // 待查询的应用名称，必须是部署单中包含的应用
    /**
     * @var string
     */
    public $applicationName;
    protected $_name = [
        'authToken'       => 'auth_token',
        'operationId'     => 'operation_id',
        'applicationName' => 'application_name',
    ];

    public function validate()
    {
        Model::validateRequired('operationId', $this->operationId, true);
        Model::validateRequired('applicationName', $this->applicationName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->operationId) {
            $res['operation_id'] = $this->operationId;
        }
        if (null !== $this->applicationName) {
            $res['application_name'] = $this->applicationName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDeploymentRollbackableRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }

        return $model;
    }
}
