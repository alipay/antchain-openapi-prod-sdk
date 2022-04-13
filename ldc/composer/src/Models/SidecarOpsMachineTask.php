<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarOpsMachineTask extends Model
{
    // 分组ID
    /**
     * @example 123456
     *
     * @var string
     */
    public $id;

    // 执行状态
    /**
     * @example _SUCCEEDED_, _FAILED_
     *
     * @var string
     */
    public $status;

    // 扩展属性 - JSON string
    /**
     * @example "{}"
     *
     * @var string
     */
    public $properties;

    // 执行信息
    /**
     * @example "test msg"
     *
     * @var string
     */
    public $message;

    // 任务名称
    /**
     * @example test
     *
     * @var string
     */
    public $target;

    // 开始时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $startTime;

    // 结束时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $endTime;

    // 任务描述
    /**
     * @example antvip摘流
     *
     * @var string
     */
    public $targetDesc;

    // 状态描述
    /**
     * @example 成功
     *
     * @var string
     */
    public $statusDesc;
    protected $_name = [
        'id'         => 'id',
        'status'     => 'status',
        'properties' => 'properties',
        'message'    => 'message',
        'target'     => 'target',
        'startTime'  => 'start_time',
        'endTime'    => 'end_time',
        'targetDesc' => 'target_desc',
        'statusDesc' => 'status_desc',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
        Model::validatePattern('startTime', $this->startTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('endTime', $this->endTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->properties) {
            $res['properties'] = $this->properties;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->target) {
            $res['target'] = $this->target;
        }
        if (null !== $this->startTime) {
            $res['start_time'] = $this->startTime;
        }
        if (null !== $this->endTime) {
            $res['end_time'] = $this->endTime;
        }
        if (null !== $this->targetDesc) {
            $res['target_desc'] = $this->targetDesc;
        }
        if (null !== $this->statusDesc) {
            $res['status_desc'] = $this->statusDesc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarOpsMachineTask
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['properties'])) {
            $model->properties = $map['properties'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['target'])) {
            $model->target = $map['target'];
        }
        if (isset($map['start_time'])) {
            $model->startTime = $map['start_time'];
        }
        if (isset($map['end_time'])) {
            $model->endTime = $map['end_time'];
        }
        if (isset($map['target_desc'])) {
            $model->targetDesc = $map['target_desc'];
        }
        if (isset($map['status_desc'])) {
            $model->statusDesc = $map['status_desc'];
        }

        return $model;
    }
}
