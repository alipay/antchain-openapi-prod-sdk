<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class KnowledgeInfo extends Model
{
    // 租户id
    /**
     * @example UDFXXXXX
     *
     * @var string
     */
    public $tenantId;

    // 主键id
    /**
     * @example 100
     *
     * @var int
     */
    public $id;

    // 类型
    /**
     * @example order
     *
     * @var string
     */
    public $type;

    // 问题
    /**
     * @example 问题
     *
     * @var string
     */
    public $question;

    // 答案
    /**
     * @example 答案
     *
     * @var string
     */
    public $answer;

    // 是否选择订单
    /**
     * @example true
     *
     * @var bool
     */
    public $hasOrder;

    // 是否带小程序链接
    /**
     * @example true, false
     *
     * @var bool
     */
    public $hasAppLink;

    // 是否转人工
    /**
     * @example true,false
     *
     * @var bool
     */
    public $hasManual;

    // 状态
    /**
     * @example 状态
     *
     * @var string
     */
    public $status;

    // 驳回原因
    /**
     * @example 驳回原因
     *
     * @var string
     */
    public $refuseReason;
    protected $_name = [
        'tenantId'     => 'tenant_id',
        'id'           => 'id',
        'type'         => 'type',
        'question'     => 'question',
        'answer'       => 'answer',
        'hasOrder'     => 'has_order',
        'hasAppLink'   => 'has_app_link',
        'hasManual'    => 'has_manual',
        'status'       => 'status',
        'refuseReason' => 'refuse_reason',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->question) {
            $res['question'] = $this->question;
        }
        if (null !== $this->answer) {
            $res['answer'] = $this->answer;
        }
        if (null !== $this->hasOrder) {
            $res['has_order'] = $this->hasOrder;
        }
        if (null !== $this->hasAppLink) {
            $res['has_app_link'] = $this->hasAppLink;
        }
        if (null !== $this->hasManual) {
            $res['has_manual'] = $this->hasManual;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->refuseReason) {
            $res['refuse_reason'] = $this->refuseReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return KnowledgeInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['question'])) {
            $model->question = $map['question'];
        }
        if (isset($map['answer'])) {
            $model->answer = $map['answer'];
        }
        if (isset($map['has_order'])) {
            $model->hasOrder = $map['has_order'];
        }
        if (isset($map['has_app_link'])) {
            $model->hasAppLink = $map['has_app_link'];
        }
        if (isset($map['has_manual'])) {
            $model->hasManual = $map['has_manual'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['refuse_reason'])) {
            $model->refuseReason = $map['refuse_reason'];
        }

        return $model;
    }
}
