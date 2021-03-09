<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UserQuery extends Model
{
    // 基础查询
    /**
     * @example
     *
     * @var PaginationQuery
     */
    public $baseQuery;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // customerId
    /**
     * @example customerId
     *
     * @var string
     */
    public $customerId;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;

    // types
    /**
     * @example
     *
     * @var string[]
     */
    public $types;

    // email
    /**
     * @example email
     *
     * @var string
     */
    public $email;

    // mobile
    /**
     * @example mobile
     *
     * @var string
     */
    public $mobile;

    // realName
    /**
     * @example realName
     *
     * @var string
     */
    public $realName;

    // loginName
    /**
     * @example loginName
     *
     * @var string
     */
    public $loginName;
    protected $_name = [
        'baseQuery'  => 'base_query',
        'id'         => 'id',
        'customerId' => 'customer_id',
        'tenantId'   => 'tenant_id',
        'type'       => 'type',
        'types'      => 'types',
        'email'      => 'email',
        'mobile'     => 'mobile',
        'realName'   => 'real_name',
        'loginName'  => 'login_name',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->baseQuery) {
            $res['base_query'] = null !== $this->baseQuery ? $this->baseQuery->toMap() : null;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->types) {
            $res['types'] = $this->types;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserQuery
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['base_query'])) {
            $model->baseQuery = PaginationQuery::fromMap($map['base_query']);
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['types'])) {
            if (!empty($map['types'])) {
                $model->types = $map['types'];
            }
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }

        return $model;
    }
}
