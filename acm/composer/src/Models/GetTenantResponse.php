<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetTenantResponse extends Model
{
    /**
     * @var string
     */
    public $reqMsgId;

    /**
     * @var string
     */
    public $resultCode;

    /**
     * @var string
     */
    public $resultMsg;

    // 蚂蚁通行证签约账户
    /**
     * @var string
     */
    public $antAccount;

    // 蚂蚁通行证uid
    /**
     * @var string
     */
    public $antUid;

    // 金融云官网:ANTCLOUD,蚂蚁开放平台：ANTOPEN
    /**
     * @var string
     */
    public $businessOwnerId;

    // 租户创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // 租户所在的企业的唯一标识
    /**
     * @var string
     */
    public $customer;

    // 租户描述信息
    /**
     * @var string
     */
    public $description;

    // 租户唯一标识
    /**
     * @var string
     */
    public $id;

    // 租户内部id
    /**
     * @var string
     */
    public $internalId;

    // 租户显示名称
    /**
     * @var string
     */
    public $name;

    // 租户最近一次修改时间，ISO8601格式
    /**
     * @var string
     */
    public $updateTime;
    protected $_name = [
        'reqMsgId'        => 'req_msg_id',
        'resultCode'      => 'result_code',
        'resultMsg'       => 'result_msg',
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
    ];

    public function validate()
    {
        Model::validateRequired('antAccount', $this->antAccount, true);
        Model::validateRequired('antUid', $this->antUid, true);
        Model::validateRequired('businessOwnerId', $this->businessOwnerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetTenantResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['req_msg_id'])) {
            $model->reqMsgId = $map['req_msg_id'];
        }
        if (isset($map['result_code'])) {
            $model->resultCode = $map['result_code'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
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

        return $model;
    }
}
