<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACOPM\Models;

use AlibabaCloud\Tea\Model;

class RateLimitEffectScopeValueDTO extends Model
{
    // region
    /**
     * @example region
     *
     * @var string
     */
    public $region;

    // enabled
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // limit
    /**
     * @example
     *
     * @var int
     */
    public $limit;

    // timeDuration
    /**
     * @example timeDuration
     *
     * @var string
     */
    public $timeDuration;
    protected $_name = [
        'region'       => 'region',
        'enabled'      => 'enabled',
        'limit'        => 'limit',
        'timeDuration' => 'time_duration',
    ];

    public function validate()
    {
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('enabled', $this->enabled, true);
        Model::validateRequired('limit', $this->limit, true);
        Model::validateRequired('timeDuration', $this->timeDuration, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->limit) {
            $res['limit'] = $this->limit;
        }
        if (null !== $this->timeDuration) {
            $res['time_duration'] = $this->timeDuration;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RateLimitEffectScopeValueDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['limit'])) {
            $model->limit = $map['limit'];
        }
        if (isset($map['time_duration'])) {
            $model->timeDuration = $map['time_duration'];
        }

        return $model;
    }
}
