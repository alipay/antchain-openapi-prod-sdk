<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class StubExtraInfo extends Model
{
    // 票面视觉
    /**
     * @example https://www.xx.com
     *
     * @var string
     */
    public $ticketVision;
    protected $_name = [
        'ticketVision' => 'ticket_vision',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
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
        if (isset($map['ticket_vision'])) {
            $model->ticketVision = $map['ticket_vision'];
        }

        return $model;
    }
}
