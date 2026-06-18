<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class PoiMallPointOrderInfo extends Model
{
    // 订单号
    /**
     * @example 0
     *
     * @var string
     */
    public $orderId;

    // 商品名称
    /**
     * @example 猫粮
     *
     * @var string
     */
    public $goodsName;

    // 商品条码
    /**
     * @example 0
     *
     * @var string
     */
    public $goodsNum;

    // 商品类型
    /**
     * @example GOODS
     *
     * @var string
     */
    public $goodsType;

    // 商品积分
    /**
     * @example 3
     *
     * @var string
     */
    public $goodsPoint;

    // 商品供应方信息
    /**
     * @example undefined
     *
     * @var PoiMallPointSupplierInfo
     */
    public $supplierInfo;
    protected $_name = [
        'orderId'      => 'order_id',
        'goodsName'    => 'goods_name',
        'goodsNum'     => 'goods_num',
        'goodsType'    => 'goods_type',
        'goodsPoint'   => 'goods_point',
        'supplierInfo' => 'supplier_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('goodsName', $this->goodsName, true);
        Model::validateRequired('goodsNum', $this->goodsNum, true);
        Model::validateRequired('goodsType', $this->goodsType, true);
        Model::validateRequired('goodsPoint', $this->goodsPoint, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->goodsName) {
            $res['goods_name'] = $this->goodsName;
        }
        if (null !== $this->goodsNum) {
            $res['goods_num'] = $this->goodsNum;
        }
        if (null !== $this->goodsType) {
            $res['goods_type'] = $this->goodsType;
        }
        if (null !== $this->goodsPoint) {
            $res['goods_point'] = $this->goodsPoint;
        }
        if (null !== $this->supplierInfo) {
            $res['supplier_info'] = null !== $this->supplierInfo ? $this->supplierInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PoiMallPointOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['goods_name'])) {
            $model->goodsName = $map['goods_name'];
        }
        if (isset($map['goods_num'])) {
            $model->goodsNum = $map['goods_num'];
        }
        if (isset($map['goods_type'])) {
            $model->goodsType = $map['goods_type'];
        }
        if (isset($map['goods_point'])) {
            $model->goodsPoint = $map['goods_point'];
        }
        if (isset($map['supplier_info'])) {
            $model->supplierInfo = PoiMallPointSupplierInfo::fromMap($map['supplier_info']);
        }

        return $model;
    }
}
