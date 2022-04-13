<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class NodeEvent extends Model
{
    // event count
    /**
     * @example 1000
     *
     * @var int
     */
    public $count;

    // event message
    /**
     * @example Node 2150535616 status is now: NodeHasSufficientDisk
     *
     * @var string
     */
    public $message;

    // event modified time
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;

    // event reason
    /**
     * @example NodeHasSufficientDisk
     *
     * @var string
     */
    public $reason;

    // event type
    /**
     * @example Normal
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'count'        => 'count',
        'message'      => 'message',
        'modifiedTime' => 'modified_time',
        'reason'       => 'reason',
        'type'         => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return NodeEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
