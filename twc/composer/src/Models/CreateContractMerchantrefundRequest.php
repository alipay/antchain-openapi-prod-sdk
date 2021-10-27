<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateContractMerchantrefundRequest extends Model
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

    // 合同id
    /**
     * @var string
     */
    public $flowId;

    // 退款请求对应的第三方ID（也叫退款ID），需保证同一平台方下唯一
    /**
     * @var string
     */
    public $outRequestNo;

    // 订单id
    /**
     * @var string
     */
    public $outTradeNo;

    // 退款金额（单位：分）
    /**
     * @var int
     */
    public $refundAmount;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'flowId'            => 'flow_id',
        'outRequestNo'      => 'out_request_no',
        'outTradeNo'        => 'out_trade_no',
        'refundAmount'      => 'refund_amount',
    ];

    public function validate()
    {
        Model::validateRequired('flowId', $this->flowId, true);
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
        Model::validateRequired('outTradeNo', $this->outTradeNo, true);
        Model::validateRequired('refundAmount', $this->refundAmount, true);
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
        if (null !== $this->flowId) {
            $res['flow_id'] = $this->flowId;
        }
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->refundAmount) {
            $res['refund_amount'] = $this->refundAmount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateContractMerchantrefundRequest
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
        if (isset($map['flow_id'])) {
            $model->flowId = $map['flow_id'];
        }
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['refund_amount'])) {
            $model->refundAmount = $map['refund_amount'];
        }

        return $model;
    }
}
