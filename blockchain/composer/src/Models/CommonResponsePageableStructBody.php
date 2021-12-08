<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CommonResponsePageableStructBody extends Model
{
    // 页面规格
    /**
     * @example 10
     *
     * @var string
     */
    public $pageSize;

    // 当前页码
    /**
     * @example 10
     *
     * @var string
     */
    public $current;

    // 总条数
    /**
     * @example total
     *
     * @var string
     */
    public $total;

    // 失败日志数组
    /**
     * @example {}
     *
     * @var TriggerLogDTOStructBody[]
     */
    public $list;
    protected $_name = [
        'pageSize' => 'page_size',
        'current'  => 'current',
        'total'    => 'total',
        'list'     => 'list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CommonResponsePageableStructBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? TriggerLogDTOStructBody::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
