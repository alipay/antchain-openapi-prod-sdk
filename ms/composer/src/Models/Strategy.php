<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class Strategy extends Model
{
    // 调度策略名称
    /**
     * @example undefined
     *
     * @var string
     */
    public $name;

    // 关联的调度任务数
    /**
     * @example undefined
     *
     * @var int
     */
    public $relatedTaskCount;
    protected $_name = [
        'name'             => 'name',
        'relatedTaskCount' => 'related_task_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->relatedTaskCount) {
            $res['related_task_count'] = $this->relatedTaskCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Strategy
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['related_task_count'])) {
            $model->relatedTaskCount = $map['related_task_count'];
        }

        return $model;
    }
}
