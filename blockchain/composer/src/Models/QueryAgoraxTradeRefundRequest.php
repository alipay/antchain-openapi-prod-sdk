<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class QueryAgoraxTradeRefundRequest extends Model
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

    // 退款请求号
    /**
     * @var string
     */
    public $outRequestNo;

    // 支付宝交易号
    /**
     * @var string
     */
    public $tradeNo;

    // 商户订单号
    /**
     * @var string
     */
    public $outTradeNo;

    // 额外查询选项
    /**
     * @var string[]
     */
    public $queryOptions;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'externalId'        => 'external_id',
        'outRequestNo'      => 'out_request_no',
        'tradeNo'           => 'trade_no',
        'outTradeNo'        => 'out_trade_no',
        'queryOptions'      => 'query_options',
    ];

    public function validate()
    {
        Model::validateRequired('externalId', $this->externalId, true);
        Model::validateRequired('outRequestNo', $this->outRequestNo, true);
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
        if (null !== $this->outRequestNo) {
            $res['out_request_no'] = $this->outRequestNo;
        }
        if (null !== $this->tradeNo) {
            $res['trade_no'] = $this->tradeNo;
        }
        if (null !== $this->outTradeNo) {
            $res['out_trade_no'] = $this->outTradeNo;
        }
        if (null !== $this->queryOptions) {
            $res['query_options'] = $this->queryOptions;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgoraxTradeRefundRequest
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
        if (isset($map['out_request_no'])) {
            $model->outRequestNo = $map['out_request_no'];
        }
        if (isset($map['trade_no'])) {
            $model->tradeNo = $map['trade_no'];
        }
        if (isset($map['out_trade_no'])) {
            $model->outTradeNo = $map['out_trade_no'];
        }
        if (isset($map['query_options'])) {
            if (!empty($map['query_options'])) {
                $model->queryOptions = $map['query_options'];
            }
        }

        return $model;
    }
}
