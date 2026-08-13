<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

use AntChain\RISKPLUS\Models\HisTranInfo;

class PetCashierApplyExtInfo extends Model {
    protected $_name = [
        'storeName' => 'store_name',
        'storeId' => 'store_id',
        'storeSocialCode' => 'store_social_code',
        'storeAddress' => 'store_address',
        'storeAddrProv' => 'store_addr_prov',
        'storeAddrCity' => 'store_addr_city',
        'storeAddrDstc' => 'store_addr_dstc',
        'vendorSocialCode' => 'vendor_social_code',
        'vendorName' => 'vendor_name',
        'commModel' => 'comm_model',
        'totalPrice' => 'total_price',
        'firstPayAmount' => 'first_pay_amount',
        'orderPaidAmount' => 'order_paid_amount',
        'hisTranInfo' => 'his_tran_info',
    ];
    public function validate() {
        Model::validateRequired('vendorSocialCode', $this->vendorSocialCode, true);
        Model::validateRequired('vendorName', $this->vendorName, true);
        Model::validateRequired('commModel', $this->commModel, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->storeName) {
            $res['store_name'] = $this->storeName;
        }
        if (null !== $this->storeId) {
            $res['store_id'] = $this->storeId;
        }
        if (null !== $this->storeSocialCode) {
            $res['store_social_code'] = $this->storeSocialCode;
        }
        if (null !== $this->storeAddress) {
            $res['store_address'] = $this->storeAddress;
        }
        if (null !== $this->storeAddrProv) {
            $res['store_addr_prov'] = $this->storeAddrProv;
        }
        if (null !== $this->storeAddrCity) {
            $res['store_addr_city'] = $this->storeAddrCity;
        }
        if (null !== $this->storeAddrDstc) {
            $res['store_addr_dstc'] = $this->storeAddrDstc;
        }
        if (null !== $this->vendorSocialCode) {
            $res['vendor_social_code'] = $this->vendorSocialCode;
        }
        if (null !== $this->vendorName) {
            $res['vendor_name'] = $this->vendorName;
        }
        if (null !== $this->commModel) {
            $res['comm_model'] = $this->commModel;
        }
        if (null !== $this->totalPrice) {
            $res['total_price'] = $this->totalPrice;
        }
        if (null !== $this->firstPayAmount) {
            $res['first_pay_amount'] = $this->firstPayAmount;
        }
        if (null !== $this->orderPaidAmount) {
            $res['order_paid_amount'] = $this->orderPaidAmount;
        }
        if (null !== $this->hisTranInfo) {
            $res['his_tran_info'] = [];
            if(null !== $this->hisTranInfo && is_array($this->hisTranInfo)){
                $n = 0;
                foreach($this->hisTranInfo as $item){
                    $res['his_tran_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return PetCashierApplyExtInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['store_name'])){
            $model->storeName = $map['store_name'];
        }
        if(isset($map['store_id'])){
            $model->storeId = $map['store_id'];
        }
        if(isset($map['store_social_code'])){
            $model->storeSocialCode = $map['store_social_code'];
        }
        if(isset($map['store_address'])){
            $model->storeAddress = $map['store_address'];
        }
        if(isset($map['store_addr_prov'])){
            $model->storeAddrProv = $map['store_addr_prov'];
        }
        if(isset($map['store_addr_city'])){
            $model->storeAddrCity = $map['store_addr_city'];
        }
        if(isset($map['store_addr_dstc'])){
            $model->storeAddrDstc = $map['store_addr_dstc'];
        }
        if(isset($map['vendor_social_code'])){
            $model->vendorSocialCode = $map['vendor_social_code'];
        }
        if(isset($map['vendor_name'])){
            $model->vendorName = $map['vendor_name'];
        }
        if(isset($map['comm_model'])){
            $model->commModel = $map['comm_model'];
        }
        if(isset($map['total_price'])){
            $model->totalPrice = $map['total_price'];
        }
        if(isset($map['first_pay_amount'])){
            $model->firstPayAmount = $map['first_pay_amount'];
        }
        if(isset($map['order_paid_amount'])){
            $model->orderPaidAmount = $map['order_paid_amount'];
        }
        if(isset($map['his_tran_info'])){
            if(!empty($map['his_tran_info'])){
                $model->hisTranInfo = [];
                $n = 0;
                foreach($map['his_tran_info'] as $item) {
                    $model->hisTranInfo[$n++] = null !== $item ? HisTranInfo::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 门店名称
    /**
     * @example 
     * @var string
     */
    public $storeName;

    // 门店id
    /**
     * @example 
     * @var string
     */
    public $storeId;

    // 门店社会统一信用代码
    /**
     * @example 
     * @var string
     */
    public $storeSocialCode;

    // 门店地址
    /**
     * @example 
     * @var string
     */
    public $storeAddress;

    // 门店地址省
    /**
     * @example 
     * @var string
     */
    public $storeAddrProv;

    // 门店地址市
    /**
     * @example 
     * @var string
     */
    public $storeAddrCity;

    // 门店地址区
    /**
     * @example 
     * @var string
     */
    public $storeAddrDstc;

    // 厂商社会信用代码
    /**
     * @example 
     * @var string
     */
    public $vendorSocialCode;

    // 厂商名称
    /**
     * @example 
     * @var string
     */
    public $vendorName;

    // 商品型号
    /**
     * @example 
     * @var string
     */
    public $commModel;

    // 商品总价(包含定金)	String
    /**
     * @example 
     * @var string
     */
    public $totalPrice;

    // 已付定金
    /**
     * @example 
     * @var string
     */
    public $firstPayAmount;

    // 已付货款
    /**
     * @example 
     * @var string
     */
    public $orderPaidAmount;

    // 客户历史交易信息
    /**
     * @example 
     * @var HisTranInfo[]
     */
    public $hisTranInfo;

}
