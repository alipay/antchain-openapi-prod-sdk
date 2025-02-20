<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class PagequeryIssuerKeyRequest extends Model
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

    // 当前页码(默认为第一页)
    /**
     * @var int
     */
    public $pageNum;

    // 页面显示条数(默认10，最小为5)
    /**
     * @var int
     */
    public $pageSize;

    // 排序字段
    /**
     * @var string
     */
    public $sortField;

    // 密钥名称
    /**
     * @var string
     */
    public $keyName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
        'sortField'         => 'sort_field',
        'keyName'           => 'key_name',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateMinimum('pageNum', $this->pageNum, 1);
        Model::validateMinimum('pageSize', $this->pageSize, 5);
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
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->sortField) {
            $res['sort_field'] = $this->sortField;
        }
        if (null !== $this->keyName) {
            $res['key_name'] = $this->keyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryIssuerKeyRequest
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
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['sort_field'])) {
            $model->sortField = $map['sort_field'];
        }
        if (isset($map['key_name'])) {
            $model->keyName = $map['key_name'];
        }

        return $model;
    }
}
