<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class EventInfo extends Model
{
    // 事件编码
    /**
     * @example face_attack_strategy
     *
     * @var string
     */
    public $eventCode;

    // 事件产生时间
    /**
     * @example 1686215967914
     *
     * @var string
     */
    public $gmtOccur;
    protected $_name = [
        'eventCode' => 'event_code',
        'gmtOccur'  => 'gmt_occur',
    ];

    public function validate()
    {
        Model::validateRequired('eventCode', $this->eventCode, true);
        Model::validateRequired('gmtOccur', $this->gmtOccur, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }
        if (null !== $this->gmtOccur) {
            $res['gmt_occur'] = $this->gmtOccur;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return EventInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }
        if (isset($map['gmt_occur'])) {
            $model->gmtOccur = $map['gmt_occur'];
        }

        return $model;
    }
}
