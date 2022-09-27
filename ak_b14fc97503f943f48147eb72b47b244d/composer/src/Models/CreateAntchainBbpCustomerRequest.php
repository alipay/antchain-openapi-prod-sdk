<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_b14fc97503f943f48147eb72b47b244d\Models;

use AlibabaCloud\Tea\Model;

class CreateAntchainBbpCustomerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 业务渠道，需提前申请产品码
    /**
     * @var string
     */
    public $bizCode;

    // 客户类型：ENTERPRISE-企业, PERSON-个人
    //
    /**
     * @var string
     */
    public $customerType;

    // 客户名称
    /**
     * @var string
     */
    public $name;

    // 客户证件号码，企业/个人均可
    /**
     * @var string
     */
    public $certNo;

    // 客户证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    /**
     * @var string
     */
    public $certType;

    // 法人姓名
    //
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人证件号码
    //
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 法人证件号码类型，枚举值参考：com.alipay.fc.common.lang.enums.CertTypeEnum
    /**
     * @var string
     */
    public $legalPersonCertNoType;

    // 是否需要先认证再注册，默认不认证。
    /**
     * @var bool
     */
    public $isAuth;

    // 业务角色： 买方，卖方，机构，合作伙伴
    /**
     * @var string
     */
    public $businessRole;

    // 客户支付宝ID，如有则填。
    /**
     * @var string
     */
    public $alipayUid;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'bizCode'               => 'biz_code',
        'customerType'          => 'customer_type',
        'name'                  => 'name',
        'certNo'                => 'cert_no',
        'certType'              => 'cert_type',
        'legalPersonCertName'   => 'legal_person_cert_name',
        'legalPersonCertNo'     => 'legal_person_cert_no',
        'legalPersonCertNoType' => 'legal_person_cert_no_type',
        'isAuth'                => 'is_auth',
        'businessRole'          => 'business_role',
        'alipayUid'             => 'alipay_uid',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('customerType', $this->customerType, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('legalPersonCertNoType', $this->legalPersonCertNoType, true);
        Model::validateRequired('isAuth', $this->isAuth, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->customerType) {
            $res['customer_type'] = $this->customerType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->legalPersonCertNoType) {
            $res['legal_person_cert_no_type'] = $this->legalPersonCertNoType;
        }
        if (null !== $this->isAuth) {
            $res['is_auth'] = $this->isAuth;
        }
        if (null !== $this->businessRole) {
            $res['business_role'] = $this->businessRole;
        }
        if (null !== $this->alipayUid) {
            $res['alipay_uid'] = $this->alipayUid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntchainBbpCustomerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['customer_type'])) {
            $model->customerType = $map['customer_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['legal_person_cert_no_type'])) {
            $model->legalPersonCertNoType = $map['legal_person_cert_no_type'];
        }
        if (isset($map['is_auth'])) {
            $model->isAuth = $map['is_auth'];
        }
        if (isset($map['business_role'])) {
            $model->businessRole = $map['business_role'];
        }
        if (isset($map['alipay_uid'])) {
            $model->alipayUid = $map['alipay_uid'];
        }

        return $model;
    }
}
