<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class QueryInnerTenantaccountinfoResponse extends Model
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

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 绑定手机号
    /**
     * @var string
     */
    public $bindMobile;

    // 登录账号
    /**
     * @var string
     */
    public $loginName;

    // 注册时间
    /**
     * @var string
     */
    public $createTime;

    // 是否已实名认证
    /**
     * @var bool
     */
    public $isCertified;
    protected $_name = [
        'reqMsgId'    => 'req_msg_id',
        'resultCode'  => 'result_code',
        'resultMsg'   => 'result_msg',
        'tenantId'    => 'tenant_id',
        'bindMobile'  => 'bind_mobile',
        'loginName'   => 'login_name',
        'createTime'  => 'create_time',
        'isCertified' => 'is_certified',
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
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bindMobile) {
            $res['bind_mobile'] = $this->bindMobile;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->isCertified) {
            $res['is_certified'] = $this->isCertified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryInnerTenantaccountinfoResponse
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
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['bind_mobile'])) {
            $model->bindMobile = $map['bind_mobile'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['is_certified'])) {
            $model->isCertified = $map['is_certified'];
        }

        return $model;
    }
}
