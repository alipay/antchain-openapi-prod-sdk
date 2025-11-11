<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class ListAuthConfigRequest extends Model
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

    // 授权企业信用代码
    /**
     * @var string
     */
    public $enterpriseCode;

    // 业务应用名称
    /**
     * @var string
     */
    public $authAppName;

    // 产品code列表
    /**
     * @var string[]
     */
    public $productCodeList;

    // 页码
    /**
     * @var int
     */
    public $pageNum;

    // 每页数量
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'enterpriseCode'    => 'enterprise_code',
        'authAppName'       => 'auth_app_name',
        'productCodeList'   => 'product_code_list',
        'pageNum'           => 'page_num',
        'pageSize'          => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('pageNum', $this->pageNum, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->enterpriseCode) {
            $res['enterprise_code'] = $this->enterpriseCode;
        }
        if (null !== $this->authAppName) {
            $res['auth_app_name'] = $this->authAppName;
        }
        if (null !== $this->productCodeList) {
            $res['product_code_list'] = $this->productCodeList;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListAuthConfigRequest
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
        if (isset($map['enterprise_code'])) {
            $model->enterpriseCode = $map['enterprise_code'];
        }
        if (isset($map['auth_app_name'])) {
            $model->authAppName = $map['auth_app_name'];
        }
        if (isset($map['product_code_list'])) {
            if (!empty($map['product_code_list'])) {
                $model->productCodeList = $map['product_code_list'];
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
