<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_2abe765c32934341bd9bb6cc1c8ff589\Models;

use AlibabaCloud\Tea\Model;

class OrderInfo extends Model
{
    // 订单 id
    /**
     * @example order_v1_test_0918_001
     *
     * @var string
     */
    public $orderId;

    // 订单创建时间，格式为2019-08-31 12:00:00
    /**
     * @example 2019-08-31 12:00:00
     *
     * @var string
     */
    public $orderCreateTime;

    // 订单支付时间，格式为 2019-08-31 12:00:00
    /**
     * @example 2019-08-31 12:00:00
     *
     * @var string
     */
    public $orderPayTime;

    // 订单支付 id
    /**
     * @example 330102
     *
     * @var string
     */
    public $orderPayId;

    // 订单支付类型；1:预授权，2:信用套餐，3:支付宝代扣，4:其他，5:网商直付通代扣，6:网商委托代扣
    /**
     * @example 1
     *
     * @var int
     */
    public $orderPayType;

    // 订单支付主题
    /**
     * @example 集成测试订单
     *
     * @var string
     */
    public $orderPaySubject;

    // 租期，单位：月
    /**
     * @example 1
     *
     * @var int
     */
    public $rentTerm;

    // 月租金 精确到分，即 1234 表示 12.34 元
    /**
     * @example 1234
     *
     * @var int
     */
    public $rentPricePerMonth;

    // 到期买断价 精确到分，即 1234 表示 12.34 元
    /**
     * @example 1234
     *
     * @var int
     */
    public $buyOutPrice;

    // 租赁合同,需要客户自己提供合并的 url
    /**
     * @example https://www.alipay.com
     *
     * @var string
     */
    public $leaseContractUrl;

    // 仓库类型；1: 实体仓 2: 虚拟仓
    /**
     * @example 1
     *
     * @var int
     */
    public $storeType;

    // 承租人收货地址
    /**
     * @example  四川省成都市高新区益州大道中段1999号成都银泰城F1
     *
     * @var string
     */
    public $userAddress;

    // 供应商在金融科技对应的租户 id，若填写此字段，则会走供应商模式
    /**
     * @example TEST_TNT
     *
     * @var string
     */
    public $supplierIsvAccount;

    // 省份编码
    /**
     * @example 510000
     *
     * @var string
     */
    public $provinceCode;

    // 城市编码
    /**
     * @example 654221
     *
     * @var string
     */
    public $cityCode;

    // 地区码
    /**
     * @example 520526
     *
     * @var string
     */
    public $districtCode;

    // 到期形式；1:到期买断 2:到期归还
    /**
     * @example 1
     *
     * @var int
     */
    public $dueMode;

    // 租赁合同 id，可用作幂等
    /**
     * @example 001
     *
     * @var string
     */
    public $contractId;

    // 租金总额，精确到分，即 1234 表示 12.34 元
    /**
     * @example 1234
     *
     * @var int
     */
    public $totalRentMoney;

    // 保险单号
    /**
     * @example 0098493
     *
     * @var string
     */
    public $insuranceNumber;

    // 保险地址
    /**
     * @example 四川省成都市
     *
     * @var string
     */
    public $insuranceUrl;

    // 蚁盾分数
    /**
     * @example 83
     *
     * @var int
     */
    public $yidunScore;

    // 网商直付通模式的代扣协议号，订单类型为网商直付通模式为必填
    /**
     * @example 764827372
     *
     * @var string
     */
    public $agreementNo;

    // 直付通代扣受理订单号，订单类型为网商直付通模式为必填
    /**
     * @example xxxx
     *
     * @var string
     */
    public $agreementOrderId;

    // 首付款金额, 精确到分，即 1234 表示 12.34 元，订单类型为网商直付通模式为必填
    /**
     * @example 1234
     *
     * @var int
     */
    public $downPayment;

    // 订单付款内容描述
    /**
     * @example 集成测试订单内容
     *
     * @var string
     */
    public $orderPayBody;

