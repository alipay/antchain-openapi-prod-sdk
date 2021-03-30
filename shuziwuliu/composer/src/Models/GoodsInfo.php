<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class GoodsInfo extends Model
{
    // 货物ID [业务必填]
    /**
     * @example 暂无
     *
     * @var string
     */
    public $goodsId;

    // 唛头
    //
    //
    /**
     * @example 暂无
     *
     * @var string
     */
    public $marks;

    // 货物名称
    /**
     * @example 暂无
     *
     * @var string
     */
    public $goods;

    // 货物类型
    /**
     * @example 暂无
     *
     * @var string
     */
    public $goodsType;

    // 货物重量
    /**
     * @example 暂无
     *
     * @var string
     */
    public $weight;

    // 件数
    /**
     * @example 暂无
     *
     * @var string
     */
    public $number;
    protected $_name = [
        'goodsId'   => 'goods_id',
        'marks'     => 'marks',
        'goods'     => 'goods',
        'goodsType' => 'goods_type',
        'weight'    => 'weight',
        'number'    => 'number',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
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
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['marks'])) {
            $model->marks = $map['marks'];
        }
        if (isset($map['goods'])) {
            $model->goods = $map['goods'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }

        return $model;
    }
}
