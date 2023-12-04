<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER\Models;

use AlibabaCloud\Tea\Model;

class PaymentShareAcceptanceResult extends Model
{
    // 外部业务平台原始交易号
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $outOrderId;

    // 外部请求ID，幂等字段
    //
    /**
     * @example 20120000000
     *
     * @var string
     */
    public $outRequestId;

    // 分账单状态
    /**
     * @example PROCESSING
     *
     * @var string
     */
    public $state;

    // 分账受理，蚂蚁单号
    /**
     * @example 1111
     *
     * @var string
     */
    public $orderId;

    // 111
    /**
     * @example http
     *
     * @var string
     */
    public $authPayUrl;

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
        'outOrderId'   => 'out_order_id',
        'outRequestId' => 'out_request_id',
        'state'        => 'state',
        'orderId'      => 'order_id',
        'authPayUrl'   => 'auth_pay_url',
        'subCode'      => 'sub_code',
        'subMsg'       => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('outOrderId', $this->outOrderId, true);
        Model::validateRequired('outRequestId', $this->outRequestId, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->outOrderId) {
            $res['out_order_id'] = $this->outOrderId;
        }
        if (null !== $this->outRequestId) {
            $res['out_request_id'] = $this->outRequestId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->authPayUrl) {
            $res['auth_pay_url'] = $this->authPayUrl;
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
     * @return PaymentShareAcceptanceResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['out_order_id'])) {
            $model->outOrderId = $map['out_order_id'];
        }
        if (isset($map['out_request_id'])) {
            $model->outRequestId = $map['out_request_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['auth_pay_url'])) {
            $model->authPayUrl = $map['auth_pay_url'];
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
