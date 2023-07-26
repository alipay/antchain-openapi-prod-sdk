<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class InstanceRecordInfo extends Model
{
    // 应用标识
    /**
     * @example app20230725115808679d4f
     *
     * @var string
     */
    public $application;

    // 执行结果
    /**
     * @example INIT
     *
     * @var string
     */
    public $status;

    // 操作时间
    /**
     * @example 1690166971465
     *
     * @var string
     */
    public $operatingTime;
    protected $_name = [
        'application'   => 'application',
        'status'        => 'status',
        'operatingTime' => 'operating_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->application) {
            $res['application'] = $this->application;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->operatingTime) {
            $res['operating_time'] = $this->operatingTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstanceRecordInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['application'])) {
            $model->application = $map['application'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['operating_time'])) {
            $model->operatingTime = $map['operating_time'];
        }

        return $model;
    }
}
