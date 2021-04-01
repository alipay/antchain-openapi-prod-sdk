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

    // 用户的外系统识别Id
    /**
     * @example User001
     *
     * @var string
     */
    public $externalUserId;

    // 外部系统用户名
    /**
     * @example 用户名
     *
     * @var string
     */
    public $externalUserName;

    // 申请时间(毫秒时间戳)
    /**
     * @example 3810551857
     *
     * @var int
     */
    public $applyDate;
    protected $_name = [
        'accountId'        => 'account_id',
        'loginName'        => 'login_name',
        'alipayLoginName'  => 'alipay_login_name',
        'legalName'        => 'legal_name',
        'phoneNumber'      => 'phone_number',
        'role'             => 'role',
        'status'           => 'status',
        'externalUserId'   => 'external_user_id',
        'externalUserName' => 'external_user_name',
        'applyDate'        => 'apply_date',
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
        Model::validateRequired('externalUserId', $this->externalUserId, true);
        Model::validateRequired('externalUserName', $this->externalUserName, true);
        Model::validateRequired('applyDate', $this->applyDate, true);
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
        if (null !== $this->externalUserId) {
            $res['external_user_id'] = $this->externalUserId;
        }
        if (null !== $this->externalUserName) {
            $res['external_user_name'] = $this->externalUserName;
        }
        if (null !== $this->applyDate) {
            $res['apply_date'] = $this->applyDate;
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
        if (isset($map['external_user_id'])) {
            $model->externalUserId = $map['external_user_id'];
        }
        if (isset($map['external_user_name'])) {
            $model->externalUserName = $map['external_user_name'];
        }
        if (isset($map['apply_date'])) {
            $model->applyDate = $map['apply_date'];
        }

        return $model;
    }
}
