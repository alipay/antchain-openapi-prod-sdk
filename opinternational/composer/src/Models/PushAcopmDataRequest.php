<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\OPINTERNATIONAL\Models;

use AlibabaCloud\Tea\Model;

class PushAcopmDataRequest extends Model
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

    // executor type
    /**
     * @var string
     */
    public $executorType;

    // 数据类型
    /**
     * @var string
     */
    public $methodType;

    // data content
    /**
     * @var string
     */
    public $dataContent;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'executorType'      => 'executor_type',
        'methodType'        => 'method_type',
        'dataContent'       => 'data_content',
    ];

    public function validate()
    {
        Model::validateRequired('executorType', $this->executorType, true);
        Model::validateRequired('methodType', $this->methodType, true);
        Model::validateRequired('dataContent', $this->dataContent, true);
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
        if (null !== $this->executorType) {
            $res['executor_type'] = $this->executorType;
        }
        if (null !== $this->methodType) {
            $res['method_type'] = $this->methodType;
        }
        if (null !== $this->dataContent) {
            $res['data_content'] = $this->dataContent;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushAcopmDataRequest
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
        if (isset($map['executor_type'])) {
            $model->executorType = $map['executor_type'];
        }
        if (isset($map['method_type'])) {
            $model->methodType = $map['method_type'];
        }
        if (isset($map['data_content'])) {
            $model->dataContent = $map['data_content'];
        }

        return $model;
    }
}
