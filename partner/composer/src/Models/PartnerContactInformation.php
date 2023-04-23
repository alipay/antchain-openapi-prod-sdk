<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerContactInformation extends Model
{
    // 企业联系人姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 企业联系人手机
    /**
     * @example 15688888888
     *
     * @var string
     */
    public $phone;

    // 企业联系邮箱
    /**
     * @example abcd@xyz.com
     *
     * @var string
     */
    public $email;

    // 通信邮编
    /**
     * @example 242332
     *
     * @var string
     */
    public $postCode;

    // 通信地址
    /**
     * @example 万塘路18号
     *
     * @var string
     */
    public $address;
    protected $_name = [
        'name'     => 'name',
        'phone'    => 'phone',
        'email'    => 'email',
        'postCode' => 'post_code',
        'address'  => 'address',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('email', $this->email, true);
        Model::validateRequired('postCode', $this->postCode, true);
        Model::validateRequired('address', $this->address, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->postCode) {
            $res['post_code'] = $this->postCode;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerContactInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['post_code'])) {
            $model->postCode = $map['post_code'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }

        return $model;
    }
}
