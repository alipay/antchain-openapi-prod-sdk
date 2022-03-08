<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class QueryOperatorRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 企业ID
    /**
     * @var string
     */
    public $customer;

    // 当前页，默认值为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认值为10
    /**
     * @var int
     */
    public $pageSize;

    // 真实姓名
    /**
     * @var string
     */
    public $realName;

    // 租户唯一标识
    /**
     * @var string
     */
    public $tenant;

    // 部门唯一码
    /**
     * @var string
     */
    public $departmentCode;
    protected $_name = [
        'authToken'      => 'auth_token',
        'customer'       => 'customer',
        'pageNum'        => 'page_num',
        'pageSize'       => 'page_size',
        'realName'       => 'real_name',
        'tenant'         => 'tenant',
        'departmentCode' => 'department_code',
    ];

    public function validate()
    {
        Model::validateRequired('customer', $this->customer, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->departmentCode) {
            $res['department_code'] = $this->departmentCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOperatorRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }
        if (isset($map['department_code'])) {
            $model->departmentCode = $map['department_code'];
        }

        return $model;
    }
}
