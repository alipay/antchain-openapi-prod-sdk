<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateBclOrderRequest extends Model
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

    // 订单外部id 商家关联自己的订单,长度不超过64位
    /**
     * @var string
     */
    public $orderOuterId;

    // 商家租赁订单创建时间,长度不超过32位
    /**
     * @var string
     */
    public $orderCreateTime;

    // 承租人用户信息
    /**
     * @var BclUserInfo
     */
    public $userInfo;

    // 到期形式
    // DUE_BUYOUT 到期买断
    // DUE_RETURN 到期归还
    /**
     * @var string
     */
    public $dueMode;

    // 租金总额 单位分
    /**
     * @var int
     */
    public $totalRentMoney;

    // 订单租期, 比如6期,12期,24期,36期,填数字
    /**
     * @var int
     */
    public $rentTerm;

    // 订单租期对应的单位,如果是租期为6,租期单位为MONTH,代表租6个月
    // 月: MONTH
    /**
     * @var string
     */
    public $rentUnit;

    // 到期买断价 单位分，若为买断形式传买断金额，否则传到期归还金额
    /**
     * @var int
     */
    public $buyOutPrice;

    // 芝麻信用 订单免押金额  单位分
    /**
     * @var int
     */
    public $depositFree;

    // 芝麻信用 实际预授权金额  单位分
    /**
     * @var int
     */
    public $acutalPreAuthFree;

    // 网商代扣协议号或预授权协议号,网商代扣和预授权必填,长度不超过64位
    /**
     * @var string
     */
    public $mybankAgreementNo;

    // 网商代扣受理订单号,网商代扣必填,长度不超过64位
    /**
     * @var string
     */
    public $mybankAgreementOrderId;

    // 用英文单词替代数字
    // -网商代扣：MY_BANK_PROXY_WITHHOLDING
    // -合同代扣：CONTRACT_PROXY_WITHHOLDING
    /**
     * @var string
     */
    public $orderWithholdType;

    // 首付款金额 单位分
    /**
     * @var int
     */
    public $downPayment;

    // 承诺详情,选择代扣是非必填, 按期数从小到大且连续排序
    /**
     * @var BclCreatePromiseDetailInfo[]
     */
    public $promiseDetails;

    // 物流方式：
    // POST 邮寄
    // OFFLINE 线下自取
    /**
     * @var string
     */
    public $logisticType;

    // 商品列表
    /**
     * @var BclOrderProductInfo[]
     */
    public $productInfos;

    // - 实名：REAL_PERSON,
    // - 风控：RISK,
    /**
     * @var string[]
     */
    public $serviceTypes;

    // 用户下单时候的ip地址,如果可选服务选择了风控,必填 ,长度不超过32位
    /**
     * @var string
     */
    public $userIp;

    // 承租人实人认证完成后回跳地址(比如商户小程序下单地址),选择实人认证服务时必填
    /**
     * @var string
     */
    public $realPersonReturnUrl;

    // 签署流程信息，如果使用租赁代扣创建则必填
    /**
     * @var BclContractFlowInfo
     */
    public $contractFlowInfo;

    // 资方定义订单的其他额外字段，以json形式传递, 如果需要一键融资,则必填,长度不超过4096位
    /**
     * @var string
     */
    public $orderExtraInfo;

    // 资方定义用户的其他额外字段，以json形式传递, 如果需要一键融资,则必填,长度不超过4096位
    /**
     * @var string
     */
    public $userExtraInfo;
    protected $_name = [
        'authToken'              => 'auth_token',
        'productInstanceId'      => 'product_instance_id',
        'orderOuterId'           => 'order_outer_id',
        'orderCreateTime'        => 'order_create_time',
        'userInfo'               => 'user_info',
        'dueMode'                => 'due_mode',
        'totalRentMoney'         => 'total_rent_money',
        'rentTerm'               => 'rent_term',
        'rentUnit'               => 'rent_unit',
        'buyOutPrice'            => 'buy_out_price',
        'depositFree'            => 'deposit_free',
        'acutalPreAuthFree'      => 'acutal_pre_auth_free',
        'mybankAgreementNo'      => 'mybank_agreement_no',
        'mybankAgreementOrderId' => 'mybank_agreement_order_id',
        'orderWithholdType'      => 'order_withhold_type',
        'downPayment'            => 'down_payment',
        'promiseDetails'         => 'promise_details',
        'logisticType'           => 'logistic_type',
        'productInfos'           => 'product_infos',
        'serviceTypes'           => 'service_types',
        'userIp'                 => 'user_ip',
        'realPersonReturnUrl'    => 'real_person_return_url',
        'contractFlowInfo'       => 'contract_flow_info',
        'orderExtraInfo'         => 'order_extra_info',
        'userExtraInfo'          => 'user_extra_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderOuterId', $this->orderOuterId, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validateRequired('dueMode', $this->dueMode, true);
        Model::validateRequired('totalRentMoney', $this->totalRentMoney, true);
        Model::validateRequired('rentTerm', $this->rentTerm, true);
        Model::validateRequired('rentUnit', $this->rentUnit, true);
        Model::validateRequired('orderWithholdType', $this->orderWithholdType, true);
        Model::validateRequired('logisticType', $this->logisticType, true);
        Model::validateRequired('productInfos', $this->productInfos, true);
        Model::validateMaxLength('orderOuterId', $this->orderOuterId, 64);
        Model::validateMaxLength('dueMode', $this->dueMode, 16);
        Model::validateMaxLength('rentUnit', $this->rentUnit, 16);
        Model::validateMaxLength('mybankAgreementNo', $this->mybankAgreementNo, 64);
        Model::validateMaxLength('mybankAgreementOrderId', $this->mybankAgreementOrderId, 64);
        Model::validateMaxLength('orderWithholdType', $this->orderWithholdType, 32);
        Model::validateMaxLength('logisticType', $this->logisticType, 16);
        Model::validateMaxLength('userIp', $this->userIp, 32);
        Model::validateMaxLength('realPersonReturnUrl', $this->realPersonReturnUrl, 512);
        Model::validateMaxLength('orderExtraInfo', $this->orderExtraInfo, 4096);
        Model::validateMaxLength('userExtraInfo', $this->userExtraInfo, 4096);
        Model::validatePattern('orderCreateTime', $this->orderCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validateMinimum('totalRentMoney', $this->totalRentMoney, 1);
        Model::validateMinimum('rentTerm', $this->rentTerm, 1);
        Model::validateMinimum('buyOutPrice', $this->buyOutPrice, 1);
        Model::validateMinimum('depositFree', $this->depositFree, 1);
        Model::validateMinimum('acutalPreAuthFree', $this->acutalPreAuthFree, 1);
        Model::validateMinimum('downPayment', $this->downPayment, 1);
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
        if (null !== $this->orderOuterId) {
            $res['order_outer_id'] = $this->orderOuterId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }
        if (null !== $this->dueMode) {
            $res['due_mode'] = $this->dueMode;
        }
        if (null !== $this->totalRentMoney) {
            $res['total_rent_money'] = $this->totalRentMoney;
        }
        if (null !== $this->rentTerm) {
            $res['rent_term'] = $this->rentTerm;
        }
        if (null !== $this->rentUnit) {
            $res['rent_unit'] = $this->rentUnit;
        }
        if (null !== $this->buyOutPrice) {
            $res['buy_out_price'] = $this->buyOutPrice;
        }
        if (null !== $this->depositFree) {
            $res['deposit_free'] = $this->depositFree;
        }
        if (null !== $this->acutalPreAuthFree) {
            $res['acutal_pre_auth_free'] = $this->acutalPreAuthFree;
        }
        if (null !== $this->mybankAgreementNo) {
            $res['mybank_agreement_no'] = $this->mybankAgreementNo;
        }
        if (null !== $this->mybankAgreementOrderId) {
            $res['mybank_agreement_order_id'] = $this->mybankAgreementOrderId;
        }
        if (null !== $this->orderWithholdType) {
            $res['order_withhold_type'] = $this->orderWithholdType;
        }
        if (null !== $this->downPayment) {
            $res['down_payment'] = $this->downPayment;
        }
        if (null !== $this->promiseDetails) {
            $res['promise_details'] = [];
            if (null !== $this->promiseDetails && \is_array($this->promiseDetails)) {
                $n = 0;
                foreach ($this->promiseDetails as $item) {
                    $res['promise_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->logisticType) {
            $res['logistic_type'] = $this->logisticType;
        }
        if (null !== $this->productInfos) {
            $res['product_infos'] = [];
            if (null !== $this->productInfos && \is_array($this->productInfos)) {
                $n = 0;
                foreach ($this->productInfos as $item) {
                    $res['product_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->serviceTypes) {
            $res['service_types'] = $this->serviceTypes;
        }
        if (null !== $this->userIp) {
            $res['user_ip'] = $this->userIp;
        }
        if (null !== $this->realPersonReturnUrl) {
            $res['real_person_return_url'] = $this->realPersonReturnUrl;
        }
        if (null !== $this->contractFlowInfo) {
            $res['contract_flow_info'] = null !== $this->contractFlowInfo ? $this->contractFlowInfo->toMap() : null;
        }
        if (null !== $this->orderExtraInfo) {
            $res['order_extra_info'] = $this->orderExtraInfo;
        }
        if (null !== $this->userExtraInfo) {
            $res['user_extra_info'] = $this->userExtraInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBclOrderRequest
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
        if (isset($map['order_outer_id'])) {
            $model->orderOuterId = $map['order_outer_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = BclUserInfo::fromMap($map['user_info']);
        }
        if (isset($map['due_mode'])) {
            $model->dueMode = $map['due_mode'];
        }
        if (isset($map['total_rent_money'])) {
            $model->totalRentMoney = $map['total_rent_money'];
        }
        if (isset($map['rent_term'])) {
            $model->rentTerm = $map['rent_term'];
        }
        if (isset($map['rent_unit'])) {
            $model->rentUnit = $map['rent_unit'];
        }
        if (isset($map['buy_out_price'])) {
            $model->buyOutPrice = $map['buy_out_price'];
        }
        if (isset($map['deposit_free'])) {
            $model->depositFree = $map['deposit_free'];
        }
        if (isset($map['acutal_pre_auth_free'])) {
            $model->acutalPreAuthFree = $map['acutal_pre_auth_free'];
        }
        if (isset($map['mybank_agreement_no'])) {
            $model->mybankAgreementNo = $map['mybank_agreement_no'];
        }
        if (isset($map['mybank_agreement_order_id'])) {
            $model->mybankAgreementOrderId = $map['mybank_agreement_order_id'];
        }
        if (isset($map['order_withhold_type'])) {
            $model->orderWithholdType = $map['order_withhold_type'];
        }
        if (isset($map['down_payment'])) {
            $model->downPayment = $map['down_payment'];
        }
        if (isset($map['promise_details'])) {
            if (!empty($map['promise_details'])) {
                $model->promiseDetails = [];
                $n                     = 0;
                foreach ($map['promise_details'] as $item) {
                    $model->promiseDetails[$n++] = null !== $item ? BclCreatePromiseDetailInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['logistic_type'])) {
            $model->logisticType = $map['logistic_type'];
        }
        if (isset($map['product_infos'])) {
            if (!empty($map['product_infos'])) {
                $model->productInfos = [];
                $n                   = 0;
                foreach ($map['product_infos'] as $item) {
                    $model->productInfos[$n++] = null !== $item ? BclOrderProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['service_types'])) {
            if (!empty($map['service_types'])) {
                $model->serviceTypes = $map['service_types'];
            }
        }
        if (isset($map['user_ip'])) {
            $model->userIp = $map['user_ip'];
        }
        if (isset($map['real_person_return_url'])) {
            $model->realPersonReturnUrl = $map['real_person_return_url'];
        }
        if (isset($map['contract_flow_info'])) {
            $model->contractFlowInfo = BclContractFlowInfo::fromMap($map['contract_flow_info']);
        }
        if (isset($map['order_extra_info'])) {
            $model->orderExtraInfo = $map['order_extra_info'];
        }
        if (isset($map['user_extra_info'])) {
            $model->userExtraInfo = $map['user_extra_info'];
        }

        return $model;
    }
}
