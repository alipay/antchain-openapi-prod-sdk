<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ManagedMQDTOStructBody extends Model
{
    // id
    /**
     * @example 5
     *
     * @var string
     */
    public $id;

    // 实例
    /**
     * @example "MQ_INST_1287126353308684_BXYEnC3u"
     *
     * @var string
     */
    public $instance;

    // 主题
    /**
     * @example "tfx4lb3m0qh3emact73tln8t8qkygb65"
     *
     * @var string
     */
    public $topic;

    // 类型
    /**
     * @example "basic"
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'id'       => 'id',
        'instance' => 'instance',
        'topic'    => 'topic',
        'type'     => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->instance) {
            $res['instance'] = $this->instance;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ManagedMQDTOStructBody
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['instance'])) {
            $model->instance = $map['instance'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
