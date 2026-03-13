<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContactInfo extends Model
{
    // 联系人名字
    /**
     * @example 张三
     *
     * @var string
     */
    public $name;

    // 手机号
    /**
     * @example 13888888888
     *
     * @var string
     */
    public $mobile;

    // 电子邮箱
    /**
     * @example user@domain.com
     *
     * @var string
     */
    public $email;

    // 电话
    /**
     * @example 0571-85022088
     *
     * @var string
     */
    public $phone;

    // 身份证号
    /**
     * @example 110000199001011234
     *
     * @var string
     */
    public $idCardNo;
    protected $_name = [
        'name'     => 'name',
        'mobile'   => 'mobile',
        'email'    => 'email',
        'phone'    => 'phone',
        'idCardNo' => 'id_card_no',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('mobile', $this->mobile, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->idCardNo) {
            $res['id_card_no'] = $this->idCardNo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContactInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['id_card_no'])) {
            $model->idCardNo = $map['id_card_no'];
        }

        return $model;
    }
}
