<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class ConfirmIpSuperviseapproveRequest extends Model
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

    // 监修报审关联的订单id
    /**
     * @var string
     */
    public $orderId;

    // 当前期望的审批阶段（用于校验）
    /**
     * @var int
     */
    public $stage;

    // 是否审批通过
    /**
     * @var bool
     */
    public $isApproval;

    // 审批备注
    /**
     * @var string
     */
    public $approvalComments;

    // 审批额外信息
    /**
     * @var string
     */
    public $approvalExtInfo;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'baseRequest'       => 'base_request',
        'orderId'           => 'order_id',
        'stage'             => 'stage',
        'isApproval'        => 'is_approval',
        'approvalComments'  => 'approval_comments',
        'approvalExtInfo'   => 'approval_ext_info',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('orderId', $this->orderId, true);
        Model::validateRequired('stage', $this->stage, true);
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
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->stage) {
            $res['stage'] = $this->stage;
        }
        if (null !== $this->isApproval) {
            $res['is_approval'] = $this->isApproval;
        }
        if (null !== $this->approvalComments) {
            $res['approval_comments'] = $this->approvalComments;
        }
        if (null !== $this->approvalExtInfo) {
            $res['approval_ext_info'] = $this->approvalExtInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ConfirmIpSuperviseapproveRequest
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
        if (isset($map['order_id'])) {
            $model->orderId = $map['order_id'];
        }
        if (isset($map['stage'])) {
            $model->stage = $map['stage'];
        }
        if (isset($map['is_approval'])) {
            $model->isApproval = $map['is_approval'];
        }
        if (isset($map['approval_comments'])) {
            $model->approvalComments = $map['approval_comments'];
        }
        if (isset($map['approval_ext_info'])) {
            $model->approvalExtInfo = $map['approval_ext_info'];
        }

        return $model;
    }
}
