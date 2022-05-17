<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppUsabilityTrendQuery extends Model
{
    // 时间以天为单位
    /**
     * @example 2018-10-10
     *
     * @var string
     */
    public $day;

    // 应用可用性
    /**
     * @example 0.9999
     *
     * @var int
     */
    public $appUsability;
    protected $_name = [
        'day'          => 'day',
        'appUsability' => 'app_usability',
    ];

    public function validate()
    {
        Model::validatePattern('day', $this->day, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->day) {
            $res['day'] = $this->day;
        }
        if (null !== $this->appUsability) {
            $res['app_usability'] = $this->appUsability;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppUsabilityTrendQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['day'])) {
            $model->day = $map['day'];
        }
        if (isset($map['app_usability'])) {
            $model->appUsability = $map['app_usability'];
        }

        return $model;
    }
}
