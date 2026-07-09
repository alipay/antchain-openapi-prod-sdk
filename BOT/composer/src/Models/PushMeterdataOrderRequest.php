<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class PushMeterdataOrderRequest extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 订单计费数据列表
    /**
     * @var OrderPushInfo[]
     */
    public $orderPushList;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'tenantId'          => 'tenant_id',
        'orderPushList'     => 'order_push_list',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('orderPushList', $this->orderPushList, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->orderPushList) {
            $res['order_push_list'] = [];
            if (null !== $this->orderPushList && \is_array($this->orderPushList)) {
                $n = 0;
                foreach ($this->orderPushList as $item) {
                    $res['order_push_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushMeterdataOrderRequest
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['order_push_list'])) {
            if (!empty($map['order_push_list'])) {
                $model->orderPushList = [];
                $n                    = 0;
                foreach ($map['order_push_list'] as $item) {
                    $model->orderPushList[$n++] = null !== $item ? OrderPushInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
