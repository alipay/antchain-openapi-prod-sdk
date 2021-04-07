<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryUserRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // customer_id
    /**
     * @var string
     */
    public $customerId;

    // 邮箱
    /**
     * @var string
     */
    public $email;

    // 用户ID
    /**
     * @var string
     */
    public $id;

    // is_locale_enabled
    /**
     * @var bool
     */
    public $isLocaleEnabled;

    // local
    /**
     * @var string
     */
    public $local;

    // 登录名称
    /**
     * @var string
     */
    public $loginName;

    // 手机号
    /**
     * @var string
     */
    public $mobile;

    // 排序关键字列表
    /**
     * @var string[]
     */
    public $orders;

    // 每页个数
    /**
     * @var int
     */
    public $pageSize;

    // 是否分页
    /**
     * @var bool
     */
    public $paging;

    // 查询类型
    // 模糊查询 FUZZY
    // 精准查询 ACCURATE,
    // 前缀查询 START_WITH
    /**
     * @var string
     */
    public $queryType;

    // 实际名称
    /**
     * @var string
     */
    public $realName;

    // search
    /**
     * @var bool
     */
    public $search;

    // 账户类型
    // MASTER 主账号
    // OPERATOR 操作员
    // SERVICE 服务账号
    // STS_ACTOR 虚拟身份
    /**
     * @var string
     */
    public $type;

    // 账户类型列表
    /**
     * @var string[]
     */
    public $types;
    protected $_name = [
        'authToken'       => 'auth_token',
        'currentPage'     => 'current_page',
        'customerId'      => 'customer_id',
        'email'           => 'email',
        'id'              => 'id',
        'isLocaleEnabled' => 'is_locale_enabled',
        'local'           => 'local',
        'loginName'       => 'login_name',
        'mobile'          => 'mobile',
        'orders'          => 'orders',
        'pageSize'        => 'page_size',
        'paging'          => 'paging',
        'queryType'       => 'query_type',
        'realName'        => 'real_name',
        'search'          => 'search',
        'type'            => 'type',
        'types'           => 'types',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isLocaleEnabled) {
            $res['is_locale_enabled'] = $this->isLocaleEnabled;
        }
        if (null !== $this->local) {
            $res['local'] = $this->local;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->paging) {
            $res['paging'] = $this->paging;
        }
        if (null !== $this->queryType) {
            $res['query_type'] = $this->queryType;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryUserRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_locale_enabled'])) {
            $model->isLocaleEnabled = $map['is_locale_enabled'];
        }
        if (isset($map['local'])) {
            $model->local = $map['local'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['orders'])) {
            if (!empty($map['orders'])) {
                $model->orders = $map['orders'];
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['paging'])) {
            $model->paging = $map['paging'];
        }
        if (isset($map['query_type'])) {
            $model->queryType = $map['query_type'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }

        return $model;
    }
}
