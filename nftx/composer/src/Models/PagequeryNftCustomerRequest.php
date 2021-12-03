<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\NFTX\Models;

use AlibabaCloud\Tea\Model;

class PagequeryNftCustomerRequest extends Model
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

    // 当前页码
    /**
     * @var int
     */
    public $page;

    // 页长
    /**
     * @var int
     */
    public $pageSize;

    // 用户手机号或支付宝UID
    /**
     * @var string
     */
    public $idNo;

    // 用户ID类型，和id_no对应
    /**
     * @var string
     */
    public $idType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'page'              => 'page',
        'pageSize'          => 'page_size',
        'idNo'              => 'id_no',
        'idType'            => 'id_type',
    ];

    public function validate()
    {
        Model::validateRequired('page', $this->page, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('idNo', $this->idNo, true);
        Model::validateRequired('idType', $this->idType, true);
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
        if (null !== $this->page) {
            $res['page'] = $this->page;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->idNo) {
            $res['id_no'] = $this->idNo;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryNftCustomerRequest
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
        if (isset($map['page'])) {
            $model->page = $map['page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['id_no'])) {
            $model->idNo = $map['id_no'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }

        return $model;
    }
}
