<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class TriggerLogDTOStructBody extends Model
{
    // 创建时间
    /**
     * @example ""
     *
     * @var string
     */
    public $createTime;

    // 修改时间
    /**
     * @example ""
     *
     * @var string
     */
    public $modifyTime;

    // 状态
    /**
     * @example ""
     *
     * @var string
     */
    public $status;

    // uuid
    /**
     * @example “”
     *
     * @var string
     */
    public $uuid;

    // 位置
    /**
     * @example {}
     *
     * @var PositionStructBody
     */
    public $position;
    protected $_name = [
        'createTime' => 'create_time',
        'modifyTime' => 'modify_time',
        'status'     => 'status',
        'uuid'       => 'uuid',
        'position'   => 'position',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->modifyTime) {
            $res['modify_time'] = $this->modifyTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->position) {
            $res['position'] = null !== $this->position ? $this->position->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TriggerLogDTOStructBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['modify_time'])) {
            $model->modifyTime = $map['modify_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['position'])) {
            $model->position = PositionStructBody::fromMap($map['position']);
        }

        return $model;
    }
}
