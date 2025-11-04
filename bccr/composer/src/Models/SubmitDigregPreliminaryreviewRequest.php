<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SubmitDigregPreliminaryreviewRequest extends Model
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

    // 数登初审
    /**
     * @var string
     */
    public $digRegId;

    // 审核状态
    /**
     * @var string
     */
    public $auditStatus;

    // 审核结果
    /**
     * @var bool
     */
    public $auditResult;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digRegId'          => 'dig_reg_id',
        'auditStatus'       => 'audit_status',
        'auditResult'       => 'audit_result',
    ];

    public function validate()
    {
        Model::validateRequired('digRegId', $this->digRegId, true);
        Model::validateRequired('auditStatus', $this->auditStatus, true);
        Model::validateRequired('auditResult', $this->auditResult, true);
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
        if (null !== $this->digRegId) {
            $res['dig_reg_id'] = $this->digRegId;
        }
        if (null !== $this->auditStatus) {
            $res['audit_status'] = $this->auditStatus;
        }
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitDigregPreliminaryreviewRequest
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
        if (isset($map['dig_reg_id'])) {
            $model->digRegId = $map['dig_reg_id'];
        }
        if (isset($map['audit_status'])) {
            $model->auditStatus = $map['audit_status'];
        }
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }

        return $model;
    }
}
