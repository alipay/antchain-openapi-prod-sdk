<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INTLCOMMONCENTER\Models;

use AlibabaCloud\Tea\Model;

class OperateApprovalCallbackRequest extends Model
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

    // 审批流Id
    /**
     * @var string
     */
    public $processId;

    // 审批状态(PASS\UNPASS\CANCEL)
    /**
     * @var string
     */
    public $auditStatus;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'processId'         => 'process_id',
        'auditStatus'       => 'audit_status',
    ];

    public function validate()
    {
        Model::validateRequired('processId', $this->processId, true);
        Model::validateRequired('auditStatus', $this->auditStatus, true);
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
        if (null !== $this->processId) {
            $res['process_id'] = $this->processId;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OperateApprovalCallbackRequest
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
        if (isset($map['process_id'])) {
            $model->processId = $map['process_id'];
        }
        if (isset($map['audit_status'])) {
            $model->auditStatus = $map['audit_status'];
        }

        return $model;
    }
}
