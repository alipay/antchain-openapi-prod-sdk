<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ContainerStateRunning extends Model
{
    // container启动时间
    /**
     * @example 2019-12-05
     *
     * @var string
     */
    public $startedAt;
    protected $_name = [
        'startedAt' => 'started_at',
    ];

    public function validate()
    {
        Model::validateRequired('startedAt', $this->startedAt, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->startedAt) {
            $res['started_at'] = $this->startedAt;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerStateRunning
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['started_at'])) {
            $model->startedAt = $map['started_at'];
        }

        return $model;
    }
}
