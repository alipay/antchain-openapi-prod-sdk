<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitEcsUsageGet extends Model
{
    // cpu平均利用率
    /**
     * @example 0.6
     *
     * @var int
     */
    public $averageCpu;

    // 内存平均利用率
    /**
     * @example 0.7
     *
     * @var int
     */
    public $averageMem;

    // 磁盘平均利用率
    /**
     * @example 0.2
     *
     * @var int
     */
    public $averageDisk;
    protected $_name = [
        'averageCpu'  => 'average_cpu',
        'averageMem'  => 'average_mem',
        'averageDisk' => 'average_disk',
    ];

    public function validate()
    {
        Model::validateRequired('averageCpu', $this->averageCpu, true);
        Model::validateRequired('averageMem', $this->averageMem, true);
        Model::validateRequired('averageDisk', $this->averageDisk, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->averageCpu) {
            $res['average_cpu'] = $this->averageCpu;
        }
        if (null !== $this->averageMem) {
            $res['average_mem'] = $this->averageMem;
        }
        if (null !== $this->averageDisk) {
            $res['average_disk'] = $this->averageDisk;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitEcsUsageGet
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['average_cpu'])) {
            $model->averageCpu = $map['average_cpu'];
        }
        if (isset($map['average_mem'])) {
            $model->averageMem = $map['average_mem'];
        }
        if (isset($map['average_disk'])) {
            $model->averageDisk = $map['average_disk'];
        }

        return $model;
    }
}
