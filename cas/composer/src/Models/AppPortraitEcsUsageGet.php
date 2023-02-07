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
     * @var string
     */
    public $averageCpu;

    // 内存平均利用率
    /**
     * @example 0.7
     *
     * @var string
     */
    public $averageMem;

    // 磁盘平均利用率
    /**
     * @example 0.2
     *
     * @var string
     */
    public $averageDisk;

    // 建议1：xxxxx
    /**
     * @example 建议1：xxxxx
     *
     * @var string
     */
    public $tips;
    protected $_name = [
        'averageCpu'  => 'average_cpu',
        'averageMem'  => 'average_mem',
        'averageDisk' => 'average_disk',
        'tips'        => 'tips',
    ];

    public function validate()
    {
        Model::validateRequired('averageCpu', $this->averageCpu, true);
        Model::validateRequired('averageMem', $this->averageMem, true);
        Model::validateRequired('averageDisk', $this->averageDisk, true);
        Model::validateRequired('tips', $this->tips, true);
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
        if (null !== $this->tips) {
            $res['tips'] = $this->tips;
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
        if (isset($map['tips'])) {
            $model->tips = $map['tips'];
        }

        return $model;
    }
}
