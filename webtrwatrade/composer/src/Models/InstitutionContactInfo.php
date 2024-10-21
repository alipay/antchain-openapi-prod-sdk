<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class InstitutionContactInfo extends Model
{
    // 联系人
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactPerson;

    // 联系人邮箱
    /**
     * @example 12345@gmail.com
     *
     * @var string
     */
    public $contactEmail;
    protected $_name = [
        'contactPerson' => 'contact_person',
        'contactEmail'  => 'contact_email',
    ];

    public function validate()
    {
        Model::validateRequired('contactPerson', $this->contactPerson, true);
        Model::validateRequired('contactEmail', $this->contactEmail, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contactPerson) {
            $res['contact_person'] = $this->contactPerson;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InstitutionContactInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contact_person'])) {
            $model->contactPerson = $map['contact_person'];
        }
        if (isset($map['contact_email'])) {
            $model->contactEmail = $map['contact_email'];
        }

        return $model;
    }
}
