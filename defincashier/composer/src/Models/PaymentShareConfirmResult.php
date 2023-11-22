<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEFINCASHIER\Models;

use AlibabaCloud\Tea\Model;

class PaymentShareConfirmResult extends Model
{
    // 蚂蚁分账申请返回的交易号
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $orgOrderId;

    // 蚂蚁分账确认订单ID
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $orderId;

    // 外部请求ID，幂等字段
    /**
     * @example 20200801000000001
     *
     * @var string
     */
    public $outRequestId;

    // 分账单状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $state;

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
        'orgOrderId'   => 'org_order_id',
        'orderId'      => 'order_id',
        'outRequestId' => 'out_request_id',
        'state'        => 'state',
        'subCode'      => 'sub_code',
        'subMsg'       => 'sub_msg',
    ];

    public function validate()
    {
        Model::validateRequired('orgOrderId', $this->orgOrderId, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('outRequestId', $this->outRequestId, true);
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('subCode', $this->subCode, true);
        Model::validateRequired('subMsg', $this->subMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orgOrderId) {
            $res['org_order_id'] = $this->orgOrderId;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->outRequestId) {
            $res['out_request_id'] = $this->outRequestId;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
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
     * @return PaymentShareConfirmResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['org_order_id'])) {
            $model->orgOrderId = $map['org_order_id'];
        }
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['out_request_id'])) {
            $model->outRequestId = $map['out_request_id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
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
