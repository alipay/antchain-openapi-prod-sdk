<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class Tenant extends Model
{
    // 蚂蚁通行证签约账户
    /**
     * @example antcloud@alipay.com
     *
     * @var string
     */
    public $antAccount;

    // 蚂蚁通行证uid
    /**
     * @example 2088xxxxx1
     *
     * @var string
     */
    public $antUid;

    // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
    /**
     * @example ANTCLOUD
     *
     * @var string
     */
    public $businessOwnerId;

    // 租户创建时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $createTime;

    // 租户所在的企业的唯一标识
    /**
     * @example 2088201881714570
     *
     * @var string
     */
    public $customer;

    // 租户描述信息
    /**
     * @example the default tenant
     *
     * @var string
     */
    public $description;

    // 租户唯一标识
    /**
     * @example TSCPDICN
     *
     * @var string
     */
    public $id;

    // 租户内部id
    /**
     * @example 0000000001
     *
     * @var string
     */
    public $internalId;

    // 租户显示名称
    /**
     * @example myTenant
     *
     * @var string
     */
    public $name;

    // 租户最近一次修改时间，ISO8601格式
    /**
     * @example
     *
     * @var string
     */
    public $updateTime;

    // 标签
    /**
     * @example ["tag1", "tag2"]
     *
     * @var string[]
     */
    public $tags;
    protected $_name = [
        'antAccount'      => 'ant_account',
        'antUid'          => 'ant_uid',
        'businessOwnerId' => 'business_owner_id',
        'createTime'      => 'create_time',
        'customer'        => 'customer',
        'description'     => 'description',
        'id'              => 'id',
        'internalId'      => 'internal_id',
        'name'            => 'name',
        'updateTime'      => 'update_time',
        'tags'            => 'tags',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->antAccount) {
            $res['ant_account'] = $this->antAccount;
        }
        if (null !== $this->antUid) {
            $res['ant_uid'] = $this->antUid;
        }
        if (null !== $this->businessOwnerId) {
            $res['business_owner_id'] = $this->businessOwnerId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->customer) {
            $res['customer'] = $this->customer;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->internalId) {
            $res['internal_id'] = $this->internalId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->tags) {
            $res['tags'] = $this->tags;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Tenant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ant_account'])) {
            $model->antAccount = $map['ant_account'];
        }
        if (isset($map['ant_uid'])) {
            $model->antUid = $map['ant_uid'];
        }
        if (isset($map['business_owner_id'])) {
            $model->businessOwnerId = $map['business_owner_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['customer'])) {
            $model->customer = $map['customer'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['internal_id'])) {
            $model->internalId = $map['internal_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['tags'])) {
            if (!empty($map['tags'])) {
                $model->tags = $map['tags'];
            }
        }

        return $model;
    }
}
