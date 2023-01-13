<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightSearchResponse extends Model
{
    // 搜索命中的结果总数
    /**
     * @example 23
     *
     * @var int
     */
    public $total;

    // 搜索总共消耗了多长时间，时间单位毫秒
    /**
     * @example 234
     *
     * @var int
     */
    public $took;

    // 当前搜索的 context；翻页时请求中的 context 需要配置为该值
    /**
     * @example DAgy567NTwPe0v8N6bmWi9FGfF/G2mZK1iCUp
     *
     * @var string
     */
    public $context;

    // 搜索结果
    /**
     * @example
     *
     * @var ChainInsightSearchResultItem[]
     */
    public $items;
    protected $_name = [
        'total'   => 'total',
        'took'    => 'took',
        'context' => 'context',
        'items'   => 'items',
    ];

    public function validate()
    {
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('took', $this->took, true);
        Model::validateRequired('context', $this->context, true);
        Model::validateRequired('items', $this->items, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->took) {
            $res['took'] = $this->took;
        }
        if (null !== $this->context) {
            $res['context'] = $this->context;
        }
        if (null !== $this->items) {
            $res['items'] = [];
            if (null !== $this->items && \is_array($this->items)) {
                $n = 0;
                foreach ($this->items as $item) {
                    $res['items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightSearchResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['took'])) {
            $model->took = $map['took'];
        }
        if (isset($map['context'])) {
            $model->context = $map['context'];
        }
        if (isset($map['items'])) {
            if (!empty($map['items'])) {
                $model->items = [];
                $n            = 0;
                foreach ($map['items'] as $item) {
                    $model->items[$n++] = null !== $item ? ChainInsightSearchResultItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
