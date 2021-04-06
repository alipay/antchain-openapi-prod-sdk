<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class UpdateCustomerIdentityRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 客户id
    /**
     * @var string
     */
    public $customerId;

    // 企业名称或个人名称
    /**
     * @var string
     */
    public $name;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 证件号
    /**
     * @var string
     */
    public $certNo;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 法人姓名
    /**
     * @var string
     */
    public $realName;

    // 法人证件号码
    /**
     * @var string
     */
    public $artificialPersonCertNo;

    // 法人证件类型
    /**
     * @var string
     */
    public $artificialPersonCertType;

    // 业务场景码
    /**
     * @var string
     */
    public $businessCode;

    // 业务角色
    /**
     * @var string
     */
    public $bussinessRole;
    protected $_name = [
        'authToken'                => 'auth_token',
        'customerId'               => 'customer_id',
        'name'                     => 'name',
        'tenantId'                 => 'tenant_id',
        'certNo'                   => 'cert_no',
        'certType'                 => 'cert_type',
        'realName'                 => 'real_name',
        'artificialPersonCertNo'   => 'artificial_person_cert_no',
        'artificialPersonCertType' => 'artificial_person_cert_type',
        'businessCode'             => 'business_code',
        'bussinessRole'            => 'bussiness_role',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('businessCode', $this->businessCode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->realName) {
            $res['real_name'] = $this->realName;
        }
        if (null !== $this->artificialPersonCertNo) {
            $res['artificial_person_cert_no'] = $this->artificialPersonCertNo;
        }
        if (null !== $this->artificialPersonCertType) {
            $res['artificial_person_cert_type'] = $this->artificialPersonCertType;
        }
        if (null !== $this->businessCode) {
            $res['business_code'] = $this->businessCode;
        }
        if (null !== $this->bussinessRole) {
            $res['bussiness_role'] = $this->bussinessRole;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCustomerIdentityRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['real_name'])) {
            $model->realName = $map['real_name'];
        }
        if (isset($map['artificial_person_cert_no'])) {
            $model->artificialPersonCertNo = $map['artificial_person_cert_no'];
        }
        if (isset($map['artificial_person_cert_type'])) {
            $model->artificialPersonCertType = $map['artificial_person_cert_type'];
        }
        if (isset($map['business_code'])) {
            $model->businessCode = $map['business_code'];
        }
        if (isset($map['bussiness_role'])) {
            $model->bussinessRole = $map['bussiness_role'];
        }

        return $model;
    }
}
