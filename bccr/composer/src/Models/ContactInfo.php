<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class ContactInfo extends Model
{
    // 联系人
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactName;

    // 联系电话
    /**
     * @example 17688887777
     *
     * @var string
     */
    public $contactPhone;
    protected $_name = [
        'contactName'  => 'contact_name',
        'contactPhone' => 'contact_phone',
    ];

    public function validate()
    {
        Model::validateRequired('contactName', $this->contactName, true);
        Model::validateRequired('contactPhone', $this->contactPhone, true);
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

        return $model;
    }
}
