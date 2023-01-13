<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class QueryChaininsightSearchRequest extends Model
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

    // 联盟ID
    /**
     * @var string
     */
    public $unionId;

    // 需要搜索的链ID列表，为空是表示搜索联盟内的所有链
    /**
     * @var string[]
     */
    public $bizIds;

    // 搜索请求
    /**
     * @var ChainInsightSearchRequest
     */
    public $request;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'unionId'           => 'union_id',
        'bizIds'            => 'biz_ids',
        'request'           => 'request',
    ];

    public function validate()
    {
        Model::validateRequired('unionId', $this->unionId, true);
        Model::validateRequired('request', $this->request, true);
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
        if (null !== $this->unionId) {
            $res['union_id'] = $this->unionId;
        }
        if (null !== $this->bizIds) {
            $res['biz_ids'] = $this->bizIds;
        }
        if (null !== $this->request) {
            $res['request'] = null !== $this->request ? $this->request->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryChaininsightSearchRequest
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
        if (isset($map['union_id'])) {
            $model->unionId = $map['union_id'];
        }
        if (isset($map['biz_ids'])) {
            if (!empty($map['biz_ids'])) {
                $model->bizIds = $map['biz_ids'];
            }
        }
        if (isset($map['request'])) {
            $model->request = ChainInsightSearchRequest::fromMap($map['request']);
        }

        return $model;
    }
}
