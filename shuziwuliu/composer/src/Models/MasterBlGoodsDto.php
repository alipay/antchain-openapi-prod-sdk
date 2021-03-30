<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class MasterBlGoodsDto extends Model
{
    // 唛头
    /**
     * @example 暂无
     *
     * @var string
     */
    public $marks;

    // 货物
    /**
     * @example 笔记本电脑
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

    // 包装类型
    /**
     * @example 暂无
     *
     * @var string
     */
    public $packageType;

    // 委托件数
    /**
     * @example 10000
     *
     * @var string
     */
    public $number;

    // 委托重量
    /**
     * @example 暂无
     *
     * @var string
     */
    public $weight;

    // 委托体积
    /**
     * @example 暂无
     *
     * @var string
     */
    public $volume;
    protected $_name = [
        'marks'       => 'marks',
        'goods'       => 'goods',
        'goodsType'   => 'goods_type',
        'packageType' => 'package_type',
        'number'      => 'number',
        'weight'      => 'weight',
        'volume'      => 'volume',
    ];

    public function validate()
    {
        Model::validateRequired('goods', $this->goods, true);
        Model::validateRequired('goodsType', $this->goodsType, true);
        Model::validateRequired('number', $this->number, true);
        Model::validateRequired('weight', $this->weight, true);
        Model::validateRequired('volume', $this->volume, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->marks) {
            $res['marks'] = $this->marks;
        }
        if (null !== $this->goods) {
            $res['goods'] = $this->goods;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->packageType) {
            $res['package_type'] = $this->packageType;
        }
        if (null !== $this->number) {
            $res['number'] = $this->number;
        }
        if (null !== $this->weight) {
            $res['weight'] = $this->weight;
        }
        if (null !== $this->volume) {
            $res['volume'] = $this->volume;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MasterBlGoodsDto
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['marks'])) {
            $model->marks = $map['marks'];
        }
        if (isset($map['goods'])) {
            $model->goods = $map['goods'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['package_type'])) {
            $model->packageType = $map['package_type'];
        }
        if (isset($map['number'])) {
            $model->number = $map['number'];
        }
        if (isset($map['weight'])) {
            $model->weight = $map['weight'];
        }
        if (isset($map['volume'])) {
            $model->volume = $map['volume'];
        }

        return $model;
    }
}
