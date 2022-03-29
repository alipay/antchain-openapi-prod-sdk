<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ClearOffsetResultDTO extends Model
{
    // GroupId
    /**
     * @example GID_TEST
     *
     * @var string
     */
    public $groupId;

    // Topic 名称
    /**
     * @example TP_XXX
     *
     * @var string
     */
    public $topic;

    // 操作结果
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $result;
    protected $_name = [
        'groupId' => 'group_id',
        'topic'   => 'topic',
        'result'  => 'result',
    ];

    public function validate()
    {
        Model::validateRequired('groupId', $this->groupId, true);
        Model::validateRequired('topic', $this->topic, true);
        Model::validateRequired('result', $this->result, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }
        if (null !== $this->result) {
            $res['result'] = $this->result;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ClearOffsetResultDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }
        if (isset($map['result'])) {
            $model->result = $map['result'];
        }

        return $model;
    }
}
