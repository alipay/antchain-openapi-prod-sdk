<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCompanyFeedback extends Model
{
    // 主键
    /**
     * @example
     *
     * @var int
     */
    public $id;

    // 企业ID
    /**
     * @example 1
     *
     * @var string
     */
    public $companyId;

    // 反馈原因
    /**
     * @example 1
     *
     * @var string
     */
    public $feedbackReason;

    // 反馈原因详情
    /**
     * @example 1
     *
     * @var string
     */
    public $feedbackReasonDetail;

    // 评论
    /**
     * @example 1
     *
     * @var string
     */
    public $comment;
    protected $_name = [
        'id'                   => 'id',
        'companyId'            => 'company_id',
        'feedbackReason'       => 'feedback_reason',
        'feedbackReasonDetail' => 'feedback_reason_detail',
        'comment'              => 'comment',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('feedbackReason', $this->feedbackReason, true);
        Model::validateRequired('feedbackReasonDetail', $this->feedbackReasonDetail, true);
        Model::validateRequired('comment', $this->comment, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->feedbackReason) {
            $res['feedback_reason'] = $this->feedbackReason;
        }
        if (null !== $this->feedbackReasonDetail) {
            $res['feedback_reason_detail'] = $this->feedbackReasonDetail;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCompanyFeedback
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['feedback_reason'])) {
            $model->feedbackReason = $map['feedback_reason'];
        }
        if (isset($map['feedback_reason_detail'])) {
            $model->feedbackReasonDetail = $map['feedback_reason_detail'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
