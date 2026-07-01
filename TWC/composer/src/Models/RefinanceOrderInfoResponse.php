<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class RefinanceOrderInfoResponse extends Model
{
    // 订单id
    /**
     * @example 20220118123123123
     *
     * @var string
     */
    public $orderId;

    // 合约id
    /**
     * @example ABCDEFGH_IJKLMNO_dfadfadfafdadfadfsdffdadf
     *
     * @var string
     */
    public $applicationId;
    protected $_name = [
        'orderId'       => 'order_id',
        'applicationId' => 'application_id',
    ];

    public function validate()
    {
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('applicationId', $this->applicationId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->applicationId) {
            $res['application_id'] = $this->applicationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RefinanceOrderInfoResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['application_id'])) {
            $model->applicationId = $map['application_id'];
        }

        return $model;
    }
}
