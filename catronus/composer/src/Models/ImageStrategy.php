<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class ImageStrategy extends Model
{
    // 准入
    /**
     * @example true, false
     *
     * @var bool
     */
    public $access;

    // 巡检
    /**
     * @example
     *
     * @var Cronjob
     */
    public $cronjob;
    protected $_name = [
        'access'  => 'access',
        'cronjob' => 'cronjob',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->access) {
            $res['access'] = $this->access;
        }
        if (null !== $this->cronjob) {
            $res['cronjob'] = null !== $this->cronjob ? $this->cronjob->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImageStrategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['access'])) {
            $model->access = $map['access'];
        }
        if (isset($map['cronjob'])) {
            $model->cronjob = Cronjob::fromMap($map['cronjob']);
        }

        return $model;
    }
}
