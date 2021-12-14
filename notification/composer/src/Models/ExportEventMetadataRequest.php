<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NOTIFICATION\Models;

use AlibabaCloud\Tea\Model;

class ExportEventMetadataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 事件码
    /**
     * @var string
     */
    public $eventCode;
    protected $_name = [
        'authToken' => 'auth_token',
        'eventCode' => 'event_code',
    ];

    public function validate()
    {
        Model::validateRequired('eventCode', $this->eventCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->eventCode) {
            $res['event_code'] = $this->eventCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExportEventMetadataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['event_code'])) {
            $model->eventCode = $map['event_code'];
        }

        return $model;
    }
}
