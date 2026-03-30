<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdPotentialCustomerRecord extends Model
{
    // uv指数
    /**
     * @example
     *
     * @var GdCustomerUv
     */
    public $uv;

    // 城市编码，数据类型为店铺或者城市时返回该属性与值
    /**
     * @example xxxx
     *
     * @var string
     */
    public $citycode;

    // pv指数
    /**
     * @example
     *
     * @var GdCustomerPv
     */
    public $pv;

    // 店铺id，数据类型为店铺时返回该属性与值
    /**
     * @example xxxx
     *
     * @var string
     */
    public $shopId;

    // 品牌id
    /**
     * @example xxxx
     *
     * @var string
     */
    public $brandId;

    // 店铺数量（dataType!=SHOP时返回该字段）
    /**
     * @example
     *
     * @var int
     */
    public $shopNum;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
    /**
     * @example xxxx
     *
     * @var string
     */
    public $time;

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
        'citycode'    => 'citycode',
        'pv'          => 'pv',
        'shopId'      => 'shop_id',
        'brandId'     => 'brand_id',
        'shopNum'     => 'shop_num',
        'time'        => 'time',
        'pcode'       => 'pcode',
        'countrycode' => 'countrycode',
    ];

    public function validate()
    {
        Model::validateRequired('uv', $this->uv, true);
        Model::validateRequired('pv', $this->pv, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('time', $this->time, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uv) {
            $res['uv'] = null !== $this->uv ? $this->uv->toMap() : null;
        }
        if (null !== $this->citycode) {
            $res['citycode'] = $this->citycode;
        }
        if (null !== $this->pv) {
            $res['pv'] = null !== $this->pv ? $this->pv->toMap() : null;
        }
        if (null !== $this->shopId) {
            $res['shop_id'] = $this->shopId;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->shopNum) {
            $res['shop_num'] = $this->shopNum;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
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
     * @return GdPotentialCustomerRecord
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uv'])) {
            $model->uv = GdCustomerUv::fromMap($map['uv']);
        }
        if (isset($map['citycode'])) {
            $model->citycode = $map['citycode'];
        }
        if (isset($map['pv'])) {
            $model->pv = GdCustomerPv::fromMap($map['pv']);
        }
        if (isset($map['shop_id'])) {
            $model->shopId = $map['shop_id'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['shop_num'])) {
            $model->shopNum = $map['shop_num'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
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
