<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_84c42ea3533d458aa799ea9a39aba49f\Models;

use AlibabaCloud\Tea\Model;

class FundItemQueryResult extends Model
{
    // 会员所属业务平台在智能科技的会员ID
    /**
     * @example 268800000000001
     *
     * @var string
     */
    public $platformMemberId;

    // 外部业务平台原始交易号
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $outOrderId;

    // 外部请求ID
    //
    /**
     * @example 20120000000
     *
     * @var string
     */
    public $outRequestId;

    // 资金操作类型。CAPTURE(请款);CANCEL(撤销/退款);
    /**
     * @example CAPTURE
     *
     * @var string
     */
    public $fundType;

    // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
    /**
     * @example PROCESSING
     *
     * @var string
     */
    public $state;

    // 本次请求金额，单位为元。
    /**
     * @example 100.00
     *
     * @var int
     */
    public $requestAmount;

    // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
    /**
     * @example CNY
     *
     * @var string
     */
    public $requestCurrency;

    // 业务错误码(为空表示成功，否则为业务错误码)
    /**
     * @example PARAM_MISSING
     *
     * @var string
     */
    public $subCode;

    // 业务错误描述
    /**
     * @example 参数不全
     *
     * @var string
     */
    public $subMsg;
    protected $_name = [
        'platformMemberId' => 'platform_member_id',
        'outOrderId'       => 'out_order_id',
        'outRequestId'     => 'out_request_id',
        'fundType'         => 'fund_type',
        'state'            => 'state',
        'requestAmount'    => 'request_amount',
        'requestCurrency'  => 'request_currency',
        'subCode'          => 'sub_code',
        'subMsg'           => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('platformMemberId', $this->platformMemberId, true);
        Model::validateRequired('outOrderId', $this->outOrderId, true);
        Model::validateRequired('fundType', $this->fundType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->platformMemberId) {
            $res['platform_member_id'] = $this->platformMemberId;
        }
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->outRequestId) {
            $res['out_request_id'] = $this->outRequestId;
        }
        if (null !== $this->fundType) {
            $res['fund_type'] = $this->fundType;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->requestAmount) {
            $res['request_amount'] = $this->requestAmount;
        }
        if (null !== $this->requestCurrency) {
            $res['request_currency'] = $this->requestCurrency;
        }
        if (null !== $this->subCode) {
            $res['sub_code'] = $this->subCode;
        }
        if (null !== $this->subMsg) {
            $res['sub_msg'] = $this->subMsg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundItemQueryResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['platform_member_id'])) {
            $model->platformMemberId = $map['platform_member_id'];
        }
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['out_request_id'])) {
            $model->outRequestId = $map['out_request_id'];
        }
        if (isset($map['fund_type'])) {
            $model->fundType = $map['fund_type'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['request_amount'])) {
            $model->requestAmount = $map['request_amount'];
        }
        if (isset($map['request_currency'])) {
            $model->requestCurrency = $map['request_currency'];
        }
        if (isset($map['sub_code'])) {
            $model->subCode = $map['sub_code'];
        }
        if (isset($map['sub_msg'])) {
            $model->subMsg = $map['sub_msg'];
        }

        return $model;
    }
}
