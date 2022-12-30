<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class SubmitRequest extends Model
{
    // 测试
    /**
     * @example 测试
     *
     * @var string
     */
    public $title;

    // 问题描述（富文本）
    /**
     * @example 无
     *
     * @var string
     */
    public $description;

    // 影响
    /**
     * @example 影响
     *
     * @var string
     */
    public $influence;

    // 账号
    /**
     * @example
     *
     * @var string
     */
    public $account;

    // 姓名
    /**
     * @example
     *
     * @var string
     */
    public $name;

    // 手机号
    /**
     * @example
     *
     * @var string
     */
    public $phone;

    // 邮箱
    /**
     * @example
     *
     * @var string
     */
    public $email;

    // 钉钉群
    /**
     * @example
     *
     * @var string
     */
    public $group;

    // 校验令牌（接入RDS校验）
    /**
     * @example
     *
     * @var string
     */
    public $token;

    // ip
    /**
     * @example
     *
     * @var string
     */
    public $ip;

    // 验证码
    /**
     * @example
     *
     * @var string
     */
    public $verifyCode;

    // RDS的bizNo
    /**
     * @example
     *
     * @var string
     */
    public $bizNo;

    // 公有化PUBLIC、私有化PRIVATE
    /**
     * @example
     *
     * @var string
     */
    public $type;

    // 上传附件的URL
    /**
     * @example
     *
     * @var string[]
     */
    public $fileUrl;
    protected $_name = [
        'title'       => 'title',
        'description' => 'description',
        'influence'   => 'influence',
        'account'     => 'account',
        'name'        => 'name',
        'phone'       => 'phone',
        'email'       => 'email',
        'group'       => 'group',
        'token'       => 'token',
        'ip'          => 'ip',
        'verifyCode'  => 'verify_code',
        'bizNo'       => 'biz_no',
        'type'        => 'type',
        'fileUrl'     => 'file_url',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('influence', $this->influence, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('token', $this->token, true);
        Model::validateRequired('ip', $this->ip, true);
        Model::validateRequired('verifyCode', $this->verifyCode, true);
        Model::validateRequired('bizNo', $this->bizNo, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->influence) {
            $res['influence'] = $this->influence;
        }
        if (null !== $this->account) {
            $res['account'] = $this->account;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->group) {
            $res['group'] = $this->group;
        }
        if (null !== $this->token) {
            $res['token'] = $this->token;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->verifyCode) {
            $res['verify_code'] = $this->verifyCode;
        }
        if (null !== $this->bizNo) {
            $res['biz_no'] = $this->bizNo;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['influence'])) {
            $model->influence = $map['influence'];
        }
        if (isset($map['account'])) {
            $model->account = $map['account'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['group'])) {
            $model->group = $map['group'];
        }
        if (isset($map['token'])) {
            $model->token = $map['token'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['verify_code'])) {
            $model->verifyCode = $map['verify_code'];
        }
        if (isset($map['biz_no'])) {
            $model->bizNo = $map['biz_no'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['file_url'])) {
            if (!empty($map['file_url'])) {
                $model->fileUrl = $map['file_url'];
            }
        }

        return $model;
    }
}
