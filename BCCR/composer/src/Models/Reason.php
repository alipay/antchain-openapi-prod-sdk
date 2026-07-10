<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class Reason extends Model
{
    // 事由ID
    /**
     * @example 123
     *
     * @var string
     */
    public $reasonId;

    // 事由名称
    /**
     * @example 商标权/名誉权/著作权
     *
     * @var string
     */
    public $reasonName;

    // 附件文字说明
    /**
     * @example 这是一个说明
     *
     * @var string
     */
    public $comment;

    // 排序
    /**
     * @example 1
     *
     * @var int
     */
    public $sort;

    // 是否必须上传附件
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isNeedAttachment;
    protected $_name = [
        'reasonId'         => 'reason_id',
        'reasonName'       => 'reason_name',
        'comment'          => 'comment',
        'sort'             => 'sort',
        'isNeedAttachment' => 'is_need_attachment',
    ];

    public function validate()
    {
        Model::validateRequired('reasonId', $this->reasonId, true);
        Model::validateRequired('reasonName', $this->reasonName, true);
        Model::validateRequired('comment', $this->comment, true);
        Model::validateRequired('sort', $this->sort, true);
        Model::validateRequired('isNeedAttachment', $this->isNeedAttachment, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reasonId) {
            $res['reason_id'] = $this->reasonId;
        }
        if (null !== $this->reasonName) {
            $res['reason_name'] = $this->reasonName;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }
        if (null !== $this->sort) {
            $res['sort'] = $this->sort;
        }
        if (null !== $this->isNeedAttachment) {
            $res['is_need_attachment'] = $this->isNeedAttachment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Reason
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['reason_id'])) {
            $model->reasonId = $map['reason_id'];
        }
        if (isset($map['reason_name'])) {
            $model->reasonName = $map['reason_name'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }
        if (isset($map['sort'])) {
            $model->sort = $map['sort'];
        }
        if (isset($map['is_need_attachment'])) {
            $model->isNeedAttachment = $map['is_need_attachment'];
        }

        return $model;
    }
}
