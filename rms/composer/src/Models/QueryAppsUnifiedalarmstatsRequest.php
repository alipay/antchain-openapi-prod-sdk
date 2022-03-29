<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAppsUnifiedalarmstatsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 告警开始时间
    /**
     * @var int
     */
    public $startTime;

    // 告警结束时间
    /**
     * @var int
     */
    public $endTime;
    protected $_name = [
        'authToken' => 'auth_token',
        'startTime' => 'start_time',
        'endTime'   => 'end_time',
    ];

    public function validate()
    {
        Model::validateRequired('endTime', $this->endTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAppsUnifiedalarmstatsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }

        return $model;
    }
}
