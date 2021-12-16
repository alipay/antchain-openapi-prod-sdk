<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CommodityVO extends Model
{
    // 商品Code
    /**
     * @example software_bpaas_xxxx
     *
     * @var string
     */
    public $commodityCode;

    // 商品名称
    /**
     * @example 商品xxx
     *
     * @var string
     */
    public $commodityName;

    // 商品服务类型
    /**
     * @example PLATFORM
     *
     * @var string
     */
    public $serviceType;

    // 商品来源
    /**
     * @example S1P_SELF_DEV
     *
     * @var string
     */
    public $sourceType;

    // 商品描述
    /**
     * @example 商品描述xxx
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'commodityCode' => 'commodity_code',
        'commodityName' => 'commodity_name',
        'serviceType'   => 'service_type',
        'sourceType'    => 'source_type',
        'desc'          => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('serviceType', $this->serviceType, true);
        Model::validateRequired('sourceType', $this->sourceType, true);
        Model::validateRequired('desc', $this->desc, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
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
     * @return CommodityVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
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
