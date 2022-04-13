<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class KubernetesEvents extends Model
{
    // 事件发生时间
    /**
     * @example 2021-01-22T09:33:31Z
     *
     * @var string
     */
    public $creationTimestamp;

    // 事件数目
    /**
     * @example 100
     *
     * @var int
     */
    public $count;

    // 事件内容
    /**
     * @example message
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'creationTimestamp' => 'creation_timestamp',
        'count'             => 'count',
        'message'           => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('creationTimestamp', $this->creationTimestamp, true);
        Model::validateRequired('count', $this->count, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creationTimestamp) {
            $res['creation_timestamp'] = $this->creationTimestamp;
        }
        if (null !== $this->count) {
            $res['count'] = $this->count;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KubernetesEvents
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creation_timestamp'])) {
            $model->creationTimestamp = $map['creation_timestamp'];
        }
        if (isset($map['count'])) {
            $model->count = $map['count'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
