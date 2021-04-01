<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmIpUpdateapprovalRequest extends Model
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

    // 基础字段
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // ip的id
    /**
     * @var string
     */
    public $ipId;

    // 是否审批通过
    /**
     * @var bool
     */
    public $isApproval;

    // 审批信息
    /**
     * @var string
     */
    public $approvalComments;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'ipId'              => 'ip_id',
        'isApproval'        => 'is_approval',
        'approvalComments'  => 'approval_comments',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('ipId', $this->ipId, true);
        Model::validateRequired('isApproval', $this->isApproval, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->ipId) {
            $res['ip_id'] = $this->ipId;
        }
        if (null !== $this->isApproval) {
            $res['is_approval'] = $this->isApproval;
        }
        if (null !== $this->approvalComments) {
            $res['approval_comments'] = $this->approvalComments;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmIpUpdateapprovalRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['ip_id'])) {
            $model->ipId = $map['ip_id'];
        }
        if (isset($map['is_approval'])) {
            $model->isApproval = $map['is_approval'];
        }
        if (isset($map['approval_comments'])) {
            $model->approvalComments = $map['approval_comments'];
        }

        return $model;
    }
}
