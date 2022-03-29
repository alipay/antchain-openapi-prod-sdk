<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MessagePayloadDTO extends Model
{
    // 消息对应的Schema的唯一ID
    /**
     * @example 123123786876868
     *
     * @var string
     */
    public $schemaId;

    // 消息体内容的展现
    /**
     * @example User{name=_Tom_, age=18, city=_null_}
     *
     * @var string
     */
    public $payload;
    protected $_name = [
        'schemaId' => 'schema_id',
        'payload'  => 'payload',
    ];

    public function validate()
    {
        Model::validateRequired('schemaId', $this->schemaId, true);
        Model::validateRequired('payload', $this->payload, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->schemaId) {
            $res['schema_id'] = $this->schemaId;
        }
        if (null !== $this->payload) {
            $res['payload'] = $this->payload;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MessagePayloadDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['schema_id'])) {
            $model->schemaId = $map['schema_id'];
        }
        if (isset($map['payload'])) {
            $model->payload = $map['payload'];
        }

        return $model;
    }
}
