<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryRbbObtsZsearchRequest extends Model
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

    // 索引名称
    /**
     * @var string
     */
    public $index;

    // 类型名称
    /**
     * @var string
     */
    public $type;

    // 操作方法
    /**
     * @var string
     */
    public $operationMethod;

    // 查询语句
    /**
     * @var string
     */
    public $entityString;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'index'             => 'index',
        'type'              => 'type',
        'operationMethod'   => 'operation_method',
        'entityString'      => 'entity_string',
    ];

    public function validate()
    {
        Model::validateRequired('index', $this->index, true);
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
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->operationMethod) {
            $res['operation_method'] = $this->operationMethod;
        }
        if (null !== $this->entityString) {
            $res['entity_string'] = $this->entityString;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryRbbObtsZsearchRequest
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
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['operation_method'])) {
            $model->operationMethod = $map['operation_method'];
        }
        if (isset($map['entity_string'])) {
            $model->entityString = $map['entity_string'];
        }

        return $model;
    }
}
