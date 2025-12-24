<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SignProductMerchant extends Model
{
    // 商户商品spuId
    /**
     * @example s123123123123123
     *
     * @var string
     */
    public $merchantProductId;

    // 商户品牌
    /**
     * @example 品牌
     *
     * @var string
     */
    public $merchantBrand;

    // 商户logo
    /**
     * @example filekey
     *
     * @var string
     */
    public $merchantLogo;

    // 商户logo
    /**
     * @example http
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
    protected $_name = [
        'merchantProductId' => 'merchant_product_id',
        'merchantBrand'     => 'merchant_brand',
        'merchantLogo'      => 'merchant_logo',
        'largeMerchantLogo' => 'large_merchant_logo',
        'grayed'            => 'grayed',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignProductMerchant
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

        return $model;
    }
}
