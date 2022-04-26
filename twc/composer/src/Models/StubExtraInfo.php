<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class StubExtraInfo extends Model
{
    // C端用户的支付宝id
    /**
     * @example 2088xxxxx
     *
     * @var string
     */
    public $customerId;

    // 票面视觉
    /**
     * @example https://www.xx.com
     *
     * @var string
     */
    public $ticketVision;
    protected $_name = [
        'customerId'   => 'customer_id',
        'ticketVision' => 'ticket_vision',
    ];

    public function validate()
    {
        Model::validateRequired('customerId', $this->customerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->ticketVision) {
            $res['ticket_vision'] = $this->ticketVision;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StubExtraInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['ticket_vision'])) {
            $model->ticketVision = $map['ticket_vision'];
        }

        return $model;
    }
}
