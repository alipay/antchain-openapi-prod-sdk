<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class UserData extends Model
{
    // 用户账号
    /**
     * @example 18654362713
     *
     * @var string
     */
    public $account;

    // 账号类型
    /**
     * @example COPYRIGHT
     *
     * @var string
     */
    public $accountType;

    // 证件名称
    /**
     * @example 张三
     *
     * @var string
     */
    public $certName;

    // 证件号码
    /**
     * @example 11111111111
     *
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $certType;

    // 联系方式
    /**
     * @example 186534672712
     *
     * @var string
     */
    public $contactInfo;

    // 企业法人
    /**
     * @example 李四
     *
     * @var string
     */
    public $legalPerson;

    // 注册时间
    /**
     * @example 1603162178000
     *
     * @var int
     */
    public $regTime;

    // 账号状态
    /**
     * @example SUCCESS
     *
     * @var string
     */
    public $status;

    // 用户类型
    /**
     * @example PERSON
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'account'     => 'account',
        'accountType' => 'account_type',
        'certName'    => 'cert_name',
        'certNo'      => 'cert_no',
        'certType'    => 'cert_type',
        'contactInfo' => 'contact_info',
        'legalPerson' => 'legal_person',
        'regTime'     => 'reg_time',
        'status'      => 'status',
        'type'        => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('accountType', $this->accountType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('regTime', $this->regTime, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->accountType) {
            $res['account_type'] = $this->accountType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->contactInfo) {
            $res['contact_info'] = $this->contactInfo;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->regTime) {
            $res['reg_time'] = $this->regTime;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
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
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['account_type'])) {
            $model->accountType = $map['account_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['contact_info'])) {
            $model->contactInfo = $map['contact_info'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['reg_time'])) {
            $model->regTime = $map['reg_time'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
