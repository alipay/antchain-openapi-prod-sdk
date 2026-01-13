<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENT\Models;

use AlibabaCloud\Tea\Model;

class Message extends Model
{
    // Parts is the container of the message content.
    /**
     * @example undefined
     *
     * @var Part[]
     */
    public $parts;

    // Identifies the sender of the message.
    // USER role refers to communication from the client to the server.
    // AGENT role refers to communication from the server to the client.
    /**
     * @example USER
     *
     * @var string
     */
    public $role;
    protected $_name = [
        'parts' => 'parts',
        'role'  => 'role',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->parts) {
            $res['parts'] = [];
            if (null !== $this->parts && \is_array($this->parts)) {
                $n = 0;
                foreach ($this->parts as $item) {
                    $res['parts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Message
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['parts'])) {
            if (!empty($map['parts'])) {
                $model->parts = [];
                $n            = 0;
                foreach ($map['parts'] as $item) {
                    $model->parts[$n++] = null !== $item ? Part::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }

        return $model;
    }
}
