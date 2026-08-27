<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class FeedbackInnerMermngcontractauditRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceId' => 'trace_id',
        'auditId' => 'audit_id',
        'tenantId' => 'tenant_id',
        'revisionId' => 'revision_id',
        'feedbackContent' => 'feedback_content',
        'buId' => 'bu_id',
    ];
    public function validate() {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('auditId', $this->auditId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('revisionId', $this->revisionId, true);
        Model::validateRequired('feedbackContent', $this->feedbackContent, true);
        Model::validateRequired('buId', $this->buId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->revisionId) {
            $res['revision_id'] = $this->revisionId;
        }
        if (null !== $this->feedbackContent) {
            $res['feedback_content'] = $this->feedbackContent;
        }
        if (null !== $this->buId) {
            $res['bu_id'] = $this->buId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return FeedbackInnerMermngcontractauditRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['audit_id'])){
            $model->auditId = $map['audit_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['revision_id'])){
            $model->revisionId = $map['revision_id'];
        }
        if(isset($map['feedback_content'])){
            $model->feedbackContent = $map['feedback_content'];
        }
        if(isset($map['bu_id'])){
            $model->buId = $map['bu_id'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 审核id
    /**
     * @var string
     */
    public $auditId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 修订ID
    /**
     * @var string
     */
    public $revisionId;

    // 反馈内容
    /**
     * @var string
     */
    public $feedbackContent;

    // buid
    /**
     * @var string
     */
    public $buId;

}