    // 额外信息
    /**
     * @example {"discount":8}
     *
     * @var string
     */
    public $extraInfo;
    protected $_name = [
        'orderId'            => 'order_id',
        'orderCreateTime'    => 'order_create_time',
        'orderPayTime'       => 'order_pay_time',
        'orderPayId'         => 'order_pay_id',
        'orderPayType'       => 'order_pay_type',
        'orderPaySubject'    => 'order_pay_subject',
        'rentTerm'           => 'rent_term',
        'rentPricePerMonth'  => 'rent_price_per_month',
        'buyOutPrice'        => 'buy_out_price',
        'leaseContractUrl'   => 'lease_contract_url',
        'storeType'          => 'store_type',
        'userAddress'        => 'user_address',
        'supplierIsvAccount' => 'supplier_isv_account',
        'provinceCode'       => 'province_code',
        'cityCode'           => 'city_code',
        'districtCode'       => 'district_code',
        'dueMode'            => 'due_mode',
        'contractId'         => 'contract_id',
        'totalRentMoney'     => 'total_rent_money',
        'insuranceNumber'    => 'insurance_number',
        'insuranceUrl'       => 'insurance_url',
        'yidunScore'         => 'yidun_score',
        'agreementNo'        => 'agreement_no',
        'agreementOrderId'   => 'agreement_order_id',
        'downPayment'        => 'down_payment',
        'orderPayBody'       => 'order_pay_body',
        'extraInfo'          => 'extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('orderPayTime', $this->orderPayTime, true);
        Model::validateRequired('orderPayId', $this->orderPayId, true);
        Model::validateRequired('orderPayType', $this->orderPayType, true);
        Model::validateRequired('orderPaySubject', $this->orderPaySubject, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('rentPricePerMonth', $this->rentPricePerMonth, true);
        Model::validateRequired('buyOutPrice', $this->buyOutPrice, true);
        Model::validateRequired('leaseContractUrl', $this->leaseContractUrl, true);
        Model::validateRequired('storeType', $this->storeType, true);
        Model::validateRequired('userAddress', $this->userAddress, true);
        Model::validateRequired('supplierIsvAccount', $this->supplierIsvAccount, true);
        Model::validateRequired('provinceCode', $this->provinceCode, true);
        Model::validateRequired('cityCode', $this->cityCode, true);
        Model::validateRequired('districtCode', $this->districtCode, true);
        Model::validateRequired('dueMode', $this->dueMode, true);
        Model::validateRequired('totalRentMoney', $this->totalRentMoney, true);
        Model::validateMaxLength('orderId', $this->orderId, 50);
        Model::validateMaxLength('orderPayId', $this->orderPayId, 50);
        Model::validateMaxLength('orderPaySubject', $this->orderPaySubject, 500);
        Model::validateMaxLength('leaseContractUrl', $this->leaseContractUrl, 1000);
        Model::validateMaxLength('userAddress', $this->userAddress, 100);
        Model::validateMaxLength('supplierIsvAccount', $this->supplierIsvAccount, 100);
        Model::validateMaxLength('contractId', $this->contractId, 100);
        Model::validateMaxLength('insuranceNumber', $this->insuranceNumber, 100);
        Model::validateMaxLength('insuranceUrl', $this->insuranceUrl, 1000);
        Model::validateMaxLength('agreementNo', $this->agreementNo, 100);
        Model::validateMaxLength('agreementOrderId', $this->agreementOrderId, 100);
        Model::validateMaxLength('orderPayBody', $this->orderPayBody, 500);
        Model::validateMinLength('orderId', $this->orderId, 1);
        Model::validateMinLength('orderPayId', $this->orderPayId, 1);
        Model::validateMinLength('orderPaySubject', $this->orderPaySubject, 1);
        Model::validateMinLength('leaseContractUrl', $this->leaseContractUrl, 1);
        Model::validateMinLength('userAddress', $this->userAddress, 1);
        Model::validateMinLength('supplierIsvAccount', $this->supplierIsvAccount, 1);
        Model::validateMinLength('contractId', $this->contractId, 0);
        Model::validateMinLength('insuranceNumber', $this->insuranceNumber, 0);
        Model::validateMinLength('insuranceUrl', $this->insuranceUrl, 0);
        Model::validateMinLength('agreementNo', $this->agreementNo, 0);
        Model::validateMinLength('agreementOrderId', $this->agreementOrderId, 0);
        Model::validateMinLength('orderPayBody', $this->orderPayBody, 0);
        Model::validateMinimum('rentTerm', $this->rentTerm, 1);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->orderPaySubject) {
            $res['order_pay_subject'] = $this->orderPaySubject;
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
        if (null !== $this->leaseContractUrl) {
            $res['lease_contract_url'] = $this->leaseContractUrl;
        }
        if (null !== $this->storeType) {
            $res['store_type'] = $this->storeType;
        }
        if (null !== $this->userAddress) {
            $res['user_address'] = $this->userAddress;
        }
        if (null !== $this->supplierIsvAccount) {
            $res['supplier_isv_account'] = $this->supplierIsvAccount;
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
        if (null !== $this->dueMode) {
            $res['due_mode'] = $this->dueMode;
        }
        if (null !== $this->contractId) {
            $res['contract_id'] = $this->contractId;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->insuranceNumber) {
            $res['insurance_number'] = $this->insuranceNumber;
        }
        if (null !== $this->insuranceUrl) {
            $res['insurance_url'] = $this->insuranceUrl;
        }
        if (null !== $this->yidunScore) {
            $res['yidun_score'] = $this->yidunScore;
        }
        if (null !== $this->agreementNo) {
            $res['agreement_no'] = $this->agreementNo;
        }
        if (null !== $this->agreementOrderId) {
            $res['agreement_order_id'] = $this->agreementOrderId;
        }
        if (null !== $this->downPayment) {
            $res['down_payment'] = $this->downPayment;
        }
        if (null !== $this->orderPayBody) {
            $res['order_pay_body'] = $this->orderPayBody;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['order_pay_subject'])) {
            $model->orderPaySubject = $map['order_pay_subject'];
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
        if (isset($map['lease_contract_url'])) {
            $model->leaseContractUrl = $map['lease_contract_url'];
        }
        if (isset($map['store_type'])) {
            $model->storeType = $map['store_type'];
        }
        if (isset($map['user_address'])) {
            $model->userAddress = $map['user_address'];
        }
        if (isset($map['supplier_isv_account'])) {
            $model->supplierIsvAccount = $map['supplier_isv_account'];
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
        if (isset($map['due_mode'])) {
            $model->dueMode = $map['due_mode'];
        }
        if (isset($map['contract_id'])) {
            $model->contractId = $map['contract_id'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['insurance_number'])) {
            $model->insuranceNumber = $map['insurance_number'];
        }
        if (isset($map['insurance_url'])) {
            $model->insuranceUrl = $map['insurance_url'];
        }
        if (isset($map['yidun_score'])) {
            $model->yidunScore = $map['yidun_score'];
        }
        if (isset($map['agreement_no'])) {
            $model->agreementNo = $map['agreement_no'];
        }
        if (isset($map['agreement_order_id'])) {
            $model->agreementOrderId = $map['agreement_order_id'];
        }
        if (isset($map['down_payment'])) {
            $model->downPayment = $map['down_payment'];
        }
        if (isset($map['order_pay_body'])) {
            $model->orderPayBody = $map['order_pay_body'];
        }
        if (isset($map['extra_info'])) {
            $model->extraInfo = $map['extra_info'];
        }

        return $model;
    }
}
