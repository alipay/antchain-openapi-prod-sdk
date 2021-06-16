<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class QueryNftCreateRequest extends Model
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

    // 对端自己的项目id；NFT发行时用作幂等字段
    /**
     * @var string
     */
    public $projectId;

    // NFT发行成功的商品id，传入sku_id时以此为准做查询
    /**
     * @var int
     */
    public $skuId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'projectId'         => 'project_id',
        'skuId'             => 'sku_id',
    ];

    public function validate()
    {
        Model::validateRequired('projectId', $this->projectId, true);
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
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryNftCreateRequest
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
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }

        return $model;
    }
}
