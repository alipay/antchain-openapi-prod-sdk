<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class MsgTypeDTO extends Model
{
    // topic name
    /**
     * @example TP_TEST
     *
     * @var string
     */
    public $topic;

    // eventcode
    /**
     * @example eventcode
     *
     * @var string
     */
    public $eventcode;

    // desc
    /**
     * @example desc
     *
     * @var string
     */
    public $desc;
    protected $_name = [
        'topic'     => 'topic',
        'eventcode' => 'eventcode',
        'desc'      => 'desc',
    ];

    public function validate()
    {
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('eventcode', $this->eventcode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MsgTypeDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }

        return $model;
    }
}
