<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class UpdateScopeValue extends Model
{
    // CN-HANGZHOU-FINANCE
    /**
     * @example CN-HANGZHOU-FINANCE
     *
     * @var string
     */
    public $region;

    // 限流值
    /**
     * @example
     *
     * @var int
     */
    public $limit;

    // 生效与否
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 时间单位
    /**
     * @example SECOND
     *
     * @var string
     */
    public $timeDuration;
    protected $_name = [
        'region'       => 'region',
        'limit'        => 'limit',
        'enabled'      => 'enabled',
        'timeDuration' => 'time_duration',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('limit', $this->limit, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('timeDuration', $this->timeDuration, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->timeDuration) {
            $res['time_duration'] = $this->timeDuration;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateScopeValue
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['time_duration'])) {
            $model->timeDuration = $map['time_duration'];
        }

        return $model;
    }
}
