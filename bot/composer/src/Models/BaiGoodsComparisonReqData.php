<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class BaiGoodsComparisonReqData extends Model
{
    // 品类
    /**
     * @example 奢侈品
     *
     * @var string
     */
    public $category;

    // 品牌
    /**
     * @example GUCCI
     *
     * @var string
     */
    public $brand;

    // 款式
    /**
     * @example Gucci Diana
     *
     * @var string
     */
    public $style;

    // 商品鉴定点列表
    /**
     * @example
     *
     * @var BaiGoodsPoint[]
     */
    public $goodsPoints;
    protected $_name = [
        'category'    => 'category',
        'brand'       => 'brand',
        'style'       => 'style',
        'goodsPoints' => 'goods_points',
    ];

    public function validate()
    {
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('brand', $this->brand, true);
        Model::validateRequired('style', $this->style, true);
        Model::validateRequired('goodsPoints', $this->goodsPoints, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->brand) {
            $res['brand'] = $this->brand;
        }
        if (null !== $this->style) {
            $res['style'] = $this->style;
        }
        if (null !== $this->goodsPoints) {
            $res['goods_points'] = [];
            if (null !== $this->goodsPoints && \is_array($this->goodsPoints)) {
                $n = 0;
                foreach ($this->goodsPoints as $item) {
                    $res['goods_points'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BaiGoodsComparisonReqData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['category'])) {
            $model->category = $map['category'];
        }
        if (isset($map['brand'])) {
            $model->brand = $map['brand'];
        }
        if (isset($map['style'])) {
            $model->style = $map['style'];
        }
        if (isset($map['goods_points'])) {
            if (!empty($map['goods_points'])) {
                $model->goodsPoints = [];
                $n                  = 0;
                foreach ($map['goods_points'] as $item) {
                    $model->goodsPoints[$n++] = null !== $item ? BaiGoodsPoint::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
