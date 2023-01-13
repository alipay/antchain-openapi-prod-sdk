<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightEvent extends Model
{
    // 事件的 topics 列表
    /**
     * @example call_contract
     *
     * @var string[]
     */
    public $topics;

    // 解析后的交易 topics 列表
    /**
     * @example call_contract
     *
     * @var string[]
     */
    public $topicsDecoded;

    // 事件的内容
    /**
     * @example 03123981
     *
     * @var string
     */
    public $content;

    // 解析后的事件内容
    /**
     * @example {"name":"a"}
     *
     * @var string
     */
    public $contentDecoded;
    protected $_name = [
        'topics'         => 'topics',
        'topicsDecoded'  => 'topics_decoded',
        'content'        => 'content',
        'contentDecoded' => 'content_decoded',
    ];

    public function validate()
    {
        Model::validateRequired('topics', $this->topics, true);
        Model::validateRequired('content', $this->content, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->topics) {
            $res['topics'] = $this->topics;
        }
        if (null !== $this->topicsDecoded) {
            $res['topics_decoded'] = $this->topicsDecoded;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->contentDecoded) {
            $res['content_decoded'] = $this->contentDecoded;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightEvent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['topics'])) {
            if (!empty($map['topics'])) {
                $model->topics = $map['topics'];
            }
        }
        if (isset($map['topics_decoded'])) {
            if (!empty($map['topics_decoded'])) {
                $model->topicsDecoded = $map['topics_decoded'];
            }
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['content_decoded'])) {
            $model->contentDecoded = $map['content_decoded'];
        }

        return $model;
    }
}
