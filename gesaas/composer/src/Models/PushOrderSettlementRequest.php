<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GESAAS\Models;

use AlibabaCloud\Tea\Model;

class PushOrderSettlementRequest extends Model
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

    // 请求流水号，由商家自定义。64个字符以内，仅可包含字母、数字、下划线。需保证在商户端不重复
    /**
     * @var string
     */
    public $outRequestNo;

    // 商家产品唯一编码，64个字符以内
    /**
     * @var string
     */
    public $outProductId;

    // 外部订单号，需保证在商家端不重复
    /**
     * @var string
     */
    public $outOrderNo;

    // 支付宝/微信/其他  平台订单号
    /**
     * @var string
     */
    public $tradeNo;

    // 支付渠道类型，枚举值：ALIPAY / WECHAT
    /**
     * @var string
     */
    public $orderType;

    // 订单金额，单位：分（如 990 表示 9.90元）
    /**
     * @var int
     */
    public $orderAmount;

    // 分账模式，目前有两种分账同步执行sync，分账异步执行async，不传默认同步执行
    // 同步执行: sync，异步执行: async
    /**
     * @var string
     */
    public $royaltyMode;

    // 扩展信息
    /**
     * @var string
     */
    public $extInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'outRequestNo'      => 'out_request_no',
        'outProductId'      => 'out_product_id',
        'outOrderNo'        => 'out_order_no',
        'tradeNo'           => 'trade_no',
        'orderType'         => 'order_type',
        'orderAmount'       => 'order_amount',
        'royaltyMode'       => 'royalty_mode',
        'extInfo'           => 'ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('outProductId', $this->outProductId, true);
        Model::validateRequired('outOrderNo', $this->outOrderNo, true);
        Model::validateRequired('tradeNo', $this->tradeNo, true);
        Model::validateRequired('orderType', $this->orderType, true);
        Model::validateRequired('orderAmount', $this->orderAmount, true);
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
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->outProductId) {
            $res['out_product_id'] = $this->outProductId;
        }
        if (null !== $this->outOrderNo) {
            $res['out_order_no'] = $this->outOrderNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->orderType) {
            $res['order_type'] = $this->orderType;
        }
        if (null !== $this->orderAmount) {
            $res['order_amount'] = $this->orderAmount;
        }
        if (null !== $this->royaltyMode) {
            $res['royalty_mode'] = $this->royaltyMode;
        }
        if (null !== $this->extInfo) {
            $res['ext_info'] = $this->extInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PushOrderSettlementRequest
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
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['out_product_id'])) {
            $model->outProductId = $map['out_product_id'];
        }
        if (isset($map['out_order_no'])) {
            $model->outOrderNo = $map['out_order_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['order_type'])) {
            $model->orderType = $map['order_type'];
        }
        if (isset($map['order_amount'])) {
            $model->orderAmount = $map['order_amount'];
        }
        if (isset($map['royalty_mode'])) {
            $model->royaltyMode = $map['royalty_mode'];
        }
        if (isset($map['ext_info'])) {
            $model->extInfo = $map['ext_info'];
        }

        return $model;
    }
}
