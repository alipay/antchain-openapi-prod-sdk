<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class Emergency extends Model
{
    // 标题
    /**
     * @example
     *
     * @var string
     */
    public $title;

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

    // 当前记录状态
    /**
     * @example 当前记录状态( SUCCESS_START发起成功， FAIL_STAT发起失败， FAIL_CONN未接通， SUCCESS_CONN已接通)
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'title'   => 'title',
        'account' => 'account',
        'name'    => 'name',
        'phone'   => 'phone',
        'email'   => 'email',
        'group'   => 'group',
        'status'  => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('title', $this->title, true);
        Model::validateRequired('account', $this->account, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('group', $this->group, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->title) {
            $res['title'] = $this->title;
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
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Emergency
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['title'])) {
            $model->title = $map['title'];
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
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
