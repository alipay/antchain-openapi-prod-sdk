<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PROPERTYCHAIN\Models;

use AlibabaCloud\Tea\Model;

class Organization extends Model
{
    // 企业编号
    /**
     * @example roleCompanyNo
     *
     * @var string
     */
    public $roleCompanyNo;

    // 企业名称
    /**
     * @example roleCompanyName
     *
     * @var string
     */
    public $roleCompanyName;
    protected $_name = [
        'roleCompanyNo'   => 'role_company_no',
        'roleCompanyName' => 'role_company_name',
    ];

    public function validate()
    {
        Model::validateRequired('roleCompanyNo', $this->roleCompanyNo, true);
        Model::validateRequired('roleCompanyName', $this->roleCompanyName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->roleCompanyNo) {
            $res['role_company_no'] = $this->roleCompanyNo;
        }
        if (null !== $this->roleCompanyName) {
            $res['role_company_name'] = $this->roleCompanyName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return Organization
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['role_company_no'])) {
            $model->roleCompanyNo = $map['role_company_no'];
        }
        if (isset($map['role_company_name'])) {
            $model->roleCompanyName = $map['role_company_name'];
        }

        return $model;
    }
}
