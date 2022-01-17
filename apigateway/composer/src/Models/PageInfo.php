<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\APIGATEWAY\Models;

use AlibabaCloud\Tea\Model;

class PageInfo extends Model
{
    // 排序信息
    /**
     * @example
     *
     * @var OrderInfo[]
     */
    public $orderInfos;

    // 当前页
    /**
     * @example
     *
     * @var int
     */
    public $pageIndex;

    // 每页记录数
    /**
     * @example
     *
     * @var int
     */
    public $pageSize;

    // 总数
    /**
     * @example
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'orderInfos' => 'order_infos',
        'pageIndex'  => 'page_index',
        'pageSize'   => 'page_size',
        'total'      => 'total',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderInfos) {
            $res['order_infos'] = [];
            if (null !== $this->orderInfos && \is_array($this->orderInfos)) {
                $n = 0;
                foreach ($this->orderInfos as $item) {
                    $res['order_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_infos'])) {
            if (!empty($map['order_infos'])) {
                $model->orderInfos = [];
                $n                 = 0;
                foreach ($map['order_infos'] as $item) {
                    $model->orderInfos[$n++] = null !== $item ? OrderInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
