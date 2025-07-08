<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimSkuInfo extends Model
{
    // sku对外id
    /**
     * @example
     *
     * @var string
     */
    public $skuId;

    // sku名称
    /**
     * @example
     *
     * @var string
     */
    public $skuName;

    // sku官方指导价：单位为元
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $price;

    // sku门店优惠价：单位为元
    /**
     * @example 1000.00
     *
     * @var string
     */
    public $storePrice;

    // 车型
    /**
     * @example
     *
     * @var string
     */
    public $vehicleModel;

    // 续航里程
    /**
     * @example -
     *
     * @var string
     */
    public $rangeKm;

    // 关键词，逗号分隔
    /**
     * @example A,B,C
     *
     * @var string
     */
    public $keywords;

    // 颜色，逗号分隔
    /**
     * @example A,B,C
     *
     * @var string
     */
    public $colors;

    // 配件信息，逗号分隔
    /**
     * @example A,B,C
     *
     * @var string
     */
    public $accessories;

    // 图片url json
    /**
     * @example {}
     *
     * @var string
     */
    public $images;

    // 门店id
    /**
     * @example
     *
     * @var string
     */
    public $storeId;

    // 车型描述
    /**
     * @example
     *
     * @var string
     */
    public $skuDescription;
    protected $_name = [
        'skuId'          => 'sku_id',
        'skuName'        => 'sku_name',
        'price'          => 'price',
        'storePrice'     => 'store_price',
        'vehicleModel'   => 'vehicle_model',
        'rangeKm'        => 'range_km',
        'keywords'       => 'keywords',
        'colors'         => 'colors',
        'accessories'    => 'accessories',
        'images'         => 'images',
        'storeId'        => 'store_id',
        'skuDescription' => 'sku_description',
    ];

    public function validate()
    {
        Model::validateRequired('skuId', $this->skuId, true);
        Model::validateRequired('skuName', $this->skuName, true);
        Model::validateRequired('price', $this->price, true);
        Model::validateRequired('storePrice', $this->storePrice, true);
        Model::validateRequired('vehicleModel', $this->vehicleModel, true);
        Model::validateRequired('rangeKm', $this->rangeKm, true);
        Model::validateRequired('keywords', $this->keywords, true);
        Model::validateRequired('colors', $this->colors, true);
        Model::validateRequired('accessories', $this->accessories, true);
        Model::validateRequired('images', $this->images, true);
        Model::validateRequired('storeId', $this->storeId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->skuId) {
            $res['sku_id'] = $this->skuId;
        }
        if (null !== $this->skuName) {
            $res['sku_name'] = $this->skuName;
        }
        if (null !== $this->price) {
            $res['price'] = $this->price;
        }
        if (null !== $this->storePrice) {
            $res['store_price'] = $this->storePrice;
        }
        if (null !== $this->vehicleModel) {
            $res['vehicle_model'] = $this->vehicleModel;
        }
        if (null !== $this->rangeKm) {
            $res['range_km'] = $this->rangeKm;
        }
        if (null !== $this->keywords) {
            $res['keywords'] = $this->keywords;
        }
        if (null !== $this->colors) {
            $res['colors'] = $this->colors;
        }
        if (null !== $this->accessories) {
            $res['accessories'] = $this->accessories;
        }
        if (null !== $this->images) {
            $res['images'] = $this->images;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->skuDescription) {
            $res['sku_description'] = $this->skuDescription;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimSkuInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sku_id'])) {
            $model->skuId = $map['sku_id'];
        }
        if (isset($map['sku_name'])) {
            $model->skuName = $map['sku_name'];
        }
        if (isset($map['price'])) {
            $model->price = $map['price'];
        }
        if (isset($map['store_price'])) {
            $model->storePrice = $map['store_price'];
        }
        if (isset($map['vehicle_model'])) {
            $model->vehicleModel = $map['vehicle_model'];
        }
        if (isset($map['range_km'])) {
            $model->rangeKm = $map['range_km'];
        }
        if (isset($map['keywords'])) {
            $model->keywords = $map['keywords'];
        }
        if (isset($map['colors'])) {
            $model->colors = $map['colors'];
        }
        if (isset($map['accessories'])) {
            $model->accessories = $map['accessories'];
        }
        if (isset($map['images'])) {
            $model->images = $map['images'];
        }
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['sku_description'])) {
            $model->skuDescription = $map['sku_description'];
        }

        return $model;
    }
}
