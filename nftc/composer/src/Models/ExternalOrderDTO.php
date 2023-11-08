<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTC\Models;

use AlibabaCloud\Tea\Model;

class ExternalOrderDTO extends Model
{
    // 订单的状态
    // PAID 已支付
    // PENDING 待支付
    // NOT_EXIST 不存在
    /**
     * @example PAID
     *
     * @var string
     */
    public $orderStatus;

    // 只有在PAID状态下，此字段才会有值
    // 由于当前一笔订单只会购买一个资产，因此当前list中只会有一个值
    /**
     * @example
     *
     * @var ExternalOrderItemDTO[]
     */
    public $orderItemList;
    protected $_name = [
        'orderStatus'   => 'order_status',
        'orderItemList' => 'order_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('orderStatus', $this->orderStatus, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->orderItemList) {
            $res['order_item_list'] = [];
            if (null !== $this->orderItemList && \is_array($this->orderItemList)) {
                $n = 0;
                foreach ($this->orderItemList as $item) {
                    $res['order_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExternalOrderDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['order_item_list'])) {
            if (!empty($map['order_item_list'])) {
                $model->orderItemList = [];
                $n                    = 0;
                foreach ($map['order_item_list'] as $item) {
                    $model->orderItemList[$n++] = null !== $item ? ExternalOrderItemDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
