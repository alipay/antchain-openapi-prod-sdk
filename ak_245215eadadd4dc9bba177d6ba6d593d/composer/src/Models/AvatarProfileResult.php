<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_245215eadadd4dc9bba177d6ba6d593d\Models;

use AlibabaCloud\Tea\Model;

class AvatarProfileResult extends Model
{
    // 数字人形象数量
    /**
     * @example 34
     *
     * @var int
     */
    public $total;

    // 查询页面索引，不分页无
    /**
     * @example 0
     *
     * @var int
     */
    public $pageIndex;

    // 数字人形象列表
    /**
     * @example
     *
     * @var AvatarProfile[]
     */
    public $itemList;
    protected $_name = [
        'total'     => 'total',
        'pageIndex' => 'page_index',
        'itemList'  => 'item_list',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('itemList', $this->itemList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->pageIndex) {
            $res['page_index'] = $this->pageIndex;
        }
        if (null !== $this->itemList) {
            $res['item_list'] = [];
            if (null !== $this->itemList && \is_array($this->itemList)) {
                $n = 0;
                foreach ($this->itemList as $item) {
                    $res['item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarProfileResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['page_index'])) {
            $model->pageIndex = $map['page_index'];
        }
        if (isset($map['item_list'])) {
            if (!empty($map['item_list'])) {
                $model->itemList = [];
                $n               = 0;
                foreach ($map['item_list'] as $item) {
                    $model->itemList[$n++] = null !== $item ? AvatarProfile::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
