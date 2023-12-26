<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ApplicationPageResp extends Model
{
    // 应用授权列表
    /**
     * @example
     *
     * @var ApplicationPageListResp[]
     */
    public $list;

    // 总数
    /**
     * @example 200
     *
     * @var int
     */
    public $total;
    protected $_name = [
        'list'  => 'list',
        'total' => 'total',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplicationPageResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? ApplicationPageListResp::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }

        return $model;
    }
}
