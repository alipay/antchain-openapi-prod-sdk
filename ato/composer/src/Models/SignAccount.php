<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SignAccount extends Model
{
    // 公司统一社会信用代码（userType=ORGANIZATION必传）
    /**
     * @example 91310101MA1FPCXA3G
     *
     * @var string
     */
    public $companyId;

    // 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
    /**
     * @example MERCHANT
     *
     * @var string
     */
    public $companyRole;

    // 用户姓名（userType=PERSON必传，需要RSA加密）
    /**
     * @example RSA(用户姓名)
     *
     * @var string
     */
    public $userName;

    // 用户身份证号（userType=PERSON必传，需要RSA加密）
    /**
     * @example RSA(用户身份证号)
     *
     * @var string
     */
    public $userIdNumber;

    // 签署人类型，PERSON=个人;ORGANIZATION=机构
    /**
     * @example PERSON
     *
     * @var string
     */
    public $userType;

    // 用户邮箱（userType=PERSON必传，需要RSA加密）
    /**
     * @example RSA(用户邮箱)
     *
     * @var string
     */
    public $userEmail;

    // 用户手机号（userType=PERSON必传，需要RSA加密）
    /**
     * @example RSA(用户手机号)
     *
     * @var string
     */
    public $userMobile;

    // 签署标签（对应模版配置中的tag）
    /**
     * @example jiafang
     *
     * @var string
     */
    public $tag;

    // 是否获取签署链接
    /**
     * @example true, false
     *
     * @var bool
     */
    public $getSignUrl;
    protected $_name = [
        'companyId'    => 'company_id',
        'companyRole'  => 'company_role',
        'userName'     => 'user_name',
        'userIdNumber' => 'user_id_number',
        'userType'     => 'user_type',
        'userEmail'    => 'user_email',
        'userMobile'   => 'user_mobile',
        'tag'          => 'tag',
        'getSignUrl'   => 'get_sign_url',
    ];

    public function validate()
    {
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('tag', $this->tag, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->companyRole) {
            $res['company_role'] = $this->companyRole;
        }
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userIdNumber) {
            $res['user_id_number'] = $this->userIdNumber;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->userEmail) {
            $res['user_email'] = $this->userEmail;
        }
        if (null !== $this->userMobile) {
            $res['user_mobile'] = $this->userMobile;
        }
        if (null !== $this->tag) {
            $res['tag'] = $this->tag;
        }
        if (null !== $this->getSignUrl) {
            $res['get_sign_url'] = $this->getSignUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignAccount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['company_role'])) {
            $model->companyRole = $map['company_role'];
        }
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_id_number'])) {
            $model->userIdNumber = $map['user_id_number'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['user_email'])) {
            $model->userEmail = $map['user_email'];
        }
        if (isset($map['user_mobile'])) {
            $model->userMobile = $map['user_mobile'];
        }
        if (isset($map['tag'])) {
            $model->tag = $map['tag'];
        }
        if (isset($map['get_sign_url'])) {
            $model->getSignUrl = $map['get_sign_url'];
        }

        return $model;
    }
}
