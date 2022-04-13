<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class QueryContainerserivceGrayreleaseconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单的time_series_id
    /**
     * @var string
     */
    public $timeSeriesId;

    // lks service的id，如果time_series_id与lks_service_id同时指定，后者生效
    /**
     * @var string
     */
    public $lksServiceId;
    protected $_name = [
        'authToken'    => 'auth_token',
        'timeSeriesId' => 'time_series_id',
        'lksServiceId' => 'lks_service_id',
    ];

    public function validate()
    {
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
        if (null !== $this->lksServiceId) {
            $res['lks_service_id'] = $this->lksServiceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryContainerserivceGrayreleaseconfigRequest
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
        if (isset($map['lks_service_id'])) {
            $model->lksServiceId = $map['lks_service_id'];
        }

        return $model;
    }
}
