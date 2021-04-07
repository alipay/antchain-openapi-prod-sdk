<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UserInfo extends Model
{
    // ID
    /**
     * @example 123
     *
     * @var string
     */
    public $id;

    // 用户来源系统，例如BUC,LDAP
    /**
     * @example BUC
     *
     * @var string
     */
    public $sourceSystem;

    // 用户在源系统的id
    /**
     * @example 123
     *
     * @var string
     */
    public $sourceUserId;

    // 登录名
    /**
     * @example test
     *
     * @var string
     */
    public $loginName;

    // 真实名
    /**
     * @example test
     *
     * @var string
     */
    public $realName;

    // 昵称
    /**
     * @example test
     *
     * @var string
     */
    public $nickName;

    // 客户ID
    /**
     * @example 123
     *
     * @var string
     */
    public $customerId;

    // 是否超级管理员
    /**
     * @example admin
     *
     * @var string
     */
    public $type;

    // 用户状态
    /**
     * @example CREATED
     *
     * @var string
     */
    public $status;

    // 即时通信账号
    /**
     * @example test
     *
     * @var string
     */
    public $imAccount;

    // 邮箱
    /**
     * @example test@alipay.com
     *
     * @var string
     */
    public $email;

    // 联系座机
    /**
     * @example 021-6666666
     *
     * @var string
     */
    public $phone;

    // 手机号
    /**
     * @example 13666666666
     *
     * @var string
     */
    public $mobile;

    // 工号
    /**
     * @example 123
     *
     * @var string
     */
    public $workNo;

    // 英文名
    /**
     * @example test
     *
     * @var string
     */
    public $enName;

    // 性别
    /**
     * @example MALE
     *
     * @var string
     */
    public $sex;

    // 国籍
    /**
     * @example CN
     *
     * @var string
     */
    public $nationCountry;

    // 民族
    /**
     * @example 汉
     *
     * @var string
     */
    public $nation;

    // 个人照片路径
    /**
     * @example http://*\/*.png
     *
     * @var string
     */
    public $personalPhoto;

    // 上次登录时间.
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $lastLogonTime;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;
    protected $_name = [
        'id'            => 'id',
        'sourceSystem'  => 'source_system',
        'sourceUserId'  => 'source_user_id',
        'loginName'     => 'login_name',
        'realName'      => 'real_name',
        'nickName'      => 'nick_name',
        'customerId'    => 'customer_id',
        'type'          => 'type',
        'status'        => 'status',
        'imAccount'     => 'im_account',
        'email'         => 'email',
        'phone'         => 'phone',
        'mobile'        => 'mobile',
        'workNo'        => 'work_no',
        'enName'        => 'en_name',
        'sex'           => 'sex',
        'nationCountry' => 'nation_country',
        'nation'        => 'nation',
        'personalPhoto' => 'personal_photo',
        'lastLogonTime' => 'last_logon_time',
        'gmtCreate'     => 'gmt_create',
        'gmtModified'   => 'gmt_modified',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validatePattern('lastLogonTime', $this->lastLogonTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->sourceSystem) {
            $res['source_system'] = $this->sourceSystem;
        }
        if (null !== $this->sourceUserId) {
            $res['source_user_id'] = $this->sourceUserId;
        }
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->nickName) {
            $res['nick_name'] = $this->nickName;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->imAccount) {
            $res['im_account'] = $this->imAccount;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->workNo) {
            $res['work_no'] = $this->workNo;
        }
        if (null !== $this->enName) {
            $res['en_name'] = $this->enName;
        }
        if (null !== $this->sex) {
            $res['sex'] = $this->sex;
        }
        if (null !== $this->nationCountry) {
            $res['nation_country'] = $this->nationCountry;
        }
        if (null !== $this->nation) {
            $res['nation'] = $this->nation;
        }
        if (null !== $this->personalPhoto) {
            $res['personal_photo'] = $this->personalPhoto;
        }
        if (null !== $this->lastLogonTime) {
            $res['last_logon_time'] = $this->lastLogonTime;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source_system'])) {
            $model->sourceSystem = $map['source_system'];
        }
        if (isset($map['source_user_id'])) {
            $model->sourceUserId = $map['source_user_id'];
        }
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['nick_name'])) {
            $model->nickName = $map['nick_name'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['im_account'])) {
            $model->imAccount = $map['im_account'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['work_no'])) {
            $model->workNo = $map['work_no'];
        }
        if (isset($map['en_name'])) {
            $model->enName = $map['en_name'];
        }
        if (isset($map['sex'])) {
            $model->sex = $map['sex'];
        }
        if (isset($map['nation_country'])) {
            $model->nationCountry = $map['nation_country'];
        }
        if (isset($map['nation'])) {
            $model->nation = $map['nation'];
        }
        if (isset($map['personal_photo'])) {
            $model->personalPhoto = $map['personal_photo'];
        }
        if (isset($map['last_logon_time'])) {
            $model->lastLogonTime = $map['last_logon_time'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }

        return $model;
    }
}
