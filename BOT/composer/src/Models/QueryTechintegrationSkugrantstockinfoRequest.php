<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class QueryTechintegrationSkugrantstockinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 产品型号
    /**
     * @var string
     */
    public $productModel;

    // 产品形式，取值范围：
    // SOFTWARE_HARDWARE：软硬一体（SE方案）,
    // SOFTWARE：纯软（非SE方案）
    /**
     * @var string
     */
    public $productForm;

    // 凭证种类列表，取值范围：
    // ["PAYMENT"]：支付码，
    // ["PAYMENT","TRANSIT"]：支付码+乘车码
    /**
     * @var string[]
     */
    public $features;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'productModel'      => 'product_model',
        'productForm'       => 'product_form',
        'features'          => 'features',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->productModel) {
            $res['product_model'] = $this->productModel;
        }
        if (null !== $this->productForm) {
            $res['product_form'] = $this->productForm;
        }
        if (null !== $this->features) {
            $res['features'] = $this->features;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryTechintegrationSkugrantstockinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
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

        return $model;
    }
}
