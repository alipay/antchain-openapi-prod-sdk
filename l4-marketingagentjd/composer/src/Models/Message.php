<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MARKETINGAGENTJD\Models;

use AlibabaCloud\Tea\Model;

class Message extends Model
{
    // Parts is the container of the message content.
    /**
     * @example
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

    // The context id of the message. This is optional and if set, the message will be associated with the given context(a specific conversation or session).
    /**
     * @example contextid
     *
     * @var string
     */
    public $contextId;
    protected $_name = [
        'parts'     => 'parts',
        'role'      => 'role',
        'contextId' => 'context_id',
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
        if (null !== $this->contextId) {
            $res['context_id'] = $this->contextId;
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
        if (isset($map['context_id'])) {
            $model->contextId = $map['context_id'];
        }

        return $model;
    }
}
