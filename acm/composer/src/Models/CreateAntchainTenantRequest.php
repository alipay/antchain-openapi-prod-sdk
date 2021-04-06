<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Acm\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainTenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 企业名称或个人名称
    /**
     * @var string
     */
    public $name;

    // 客户类型
    // PERSON("个人","1"),
    // ENTERPRISE("企业","2")
    /**
     * @var string
     */
    public $userType;

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

    // 法人证件号
    /**
     * @var string
     */
    public $artificialPersonCertNo;

    // 法人证件类型
    /**
     * @var string
     */
    public $artificialPersonCertType;

    // 支付宝登录号
    /**
     * @var string
     */
    public $loginName;

    // 支付宝uid(租户id)
    /**
     * @var string
     */
    public $tenantId;

    // 业务场景码
    /**
     * @var string
     */
    public $bussinessCode;

    // 在平台上的角色，比如服务提供方，服务消费方，合作机构，资金提供方
    /**
     * @var string
     */
    public $bussinessRole;

    // 是否支付宝账户入驻
    /**
     * @var bool
     */
    public $isAlipayTenant;

    // 是否认证过，不填默认未认证
    /**
     * @var bool
     */
    public $antchainCertified;
    protected $_name = [
        'authToken'                => 'auth_token',
        'name'                     => 'name',
        'userType'                 => 'user_type',
        'certNo'                   => 'cert_no',
        'certType'                 => 'cert_type',
        'realName'                 => 'real_name',
        'artificialPersonCertNo'   => 'artificial_person_cert_no',
        'artificialPersonCertType' => 'artificial_person_cert_type',
        'loginName'                => 'login_name',
        'tenantId'                 => 'tenant_id',
        'bussinessCode'            => 'bussiness_code',
        'bussinessRole'            => 'bussiness_role',
        'isAlipayTenant'           => 'is_alipay_tenant',
        'antchainCertified'        => 'antchain_certified',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('bussinessCode', $this->bussinessCode, true);
        Model::validateRequired('isAlipayTenant', $this->isAlipayTenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
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
        if (null !== $this->loginName) {
            $res['login_name'] = $this->loginName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bussinessCode) {
            $res['bussiness_code'] = $this->bussinessCode;
        }
        if (null !== $this->bussinessRole) {
            $res['bussiness_role'] = $this->bussinessRole;
        }
        if (null !== $this->isAlipayTenant) {
            $res['is_alipay_tenant'] = $this->isAlipayTenant;
        }
        if (null !== $this->antchainCertified) {
            $res['antchain_certified'] = $this->antchainCertified;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainTenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
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
        if (isset($map['login_name'])) {
            $model->loginName = $map['login_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['bussiness_code'])) {
            $model->bussinessCode = $map['bussiness_code'];
        }
        if (isset($map['bussiness_role'])) {
            $model->bussinessRole = $map['bussiness_role'];
        }
        if (isset($map['is_alipay_tenant'])) {
            $model->isAlipayTenant = $map['is_alipay_tenant'];
        }
        if (isset($map['antchain_certified'])) {
            $model->antchainCertified = $map['antchain_certified'];
        }

        return $model;
    }
}
