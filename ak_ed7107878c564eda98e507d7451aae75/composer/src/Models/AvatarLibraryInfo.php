<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_ed7107878c564eda98e507d7451aae75\Models;

use AlibabaCloud\Tea\Model;

class AvatarLibraryInfo extends Model
{
    // 知识点数量
    /**
     * @example 1
     *
     * @var int
     */
    public $questionCount;

    // 知识库id
    /**
     * @example 73423001
     *
     * @var int
     */
    public $id;

    // 知识库名称
    /**
     * @example 知识库
     *
     * @var string
     */
    public $title;

    // 数字人角色信息
    /**
     * @example
     *
     * @var AvatarHumanInfo
     */
    public $humanInfo;
    protected $_name = [
        'questionCount' => 'question_count',
        'id'            => 'id',
        'title'         => 'title',
        'humanInfo'     => 'human_info',
    ];

    public function validate()
    {
        Model::validateRequired('questionCount', $this->questionCount, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('humanInfo', $this->humanInfo, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->questionCount) {
            $res['question_count'] = $this->questionCount;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->humanInfo) {
            $res['human_info'] = null !== $this->humanInfo ? $this->humanInfo->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AvatarLibraryInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['question_count'])) {
            $model->questionCount = $map['question_count'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['human_info'])) {
            $model->humanInfo = AvatarHumanInfo::fromMap($map['human_info']);
        }

        return $model;
    }
}
