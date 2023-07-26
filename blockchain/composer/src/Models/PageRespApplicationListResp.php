<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class PageRespApplicationListResp extends Model
{
    // 总数
    /**
     * @example 200
     *
     * @var int
     */
    public $total;

    // 列表数据
    /**
     * @example
     *
     * @var ApplicationListResp[]
     */
    public $dataList;
    protected $_name = [
        'total'    => 'total',
        'dataList' => 'data_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->dataList) {
            $res['data_list'] = [];
            if (null !== $this->dataList && \is_array($this->dataList)) {
                $n = 0;
                foreach ($this->dataList as $item) {
                    $res['data_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PageRespApplicationListResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['data_list'])) {
            if (!empty($map['data_list'])) {
                $model->dataList = [];
                $n               = 0;
                foreach ($map['data_list'] as $item) {
                    $model->dataList[$n++] = null !== $item ? ApplicationListResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
