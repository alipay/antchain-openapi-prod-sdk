<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AlarmDO extends Model
{
    // model
    /**
     * @example model
     *
     * @var Model
     */
    public $model;

    // level
    /**
     * @example level
     *
     * @var string
     */
    public $level;

    // frequency
    /**
     * @example frequency
     *
     * @var int
     */
    public $frequency;

    // silent_minute
    /**
     * @example silent_minute
     *
     * @var string
     */
    public $silentMinute;

    // emergency_copy
    /**
     * @example emergency_copy
     *
     * @var string
     */
    public $emergencyCopy;

    // emergency_url
    /**
     * @example emergency_url
     *
     * @var string
     */
    public $emergencyUrl;

    // time_zone
    /**
     * @example time_zone
     *
     * @var string
     */
    public $timeZone;

    // time_zone_custom
    /**
     * @example true,false
     *
     * @var bool
     */
    public $timeZoneCustom;
    protected $_name = [
        'model'          => 'model',
        'level'          => 'level',
        'frequency'      => 'frequency',
        'silentMinute'   => 'silent_minute',
        'emergencyCopy'  => 'emergency_copy',
        'emergencyUrl'   => 'emergency_url',
        'timeZone'       => 'time_zone',
        'timeZoneCustom' => 'time_zone_custom',
    ];

    public function validate()
    {
        Model::validateRequired('model', $this->model, true);
        Model::validateRequired('level', $this->level, true);
        Model::validateRequired('frequency', $this->frequency, true);
        Model::validateRequired('silentMinute', $this->silentMinute, true);
        Model::validateRequired('emergencyCopy', $this->emergencyCopy, true);
        Model::validateRequired('emergencyUrl', $this->emergencyUrl, true);
        Model::validateRequired('timeZone', $this->timeZone, true);
        Model::validateRequired('timeZoneCustom', $this->timeZoneCustom, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->model) {
            $res['model'] = null !== $this->model ? $this->model->toMap() : null;
        }
        if (null !== $this->level) {
            $res['level'] = $this->level;
        }
        if (null !== $this->frequency) {
            $res['frequency'] = $this->frequency;
        }
        if (null !== $this->silentMinute) {
            $res['silent_minute'] = $this->silentMinute;
        }
        if (null !== $this->emergencyCopy) {
            $res['emergency_copy'] = $this->emergencyCopy;
        }
        if (null !== $this->emergencyUrl) {
            $res['emergency_url'] = $this->emergencyUrl;
        }
        if (null !== $this->timeZone) {
            $res['time_zone'] = $this->timeZone;
        }
        if (null !== $this->timeZoneCustom) {
            $res['time_zone_custom'] = $this->timeZoneCustom;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AlarmDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['model'])) {
            $model->model = Model::fromMap($map['model']);
        }
        if (isset($map['level'])) {
            $model->level = $map['level'];
        }
        if (isset($map['frequency'])) {
            $model->frequency = $map['frequency'];
        }
        if (isset($map['silent_minute'])) {
            $model->silentMinute = $map['silent_minute'];
        }
        if (isset($map['emergency_copy'])) {
            $model->emergencyCopy = $map['emergency_copy'];
        }
        if (isset($map['emergency_url'])) {
            $model->emergencyUrl = $map['emergency_url'];
        }
        if (isset($map['time_zone'])) {
            $model->timeZone = $map['time_zone'];
        }
        if (isset($map['time_zone_custom'])) {
            $model->timeZoneCustom = $map['time_zone_custom'];
        }

        return $model;
    }
}
