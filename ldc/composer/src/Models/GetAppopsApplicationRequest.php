<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class GetAppopsApplicationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 待查询的应用名称，必须是运维单中包含的应用
    /**
     * @var string
     */
    public $applicationName;

    // 运维单id
    /**
     * @var string
     */
    public $operationId;
    protected $_name = [
        'authToken'       => 'auth_token',
        'applicationName' => 'application_name',
        'operationId'     => 'operation_id',
    ];

    public function validate()
    {
        Model::validateRequired('applicationName', $this->applicationName, true);
        Model::validateRequired('operationId', $this->operationId, true);
    }

    public function toMap()
    {
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
     *
     * @return GetAppopsApplicationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['application_name'])) {
            $model->applicationName = $map['application_name'];
        }
        if (isset($map['operation_id'])) {
            $model->operationId = $map['operation_id'];
        }

        return $model;
    }
}
