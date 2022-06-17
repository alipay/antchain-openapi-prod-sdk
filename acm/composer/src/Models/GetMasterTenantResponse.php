<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class GetMasterTenantResponse extends Model
{
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 蚂蚁通行证签约账户
    /**
     * @var string
     */
    public $loginName;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 租户创建时间，ISO8601格式
    /**
     * @var string
     */
    public $createTime;

    // 客户id
    /**
     * @var string
     */
    public $customerId;

    // 租户描述信息
    /**
     * @var string
     */
    public $description;

    // 租户名称
    /**
     * @var string
     */
    public $name;

    // 租户最近一次修改时间，ISO8601格式
    /**
     * @var string
     */
    public $updateTime;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

    // 租户的类型 N 支付宝 Q支付宝开放平台 V 蚂蚁链账号
    /**
     * @var string
     */
    public $tenantLevel;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 证件号码
    /**
     * @var string
     */
    public $certNo;

    // 法人姓名，个人账号时是个人姓名
    /**
     * @var string
     */
    public $realName;

    // 企业姓名
    /**
     * @var string
     */
    public $firmName;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'loginName'   => 'login_name',
        'tenantId'    => 'tenant_id',
        'createTime'  => 'create_time',
        'customerId'  => 'customer_id',
        'description' => 'description',
        'name'        => 'name',
        'updateTime'  => 'update_time',
        'userType'    => 'user_type',
        'tenantLevel' => 'tenant_level',
        'certType'    => 'cert_type',
        'certNo'      => 'cert_no',
        'realName'    => 'real_name',
        'firmName'    => 'firm_name',
    ];

    public function validate()
    {
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
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->updateTime) {
            $res['update_time'] = $this->updateTime;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->tenantLevel) {
            $res['tenant_level'] = $this->tenantLevel;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMasterTenantResponse
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
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['update_time'])) {
            $model->updateTime = $map['update_time'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['tenant_level'])) {
            $model->tenantLevel = $map['tenant_level'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }

        return $model;
    }
}
