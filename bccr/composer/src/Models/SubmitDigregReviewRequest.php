<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class SubmitDigregReviewRequest extends Model
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

    // 数登ID
    /**
     * @var string
     */
    public $digRegId;

    // 复审结果：
    // REPLACE_DCI（复审不通过，补正需要替换DCI作品）
    // NO_NEED_REPLACE_DCI（复审不通过，补正不需要替换DCI作品）
    // PASS（复审通过）
    /**
     * @var string
     */
    public $auditResult;

    // 复审不通过原因
    /**
     * @var string
     */
    public $failReason;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digRegId'          => 'dig_reg_id',
        'auditResult'       => 'audit_result',
        'failReason'        => 'fail_reason',
    ];

    public function validate()
    {
        Model::validateRequired('digRegId', $this->digRegId, true);
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
        if (null !== $this->auditResult) {
            $res['audit_result'] = $this->auditResult;
        }
        if (null !== $this->failReason) {
            $res['fail_reason'] = $this->failReason;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitDigregReviewRequest
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
        if (isset($map['audit_result'])) {
            $model->auditResult = $map['audit_result'];
        }
        if (isset($map['fail_reason'])) {
            $model->failReason = $map['fail_reason'];
        }

        return $model;
    }
}
