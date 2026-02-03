<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENTJD\Models;

use AlibabaCloud\Tea\Model;

class TaskStatus extends Model
{
    // The current state of this task.
    /**
     * @example TASK_STATE_COMPLETED
     *
     * @var string
     */
    public $state;

    // A message associated with the status.
    /**
     * @example
     *
     * @var Message
     */
    public $message;
    protected $_name = [
        'state'   => 'state',
        'message' => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('state', $this->state, true);
        Model::validateRequired('message', $this->message, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->message) {
            $res['message'] = null !== $this->message ? $this->message->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TaskStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['message'])) {
            $model->message = Message::fromMap($map['message']);
        }

        return $model;
    }
}
