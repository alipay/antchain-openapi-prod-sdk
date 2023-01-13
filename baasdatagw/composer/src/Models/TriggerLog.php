<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class TriggerLog extends Model
{
    // 日志的唯一ID
    /**
     * @example 123123
     *
     * @var string
     */
    public $uuid;

    // 日志的发生时间
    /**
     * @example 1650965665000
     *
     * @var int
     */
    public $createTime;

    // 日志的最近修改时间
    /**
     * @example 1650965665000
     *
     * @var int
     */
    public $modifyTime;

    // 日志发生的位置
    /**
     * @example
     *
     * @var TriggerCheckpoint
     */
    public $position;

    // 日志状态
    /**
     * @example Pending
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'uuid'       => 'uuid',
        'createTime' => 'create_time',
        'modifyTime' => 'modify_time',
        'position'   => 'position',
        'status'     => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('position', $this->position, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->position) {
            $res['position'] = null !== $this->position ? $this->position->toMap() : null;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TriggerLog
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['position'])) {
            $model->position = TriggerCheckpoint::fromMap($map['position']);
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
