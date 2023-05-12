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
    protected $_name = [
        'outOrderId'   => 'out_order_id',
        'outRequestId' => 'out_request_id',
        'state'        => 'state',
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

        return $model;
    }
}
