<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class BatchqueryPdcpDataRequest extends Model
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

    // 业务数据类型，查询该数据类型的授权数据
    /**
     * @var string
     */
    public $dataType;

    // 授权方身份ID，若指定查询该用户授权的数据
    /**
     * @var string
     */
    public $authorizerDid;

    // 被授权方身份ID，若指定查询授权给该用户的数据
    /**
     * @var string
     */
    public $authorizedDid;

    // 当前页面，默认1
    /**
     * @var int
     */
    public $pageNumber;

    // 分页大小，默认20
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataType'          => 'data_type',
        'authorizerDid'     => 'authorizer_did',
        'authorizedDid'     => 'authorized_did',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('pageNumber', $this->pageNumber, true);
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
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->authorizerDid) {
            $res['authorizer_did'] = $this->authorizerDid;
        }
        if (null !== $this->authorizedDid) {
            $res['authorized_did'] = $this->authorizedDid;
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
     * @return BatchqueryPdcpDataRequest
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
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['authorizer_did'])) {
            $model->authorizerDid = $map['authorizer_did'];
        }
        if (isset($map['authorized_did'])) {
            $model->authorizedDid = $map['authorized_did'];
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
