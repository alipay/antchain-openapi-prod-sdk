<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class UserData extends Model
{
    // 账号id
    /**
     * @example 12
     *
     * @var string
     */
    public $loginId;

    // 账号id
    /**
     * @example 12
     *
     * @var int
     */
    public $userId;

    // 用户类型
    /**
     * @example COMMON_USER_C
     *
     * @var string
     */
    public $userType;

    // 用户姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $userName;

    // 关联企业
    /**
     * @example xxx
     *
     * @var RefFirm[]
     */
    public $refFirms;

    // 认证状态
    /**
     * @example 认证状态
     *
     * @var string
     */
    public $certStatus;

    // 账户类别
    /**
     * @example xxx
     *
     * @var string
     */
    public $accountType;

    // did
    /**
     * @example did
     *
     * @var string
     */
    public $did;
    protected $_name = [
        'loginId'     => 'login_id',
        'userId'      => 'user_id',
        'userType'    => 'user_type',
        'userName'    => 'user_name',
        'refFirms'    => 'ref_firms',
        'certStatus'  => 'cert_status',
        'accountType' => 'account_type',
        'did'         => 'did',
    ];

    public function validate()
    {
        Model::validateRequired('loginId', $this->loginId, true);
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('refFirms', $this->refFirms, true);
        Model::validateRequired('certStatus', $this->certStatus, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('did', $this->did, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->loginId) {
            $res['login_id'] = $this->loginId;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->refFirms) {
            $res['ref_firms'] = [];
            if (null !== $this->refFirms && \is_array($this->refFirms)) {
                $n = 0;
                foreach ($this->refFirms as $item) {
                    $res['ref_firms'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->certStatus) {
            $res['cert_status'] = $this->certStatus;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->did) {
            $res['did'] = $this->did;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['login_id'])) {
            $model->loginId = $map['login_id'];
        }
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['ref_firms'])) {
            if (!empty($map['ref_firms'])) {
                $model->refFirms = [];
                $n               = 0;
                foreach ($map['ref_firms'] as $item) {
                    $model->refFirms[$n++] = null !== $item ? RefFirm::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['cert_status'])) {
            $model->certStatus = $map['cert_status'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['did'])) {
            $model->did = $map['did'];
        }

        return $model;
    }
}
