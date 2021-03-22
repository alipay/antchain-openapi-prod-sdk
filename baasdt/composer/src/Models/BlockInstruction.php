<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class BlockInstruction extends Model
{
    // 商品兑换单/订单编号
    /**
     * @example Afc982d96fAB65b3a49c
     *
     * @var string
     */
    public $orderId;

    // 交易类型
    /**
     * @example 1
     *
     * @var int
     */
    public $instructionType;

    // 买家的链上账户Id
    /**
     * @example 481055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $buyerAccountId;

    // 卖家的链上账户Id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $sellerAccountId;

    // 平台机构ID
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $platformId;

    // 商品ID
    /**
     * @example 5Afc982d96fAB65b3
     *
     * @var string
     */
    public $goodsId;

    // 商品名称
    /**
     * @example 9cAc8b878184Cb16
     *
     * @var string
     */
    public $displayName;

    // 实际售价(元)
    /**
     * @example 19.00
     *
     * @var string
     */
    public $sellerPrice;

    // 商品面值(元)
    /**
     * @example 20.00
     *
     * @var string
     */
    public $displayPrice;

    // 备注信息
    /**
     * @example 备注信息
     *
     * @var string
     */
    public $memo;

    // 附言
    /**
     * @example 附言
     *
     * @var string
     */
    public $remark;

    // 兑换单状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;

    // 退款状态
    /**
     * @example 0
     *
     * @var int
     */
    public $refundStatus;

    // 交易创建时间
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $createTimestamp;

    // 支付时间
    /**
     * @example 1596896477580
     *
     * @var int
     */
    public $payTimestamp;

    // 交易附属信息
    /**
     * @example
     *
     * @var MetaDataDO[]
     */
    public $extraData;

    // 交易token来源信息
    /**
     * @example
     *
     * @var TokenInstructionDO[]
     */
    public $tokenInstructions;

    // 关联交易ID
    /**
     * @example 20200707123456
     *
     * @var string
     */
    public $relatedOrderId;

    // 手续费token数量
    /**
     * @example 10000000000
     *
     * @var string
     */
    public $commissionToken;

    // 卖家收到的token数量
    /**
     * @example 100000000000000
     *
     * @var string
     */
    public $sellerReceiveToken;

    // 支付类型：买家支付，卖家支付
    /**
     * @example 0
     *
     * @var int
     */
    public $payCommissionType;

    // 买家手机号
    /**
     * @example 12345678900
     *
     * @var string
     */
    public $buyerPhone;

    // 买家名称
    /**
     * @example 张**
     *
     * @var string
     */
    public $buyerName;

    // 买家身份信息
    /**
     * @example 3452375452476349760974263476203764
     *
     * @var string
     */
    public $buyerIdNumber;

    // 买家身份信息类型
    /**
     * @example 1
     *
     * @var string
     */
    public $buyerIdType;

    // 买家IP
    /**
     * @example 10.10.10.10
     *
     * @var string
     */
    public $buyeIp;

    // 订单原始创建时间，外部传入
    /**
     * @example 1594896477580
     *
     * @var int
     */
    public $originCreateTime;

    // 订单原始订单ID，外部传入
    /**
     * @example origin20200707123456
     *
     * @var string
     */
    public $originOrderId;
    protected $_name = [
        'orderId'            => 'order_id',
        'instructionType'    => 'instruction_type',
        'buyerAccountId'     => 'buyer_account_id',
        'sellerAccountId'    => 'seller_account_id',
        'platformId'         => 'platform_id',
        'goodsId'            => 'goods_id',
        'displayName'        => 'display_name',
        'sellerPrice'        => 'seller_price',
        'displayPrice'       => 'display_price',
        'memo'               => 'memo',
        'remark'             => 'remark',
        'status'             => 'status',
        'refundStatus'       => 'refund_status',
        'createTimestamp'    => 'create_timestamp',
        'payTimestamp'       => 'pay_timestamp',
        'extraData'          => 'extra_data',
        'tokenInstructions'  => 'token_instructions',
        'relatedOrderId'     => 'related_order_id',
        'commissionToken'    => 'commission_token',
        'sellerReceiveToken' => 'seller_receive_token',
        'payCommissionType'  => 'pay_commission_type',
        'buyerPhone'         => 'buyer_phone',
        'buyerName'          => 'buyer_name',
        'buyerIdNumber'      => 'buyer_id_number',
        'buyerIdType'        => 'buyer_id_type',
        'buyeIp'             => 'buye_ip',
        'originCreateTime'   => 'origin_create_time',
        'originOrderId'      => 'origin_order_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('instructionType', $this->instructionType, true);
        Model::validateRequired('buyerAccountId', $this->buyerAccountId, true);
        Model::validateRequired('sellerAccountId', $this->sellerAccountId, true);
        Model::validateRequired('platformId', $this->platformId, true);
        Model::validateRequired('goodsId', $this->goodsId, true);
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('sellerPrice', $this->sellerPrice, true);
        Model::validateRequired('displayPrice', $this->displayPrice, true);
        Model::validateRequired('memo', $this->memo, true);
        Model::validateRequired('remark', $this->remark, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('refundStatus', $this->refundStatus, true);
        Model::validateRequired('createTimestamp', $this->createTimestamp, true);
        Model::validateRequired('payTimestamp', $this->payTimestamp, true);
        Model::validateRequired('extraData', $this->extraData, true);
        Model::validateRequired('tokenInstructions', $this->tokenInstructions, true);
        Model::validateRequired('relatedOrderId', $this->relatedOrderId, true);
        Model::validateRequired('commissionToken', $this->commissionToken, true);
        Model::validateRequired('sellerReceiveToken', $this->sellerReceiveToken, true);
        Model::validateRequired('payCommissionType', $this->payCommissionType, true);
        Model::validateRequired('buyerPhone', $this->buyerPhone, true);
        Model::validateRequired('buyerName', $this->buyerName, true);
        Model::validateRequired('buyerIdNumber', $this->buyerIdNumber, true);
        Model::validateRequired('buyerIdType', $this->buyerIdType, true);
        Model::validateRequired('buyeIp', $this->buyeIp, true);
        Model::validateRequired('originCreateTime', $this->originCreateTime, true);
        Model::validateRequired('originOrderId', $this->originOrderId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->instructionType) {
            $res['instruction_type'] = $this->instructionType;
        }
        if (null !== $this->buyerAccountId) {
            $res['buyer_account_id'] = $this->buyerAccountId;
        }
        if (null !== $this->sellerAccountId) {
            $res['seller_account_id'] = $this->sellerAccountId;
        }
        if (null !== $this->platformId) {
            $res['platform_id'] = $this->platformId;
        }
        if (null !== $this->goodsId) {
            $res['goods_id'] = $this->goodsId;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->sellerPrice) {
            $res['seller_price'] = $this->sellerPrice;
        }
        if (null !== $this->displayPrice) {
            $res['display_price'] = $this->displayPrice;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->refundStatus) {
            $res['refund_status'] = $this->refundStatus;
        }
        if (null !== $this->createTimestamp) {
            $res['create_timestamp'] = $this->createTimestamp;
        }
        if (null !== $this->payTimestamp) {
            $res['pay_timestamp'] = $this->payTimestamp;
        }
        if (null !== $this->extraData) {
            $res['extra_data'] = [];
            if (null !== $this->extraData && \is_array($this->extraData)) {
                $n = 0;
                foreach ($this->extraData as $item) {
                    $res['extra_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->tokenInstructions) {
            $res['token_instructions'] = [];
            if (null !== $this->tokenInstructions && \is_array($this->tokenInstructions)) {
                $n = 0;
                foreach ($this->tokenInstructions as $item) {
                    $res['token_instructions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->relatedOrderId) {
            $res['related_order_id'] = $this->relatedOrderId;
        }
        if (null !== $this->commissionToken) {
            $res['commission_token'] = $this->commissionToken;
        }
        if (null !== $this->sellerReceiveToken) {
            $res['seller_receive_token'] = $this->sellerReceiveToken;
        }
        if (null !== $this->payCommissionType) {
            $res['pay_commission_type'] = $this->payCommissionType;
        }
        if (null !== $this->buyerPhone) {
            $res['buyer_phone'] = $this->buyerPhone;
        }
        if (null !== $this->buyerName) {
            $res['buyer_name'] = $this->buyerName;
        }
        if (null !== $this->buyerIdNumber) {
            $res['buyer_id_number'] = $this->buyerIdNumber;
        }
        if (null !== $this->buyerIdType) {
            $res['buyer_id_type'] = $this->buyerIdType;
        }
        if (null !== $this->buyeIp) {
            $res['buye_ip'] = $this->buyeIp;
        }
        if (null !== $this->originCreateTime) {
            $res['origin_create_time'] = $this->originCreateTime;
        }
        if (null !== $this->originOrderId) {
            $res['origin_order_id'] = $this->originOrderId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BlockInstruction
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['instruction_type'])) {
            $model->instructionType = $map['instruction_type'];
        }
        if (isset($map['buyer_account_id'])) {
            $model->buyerAccountId = $map['buyer_account_id'];
        }
        if (isset($map['seller_account_id'])) {
            $model->sellerAccountId = $map['seller_account_id'];
        }
        if (isset($map['platform_id'])) {
            $model->platformId = $map['platform_id'];
        }
        if (isset($map['goods_id'])) {
            $model->goodsId = $map['goods_id'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['seller_price'])) {
            $model->sellerPrice = $map['seller_price'];
        }
        if (isset($map['display_price'])) {
            $model->displayPrice = $map['display_price'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['refund_status'])) {
            $model->refundStatus = $map['refund_status'];
        }
        if (isset($map['create_timestamp'])) {
            $model->createTimestamp = $map['create_timestamp'];
        }
        if (isset($map['pay_timestamp'])) {
            $model->payTimestamp = $map['pay_timestamp'];
        }
        if (isset($map['extra_data'])) {
            if (!empty($map['extra_data'])) {
                $model->extraData = [];
                $n                = 0;
                foreach ($map['extra_data'] as $item) {
                    $model->extraData[$n++] = null !== $item ? MetaDataDO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['token_instructions'])) {
            if (!empty($map['token_instructions'])) {
                $model->tokenInstructions = [];
                $n                        = 0;
                foreach ($map['token_instructions'] as $item) {
                    $model->tokenInstructions[$n++] = null !== $item ? TokenInstructionDO::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['related_order_id'])) {
            $model->relatedOrderId = $map['related_order_id'];
        }
        if (isset($map['commission_token'])) {
            $model->commissionToken = $map['commission_token'];
        }
        if (isset($map['seller_receive_token'])) {
            $model->sellerReceiveToken = $map['seller_receive_token'];
        }
        if (isset($map['pay_commission_type'])) {
            $model->payCommissionType = $map['pay_commission_type'];
        }
        if (isset($map['buyer_phone'])) {
            $model->buyerPhone = $map['buyer_phone'];
        }
        if (isset($map['buyer_name'])) {
            $model->buyerName = $map['buyer_name'];
        }
        if (isset($map['buyer_id_number'])) {
            $model->buyerIdNumber = $map['buyer_id_number'];
        }
        if (isset($map['buyer_id_type'])) {
            $model->buyerIdType = $map['buyer_id_type'];
        }
        if (isset($map['buye_ip'])) {
            $model->buyeIp = $map['buye_ip'];
        }
        if (isset($map['origin_create_time'])) {
            $model->originCreateTime = $map['origin_create_time'];
        }
        if (isset($map['origin_order_id'])) {
            $model->originOrderId = $map['origin_order_id'];
        }

        return $model;
    }
}
