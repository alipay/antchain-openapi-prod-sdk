<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class BclUserInfo extends Model
{
    // 用户账号ID
    // 长度不超过64位，本期只支持支付宝userid
    /**
     * @example 2088xxxxx
     *
     * @var string
     */
    public $userAccountId;

    // 用户账号平台类型
    // 1.支付宝：ALIPAY
    // 本期暂时只支持支付宝
    /**
     * @example ALIPAY
     *
     * @var string
     */
    public $userAccountType;

    // 承租人/企业姓名,长度不超过32位
    /**
     * @example 张三
     *
     * @var string
     */
    public $userCertName;

    // 承租人/企业证件号,长度不超过64位
    /**
     * @example 5002331982122xx233
     *
     * @var string
     */
    public $userCertNo;

    // 承租人/企业证件类型:
    // 1.身份证：IDENTITY_CARD
    // 本期暂时只支持个人身份证
    /**
     * @example IDENTITY_CARD
     *
     * @var string
     */
    public $userCertType;

    // 承租人/企业手机号,长度不超过32位
    /**
     * @example 172312xx231
     *
     * @var string
     */
    public $userPhoneNumber;

    // 承租人身份证人像面/企业营业执照 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * @example 24343.jpg
     *
     * @var string
     */
    public $userCertFrontFileId;

    // 承租人身份证国徽面 先调用文件上传的接口,这里填上传后返回的fileid
    /**
     * @example 342323.jpg
     *
     * @var string
     */
    public $userCertBackFileId;
    protected $_name = [
        'userAccountId'       => 'user_account_id',
        'userAccountType'     => 'user_account_type',
        'userCertName'        => 'user_cert_name',
        'userCertNo'          => 'user_cert_no',
        'userCertType'        => 'user_cert_type',
        'userPhoneNumber'     => 'user_phone_number',
        'userCertFrontFileId' => 'user_cert_front_file_id',
        'userCertBackFileId'  => 'user_cert_back_file_id',
    ];

    public function validate()
    {
        Model::validateRequired('userAccountId', $this->userAccountId, true);
        Model::validateRequired('userAccountType', $this->userAccountType, true);
        Model::validateRequired('userCertName', $this->userCertName, true);
        Model::validateRequired('userCertNo', $this->userCertNo, true);
        Model::validateRequired('userCertType', $this->userCertType, true);
        Model::validateRequired('userPhoneNumber', $this->userPhoneNumber, true);
        Model::validateRequired('userCertFrontFileId', $this->userCertFrontFileId, true);
        Model::validateMaxLength('userAccountId', $this->userAccountId, 64);
        Model::validateMaxLength('userAccountType', $this->userAccountType, 16);
        Model::validateMaxLength('userCertName', $this->userCertName, 32);
        Model::validateMaxLength('userCertNo', $this->userCertNo, 64);
        Model::validateMaxLength('userCertType', $this->userCertType, 32);
        Model::validateMaxLength('userPhoneNumber', $this->userPhoneNumber, 32);
        Model::validateMaxLength('userCertFrontFileId', $this->userCertFrontFileId, 64);
        Model::validateMaxLength('userCertBackFileId', $this->userCertBackFileId, 64);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userAccountId) {
            $res['user_account_id'] = $this->userAccountId;
        }
        if (null !== $this->userAccountType) {
            $res['user_account_type'] = $this->userAccountType;
        }
        if (null !== $this->userCertName) {
            $res['user_cert_name'] = $this->userCertName;
        }
        if (null !== $this->userCertNo) {
            $res['user_cert_no'] = $this->userCertNo;
        }
        if (null !== $this->userCertType) {
            $res['user_cert_type'] = $this->userCertType;
        }
        if (null !== $this->userPhoneNumber) {
            $res['user_phone_number'] = $this->userPhoneNumber;
        }
        if (null !== $this->userCertFrontFileId) {
            $res['user_cert_front_file_id'] = $this->userCertFrontFileId;
        }
        if (null !== $this->userCertBackFileId) {
            $res['user_cert_back_file_id'] = $this->userCertBackFileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BclUserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_account_id'])) {
            $model->userAccountId = $map['user_account_id'];
        }
        if (isset($map['user_account_type'])) {
            $model->userAccountType = $map['user_account_type'];
        }
        if (isset($map['user_cert_name'])) {
            $model->userCertName = $map['user_cert_name'];
        }
        if (isset($map['user_cert_no'])) {
            $model->userCertNo = $map['user_cert_no'];
        }
        if (isset($map['user_cert_type'])) {
            $model->userCertType = $map['user_cert_type'];
        }
        if (isset($map['user_phone_number'])) {
            $model->userPhoneNumber = $map['user_phone_number'];
        }
        if (isset($map['user_cert_front_file_id'])) {
            $model->userCertFrontFileId = $map['user_cert_front_file_id'];
        }
        if (isset($map['user_cert_back_file_id'])) {
            $model->userCertBackFileId = $map['user_cert_back_file_id'];
        }

        return $model;
    }
}
