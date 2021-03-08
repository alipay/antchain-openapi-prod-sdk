<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class QueryGroupRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 授权组成员ID。授权组成员是操作员
    /**
     * @var string
     */
    public $memberId;

    // 授权组名称
    /**
     * @var string
     */
    public $name;

    // 当前页码，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认10
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken' => 'auth_token',
        'memberId'  => 'member_id',
        'name'      => 'name',
        'pageNum'   => 'page_num',
        'pageSize'  => 'page_size',
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
        if (null !== $this->memberId) {
            $res['member_id'] = $this->memberId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
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
     * @return QueryGroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['member_id'])) {
            $model->memberId = $map['member_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
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
