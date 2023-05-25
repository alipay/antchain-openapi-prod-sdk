<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class RiskTaskAudit extends Model
{
    // 操作人
    /**
     * @example 张三
     *
     * @var string
     */
    public $operator;

    // 操作类型
    /**
     * @example COMMIT
     *
     * @var string
     */
    public $operationType;

    // 风险工单ID
    /**
     * @example 1000000000001
     *
     * @var string
     */
    public $riskTaskId;

    // 评论
    /**
     * @example this is a comment
     *
     * @var string
     */
    public $comment;
    protected $_name = [
        'operator'      => 'operator',
        'operationType' => 'operation_type',
        'riskTaskId'    => 'risk_task_id',
        'comment'       => 'comment',
    ];

    public function validate()
    {
        Model::validateRequired('operator', $this->operator, true);
        Model::validateRequired('operationType', $this->operationType, true);
        Model::validateRequired('riskTaskId', $this->riskTaskId, true);
        Model::validateRequired('comment', $this->comment, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }
        if (null !== $this->riskTaskId) {
            $res['risk_task_id'] = $this->riskTaskId;
        }
        if (null !== $this->comment) {
            $res['comment'] = $this->comment;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskTaskAudit
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }
        if (isset($map['risk_task_id'])) {
            $model->riskTaskId = $map['risk_task_id'];
        }
        if (isset($map['comment'])) {
            $model->comment = $map['comment'];
        }

        return $model;
    }
}
