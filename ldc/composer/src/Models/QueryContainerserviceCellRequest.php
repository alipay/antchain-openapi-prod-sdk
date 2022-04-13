<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryContainerserviceCellRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // container service name
    /**
     * @var string
     */
    public $containerServiceName;
    protected $_name = [
        'authToken'            => 'auth_token',
        'containerServiceName' => 'container_service_name',
    ];

    public function validate()
    {
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContainerserviceCellRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }

        return $model;
    }
}
