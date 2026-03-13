<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CreateAgoraxTradeRequest extends Model
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

    // 商户编号
    /**
     * @var string
     */
    public $externalId;

    // 支付类型
    /**
     * @var string
     */
    public $payType;

    // 商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 订单总金额（元）
    /**
     * @var string
     */
    public $totalAmount;

    // 订单标题
    /**
     * @var string
     */
    public $subject;

    // 描述结算信息
    /**
     * @var SettleInfo
     */
    public $settleInfo;

    // 买家支付宝 openid
    /**
     * @var string
     */
    public $buyerOpenId;

    // 产品码
    /**
     * @var string
     */
    public $productCode;

    // 支付授权码
    /**
     * @var string
     */
    public $authCode;

    // 支付场景
    /**
     * @var string
     */
    public $scene;

    // 商户实际经营主体的小程序应用的 appid
    /**
     * @var string
     */
    public $opAppId;

    // 分账明细信息
    /**
     * @var OpenApiRoyaltyDetailInfoPojo[]
     */
    public $royaltyParameters;

    // 卖家支付宝用户 ID
    /**
     * @var string
     */
    public $sellerId;

    // 订单包含的商品列表信息
    /**
     * @var GoodsDetail[]
     */
    public $goodsDetails;

    // 订单绝对超时时间
    /**
     * @var string
     */
    public $timeExpire;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externalId'        => 'external_id',
        'payType'           => 'pay_type',
        'outTradeNo'        => 'out_trade_no',
        'totalAmount'       => 'total_amount',
        'subject'           => 'subject',
        'settleInfo'        => 'settle_info',
        'buyerOpenId'       => 'buyer_open_id',
        'productCode'       => 'product_code',
        'authCode'          => 'auth_code',
        'scene'             => 'scene',
        'opAppId'           => 'op_app_id',
        'royaltyParameters' => 'royalty_parameters',
        'sellerId'          => 'seller_id',
        'goodsDetails'      => 'goods_details',
        'timeExpire'        => 'time_expire',
    ];

    public function validate()
    {
        Model::validateRequired('externalId', $this->externalId, true);
        Model::validateRequired('payType', $this->payType, true);
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('totalAmount', $this->totalAmount, true);
        Model::validateRequired('subject', $this->subject, true);
        Model::validateRequired('settleInfo', $this->settleInfo, true);
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
        if (null !== $this->externalId) {
            $res['external_id'] = $this->externalId;
        }
        if (null !== $this->payType) {
            $res['pay_type'] = $this->payType;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->totalAmount) {
            $res['total_amount'] = $this->totalAmount;
        }
        if (null !== $this->subject) {
            $res['subject'] = $this->subject;
        }
        if (null !== $this->settleInfo) {
            $res['settle_info'] = null !== $this->settleInfo ? $this->settleInfo->toMap() : null;
        }
        if (null !== $this->buyerOpenId) {
            $res['buyer_open_id'] = $this->buyerOpenId;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        if (null !== $this->authCode) {
            $res['auth_code'] = $this->authCode;
        }
        if (null !== $this->scene) {
            $res['scene'] = $this->scene;
        }
        if (null !== $this->opAppId) {
            $res['op_app_id'] = $this->opAppId;
        }
        if (null !== $this->royaltyParameters) {
            $res['royalty_parameters'] = [];
            if (null !== $this->royaltyParameters && \is_array($this->royaltyParameters)) {
                $n = 0;
                foreach ($this->royaltyParameters as $item) {
                    $res['royalty_parameters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->sellerId) {
            $res['seller_id'] = $this->sellerId;
        }
        if (null !== $this->goodsDetails) {
            $res['goods_details'] = [];
            if (null !== $this->goodsDetails && \is_array($this->goodsDetails)) {
                $n = 0;
                foreach ($this->goodsDetails as $item) {
                    $res['goods_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->timeExpire) {
            $res['time_expire'] = $this->timeExpire;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAgoraxTradeRequest
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
        if (isset($map['external_id'])) {
            $model->externalId = $map['external_id'];
        }
        if (isset($map['pay_type'])) {
            $model->payType = $map['pay_type'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['total_amount'])) {
            $model->totalAmount = $map['total_amount'];
        }
        if (isset($map['subject'])) {
            $model->subject = $map['subject'];
        }
        if (isset($map['settle_info'])) {
            $model->settleInfo = SettleInfo::fromMap($map['settle_info']);
        }
        if (isset($map['buyer_open_id'])) {
            $model->buyerOpenId = $map['buyer_open_id'];
        }
        if (isset($map['product_code'])) {
            $model->productCode = $map['product_code'];
        }
        if (isset($map['auth_code'])) {
            $model->authCode = $map['auth_code'];
        }
        if (isset($map['scene'])) {
            $model->scene = $map['scene'];
        }
        if (isset($map['op_app_id'])) {
            $model->opAppId = $map['op_app_id'];
        }
        if (isset($map['royalty_parameters'])) {
            if (!empty($map['royalty_parameters'])) {
                $model->royaltyParameters = [];
                $n                        = 0;
                foreach ($map['royalty_parameters'] as $item) {
                    $model->royaltyParameters[$n++] = null !== $item ? OpenApiRoyaltyDetailInfoPojo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['seller_id'])) {
            $model->sellerId = $map['seller_id'];
        }
        if (isset($map['goods_details'])) {
            if (!empty($map['goods_details'])) {
                $model->goodsDetails = [];
                $n                   = 0;
                foreach ($map['goods_details'] as $item) {
                    $model->goodsDetails[$n++] = null !== $item ? GoodsDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['time_expire'])) {
            $model->timeExpire = $map['time_expire'];
        }

        return $model;
    }
}
