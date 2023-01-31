<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AuthenticationInfoVO extends Model
{
    // 授权记录编码
    /**
     * @example 授权记录编码
     *
     * @var string
     */
    public $authenticationNo;

    // 收取方did
    /**
     * @example 收取方did
     *
     * @var string
     */
    public $authorizerDid;

    // 授权方名称
    /**
     * @example 授权方名称
     *
     * @var string
     */
    public $authorizerName;

    // 被授权方did
    /**
     * @example 被授权方did
     *
     * @var string
     */
    public $authorizedDid;

    // 被授权方名称
    /**
     * @example 被授权方名称
     *
     * @var string
     */
    public $authorizedName;

    // 数据协作类型
    /**
     * @example 数据协作类型
     *
     * @var string
     */
    public $dataTransferType;

    // 授权详情
    /**
     * @example {}
     *
     * @var string
     */
    public $authenticationDeetail;

    // 授权状态
    /**
     * @example Approved：审批通过   Approving：待审批 NotApproved：审批不通过 Cancelled: 取消授权
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'authenticationNo'      => 'authentication_no',
        'authorizerDid'         => 'authorizer_did',
        'authorizerName'        => 'authorizer_name',
        'authorizedDid'         => 'authorized_did',
        'authorizedName'        => 'authorized_name',
        'dataTransferType'      => 'data_transfer_type',
        'authenticationDeetail' => 'authentication_deetail',
        'status'                => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('authenticationNo', $this->authenticationNo, true);
        Model::validateRequired('authorizerDid', $this->authorizerDid, true);
        Model::validateRequired('authorizerName', $this->authorizerName, true);
        Model::validateRequired('authorizedDid', $this->authorizedDid, true);
        Model::validateRequired('authorizedName', $this->authorizedName, true);
        Model::validateRequired('dataTransferType', $this->dataTransferType, true);
        Model::validateRequired('authenticationDeetail', $this->authenticationDeetail, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authenticationNo) {
            $res['authentication_no'] = $this->authenticationNo;
        }
        if (null !== $this->authorizerDid) {
            $res['authorizer_did'] = $this->authorizerDid;
        }
        if (null !== $this->authorizerName) {
            $res['authorizer_name'] = $this->authorizerName;
        }
        if (null !== $this->authorizedDid) {
            $res['authorized_did'] = $this->authorizedDid;
        }
        if (null !== $this->authorizedName) {
            $res['authorized_name'] = $this->authorizedName;
        }
        if (null !== $this->dataTransferType) {
            $res['data_transfer_type'] = $this->dataTransferType;
        }
        if (null !== $this->authenticationDeetail) {
            $res['authentication_deetail'] = $this->authenticationDeetail;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuthenticationInfoVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['authentication_no'])) {
            $model->authenticationNo = $map['authentication_no'];
        }
        if (isset($map['authorizer_did'])) {
            $model->authorizerDid = $map['authorizer_did'];
        }
        if (isset($map['authorizer_name'])) {
            $model->authorizerName = $map['authorizer_name'];
        }
        if (isset($map['authorized_did'])) {
            $model->authorizedDid = $map['authorized_did'];
        }
        if (isset($map['authorized_name'])) {
            $model->authorizedName = $map['authorized_name'];
        }
        if (isset($map['data_transfer_type'])) {
            $model->dataTransferType = $map['data_transfer_type'];
        }
        if (isset($map['authentication_deetail'])) {
            $model->authenticationDeetail = $map['authentication_deetail'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
