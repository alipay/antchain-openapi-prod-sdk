<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class CreateTradecoreOrderRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // seller
    /**
     * @var string
     */
    public $seller;

    // 开发环境可以用：0016010039
    /**
     * @var string
     */
    public $spId;

    // product_name
    /**
     * @var string
     */
    public $productName;

    // 开发环境可以用：3000.00  单位是元
    /**
     * @var string
     */
    public $amt;

    // ccy
    /**
     * @var string
     */
    public $ccy;

    // 固定填写OFFICIAL_SITE
    /**
     * @var string
     */
    public $orderOrigin;

    // LICENSE(软件许可),RENEW(软件许可更新和技术支持),SUBSCRIBE(软件订阅),PRE(包年包月),POST(按量付费),SERVICE(服务型)
    /**
     * @var string
     */
    public $payMethod;

    // order_duration
    /**
     * @var string
     */
    public $orderDuration;

    // commodity_name
    /**
     * @var string
     */
    public $commodityName;

    // 开发环境可以用：10007
    /**
     * @var string
     */
    public $specCode;

    // spec_name
    /**
     * @var string
     */
    public $specName;

    // spec_desc
    /**
     * @var string
     */
    public $specDesc;

    // order_detail
    /**
     * @var string
     */
    public $orderDetail;

    // spec_props
    /**
     * @var Pair[]
     */
    public $specProps;

    // ext_params
    /**
     * @var Pair[]
     */
    public $extParams;
    protected $_name = [
        'authToken'     => 'auth_token',
        'seller'        => 'seller',
        'spId'          => 'sp_id',
        'productName'   => 'product_name',
        'amt'           => 'amt',
        'ccy'           => 'ccy',
        'orderOrigin'   => 'order_origin',
        'payMethod'     => 'pay_method',
        'orderDuration' => 'order_duration',
        'commodityName' => 'commodity_name',
        'specCode'      => 'spec_code',
        'specName'      => 'spec_name',
        'specDesc'      => 'spec_desc',
        'orderDetail'   => 'order_detail',
        'specProps'     => 'spec_props',
        'extParams'     => 'ext_params',
    ];

    public function validate()
    {
        Model::validateRequired('seller', $this->seller, true);
        Model::validateRequired('spId', $this->spId, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('amt', $this->amt, true);
        Model::validateRequired('orderOrigin', $this->orderOrigin, true);
        Model::validateRequired('payMethod', $this->payMethod, true);
        Model::validateRequired('orderDuration', $this->orderDuration, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specName', $this->specName, true);
        Model::validateRequired('specProps', $this->specProps, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->seller) {
            $res['seller'] = $this->seller;
        }
        if (null !== $this->spId) {
            $res['sp_id'] = $this->spId;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->amt) {
            $res['amt'] = $this->amt;
        }
        if (null !== $this->ccy) {
            $res['ccy'] = $this->ccy;
        }
        if (null !== $this->orderOrigin) {
            $res['order_origin'] = $this->orderOrigin;
        }
        if (null !== $this->payMethod) {
            $res['pay_method'] = $this->payMethod;
        }
        if (null !== $this->orderDuration) {
            $res['order_duration'] = $this->orderDuration;
        }
        if (null !== $this->commodityName) {
            $res['commodity_name'] = $this->commodityName;
        }
        if (null !== $this->specCode) {
            $res['spec_code'] = $this->specCode;
        }
        if (null !== $this->specName) {
            $res['spec_name'] = $this->specName;
        }
        if (null !== $this->specDesc) {
            $res['spec_desc'] = $this->specDesc;
        }
        if (null !== $this->orderDetail) {
            $res['order_detail'] = $this->orderDetail;
        }
        if (null !== $this->specProps) {
            $res['spec_props'] = [];
            if (null !== $this->specProps && \is_array($this->specProps)) {
                $n = 0;
                foreach ($this->specProps as $item) {
                    $res['spec_props'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extParams) {
            $res['ext_params'] = [];
            if (null !== $this->extParams && \is_array($this->extParams)) {
                $n = 0;
                foreach ($this->extParams as $item) {
                    $res['ext_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateTradecoreOrderRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['seller'])) {
            $model->seller = $map['seller'];
        }
        if (isset($map['sp_id'])) {
            $model->spId = $map['sp_id'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['amt'])) {
            $model->amt = $map['amt'];
        }
        if (isset($map['ccy'])) {
            $model->ccy = $map['ccy'];
        }
        if (isset($map['order_origin'])) {
            $model->orderOrigin = $map['order_origin'];
        }
        if (isset($map['pay_method'])) {
            $model->payMethod = $map['pay_method'];
        }
        if (isset($map['order_duration'])) {
            $model->orderDuration = $map['order_duration'];
        }
        if (isset($map['commodity_name'])) {
            $model->commodityName = $map['commodity_name'];
        }
        if (isset($map['spec_code'])) {
            $model->specCode = $map['spec_code'];
        }
        if (isset($map['spec_name'])) {
            $model->specName = $map['spec_name'];
        }
        if (isset($map['spec_desc'])) {
            $model->specDesc = $map['spec_desc'];
        }
        if (isset($map['order_detail'])) {
            $model->orderDetail = $map['order_detail'];
        }
        if (isset($map['spec_props'])) {
            if (!empty($map['spec_props'])) {
                $model->specProps = [];
                $n                = 0;
                foreach ($map['spec_props'] as $item) {
                    $model->specProps[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext_params'])) {
            if (!empty($map['ext_params'])) {
                $model->extParams = [];
                $n                = 0;
                foreach ($map['ext_params'] as $item) {
                    $model->extParams[$n++] = null !== $item ? Pair::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
