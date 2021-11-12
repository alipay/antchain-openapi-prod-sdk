<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class ContainerInfo extends Model
{
    // 容器日志
    /**
     * @example fabadfasd
     *
     * @var string
     */
    public $log;

    // 容器节点状态
    /**
     * @example FAILED
     *
     * @var string
     */
    public $status;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcEnd;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcModified;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcStart;
    protected $_name = [
        'log'         => 'log',
        'status'      => 'status',
        'utcCreate'   => 'utc_create',
        'utcEnd'      => 'utc_end',
        'utcModified' => 'utc_modified',
        'utcStart'    => 'utc_start',
    ];

    public function validate()
    {
        Model::validateRequired('log', $this->log, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('utcCreate', $this->utcCreate, true);
        Model::validateRequired('utcEnd', $this->utcEnd, true);
        Model::validateRequired('utcModified', $this->utcModified, true);
        Model::validateRequired('utcStart', $this->utcStart, true);
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcEnd', $this->utcEnd, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcStart', $this->utcStart, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->log) {
            $res['log'] = $this->log;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcEnd) {
            $res['utc_end'] = $this->utcEnd;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->utcStart) {
            $res['utc_start'] = $this->utcStart;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContainerInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['log'])) {
            $model->log = $map['log'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_end'])) {
            $model->utcEnd = $map['utc_end'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['utc_start'])) {
            $model->utcStart = $map['utc_start'];
        }

        return $model;
    }
}
