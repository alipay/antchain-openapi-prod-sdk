<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class ApplySceneProductMerchantInfo extends Model
{
    // 商户商品spuId
    /**
     * @example s12312312312
     *
     * @var string
     */
    public $merchantProductId;

    // 商户品牌
    /**
     * @example merchantBrand
     *
     * @var string
     */
    public $merchantBrand;

    // logo
    /**
     * @example logo
     *
     * @var string
     */
    public $merchantLogo;

    // logo
    /**
     * @example logo
     *
     * @var string
     */
    public $largeMerchantLogo;

    // 是否置灰
    /**
     * @example true, false
     *
     * @var bool
     */
    public $grayed;

    // 是否勾选
    /**
     * @example true, false
     *
     * @var bool
     */
    public $choosed;
    protected $_name = [
        'merchantProductId' => 'merchant_product_id',
        'merchantBrand'     => 'merchant_brand',
        'merchantLogo'      => 'merchant_logo',
        'largeMerchantLogo' => 'large_merchant_logo',
        'grayed'            => 'grayed',
        'choosed'           => 'choosed',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->merchantProductId) {
            $res['merchant_product_id'] = $this->merchantProductId;
        }
        if (null !== $this->merchantBrand) {
            $res['merchant_brand'] = $this->merchantBrand;
        }
        if (null !== $this->merchantLogo) {
            $res['merchant_logo'] = $this->merchantLogo;
        }
        if (null !== $this->largeMerchantLogo) {
            $res['large_merchant_logo'] = $this->largeMerchantLogo;
        }
        if (null !== $this->grayed) {
            $res['grayed'] = $this->grayed;
        }
        if (null !== $this->choosed) {
            $res['choosed'] = $this->choosed;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ApplySceneProductMerchantInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['merchant_product_id'])) {
            $model->merchantProductId = $map['merchant_product_id'];
        }
        if (isset($map['merchant_brand'])) {
            $model->merchantBrand = $map['merchant_brand'];
        }
        if (isset($map['merchant_logo'])) {
            $model->merchantLogo = $map['merchant_logo'];
        }
        if (isset($map['large_merchant_logo'])) {
            $model->largeMerchantLogo = $map['large_merchant_logo'];
        }
        if (isset($map['grayed'])) {
            $model->grayed = $map['grayed'];
        }
        if (isset($map['choosed'])) {
            $model->choosed = $map['choosed'];
        }

        return $model;
    }
}
