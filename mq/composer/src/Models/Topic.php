<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class Topic extends Model
{
    // creation_time
    /**
     * @example 2018-04-16T00:01:59Z
     *
     * @var string
     */
    public $creationTime;

    // desc
    /**
     * @example eventcode
     *
     * @var string
     */
    public $desc;

    // eventcode
    /**
     * @example eventcode
     *
     * @var string
     */
    public $eventcode;

    // id
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // topic
    /**
     * @example instance_id
     *
     * @var string
     */
    public $topic;

    // update_time
    /**
     * @example 2018-04-16T00:01:59Z
     *
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'creationTime' => 'creation_time',
        'desc'         => 'desc',
        'eventcode'    => 'eventcode',
        'id'           => 'id',
        'instanceId'   => 'instance_id',
        'topic'        => 'topic',
        'updateTime'   => 'update_time',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->eventcode) {
            $res['eventcode'] = $this->eventcode;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Topic
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['creation_time'])) {
            $model->creationTime = $map['creation_time'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['eventcode'])) {
            $model->eventcode = $map['eventcode'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }

        return $model;
    }
}
