<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateContainerserviceGrayreleaseconfigRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 发布单的time series id
    /**
     * @var string
     */
    public $timeSeriesId;

    // lks service id，与plan_id同时传时前者生效。
    /**
     * @var string
     */
    public $lksServiceId;

    // 灰度规则
    /**
     * @var GrayReleaseConfig
     */
    public $grayReleaseConfig;
    protected $_name = [
        'authToken'         => 'auth_token',
        'timeSeriesId'      => 'time_series_id',
        'lksServiceId'      => 'lks_service_id',
        'grayReleaseConfig' => 'gray_release_config',
    ];

    public function validate()
    {
        Model::validateRequired('grayReleaseConfig', $this->grayReleaseConfig, true);
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
        if (null !== $this->grayReleaseConfig) {
            $res['gray_release_config'] = null !== $this->grayReleaseConfig ? $this->grayReleaseConfig->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContainerserviceGrayreleaseconfigRequest
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
        if (isset($map['gray_release_config'])) {
            $model->grayReleaseConfig = GrayReleaseConfig::fromMap($map['gray_release_config']);
        }

        return $model;
    }
}
