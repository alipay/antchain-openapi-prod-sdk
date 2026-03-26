<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class Overlap extends Model
{
    // 重叠指数uv指数
    /**
     * @example
     *
     * @var GdCustomerUv
     */
    public $uv;

    // 重叠指数pv指数
    /**
     * @example
     *
     * @var GdCustomerPv
     */
    public $pv;

    // 重叠品牌id
    /**
     * @example 104
     *
     * @var string
     */
    public $brandId;

    // 重叠店铺id，数据类型为店铺时返回该属性与值
    /**
     * @example 26nhJ8duzh
     *
     * @var string
     */
    public $shopId;

    // 重叠城市编码，数据类型为城市时返回该属性与值
    /**
     * @example 021
     *
     * @var string
     */
    public $citycode;
    protected $_name = [
        'uv'       => 'uv',
        'pv'       => 'pv',
        'brandId'  => 'brand_id',
        'shopId'   => 'shop_id',
        'citycode' => 'citycode',
    ];

    public function validate()
    {
        Model::validateRequired('uv', $this->uv, true);
        Model::validateRequired('pv', $this->pv, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('shopId', $this->shopId, true);
        Model::validateRequired('citycode', $this->citycode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uv) {
            $res['uv'] = null !== $this->uv ? $this->uv->toMap() : null;
        }
        if (null !== $this->pv) {
            $res['pv'] = null !== $this->pv ? $this->pv->toMap() : null;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->citycode) {
            $res['citycode'] = $this->citycode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Overlap
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uv'])) {
            $model->uv = GdCustomerUv::fromMap($map['uv']);
        }
        if (isset($map['pv'])) {
            $model->pv = GdCustomerPv::fromMap($map['pv']);
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['citycode'])) {
            $model->citycode = $map['citycode'];
        }

        return $model;
    }
}
