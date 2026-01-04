<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class KnowledgeTitleInfo extends Model
{
    // title
    /**
     * @example title
     *
     * @var string
     */
    public $title;

    // score 浮点类型
    /**
     * @example 0.1
     *
     * @var string
     */
    public $score;
    protected $_name = [
        'title' => 'title',
        'score' => 'score',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('score', $this->score, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KnowledgeTitleInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
