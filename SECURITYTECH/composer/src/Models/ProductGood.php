<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class ProductGood extends Model {
    protected $_name = [
        'goodsName' => 'goods_name',
        'goodsCategory' => 'goods_category',
        'goodsAmount' => 'goods_amount',
        'goodsPoints' => 'goods_points',
        'goodsCount' => 'goods_count',
    ];
    public function validate() {
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsCategory', $this->goodsCategory, true);
        Model::validateRequired('goodsAmount', $this->goodsAmount, true);
        Model::validateRequired('goodsPoints', $this->goodsPoints, true);
        Model::validateRequired('goodsCount', $this->goodsCount, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsCategory) {
            $res['goods_category'] = $this->goodsCategory;
        }
        if (null !== $this->goodsAmount) {
            $res['goods_amount'] = $this->goodsAmount;
        }
        if (null !== $this->goodsPoints) {
            $res['goods_points'] = $this->goodsPoints;
        }
        if (null !== $this->goodsCount) {
            $res['goods_count'] = $this->goodsCount;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ProductGood
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['goods_name'])){
            $model->goodsName = $map['goods_name'];
        }
        if(isset($map['goods_category'])){
            $model->goodsCategory = $map['goods_category'];
        }
        if(isset($map['goods_amount'])){
            $model->goodsAmount = $map['goods_amount'];
        }
        if(isset($map['goods_points'])){
            $model->goodsPoints = $map['goods_points'];
        }
        if(isset($map['goods_count'])){
            $model->goodsCount = $map['goods_count'];
        }
        return $model;
    }
    // 商品名称
    /**
     * @example 猫罐头
     * @var string
     */
    public $goodsName;

    // 商品类别，枚举值
    /**
     * @example CAN
     * @var string
     */
    public $goodsCategory;

    // 此商品总金额（元，两位小数）
    /**
     * @example 1000.00
     * @var string
     */
    public $goodsAmount;

    // 此商消费总积分（两位小数）
    /**
     * @example 1000.00
     * @var string
     */
    public $goodsPoints;

    // 商品件数（整数）
    /**
     * @example 1
     * @var string
     */
    public $goodsCount;

}
