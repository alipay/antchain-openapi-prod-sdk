<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsplanDetailRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单id
    /**
     * @var string
     */
    public $timeSeriesId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'timeSeriesId' => 'time_series_id',
    ];

    public function validate()
    {
        Model::validateRequired('timeSeriesId', $this->timeSeriesId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->timeSeriesId) {
            $res['time_series_id'] = $this->timeSeriesId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsplanDetailRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['time_series_id'])) {
            $model->timeSeriesId = $map['time_series_id'];
        }

        return $model;
    }
}
