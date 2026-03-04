<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class SimStoreInfo extends Model
{
    // 门店对外业务id
    /**
     * @example
     *
     * @var string
     */
    public $storeId;

    // 品牌id
    /**
     * @example HQS
     *
     * @var string
     */
    public $brandId;

    // 门店名称
    /**
     * @example
     *
     * @var string
     */
    public $storeName;

    // 是否签约 true已签约/false未签约
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isSign;

    // 支付宝H5签约链接 未签约时非空
    /**
     * @example
     *
     * @var string
     */
    public $signUrl;

    // 销售信息
    /**
     * @example
     *
     * @var SimSalesInfo
     */
    public $salesInfo;
    protected $_name = [
        'storeId'   => 'store_id',
        'brandId'   => 'brand_id',
        'storeName' => 'store_name',
        'isSign'    => 'is_sign',
        'signUrl'   => 'sign_url',
        'salesInfo' => 'sales_info',
    ];

    public function validate()
    {
        Model::validateRequired('storeId', $this->storeId, true);
        Model::validateRequired('brandId', $this->brandId, true);
        Model::validateRequired('storeName', $this->storeName, true);
        Model::validateRequired('isSign', $this->isSign, true);
        Model::validateRequired('salesInfo', $this->salesInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->brandId) {
            $res['brand_id'] = $this->brandId;
        }
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }
        if (null !== $this->isSign) {
            $res['is_sign'] = $this->isSign;
        }
        if (null !== $this->signUrl) {
            $res['sign_url'] = $this->signUrl;
        }
        if (null !== $this->salesInfo) {
            $res['sales_info'] = null !== $this->salesInfo ? $this->salesInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SimStoreInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['store_id'])) {
            $model->storeId = $map['store_id'];
        }
        if (isset($map['brand_id'])) {
            $model->brandId = $map['brand_id'];
        }
        if (isset($map['store_name'])) {
            $model->storeName = $map['store_name'];
        }
        if (isset($map['is_sign'])) {
            $model->isSign = $map['is_sign'];
        }
        if (isset($map['sign_url'])) {
            $model->signUrl = $map['sign_url'];
        }
        if (isset($map['sales_info'])) {
            $model->salesInfo = SimSalesInfo::fromMap($map['sales_info']);
        }

        return $model;
    }
}
