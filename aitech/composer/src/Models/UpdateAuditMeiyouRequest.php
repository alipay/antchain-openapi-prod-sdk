<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class UpdateAuditMeiyouRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 审核记录ID
    /**
     * @var int
     */
    public $auditId;

    // 审核结果
    /**
     * @var string
     */
    public $auditResult;

    // 审核原因
    /**
     * @var string
     */
    public $auditReason;

    // 操作人
    /**
     * @var string
     */
    public $auditOperator;

    // 操作时间戳(毫秒)
    /**
     * @var int
     */
    public $auditTime;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'auditId'           => 'audit_id',
        'auditResult'       => 'audit_result',
        'auditReason'       => 'audit_reason',
        'auditOperator'     => 'audit_operator',
        'auditTime'         => 'audit_time',
    ];

    public function validate()
    {
        Model::validateRequired('auditId', $this->auditId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }
        if (null !== $this->auditReason) {
            $res['audit_reason'] = $this->auditReason;
        }
        if (null !== $this->auditOperator) {
            $res['audit_operator'] = $this->auditOperator;
        }
        if (null !== $this->auditTime) {
            $res['audit_time'] = $this->auditTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateAuditMeiyouRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['audit_id'])) {
            $model->auditId = $map['audit_id'];
        }
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }
        if (isset($map['audit_reason'])) {
            $model->auditReason = $map['audit_reason'];
        }
        if (isset($map['audit_operator'])) {
            $model->auditOperator = $map['audit_operator'];
        }
        if (isset($map['audit_time'])) {
            $model->auditTime = $map['audit_time'];
        }

        return $model;
    }
}
