<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class AppAlarmStats extends Model
{
    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // count
    /**
     * @example count
     *
     * @var int
     */
    public $count;
    protected $_name = [
        'appName' => 'app_name',
        'count'   => 'count',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('count', $this->count, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppAlarmStats
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }

        return $model;
    }
}
