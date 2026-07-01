<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class QueryLeaseOrderdetailinfoResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 融资租赁订单id
    /**
     * @var string
     */
    public $orderId;

    // 订单创建时间
    /**
     * @var string
     */
    public $orderCreateTime;

    // 订单支付时间 格式为
    /**
     * @var string
     */
    public $orderPayTime;

    // 支付订单id
    /**
     * @var string
     */
    public $orderPayId;

    // 订单支付类型 1 预授权，2信用套餐，3支付宝代扣，4其他，5网商直付通代扣
    /**
     * @var int
     */
    public $orderPayType;

    // 免押金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $depositFree;

    // 实际预授权金额，芝麻信用免押金额 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $acutalPreAuthFree;

    // 租期单位月
    /**
     * @var int
     */
    public $rentTerm;

    // 月租金 精确到毫厘，即123400表示12.34元
    /**
     * @var int
     */
    public $rentPricePerMonth;

    // 到期买断价
    /**
     * @var int
     */
    public $buyOutPrice;

    // 承租人收货地址
    /**
     * @var string
     */
    public $userAddress;

    // 省份编码
    /**
     * @var string
     */
    public $provinceCode;

    // 城市编码
    /**
     * @var string
     */
    public $cityCode;

    // 地区编码
    /**
     * @var string
     */
    public $districtCode;

    // 租赁合同链接
    /**
     * @var string
     */
    public $rentContractUrl;

    // 保险单号
    /**
     * @var string
     */
    public $insuranceNumber;

    // 保险链接
    /**
     * @var string
     */
    public $insuranceUrl;

    // 采购合同协议
    /**
     * @var string
     */
    public $purchaseContractUrl;

    // 蚁盾分数
    /**
     * @var int
     */
    public $yidunScore;

    // 物流订单id
    /**
     * @var string
     */
    public $outStoreDeliverNumber;

    // 物流发货时间
    /**
     * @var string
     */
    public $outStoreTime;
    protected $_name = [
        'reqMsgId'              => 'req_msg_id',
        'resultCode'            => 'result_code',
        'resultMsg'             => 'result_msg',
        'orderId'               => 'order_id',
        'orderCreateTime'       => 'order_create_time',
        'orderPayTime'          => 'order_pay_time',
        'orderPayId'            => 'order_pay_id',
        'orderPayType'          => 'order_pay_type',
        'depositFree'           => 'deposit_free',
        'acutalPreAuthFree'     => 'acutal_pre_auth_free',
        'rentTerm'              => 'rent_term',
        'rentPricePerMonth'     => 'rent_price_per_month',
        'buyOutPrice'           => 'buy_out_price',
        'userAddress'           => 'user_address',
        'provinceCode'          => 'province_code',
        'cityCode'              => 'city_code',
        'districtCode'          => 'district_code',
        'rentContractUrl'       => 'rent_contract_url',
        'insuranceNumber'       => 'insurance_number',
        'insuranceUrl'          => 'insurance_url',
        'purchaseContractUrl'   => 'purchase_contract_url',
        'yidunScore'            => 'yidun_score',
        'outStoreDeliverNumber' => 'out_store_deliver_number',
        'outStoreTime'          => 'out_store_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->orderPayTime) {
            $res['order_pay_time'] = $this->orderPayTime;
        }
        if (null !== $this->orderPayId) {
            $res['order_pay_id'] = $this->orderPayId;
        }
        if (null !== $this->orderPayType) {
            $res['order_pay_type'] = $this->orderPayType;
        }
        if (null !== $this->depositFree) {
            $res['deposit_free'] = $this->depositFree;
        }
        if (null !== $this->acutalPreAuthFree) {
            $res['acutal_pre_auth_free'] = $this->acutalPreAuthFree;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentPricePerMonth) {
            $res['rent_price_per_month'] = $this->rentPricePerMonth;
        }
        if (null !== $this->buyOutPrice) {
            $res['buy_out_price'] = $this->buyOutPrice;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->provinceCode) {
            $res['province_code'] = $this->provinceCode;
        }
        if (null !== $this->cityCode) {
            $res['city_code'] = $this->cityCode;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->rentContractUrl) {
            $res['rent_contract_url'] = $this->rentContractUrl;
        }
        if (null !== $this->insuranceNumber) {
            $res['insurance_number'] = $this->insuranceNumber;
        }
        if (null !== $this->insuranceUrl) {
            $res['insurance_url'] = $this->insuranceUrl;
        }
        if (null !== $this->purchaseContractUrl) {
            $res['purchase_contract_url'] = $this->purchaseContractUrl;
        }
        if (null !== $this->yidunScore) {
            $res['yidun_score'] = $this->yidunScore;
        }
        if (null !== $this->outStoreDeliverNumber) {
            $res['out_store_deliver_number'] = $this->outStoreDeliverNumber;
        }
        if (null !== $this->outStoreTime) {
            $res['out_store_time'] = $this->outStoreTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryLeaseOrderdetailinfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['order_pay_time'])) {
            $model->orderPayTime = $map['order_pay_time'];
        }
        if (isset($map['order_pay_id'])) {
            $model->orderPayId = $map['order_pay_id'];
        }
        if (isset($map['order_pay_type'])) {
            $model->orderPayType = $map['order_pay_type'];
        }
        if (isset($map['deposit_free'])) {
            $model->depositFree = $map['deposit_free'];
        }
        if (isset($map['acutal_pre_auth_free'])) {
            $model->acutalPreAuthFree = $map['acutal_pre_auth_free'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rent_price_per_month'])) {
            $model->rentPricePerMonth = $map['rent_price_per_month'];
        }
        if (isset($map['buy_out_price'])) {
            $model->buyOutPrice = $map['buy_out_price'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['province_code'])) {
            $model->provinceCode = $map['province_code'];
        }
        if (isset($map['city_code'])) {
            $model->cityCode = $map['city_code'];
        }
        if (isset($map['district_code'])) {
            $model->districtCode = $map['district_code'];
        }
        if (isset($map['rent_contract_url'])) {
            $model->rentContractUrl = $map['rent_contract_url'];
        }
        if (isset($map['insurance_number'])) {
            $model->insuranceNumber = $map['insurance_number'];
        }
        if (isset($map['insurance_url'])) {
            $model->insuranceUrl = $map['insurance_url'];
        }
        if (isset($map['purchase_contract_url'])) {
            $model->purchaseContractUrl = $map['purchase_contract_url'];
        }
        if (isset($map['yidun_score'])) {
            $model->yidunScore = $map['yidun_score'];
        }
        if (isset($map['out_store_deliver_number'])) {
            $model->outStoreDeliverNumber = $map['out_store_deliver_number'];
        }
        if (isset($map['out_store_time'])) {
            $model->outStoreTime = $map['out_store_time'];
        }

        return $model;
    }
}
