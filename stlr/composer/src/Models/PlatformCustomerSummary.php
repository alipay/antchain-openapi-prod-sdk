<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\STLR\Models;

use AlibabaCloud\Tea\Model;

class PlatformCustomerSummary extends Model
{
    // 三方平台的客户ID
    /**
     * @example 2322323
     *
     * @var string
     */
    public $customerId;

    // 三方平台客户名称
    /**
     * @example ****有限公司
     *
     * @var string
     */
    public $customerName;

    // 联系人
    /**
     * @example 张三
     *
     * @var string
     */
    public $contactPerson;

    // 联系电话
    /**
     * @example 13655665566
     *
     * @var string
     */
    public $contactTelephone;

    // 联系邮箱
    /**
     * @example ss@163.com
     *
     * @var string
     */
    public $contactEmail;

    // 统一社会信用代码
    /**
     * @example 23123121
     *
     * @var string
     */
    public $socialCreditCode;
    protected $_name = [
        'customerId'       => 'customer_id',
        'customerName'     => 'customer_name',
        'contactPerson'    => 'contact_person',
        'contactTelephone' => 'contact_telephone',
        'contactEmail'     => 'contact_email',
        'socialCreditCode' => 'social_credit_code',
    ];

    public function validate()
    {
        Model::validateRequired('customerId', $this->customerId, true);
        Model::validateRequired('customerName', $this->customerName, true);
        Model::validateRequired('contactPerson', $this->contactPerson, true);
        Model::validateRequired('contactTelephone', $this->contactTelephone, true);
        Model::validateRequired('socialCreditCode', $this->socialCreditCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->customerName) {
            $res['customer_name'] = $this->customerName;
        }
        if (null !== $this->contactPerson) {
            $res['contact_person'] = $this->contactPerson;
        }
        if (null !== $this->contactTelephone) {
            $res['contact_telephone'] = $this->contactTelephone;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
        }
        if (null !== $this->socialCreditCode) {
            $res['social_credit_code'] = $this->socialCreditCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PlatformCustomerSummary
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['customer_name'])) {
            $model->customerName = $map['customer_name'];
        }
        if (isset($map['contact_person'])) {
            $model->contactPerson = $map['contact_person'];
        }
        if (isset($map['contact_telephone'])) {
            $model->contactTelephone = $map['contact_telephone'];
        }
        if (isset($map['contact_email'])) {
            $model->contactEmail = $map['contact_email'];
        }
        if (isset($map['social_credit_code'])) {
            $model->socialCreditCode = $map['social_credit_code'];
        }

        return $model;
    }
}
