<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class QueryNewcarQczjRequest extends Model
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

    // 查询类型
    /**
     * @var string
     */
    public $queryType;

    // 批量拉取数据时，上一次返回的afterSpecId
    /**
     * @var string
     */
    public $afterSpecId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryType'         => 'query_type',
        'afterSpecId'       => 'after_spec_id',
    ];

    public function validate()
    {
        Model::validateRequired('queryType', $this->queryType, true);
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
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->afterSpecId) {
            $res['after_spec_id'] = $this->afterSpecId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNewcarQczjRequest
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
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['after_spec_id'])) {
            $model->afterSpecId = $map['after_spec_id'];
        }

        return $model;
    }
}
