<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BILLING\Models;

use AlibabaCloud\Tea\Model;

class GetAccountUserResponse extends Model
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

    // 智能科技user_id
    /**
     * @var string
     */
    public $tenantId;

    // 登录名
    /**
     * @var string
     */
    public $loginName;

    // 用户的真实姓名
    /**
     * @var string
     */
    public $realName;

    // 手机号
    /**
     * @var string
     */
    public $mobileNum;

    // 公司名称
    /**
     * @var string
     */
    public $firmName;

    // 帐号类型，企业或者是个人
    // ENTERPRISE("1","企业类型账号"),
    // INDIVIDUAL("2","个人类型账号")
    /**
     * @var string
     */
    public $userType;
    protected $_name = [
        'reqMsgId'   => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg'  => 'result_msg',
        'tenantId'   => 'tenant_id',
        'loginName'  => 'login_name',
        'realName'   => 'real_name',
        'mobileNum'  => 'mobile_num',
        'firmName'   => 'firm_name',
        'userType'   => 'user_type',
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
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->mobileNum) {
            $res['mobile_num'] = $this->mobileNum;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetAccountUserResponse
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
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['mobile_num'])) {
            $model->mobileNum = $map['mobile_num'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }

        return $model;
    }
}
