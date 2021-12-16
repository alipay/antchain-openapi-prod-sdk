<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMERCIAL\Models;

use AlibabaCloud\Tea\Model;

class MainOrderVO extends Model
{
    // order_no
    /**
     * @example order_no
     *
     * @var string
     */
    public $orderNo;

    // buyer
    /**
     * @example buyer
     *
     * @var string
     */
    public $buyer;

    // seller
    /**
     * @example seller
     *
     * @var string
     */
    public $seller;

    // sp_id
    /**
     * @example sp_id
     *
     * @var string
     */
    public $spId;

    // login_account
    /**
     * @example login_account
     *
     * @var string
     */
    public $loginAccount;

    // product_name
    /**
     * @example product_name
     *
     * @var string
     */
    public $productName;

    // money
    /**
     * @example money
     *
     * @var MultiCurrencyMoneyVO
     */
    public $money;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;

    // gmt_close
    /**
     * @example gmt_close
     *
     * @var string
     */
    public $gmtClose;

    // gmt_pay_success
    /**
     * @example gmt_pay_success
     *
     * @var string
     */
    public $gmtPaySuccess;

    // order_status
    /**
     * @example order_status
     *
     * @var string
     */
    public $orderStatus;

    // order_type
    /**
     * @example order_type
     *
     * @var string
     */
    public $orderType;

    // order_origin
    /**
     * @example order_origin
     *
     * @var string
     */
    public $orderOrigin;

    // order_level
    /**
     * @example order_level
     *
     * @var string
     */
    public $orderLevel;

    // pay_method
    /**
     * @example pay_method
     *
     * @var string
     */
    public $payMethod;

    // orde_duration
    /**
     * @example orde_duration
     *
     * @var string
     */
    public $orderDuration;

    // parent_order_no
    /**
     * @example parent_order_no
     *
     * @var string
     */
    public $parentOrderNo;

    // commodity_name
    /**
     * @example commodity_name
     *
     * @var string
     */
    public $commodityName;

    // spec_code
    /**
     * @example spec_code
     *
     * @var string
     */
    public $specCode;

    // spec_name
    /**
     * @example spec_name
     *
     * @var string
     */
    public $specName;

    // spec_desc
    /**
     * @example spec_desc
     *
     * @var string
     */
    public $specDesc;

    // order_detail
    /**
     * @example order_detail
     *
     * @var string
     */
    public $orderDetail;

    // sub_order_include
    /**
     * @example true, false
     *
     * @var bool
     */
    public $subOrderInclude;

    // spec_props
    /**
     * @example spec_props
     *
     * @var Pair[]
     */
    public $specProps;

    // ext_params
    /**
     * @example ext_params
     *
     * @var Pair[]
     */
    public $extParams;
    protected $_name = [
        'orderNo'         => 'order_no',
        'buyer'           => 'buyer',
        'seller'          => 'seller',
        'spId'            => 'sp_id',
        'loginAccount'    => 'login_account',
        'productName'     => 'product_name',
        'money'           => 'money',
        'gmtCreate'       => 'gmt_create',
        'gmtModified'     => 'gmt_modified',
        'gmtClose'        => 'gmt_close',
        'gmtPaySuccess'   => 'gmt_pay_success',
        'orderStatus'     => 'order_status',
        'orderType'       => 'order_type',
        'orderOrigin'     => 'order_origin',
        'orderLevel'      => 'order_level',
        'payMethod'       => 'pay_method',
        'orderDuration'   => 'order_duration',
        'parentOrderNo'   => 'parent_order_no',
        'commodityName'   => 'commodity_name',
        'specCode'        => 'spec_code',
        'specName'        => 'spec_name',
        'specDesc'        => 'spec_desc',
        'orderDetail'     => 'order_detail',
        'subOrderInclude' => 'sub_order_include',
        'specProps'       => 'spec_props',
        'extParams'       => 'ext_params',
    ];

