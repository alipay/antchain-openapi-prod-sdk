<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryDataResultBatchqueryRequest extends Model
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

    // 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
    /**
     * @var string
     */
    public $queryId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'queryId'           => 'query_id',
    ];

    public function validate()
    {
        Model::validateRequired('queryId', $this->queryId, true);
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
        if (null !== $this->queryId) {
            $res['query_id'] = $this->queryId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDataResultBatchqueryRequest
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
        if (isset($map['query_id'])) {
            $model->queryId = $map['query_id'];
        }

        return $model;
    }
}
