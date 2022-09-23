<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContactInfo extends Model
{
    // 联系人-姓名
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactName;

    // 联系人-电话
    /**
     * @example 18888xxxx66
     *
     * @var string
     */
    public $contactPhone;

    // 联系人-电子邮箱
    /**
     * @example aaaaa@qq.com
     *
     * @var string
     */
    public $contactEmail;
    protected $_name = [
        'contactName'  => 'contact_name',
        'contactPhone' => 'contact_phone',
        'contactEmail' => 'contact_email',
    ];

    public function validate()
    {
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
        Model::validateRequired('contactEmail', $this->contactEmail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactPhone) {
            $res['contact_phone'] = $this->contactPhone;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
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
        if (isset($map['contact_name'])) {
            $model->contactName = $map['contact_name'];
        }
        if (isset($map['contact_phone'])) {
            $model->contactPhone = $map['contact_phone'];
        }
        if (isset($map['contact_email'])) {
            $model->contactEmail = $map['contact_email'];
        }

        return $model;
    }
}
