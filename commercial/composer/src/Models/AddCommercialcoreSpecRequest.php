<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class AddCommercialcoreSpecRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 规格code
    /**
     * @var string
     */
    public $specCode;

    // 产品code
    /**
     * @var string
     */
    public $productCode;

    // 商品code
    /**
     * @var string
     */
    public $commodityCode;

    // 售卖模式
    /**
     * @var string
     */
    public $salesMode;

    // 主要付款方式
    /**
     * @var string
     */
    public $mainPayMethod;

    // 规格描述
    /**
     * @var string
     */
    public $specDesc;

    // 规格名称
    /**
     * @var string
     */
    public $specName;

    // 定价计划
    /**
     * @var PricePlanVO
     */
    public $pricePlan;
    protected $_name = [
        'authToken'     => 'auth_token',
        'specCode'      => 'spec_code',
        'productCode'   => 'product_code',
        'commodityCode' => 'commodity_code',
        'salesMode'     => 'sales_mode',
        'mainPayMethod' => 'main_pay_method',
        'specDesc'      => 'spec_desc',
        'specName'      => 'spec_name',
        'pricePlan'     => 'price_plan',
    ];

    public function validate()
    {
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('productCode', $this->productCode, true);
        Model::validateRequired('commodityCode', $this->commodityCode, true);
        Model::validateRequired('salesMode', $this->salesMode, true);
        Model::validateRequired('mainPayMethod', $this->mainPayMethod, true);
        Model::validateRequired('specName', $this->specName, true);
        Model::validateRequired('pricePlan', $this->pricePlan, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->commodityCode) {
            $res['commodity_code'] = $this->commodityCode;
        }
        if (null !== $this->salesMode) {
            $res['sales_mode'] = $this->salesMode;
        }
        if (null !== $this->mainPayMethod) {
            $res['main_pay_method'] = $this->mainPayMethod;
        }
        if (null !== $this->specDesc) {
            $res['spec_desc'] = $this->specDesc;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }
        if (null !== $this->pricePlan) {
            $res['price_plan'] = null !== $this->pricePlan ? $this->pricePlan->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddCommercialcoreSpecRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['commodity_code'])) {
            $model->commodityCode = $map['commodity_code'];
        }
        if (isset($map['sales_mode'])) {
            $model->salesMode = $map['sales_mode'];
        }
        if (isset($map['main_pay_method'])) {
            $model->mainPayMethod = $map['main_pay_method'];
        }
        if (isset($map['spec_desc'])) {
            $model->specDesc = $map['spec_desc'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }
        if (isset($map['price_plan'])) {
            $model->pricePlan = PricePlanVO::fromMap($map['price_plan']);
        }

        return $model;
    }
}
