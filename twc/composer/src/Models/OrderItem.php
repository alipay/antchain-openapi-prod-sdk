<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class OrderItem extends Model
{
    // 产品名称
    /**
     * @example 戴尔电脑
     *
     * @var string
     */
    public $productName;

    // 商品品牌
    /**
     * @example 戴尔
     *
     * @var string
     */
    public $commodityBrand;

    // 商品版本
    /**
     * @example 戴尔成就3681
     *
     * @var string
     */
    public $commodityVersion;

    // 商品规格
    /**
     * @example 英特尔酷睿i3
     *
     * @var string
     */
    public $commoditySpecification;

    // 商品颜色
    /**
     * @example 黑色
     *
     * @var string
     */
    public $commodityColor;

    // 商品详情
    /**
     * @example 戴尔电脑
     *
     * @var string
     */
    public $commodityDetails;

    // 商品官方价格
    /**
     * @example 6666.00
     *
     * @var string
     */
    public $commodityOfficialPrice;

    // 租赁物数量
    /**
     * @example 10
     *
     * @var int
     */
    public $leaseNumber;
    protected $_name = [
        'productName'            => 'product_name',
        'commodityBrand'         => 'commodity_brand',
        'commodityVersion'       => 'commodity_version',
        'commoditySpecification' => 'commodity_specification',
        'commodityColor'         => 'commodity_color',
        'commodityDetails'       => 'commodity_details',
        'commodityOfficialPrice' => 'commodity_official_price',
        'leaseNumber'            => 'lease_number',
    ];

    public function validate()
    {
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('commodityBrand', $this->commodityBrand, true);
        Model::validateRequired('commodityVersion', $this->commodityVersion, true);
        Model::validateRequired('commoditySpecification', $this->commoditySpecification, true);
        Model::validateRequired('commodityOfficialPrice', $this->commodityOfficialPrice, true);
        Model::validateRequired('leaseNumber', $this->leaseNumber, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->commodityBrand) {
            $res['commodity_brand'] = $this->commodityBrand;
        }
        if (null !== $this->commodityVersion) {
            $res['commodity_version'] = $this->commodityVersion;
        }
        if (null !== $this->commoditySpecification) {
            $res['commodity_specification'] = $this->commoditySpecification;
        }
        if (null !== $this->commodityColor) {
            $res['commodity_color'] = $this->commodityColor;
        }
        if (null !== $this->commodityDetails) {
            $res['commodity_details'] = $this->commodityDetails;
        }
        if (null !== $this->commodityOfficialPrice) {
            $res['commodity_official_price'] = $this->commodityOfficialPrice;
        }
        if (null !== $this->leaseNumber) {
            $res['lease_number'] = $this->leaseNumber;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['commodity_brand'])) {
            $model->commodityBrand = $map['commodity_brand'];
        }
        if (isset($map['commodity_version'])) {
            $model->commodityVersion = $map['commodity_version'];
        }
        if (isset($map['commodity_specification'])) {
            $model->commoditySpecification = $map['commodity_specification'];
        }
        if (isset($map['commodity_color'])) {
            $model->commodityColor = $map['commodity_color'];
        }
        if (isset($map['commodity_details'])) {
            $model->commodityDetails = $map['commodity_details'];
        }
        if (isset($map['commodity_official_price'])) {
            $model->commodityOfficialPrice = $map['commodity_official_price'];
        }
        if (isset($map['lease_number'])) {
            $model->leaseNumber = $map['lease_number'];
        }

        return $model;
    }
}
