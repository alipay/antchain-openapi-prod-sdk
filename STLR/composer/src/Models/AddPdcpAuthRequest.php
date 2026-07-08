<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class AddPdcpAuthRequest extends Model
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

    // 授权记录的唯一标记
    /**
     * @var string
     */
    public $authenticationNo;

    // 授权方did
    /**
     * @var string
     */
    public $authorizerDid;

    // 被授权方did
    /**
     * @var string
     */
    public $authorizedDid;

    // 数据协作类型
    /**
     * @var string
     */
    public $dataTransferType;

    // 授权详情
    /**
     * @var string
     */
    public $authenticationDetail;

    // 授权状态
    /**
     * @var string
     */
    public $status;
    protected $_name = [
        'authToken'            => 'auth_token',
        'productInstanceId'    => 'product_instance_id',
        'authenticationNo'     => 'authentication_no',
        'authorizerDid'        => 'authorizer_did',
        'authorizedDid'        => 'authorized_did',
        'dataTransferType'     => 'data_transfer_type',
        'authenticationDetail' => 'authentication_detail',
        'status'               => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('authenticationNo', $this->authenticationNo, true);
        Model::validateRequired('authorizerDid', $this->authorizerDid, true);
        Model::validateRequired('authorizedDid', $this->authorizedDid, true);
        Model::validateRequired('dataTransferType', $this->dataTransferType, true);
        Model::validateRequired('authenticationDetail', $this->authenticationDetail, true);
        Model::validateRequired('status', $this->status, true);
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
        if (null !== $this->authenticationNo) {
            $res['authentication_no'] = $this->authenticationNo;
        }
        if (null !== $this->authorizerDid) {
            $res['authorizer_did'] = $this->authorizerDid;
        }
        if (null !== $this->authorizedDid) {
            $res['authorized_did'] = $this->authorizedDid;
        }
        if (null !== $this->dataTransferType) {
            $res['data_transfer_type'] = $this->dataTransferType;
        }
        if (null !== $this->authenticationDetail) {
            $res['authentication_detail'] = $this->authenticationDetail;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddPdcpAuthRequest
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
        if (isset($map['authentication_no'])) {
            $model->authenticationNo = $map['authentication_no'];
        }
        if (isset($map['authorizer_did'])) {
            $model->authorizerDid = $map['authorizer_did'];
        }
        if (isset($map['authorized_did'])) {
            $model->authorizedDid = $map['authorized_did'];
        }
        if (isset($map['data_transfer_type'])) {
            $model->dataTransferType = $map['data_transfer_type'];
        }
        if (isset($map['authentication_detail'])) {
            $model->authenticationDetail = $map['authentication_detail'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
