<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class SimpleContactInfo extends Model
{
    // 联系人名称
    /**
     * @example 小王
     *
     * @var string
     */
    public $contactName;

    // 联系电话
    /**
     * @example 18888888888
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
     * @return SimpleContactInfo
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
