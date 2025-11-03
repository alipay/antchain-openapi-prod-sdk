<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateMeiyouItagRelationWebInfo extends Model
{
    // 主键id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 审核记录ID
    /**
     * @example 1
     *
     * @var string
     */
    public $auditId;

    // itag数据ID
    /**
     * @example 1
     *
     * @var int
     */
    public $itagDataId;

    // 美柚任务审核结果推送状态
    /**
     * @example INIT
     *
     * @var string
     */
    public $meiyouAuditState;

    // 审核不通过原因
    /**
     * @example 34
     *
     * @var string
     */
    public $refuseReson;

    // 美柚itag关联状态
    /**
     * @example 1
     *
     * @var string
     */
    public $auditState;

    // 美柚itag关联状态
    /**
     * @example 1
     *
     * @var string
     */
    public $topicState;

    // 审核结果
    /**
     * @example 1
     *
     * @var string
     */
    public $auditResult;
    protected $_name = [
        'id'               => 'id',
        'auditId'          => 'audit_id',
        'itagDataId'       => 'itag_data_id',
        'meiyouAuditState' => 'meiyou_audit_state',
        'refuseReson'      => 'refuse_reson',
        'auditState'       => 'audit_state',
        'topicState'       => 'topic_state',
        'auditResult'      => 'audit_result',
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
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->itagDataId) {
            $res['itag_data_id'] = $this->itagDataId;
        }
        if (null !== $this->meiyouAuditState) {
            $res['meiyou_audit_state'] = $this->meiyouAuditState;
        }
        if (null !== $this->refuseReson) {
            $res['refuse_reson'] = $this->refuseReson;
        }
        if (null !== $this->auditState) {
            $res['audit_state'] = $this->auditState;
        }
        if (null !== $this->topicState) {
            $res['topic_state'] = $this->topicState;
        }
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateMeiyouItagRelationWebInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['itag_data_id'])) {
            $model->itagDataId = $map['itag_data_id'];
        }
        if (isset($map['meiyou_audit_state'])) {
            $model->meiyouAuditState = $map['meiyou_audit_state'];
        }
        if (isset($map['refuse_reson'])) {
            $model->refuseReson = $map['refuse_reson'];
        }
        if (isset($map['audit_state'])) {
            $model->auditState = $map['audit_state'];
        }
        if (isset($map['topic_state'])) {
            $model->topicState = $map['topic_state'];
        }
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }

        return $model;
    }
}
