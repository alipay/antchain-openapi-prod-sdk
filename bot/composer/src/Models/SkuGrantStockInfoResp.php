<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class SkuGrantStockInfoResp extends Model
{
    // 产品型号
    /**
     * @example TEST-MODEL-0001
     *
     * @var string
     */
    public $productModel;

    // 产品形式，取值范围： SOFTWARE_HARDWARE：软硬一体（SE方案）, SOFTWARE：纯软（非SE方案）
    /**
     * @example SOFTWARE_HARDWARE
     *
     * @var string
     */
    public $productForm;

    // 凭证种类列表，取值范围： ["PAYMENT"]：支付码， ["PAYMENT","TRANSIT"]：支付码+乘车码
    /**
     * @example ["PAYMENT"]
     *
     * @var string[]
     */
    public $features;

    // 授权数量(指当前证书凭证种类下未消耗的证书数量)
    /**
     * @example 10
     *
     * @var int
     */
    public $certNum;
    protected $_name = [
        'productModel' => 'product_model',
        'productForm'  => 'product_form',
        'features'     => 'features',
        'certNum'      => 'cert_num',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->productForm) {
            $res['product_form'] = $this->productForm;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SkuGrantStockInfoResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['product_model'])) {
            $model->productModel = $map['product_model'];
        }
        if (isset($map['product_form'])) {
            $model->productForm = $map['product_form'];
        }
        if (isset($map['features'])) {
            if (!empty($map['features'])) {
                $model->features = $map['features'];
            }
        }
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }

        return $model;
    }
}
