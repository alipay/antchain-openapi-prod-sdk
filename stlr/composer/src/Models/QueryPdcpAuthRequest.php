<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryPdcpAuthRequest extends Model
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

    // 授权记录编码
    /**
     * @var string
     */
    public $authenticationNo;

    // 授权方did
    /**
     * @var string
     */
    public $authorizerDid;

    // 模糊匹配
    /**
     * @var string
     */
    public $authorizerName;

    // 被授权方did
    /**
     * @var string
     */
    public $authorizedDid;

    // 模糊匹配
    /**
     * @var string
     */
    public $authorizedName;

    // 数据协作类型
    /**
     * @var string
     */
    public $dataTransferType;

    // 授权状态
    /**
     * @var string
     */
    public $status;

    // 当前页面
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'authenticationNo'  => 'authentication_no',
        'authorizerDid'     => 'authorizer_did',
        'authorizerName'    => 'authorizer_name',
        'authorizedDid'     => 'authorized_did',
        'authorizedName'    => 'authorized_name',
        'dataTransferType'  => 'data_transfer_type',
        'status'            => 'status',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdcpAuthRequest
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
