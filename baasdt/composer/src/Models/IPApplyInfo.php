<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class IPApplyInfo extends Model
{
    // 账户Id
    /**
     * @example 381055Afc982d96fAB65b3a49cAc8b878184Cb16
     *
     * @var string
     */
    public $accountId;

    // 用户名
    /**
     * @example wjy@alipay.com
     *
     * @var string
     */
    public $loginName;

    // 支付宝账户
    /**
     * @example wjy@alipay.com
     *
     * @var string
     */
    public $alipayLoginName;

    // 联系人
    /**
     * @example 马云
     *
     * @var string
     */
    public $legalName;

    // 联系方式
    /**
     * @example 13291887615
     *
     * @var string
     */
    public $phoneNumber;

    // 角色(1: 版权方 2:商家)
    /**
     * @example 1
     *
     * @var int
     */
    public $role;

    // 状态
    /**
     * @example 1
     *
     * @var int
     */
    public $status;
    protected $_name = [
        'accountId'       => 'account_id',
        'loginName'       => 'login_name',
        'alipayLoginName' => 'alipay_login_name',
        'legalName'       => 'legal_name',
        'phoneNumber'     => 'phone_number',
        'role'            => 'role',
        'status'          => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('accountId', $this->accountId, true);
        Model::validateRequired('loginName', $this->loginName, true);
        Model::validateRequired('alipayLoginName', $this->alipayLoginName, true);
        Model::validateRequired('legalName', $this->legalName, true);
        Model::validateRequired('phoneNumber', $this->phoneNumber, true);
        Model::validateRequired('role', $this->role, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->accountId) {
            $res['account_id'] = $this->accountId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->alipayLoginName) {
            $res['alipay_login_name'] = $this->alipayLoginName;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->phoneNumber) {
            $res['phone_number'] = $this->phoneNumber;
        }
        if (null !== $this->role) {
            $res['role'] = $this->role;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return IPApplyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['account_id'])) {
            $model->accountId = $map['account_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['alipay_login_name'])) {
            $model->alipayLoginName = $map['alipay_login_name'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['phone_number'])) {
            $model->phoneNumber = $map['phone_number'];
        }
        if (isset($map['role'])) {
            $model->role = $map['role'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
