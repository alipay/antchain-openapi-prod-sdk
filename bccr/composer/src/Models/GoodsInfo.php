<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class GoodsInfo extends Model
{
    // 商品id
    /**
     * @example 111111
     *
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @example 测试商品
     *
     * @var string
     */
    public $goodsName;

    // 商品状态
    /**
     * @example UP
     *
     * @var string
     */
    public $goodsStatus;

    // 商品分类
    /**
     * @example 分类
     *
     * @var string
     */
    public $classification;

    // 售卖数量
    /**
     * @example 1
     *
     * @var int
     */
    public $totalSoldNum;

    // 售价（分）
    /**
     * @example 1
     *
     * @var int
     */
    public $standardPriceInCent;

    // 商品标题
    /**
     * @example 测试标题
     *
     * @var string
     */
    public $title;

    // 授权期限起始时间
    /**
     * @example
     *
     * @var int
     */
    public $authStartTime;

    // 授权期限结束时间
    /**
     * @example
     *
     * @var int
     */
    public $authEndTime;

    // 发布时间
    /**
     * @example
     *
     * @var int
     */
    public $publishTime;
    protected $_name = [
        'goodsId'             => 'goods_id',
        'goodsName'           => 'goods_name',
        'goodsStatus'         => 'goods_status',
        'classification'      => 'classification',
        'totalSoldNum'        => 'total_sold_num',
        'standardPriceInCent' => 'standard_price_in_cent',
        'title'               => 'title',
        'authStartTime'       => 'auth_start_time',
        'authEndTime'         => 'auth_end_time',
        'publishTime'         => 'publish_time',
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
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsStatus) {
            $res['goods_status'] = $this->goodsStatus;
        }
        if (null !== $this->classification) {
            $res['classification'] = $this->classification;
        }
        if (null !== $this->totalSoldNum) {
            $res['total_sold_num'] = $this->totalSoldNum;
        }
        if (null !== $this->standardPriceInCent) {
            $res['standard_price_in_cent'] = $this->standardPriceInCent;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->authStartTime) {
            $res['auth_start_time'] = $this->authStartTime;
        }
        if (null !== $this->authEndTime) {
            $res['auth_end_time'] = $this->authEndTime;
        }
        if (null !== $this->publishTime) {
            $res['publish_time'] = $this->publishTime;
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
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_status'])) {
            $model->goodsStatus = $map['goods_status'];
        }
        if (isset($map['classification'])) {
            $model->classification = $map['classification'];
        }
        if (isset($map['total_sold_num'])) {
            $model->totalSoldNum = $map['total_sold_num'];
        }
        if (isset($map['standard_price_in_cent'])) {
            $model->standardPriceInCent = $map['standard_price_in_cent'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['auth_start_time'])) {
            $model->authStartTime = $map['auth_start_time'];
        }
        if (isset($map['auth_end_time'])) {
            $model->authEndTime = $map['auth_end_time'];
        }
        if (isset($map['publish_time'])) {
            $model->publishTime = $map['publish_time'];
        }

        return $model;
    }
}
