<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class DocumentReferenceInfo extends Model
{
    // title
    /**
     * @example title
     *
     * @var string
     */
    public $title;

    // address
    /**
     * @example address
     *
     * @var string
     */
    public $address;

    // score 浮点类型
    /**
     * @example 0.1
     *
     * @var string
     */
    public $score;

    // content
    /**
     * @example content
     *
     * @var string
     */
    public $content;

    // type	SearchSceneEnum
    // LLM_CHUNK,
    // FAQ,
    // LLM_TABLE;
    /**
     * @example LLM_CHUNK
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'title'   => 'title',
        'address' => 'address',
        'score'   => 'score',
        'content' => 'content',
        'type'    => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('content', $this->content, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DocumentReferenceInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['content'])) {
            $model->content = $map['content'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
