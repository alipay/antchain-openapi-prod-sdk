<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class DisableGoodsRequest extends Model
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

    // 商品id
    /**
     * @var string
     */
    public $goodsId;

    // 异常状态描述
    /**
     * @var string
     */
    public $statusDesc;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'goodsId'           => 'goods_id',
        'statusDesc'        => 'status_desc',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('statusDesc', $this->statusDesc, true);
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
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DisableGoodsRequest
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
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }

        return $model;
    }
}
