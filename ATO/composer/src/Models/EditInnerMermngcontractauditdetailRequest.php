<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class EditInnerMermngcontractauditdetailRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceId' => 'trace_id',
        'tenantId' => 'tenant_id',
        'auditId' => 'audit_id',
        'auditDetailId' => 'audit_detail_id',
        'operateType' => 'operate_type',
        'contentType' => 'content_type',
        'content' => 'content',
    ];
    public function validate() {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('auditId', $this->auditId, true);
        Model::validateRequired('auditDetailId', $this->auditDetailId, true);
        Model::validateRequired('operateType', $this->operateType, true);
        Model::validateRequired('contentType', $this->contentType, true);
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->auditId) {
            $res['audit_id'] = $this->auditId;
        }
        if (null !== $this->auditDetailId) {
            $res['audit_detail_id'] = $this->auditDetailId;
        }
        if (null !== $this->operateType) {
            $res['operate_type'] = $this->operateType;
        }
        if (null !== $this->contentType) {
            $res['content_type'] = $this->contentType;
        }
        if (null !== $this->content) {
            $res['content'] = $this->content;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return EditInnerMermngcontractauditdetailRequest
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
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['audit_id'])){
            $model->auditId = $map['audit_id'];
        }
        if(isset($map['audit_detail_id'])){
            $model->auditDetailId = $map['audit_detail_id'];
        }
        if(isset($map['operate_type'])){
            $model->operateType = $map['operate_type'];
        }
        if(isset($map['content_type'])){
            $model->contentType = $map['content_type'];
        }
        if(isset($map['content'])){
            $model->content = $map['content'];
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

    // 商户租户id
    /**
     * @var string
     */
    public $tenantId;

    // 审核id
    /**
     * @var string
     */
    public $auditId;

    // 审核详情id
    /**
     * @var string
     */
    public $auditDetailId;

    // ADOPT采纳
    // CANCEL撤回
    // EDIT编辑
    /**
     * @var string
     */
    public $operateType;

    // REVISE 修订
    // ANNOTATION 批注
    /**
     * @var string
     */
    public $contentType;

    // 编辑修订内容/采纳修订内容/采纳批注内容
    /**
     * @var string
     */
    public $content;

}
