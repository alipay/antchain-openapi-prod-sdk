<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTELLICAR\Models;

use AlibabaCloud\Tea\Model;

class GdCustomerFlow extends Model
{
    // 当前页面
    /**
     * @example 1
     *
     * @var int
     */
    public $current;

    // 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
    /**
     * @example SHOP
     *
     * @var string
     */
    public $dataType;

    // 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
    /**
     * @example DAY
     *
     * @var string
     */
    public $timeType;

    // 主品牌id
    /**
     * @example 102
     *
     * @var string
     */
    public $mainBrand;

    // 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
    /**
     * @example 20230103
     *
     * @var string
     */
    public $time;

    // 品牌id，以”,”分隔
    /**
     * @example 102
     *
     * @var string
     */
    public $brandLimit;

    // 数据指数类型（pv、uv中选择，多个以”,”分隔）
    /**
     * @example pv,uv
     *
     * @var string
     */
    public $dataLimit;

    // 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
    /**
     * @example 1
     *
     * @var int
     */
    public $baseSelf;
    protected $_name = [
        'current'    => 'current',
        'dataType'   => 'data_type',
        'timeType'   => 'time_type',
        'mainBrand'  => 'main_brand',
        'time'       => 'time',
        'brandLimit' => 'brand_limit',
        'dataLimit'  => 'data_limit',
        'baseSelf'   => 'base_self',
    ];

    public function validate()
    {
        Model::validateRequired('current', $this->current, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->current) {
            $res['current'] = $this->current;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->timeType) {
            $res['time_type'] = $this->timeType;
        }
        if (null !== $this->mainBrand) {
            $res['main_brand'] = $this->mainBrand;
        }
        if (null !== $this->time) {
            $res['time'] = $this->time;
        }
        if (null !== $this->brandLimit) {
            $res['brand_limit'] = $this->brandLimit;
        }
        if (null !== $this->dataLimit) {
            $res['data_limit'] = $this->dataLimit;
        }
        if (null !== $this->baseSelf) {
            $res['base_self'] = $this->baseSelf;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GdCustomerFlow
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['current'])) {
            $model->current = $map['current'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['time_type'])) {
            $model->timeType = $map['time_type'];
        }
        if (isset($map['main_brand'])) {
            $model->mainBrand = $map['main_brand'];
        }
        if (isset($map['time'])) {
            $model->time = $map['time'];
        }
        if (isset($map['brand_limit'])) {
            $model->brandLimit = $map['brand_limit'];
        }
        if (isset($map['data_limit'])) {
            $model->dataLimit = $map['data_limit'];
        }
        if (isset($map['base_self'])) {
            $model->baseSelf = $map['base_self'];
        }

        return $model;
    }
}
