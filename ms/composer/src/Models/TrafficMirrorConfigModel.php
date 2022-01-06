<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TrafficMirrorConfigModel extends Model
{
    // 百分比
    /**
     * @example 100
     *
     * @var int
     */
    public $percent;

    // 放大倍数
    /**
     * @example 2
     *
     * @var int
     */
    public $amplification;
    protected $_name = [
        'percent'       => 'percent',
        'amplification' => 'amplification',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->percent) {
            $res['percent'] = $this->percent;
        }
        if (null !== $this->amplification) {
            $res['amplification'] = $this->amplification;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TrafficMirrorConfigModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['percent'])) {
            $model->percent = $map['percent'];
        }
        if (isset($map['amplification'])) {
            $model->amplification = $map['amplification'];
        }

        return $model;
    }
}
