<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class AddCommercialcoreCommodityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商品code
    /**
     * @var string
     */
    public $commodityCode;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 商品名称
    /**
     * @var string
     */
    public $commodityName;

    // 商品服务类型
    /**
     * @var string
     */
    public $serviceType;

    // 商品来源
    /**
     * @var string
     */
    public $sourceType;

    // 商品描述
    /**
     * @var string
     */
    public $desc;
    protected $_name = [
        'authToken'     => 'auth_token',
        'commodityCode' => 'commodity_code',
        'productCode'   => 'product_code',
        'commodityName' => 'commodity_name',
        'serviceType'   => 'service_type',
        'sourceType'    => 'source_type',
        'desc'          => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->serviceType) {
            $res['service_type'] = $this->serviceType;
        }
        if (null !== $this->sourceType) {
            $res['source_type'] = $this->sourceType;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddCommercialcoreCommodityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['commodity_name'])) {
            $model->commodityName = $map['commodity_name'];
        }
        if (isset($map['service_type'])) {
            $model->serviceType = $map['service_type'];
        }
        if (isset($map['source_type'])) {
            $model->sourceType = $map['source_type'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
