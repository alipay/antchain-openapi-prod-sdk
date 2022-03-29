<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class WhitelistDO extends Model
{
    // instance_id
    /**
     * @example instance_id
     *
     * @var string
     */
    public $instanceId;

    // topic
    /**
     * @example topic
     *
     * @var string
     */
    public $topic;

    // id
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // groupid
    /**
     * @example groupid
     *
     * @var string
     */
    public $groupid;

    // gmt_create
    /**
     * @example gmt_create
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example gmt_modified
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'instanceId'  => 'instance_id',
        'topic'       => 'topic',
        'id'          => 'id',
        'groupid'     => 'groupid',
        'gmtCreate'   => 'gmt_create',
        'gmtModified' => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('groupid', $this->groupid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->groupid) {
            $res['groupid'] = $this->groupid;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return WhitelistDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['groupid'])) {
            $model->groupid = $map['groupid'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
