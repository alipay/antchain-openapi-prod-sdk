<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclOrderInfo extends Model
{
    // 订单外部id,商户自己定义的订单id
    /**
     * @example asdasdqwe123wer
     *
     * @var string
     */
    public $orderOuterId;

    // 订单创建时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $orderCreateTime;

    // DUE_BUYOUT 到期买断
    // DUE_RETURN 到期归还
    /**
     * @example DUE_BUYOUT
     *
     * @var string
     */
    public $dueMode;

    // 订单总金额 单位分
    /**
     * @example 12300
     *
     * @var int
     */
    public $totalMoney;

    // 到期买断价  单位分，
    // 到期金额，若为买断形式传买断金额，否则传到期归还金额
    /**
     * @example 12300
     *
     * @var int
     */
    public $buyOutPrice;

    // 芝麻信用订单免押金额 单位分
    /**
     * @example 10035
     *
     * @var int
     */
    public $depositFree;

    // 芝麻信用 实际预授权金额 单位分
    /**
     * @example 12322
     *
     * @var int
     */
    public $acutalPreAuthFree;

    // 网商直付通模式的代扣协议号
    /**
     * @example ssdsf23324dfsdfsdf
     *
     * @var string
     */
    public $mybankAgreementNo;

    // 直付通代扣受理订单号
    /**
     * @example asdasdqwewqes223
     *
     * @var string
     */
    public $mybankAgreementOrderId;

    // -网商代扣：MY_BANK_PROXY_WITHHOLDING
    // -合同代扣：CONTRACT_PROXY_WITHHOLDING
    /**
     * @example MY_BANK_PROXY_WITHHOLDING
     *
     * @var string
     */
    public $orderWithholdType;

    // 首付款金额 单位分
    /**
     * @example 12323
     *
     * @var int
     */
    public $downPayment;

    // 商品列表
    /**
     * @example SANDBOX12312
     *
     * @var BclOrderProductInfo[]
     */
    public $productInfos;

    // 物流方式： POST 邮寄 OFFLINE 线下自取
    /**
     * @example POST
     *
     * @var string
     */
    public $logisticType;

    // 订单状态
    // 已创建 CREATED
    // 待发起 PRE_SUBMIT
    // 已发起 SUBMIT
    // 履约中 PROMISING
    // 履约完成 PROMISED
    // 订单完结 ORDER_FINISH
    // 风控失败 RISK_FAIL
    // 核身失败 IDENTITY_NOT_MATCH
    // 网商订单核验失败 MY_BANK_VERIFY_FAIL
    // 实人中 PERSON_FACE_VERIFY
    // 实人认证失败 PERSON_FACE_VERIFY_FAIL
    // 订单异常 ORDER_ERROR
    //
    //
    /**
     * @example CREATED
     *
     * @var string
     */
    public $status;

    // 订单状态失败的描述
    /**
     * @example 核身没有通过
     *
     * @var string
     */
    public $statusRemark;

    // 承租方用户信息
    /**
     * @example
     *
     * @var BclUserInfo
     */
    public $userInfo;
    protected $_name = [
        'orderOuterId'           => 'order_outer_id',
        'orderCreateTime'        => 'order_create_time',
        'dueMode'                => 'due_mode',
        'totalMoney'             => 'total_money',
        'buyOutPrice'            => 'buy_out_price',
        'depositFree'            => 'deposit_free',
        'acutalPreAuthFree'      => 'acutal_pre_auth_free',
        'mybankAgreementNo'      => 'mybank_agreement_no',
        'mybankAgreementOrderId' => 'mybank_agreement_order_id',
        'orderWithholdType'      => 'order_withhold_type',
        'downPayment'            => 'down_payment',
        'productInfos'           => 'product_infos',
        'logisticType'           => 'logistic_type',
        'status'                 => 'status',
        'statusRemark'           => 'status_remark',
        'userInfo'               => 'user_info',
    ];

    public function validate()
    {
        Model::validateRequired('orderOuterId', $this->orderOuterId, true);
        Model::validateRequired('orderCreateTime', $this->orderCreateTime, true);
        Model::validateRequired('dueMode', $this->dueMode, true);
        Model::validateRequired('totalMoney', $this->totalMoney, true);
        Model::validateRequired('orderWithholdType', $this->orderWithholdType, true);
        Model::validateRequired('productInfos', $this->productInfos, true);
        Model::validateRequired('logisticType', $this->logisticType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('userInfo', $this->userInfo, true);
        Model::validatePattern('orderCreateTime', $this->orderCreateTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderOuterId) {
            $res['order_outer_id'] = $this->orderOuterId;
        }
        if (null !== $this->orderCreateTime) {
            $res['order_create_time'] = $this->orderCreateTime;
        }
        if (null !== $this->dueMode) {
            $res['due_mode'] = $this->dueMode;
        }
        if (null !== $this->totalMoney) {
            $res['total_money'] = $this->totalMoney;
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
        if (null !== $this->productInfos) {
            $res['product_infos'] = [];
            if (null !== $this->productInfos && \is_array($this->productInfos)) {
                $n = 0;
                foreach ($this->productInfos as $item) {
                    $res['product_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->logisticType) {
            $res['logistic_type'] = $this->logisticType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->statusRemark) {
            $res['status_remark'] = $this->statusRemark;
        }
        if (null !== $this->userInfo) {
            $res['user_info'] = null !== $this->userInfo ? $this->userInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclOrderInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_outer_id'])) {
            $model->orderOuterId = $map['order_outer_id'];
        }
        if (isset($map['order_create_time'])) {
            $model->orderCreateTime = $map['order_create_time'];
        }
        if (isset($map['due_mode'])) {
            $model->dueMode = $map['due_mode'];
        }
        if (isset($map['total_money'])) {
            $model->totalMoney = $map['total_money'];
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
        if (isset($map['product_infos'])) {
            if (!empty($map['product_infos'])) {
                $model->productInfos = [];
                $n                   = 0;
                foreach ($map['product_infos'] as $item) {
                    $model->productInfos[$n++] = null !== $item ? BclOrderProductInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['logistic_type'])) {
            $model->logisticType = $map['logistic_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['status_remark'])) {
            $model->statusRemark = $map['status_remark'];
        }
        if (isset($map['user_info'])) {
            $model->userInfo = BclUserInfo::fromMap($map['user_info']);
        }

        return $model;
    }
}
