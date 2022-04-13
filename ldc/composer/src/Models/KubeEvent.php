<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class KubeEvent extends Model
{
    // 事件类型
    /**
     * @example Normal
     *
     * @var string
     */
    public $type;

    // 发布次数
    /**
     * @example 1
     *
     * @var int
     */
    public $count;

    // 事件原因
    /**
     * @example Created
     *
     * @var string
     */
    public $reason;

    // 事件内容
    /**
     * @example Created container
     *
     * @var string
     */
    public $message;

    // 更新时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;
    protected $_name = [
        'type'         => 'type',
        'count'        => 'count',
        'reason'       => 'reason',
        'message'      => 'message',
        'modifiedTime' => 'modified_time',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('reason', $this->reason, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('modifiedTime', $this->modifiedTime, true);
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->reason) {
            $res['reason'] = $this->reason;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KubeEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['reason'])) {
            $model->reason = $map['reason'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }

        return $model;
    }
}
