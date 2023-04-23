<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerInformation extends Model
{
    // 合作方（商家、伙伴）用户id
    /**
     * @example 2088xxxxxx
     *
     * @var string
     */
    public $tenantId;

    // 合作方（商家、伙伴）基本信息
    /**
     * @example 合作方（商家、伙伴）基本信息
     *
     * @var PartnerBasicInformation
     */
    public $basicInformation;

    // 联系信息
    /**
     * @example 联系信息
     *
     * @var PartnerContactInformation
     */
    public $contactInformation;

    // 除约定属性外的，其余商家主要信息
    /**
     * @example {"key1": "value1", "key2": "value2"}
     *
     * @var string
     */
    public $extendInfo;
    protected $_name = [
        'tenantId'           => 'tenant_id',
        'basicInformation'   => 'basic_information',
        'contactInformation' => 'contact_information',
        'extendInfo'         => 'extend_info',
    ];

    public function validate()
    {
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('basicInformation', $this->basicInformation, true);
        Model::validateRequired('contactInformation', $this->contactInformation, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->basicInformation) {
            $res['basic_information'] = null !== $this->basicInformation ? $this->basicInformation->toMap() : null;
        }
        if (null !== $this->contactInformation) {
            $res['contact_information'] = null !== $this->contactInformation ? $this->contactInformation->toMap() : null;
        }
        if (null !== $this->extendInfo) {
            $res['extend_info'] = $this->extendInfo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerInformation
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['basic_information'])) {
            $model->basicInformation = PartnerBasicInformation::fromMap($map['basic_information']);
        }
        if (isset($map['contact_information'])) {
            $model->contactInformation = PartnerContactInformation::fromMap($map['contact_information']);
        }
        if (isset($map['extend_info'])) {
            $model->extendInfo = $map['extend_info'];
        }

        return $model;
    }
}
