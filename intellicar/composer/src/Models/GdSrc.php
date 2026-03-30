<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdSrc extends Model
{
    // 流入指数uv指数
    /**
     * @example
     *
     * @var GdCustomerUv
     */
    public $uv;

    // 流入指数pv指数
    /**
     * @example
     *
     * @var GdCustomerPv
     */
    public $pv;

    // 流入品牌id
    /**
     * @example 106
     *
     * @var string
     */
    public $brandId;

    // 流入店铺id，数据类型为店铺时返回该属性与值
    /**
     * @example 26mMw8duxn
     *
     * @var string
     */
    public $shopId;

    // 流入城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * @example 021
     *
     * @var string
     */
    public $citycode;

    // 省份编码，数据类型为省份时返回该属性与值
    /**
     * @example xxxx
     *
     * @var string
     */
    public $pcode;

    // 数据类型为全国时返回该属性与值
    /**
     * @example xxxx
     *
     * @var string
     */
    public $countrycode;
    protected $_name = [
        'uv'          => 'uv',
        'pv'          => 'pv',
        'brandId'     => 'brand_id',
        'shopId'      => 'shop_id',
        'citycode'    => 'citycode',
        'pcode'       => 'pcode',
        'countrycode' => 'countrycode',
    ];

    public function validate()
    {
        Model::validateRequired('uv', $this->uv, true);
        Model::validateRequired('pv', $this->pv, true);
        Model::validateRequired('brandId', $this->brandId, true);
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
        if (null !== $this->pcode) {
            $res['pcode'] = $this->pcode;
        }
        if (null !== $this->countrycode) {
            $res['countrycode'] = $this->countrycode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdSrc
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
        if (isset($map['pcode'])) {
            $model->pcode = $map['pcode'];
        }
        if (isset($map['countrycode'])) {
            $model->countrycode = $map['countrycode'];
        }

        return $model;
    }
}
