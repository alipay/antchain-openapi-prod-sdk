<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DATAXHUB\Models;

use AlibabaCloud\Tea\Model;

class QueryAntchainDataxMcpRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // toolId
    /**
     * @var string
     */
    public $toolId;

    // 统一入参
    /**
     * @var string
     */
    public $params;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'toolId'            => 'tool_id',
        'params'            => 'params',
    ];

    public function validate()
    {
        Model::validateRequired('toolId', $this->toolId, true);
        Model::validateRequired('params', $this->params, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->toolId) {
            $res['tool_id'] = $this->toolId;
        }
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAntchainDataxMcpRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['tool_id'])) {
            $model->toolId = $map['tool_id'];
        }
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }

        return $model;
    }
}
