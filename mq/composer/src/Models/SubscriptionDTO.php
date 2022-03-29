<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class SubscriptionDTO extends Model
{
    // 订阅该 Topic 的子类别 Tag 表达式
    /**
     * @example *
     *
     * @var string
     */
    public $subString;

    // 订阅关系版本号，为自增 Long 型
    /**
     * @example 1570701364301
     *
     * @var int
     */
    public $subVersion;

    // 订阅的 Tag 集合
    /**
     * @example *
     *
     * @var string[]
     */
    public $tagsSet;

    // 订阅的 Topic 名称
    /**
     * @example test-mq_topic
     *
     * @var string
     */
    public $topic;
    protected $_name = [
        'subString'  => 'sub_string',
        'subVersion' => 'sub_version',
        'tagsSet'    => 'tags_set',
        'topic'      => 'topic',
    ];

    public function validate()
    {
        Model::validateRequired('subString', $this->subString, true);
        Model::validateRequired('subVersion', $this->subVersion, true);
        Model::validateRequired('tagsSet', $this->tagsSet, true);
        Model::validateRequired('topic', $this->topic, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subString) {
            $res['sub_string'] = $this->subString;
        }
        if (null !== $this->subVersion) {
            $res['sub_version'] = $this->subVersion;
        }
        if (null !== $this->tagsSet) {
            $res['tags_set'] = $this->tagsSet;
        }
        if (null !== $this->topic) {
            $res['topic'] = $this->topic;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubscriptionDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_string'])) {
            $model->subString = $map['sub_string'];
        }
        if (isset($map['sub_version'])) {
            $model->subVersion = $map['sub_version'];
        }
        if (isset($map['tags_set'])) {
            if (!empty($map['tags_set'])) {
                $model->tagsSet = $map['tags_set'];
            }
        }
        if (isset($map['topic'])) {
            $model->topic = $map['topic'];
        }

        return $model;
    }
}
