<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class GoodsInfo extends Model
{
    // 订单 id
    /**
     * @example order_v1_test_0918_001
     *
     * @var string
     */
    public $orderId;

    // 租赁机构自己的金融科技租户 id，如果是代理模式此处需要为被代理机构的金融科技租户 id
    /**
     * @example xxx
     *
     * @var string
     */
    public $leaseId;

    // 订单包含的商品信息列表
    /**
     * @example
     *
     * @var OrderGoodsModel[]
     */
    public $goodsList;
    protected $_name = [
        'orderId'   => 'order_id',
        'leaseId'   => 'lease_id',
        'goodsList' => 'goods_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('goodsList', $this->goodsList, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('leaseId', $this->leaseId, 50);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('leaseId', $this->leaseId, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->leaseId) {
            $res['lease_id'] = $this->leaseId;
        }
        if (null !== $this->goodsList) {
            $res['goods_list'] = [];
            if (null !== $this->goodsList && \is_array($this->goodsList)) {
                $n = 0;
                foreach ($this->goodsList as $item) {
                    $res['goods_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['lease_id'])) {
            $model->leaseId = $map['lease_id'];
        }
        if (isset($map['goods_list'])) {
            if (!empty($map['goods_list'])) {
                $model->goodsList = [];
                $n                = 0;
                foreach ($map['goods_list'] as $item) {
                    $model->goodsList[$n++] = null !== $item ? OrderGoodsModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
