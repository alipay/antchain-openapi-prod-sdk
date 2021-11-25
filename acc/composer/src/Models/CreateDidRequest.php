<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateDidRequest extends Model
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

    // ⾃定义唯⼀id
    /**
     * @var string
     */
    public $bizId;

    // 租户类型
    //
    /**
     * @var string
     */
    public $tenantType;

    // 认证类型，企业：FIRM，个人：PERSON
    /**
     * @var string
     */
    public $certType;

    // 企业营业执照号(当认证类型为企业时为必传)
    /**
     * @var string
     */
    public $certRegNum;

    // 法人姓名
    /**
     * @var string
     */
    public $legalName;

    // 法人身份证号
    /**
     * @var string
     */
    public $legalCertNum;

    // 企业名称(当认证类型为企业时为必传)
    /**
     * @var string
     */
    public $firmName;

    // 个人email
    /**
     * @var string
     */
    public $email;

    // 个人身份证号
    /**
     * @var string
     */
    public $certNum;

    // 个人手机号
    /**
     * @var string
     */
    public $phone;

    // 个人姓名
    /**
     * @var string
     */
    public $name;

    // 个人did(当认证类型为企业时为必传)
    /**
     * @var string
     */
    public $userDid;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'bizId'             => 'biz_id',
        'tenantType'        => 'tenant_type',
        'certType'          => 'cert_type',
        'certRegNum'        => 'cert_reg_num',
        'legalName'         => 'legal_name',
        'legalCertNum'      => 'legal_cert_num',
        'firmName'          => 'firm_name',
        'email'             => 'email',
        'certNum'           => 'cert_num',
        'phone'             => 'phone',
        'name'              => 'name',
        'userDid'           => 'user_did',
    ];

    public function validate()
    {
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('tenantType', $this->tenantType, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNum', $this->certNum, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->tenantType) {
            $res['tenant_type'] = $this->tenantType;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certRegNum) {
            $res['cert_reg_num'] = $this->certRegNum;
        }
        if (null !== $this->legalName) {
            $res['legal_name'] = $this->legalName;
        }
        if (null !== $this->legalCertNum) {
            $res['legal_cert_num'] = $this->legalCertNum;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->email) {
            $res['email'] = $this->email;
        }
        if (null !== $this->certNum) {
            $res['cert_num'] = $this->certNum;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->userDid) {
            $res['user_did'] = $this->userDid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDidRequest
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
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['tenant_type'])) {
            $model->tenantType = $map['tenant_type'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_reg_num'])) {
            $model->certRegNum = $map['cert_reg_num'];
        }
        if (isset($map['legal_name'])) {
            $model->legalName = $map['legal_name'];
        }
        if (isset($map['legal_cert_num'])) {
            $model->legalCertNum = $map['legal_cert_num'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['email'])) {
            $model->email = $map['email'];
        }
        if (isset($map['cert_num'])) {
            $model->certNum = $map['cert_num'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['user_did'])) {
            $model->userDid = $map['user_did'];
        }

        return $model;
    }
}
