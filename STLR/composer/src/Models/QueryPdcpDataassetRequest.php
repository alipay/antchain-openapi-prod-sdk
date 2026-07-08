<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class QueryPdcpDataassetRequest extends Model
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

    // 当前页码，默认1
    /**
     * @var int
     */
    public $pageNumber;

    // 页面大小，默认20
    /**
     * @var int
     */
    public $pageSize;

    // 数据类型
    /**
     * @var string
     */
    public $dataTypeNo;

    // 数据资产所有者
    /**
     * @var string
     */
    public $userDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNumber'        => 'page_number',
        'pageSize'          => 'page_size',
        'dataTypeNo'        => 'data_type_no',
        'userDid'           => 'user_did',
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
        if (null !== $this->pageNumber) {
            $res['page_number'] = $this->pageNumber;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->dataTypeNo) {
            $res['data_type_no'] = $this->dataTypeNo;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPdcpDataassetRequest
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
        if (isset($map['page_number'])) {
            $model->pageNumber = $map['page_number'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['data_type_no'])) {
            $model->dataTypeNo = $map['data_type_no'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }

        return $model;
    }
}