    public function validate()
    {
        Model::validateRequired('orderNo', $this->orderNo, true);
        Model::validateRequired('buyer', $this->buyer, true);
        Model::validateRequired('seller', $this->seller, true);
        Model::validateRequired('spId', $this->spId, true);
        Model::validateRequired('loginAccount', $this->loginAccount, true);
        Model::validateRequired('productName', $this->productName, true);
        Model::validateRequired('money', $this->money, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('gmtClose', $this->gmtClose, true);
        Model::validateRequired('gmtPaySuccess', $this->gmtPaySuccess, true);
        Model::validateRequired('orderStatus', $this->orderStatus, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderOrigin', $this->orderOrigin, true);
        Model::validateRequired('orderLevel', $this->orderLevel, true);
        Model::validateRequired('payMethod', $this->payMethod, true);
        Model::validateRequired('orderDuration', $this->orderDuration, true);
        Model::validateRequired('parentOrderNo', $this->parentOrderNo, true);
        Model::validateRequired('commodityName', $this->commodityName, true);
        Model::validateRequired('specCode', $this->specCode, true);
        Model::validateRequired('specName', $this->specName, true);
        Model::validateRequired('specDesc', $this->specDesc, true);
        Model::validateRequired('orderDetail', $this->orderDetail, true);
        Model::validateRequired('subOrderInclude', $this->subOrderInclude, true);
        Model::validateRequired('specProps', $this->specProps, true);
        Model::validateRequired('extParams', $this->extParams, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtClose', $this->gmtClose, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtPaySuccess', $this->gmtPaySuccess, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderNo) {
            $res['order_no'] = $this->orderNo;
        }
        if (null !== $this->buyer) {
            $res['buyer'] = $this->buyer;
        }
        if (null !== $this->seller) {
            $res['seller'] = $this->seller;
        }
        if (null !== $this->spId) {
            $res['sp_id'] = $this->spId;
        }
        if (null !== $this->loginAccount) {
            $res['login_account'] = $this->loginAccount;
        }
        if (null !== $this->productName) {
            $res['product_name'] = $this->productName;
        }
        if (null !== $this->money) {
            $res['money'] = null !== $this->money ? $this->money->toMap() : null;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->gmtClose) {
            $res['gmt_close'] = $this->gmtClose;
        }
        if (null !== $this->gmtPaySuccess) {
            $res['gmt_pay_success'] = $this->gmtPaySuccess;
        }
        if (null !== $this->orderStatus) {
            $res['order_status'] = $this->orderStatus;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderOrigin) {
            $res['order_origin'] = $this->orderOrigin;
        }
        if (null !== $this->orderLevel) {
            $res['order_level'] = $this->orderLevel;
        }
        if (null !== $this->payMethod) {
            $res['pay_method'] = $this->payMethod;
        }
        if (null !== $this->orderDuration) {
            $res['order_duration'] = $this->orderDuration;
        }
        if (null !== $this->parentOrderNo) {
            $res['parent_order_no'] = $this->parentOrderNo;
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
        if (null !== $this->subOrderInclude) {
            $res['sub_order_include'] = $this->subOrderInclude;
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
     * @return MainOrderVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_no'])) {
            $model->orderNo = $map['order_no'];
        }
        if (isset($map['buyer'])) {
            $model->buyer = $map['buyer'];
        }
        if (isset($map['seller'])) {
            $model->seller = $map['seller'];
        }
        if (isset($map['sp_id'])) {
            $model->spId = $map['sp_id'];
        }
        if (isset($map['login_account'])) {
            $model->loginAccount = $map['login_account'];
        }
        if (isset($map['product_name'])) {
            $model->productName = $map['product_name'];
        }
        if (isset($map['money'])) {
            $model->money = MultiCurrencyMoneyVO::fromMap($map['money']);
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['gmt_close'])) {
            $model->gmtClose = $map['gmt_close'];
        }
        if (isset($map['gmt_pay_success'])) {
            $model->gmtPaySuccess = $map['gmt_pay_success'];
        }
        if (isset($map['order_status'])) {
            $model->orderStatus = $map['order_status'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_origin'])) {
            $model->orderOrigin = $map['order_origin'];
        }
        if (isset($map['order_level'])) {
            $model->orderLevel = $map['order_level'];
        }
        if (isset($map['pay_method'])) {
            $model->payMethod = $map['pay_method'];
        }
        if (isset($map['order_duration'])) {
            $model->orderDuration = $map['order_duration'];
        }
        if (isset($map['parent_order_no'])) {
            $model->parentOrderNo = $map['parent_order_no'];
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
        if (isset($map['sub_order_include'])) {
            $model->subOrderInclude = $map['sub_order_include'];
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
