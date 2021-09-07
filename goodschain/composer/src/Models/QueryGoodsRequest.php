<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GOODSCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryGoodsRequest extends Model
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

    // 溯源信息枚举：ASSET_ONLY，只返回物权信息；LIST_ROAM_TRACE，转让溯源信息；LIST_TRACE，所有溯源信息；ASSET_ALL，返回以上所有信息（默认）
    /**
     * @var string
     */
    public $traceType;

    // 当前页（默认为1）
    /**
     * @var int
     */
    public $currentPage;

    // 页大小（默认为10）
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'goodsId'           => 'goods_id',
        'traceType'         => 'trace_type',
        'currentPage'       => 'current_page',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('goodsId', $this->goodsId, true);
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
        if (null !== $this->traceType) {
            $res['trace_type'] = $this->traceType;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryGoodsRequest
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
        if (isset($map['trace_type'])) {
            $model->traceType = $map['trace_type'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
