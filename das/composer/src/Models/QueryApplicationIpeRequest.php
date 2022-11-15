<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class QueryApplicationIpeRequest extends Model
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

    // 数据集id，开发者提供
    /**
     * @var string
     */
    public $dataSetId;

    // 企业信息
    /**
     * @var string
     */
    public $index;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSetId'         => 'data_set_id',
        'index'             => 'index',
    ];

    public function validate()
    {
        Model::validateRequired('dataSetId', $this->dataSetId, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->index) {
            $res['index'] = $this->index;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryApplicationIpeRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['index'])) {
            $model->index = $map['index'];
        }

        return $model;
    }
}
