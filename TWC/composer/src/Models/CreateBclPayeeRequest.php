<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateBclPayeeRequest extends Model
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

    // 企业证件姓名
    /**
     * @var string
     */
    public $certName;

    // 企业证件号
    /**
     * @var string
     */
    public $certNo;

    // 企业证件类型
    // unified_social_credit_code（统一社会信用代码）
    // enterprise_registered_number（企业工商注册号）
    /**
     * @var string
     */
    public $certType;

    // 企业法定代表人名称
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业法定代表人证件号
    /**
     * @var string
     */
    public $legalPersonCertNo;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'certName'            => 'cert_name',
        'certNo'              => 'cert_no',
        'certType'            => 'cert_type',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertNo'   => 'legal_person_cert_no',
    ];

    public function validate()
    {
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('legalPersonCertName', $this->legalPersonCertName, true);
        Model::validateRequired('legalPersonCertNo', $this->legalPersonCertNo, true);
        Model::validateMaxLength('certName', $this->certName, 96);
        Model::validateMaxLength('certNo', $this->certNo, 32);
        Model::validateMaxLength('legalPersonCertName', $this->legalPersonCertName, 32);
        Model::validateMaxLength('legalPersonCertNo', $this->legalPersonCertNo, 32);
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
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateBclPayeeRequest
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
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
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

        return $model;
    }
}
