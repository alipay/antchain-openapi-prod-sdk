<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class CreateDisDidRequest extends Model
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

    // 个人身份证号。当组织类型为个人时，此字段为必填项
    /**
     * @var string
     */
    public $certNo;

    // 企业名称。当组织类型为企业时，此字段为必填项
    /**
     * @var string
     */
    public $epCertName;

    // 企业信用号码。当组织类型为企业时，此字段为必填项
    /**
     * @var string
     */
    public $epCertNo;

    // 扩展字段
    /**
     * @var string
     */
    public $extensionInfo;

    // 企业法人姓名。当申请企业类型网络货运平台或者子平台时，此字段为必填项
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法人身份证号码。当申请企业类型网络货运平台或者子平台时，此字段为必填项
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 个人手机号码。当组织类型为个人时，此字段为必填项
    /**
     * @var string
     */
    public $mobile;

    // 个人姓名。当组织类型为个人时，此字段为必填项
    /**
     * @var string
     */
    public $name;

    // 组织类型。企业或者个人，二选一填入
    /**
     * @var string
     */
    public $organizationType;

    // 所属平台did。如果为空时，表示创建根平台，允许申请网络货运平台或者3pl角色。创建除根平台外的其他身份时，所属平台did必须填写。
    /**
     * @var string
     */
    public $platformDid;

    // 角色类型。
    // 当组织类型为个人时，可填角色：货主、司机、承运商；
    // 当组织类型为企业时，可填角色：网络货运平台、道路运输企业/3pl、货主、子平台、承运商
    /**
     * @var string
     */
    public $roleType;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'certNo'              => 'cert_no',
        'epCertName'          => 'ep_cert_name',
        'epCertNo'            => 'ep_cert_no',
        'extensionInfo'       => 'extension_info',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'mobile'              => 'mobile',
        'name'                => 'name',
        'organizationType'    => 'organization_type',
        'platformDid'         => 'platform_did',
        'roleType'            => 'role_type',
    ];

    public function validate()
    {
        Model::validateRequired('organizationType', $this->organizationType, true);
        Model::validateRequired('roleType', $this->roleType, true);
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
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->epCertName) {
            $res['ep_cert_name'] = $this->epCertName;
        }
        if (null !== $this->epCertNo) {
            $res['ep_cert_no'] = $this->epCertNo;
        }
        if (null !== $this->extensionInfo) {
            $res['extension_info'] = $this->extensionInfo;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->mobile) {
            $res['mobile'] = $this->mobile;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->organizationType) {
            $res['organization_type'] = $this->organizationType;
        }
        if (null !== $this->platformDid) {
            $res['platform_did'] = $this->platformDid;
        }
        if (null !== $this->roleType) {
            $res['role_type'] = $this->roleType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDisDidRequest
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
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['ep_cert_name'])) {
            $model->epCertName = $map['ep_cert_name'];
        }
        if (isset($map['ep_cert_no'])) {
            $model->epCertNo = $map['ep_cert_no'];
        }
        if (isset($map['extension_info'])) {
            $model->extensionInfo = $map['extension_info'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['mobile'])) {
            $model->mobile = $map['mobile'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['organization_type'])) {
            $model->organizationType = $map['organization_type'];
        }
        if (isset($map['platform_did'])) {
            $model->platformDid = $map['platform_did'];
        }
        if (isset($map['role_type'])) {
            $model->roleType = $map['role_type'];
        }

        return $model;
    }
}
