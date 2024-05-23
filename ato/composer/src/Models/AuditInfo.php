<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class AuditInfo extends Model
{
    // 审核步骤
    /**
     * @example 商户提交
     *
     * @var string
     */
    public $stage;

    // 审核主体
    /**
     * @example 平台审核
     *
     * @var string
     */
    public $auditSubject;

    // 审核状态
    /**
     * @example AUDIT_PASSED
     *
     * @var string
     */
    public $status;

    // 审核时间
    /**
     * @example 2023-04-05 12:12:23
     *
     * @var string
     */
    public $applyDateStr;

    // 审核失败描述
    /**
     * @example xx值校验失败
     *
     * @var string
     */
    public $failReason;
    protected $_name = [
        'stage'        => 'stage',
        'auditSubject' => 'audit_subject',
        'status'       => 'status',
        'applyDateStr' => 'apply_date_str',
        'failReason'   => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('stage', $this->stage, true);
        Model::validateRequired('auditSubject', $this->auditSubject, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('applyDateStr', $this->applyDateStr, true);
        Model::validateRequired('failReason', $this->failReason, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->auditSubject) {
            $res['audit_subject'] = $this->auditSubject;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->applyDateStr) {
            $res['apply_date_str'] = $this->applyDateStr;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuditInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['audit_subject'])) {
            $model->auditSubject = $map['audit_subject'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['apply_date_str'])) {
            $model->applyDateStr = $map['apply_date_str'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
