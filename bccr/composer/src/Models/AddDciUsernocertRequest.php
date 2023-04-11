<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddDciUsernocertRequest extends Model
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

    // 用户名称
    /**
     * @var string
     */
    public $certificateName;

    // 证件类型
    /**
     * @var string
     */
    public $certificateType;

    // 证件号
    /**
     * @var string
     */
    public $certificateNumber;

    // 企业用户必填
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 企业用户必填
    /**
     * @var string
     */
    public $legalPersonCertType;

    // 企业用户必填
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 代理信息
    /**
     * @var ProxyData
     */
    public $proxyData;

    // 幂等字段
    /**
     * @var string
     */
    public $clientToken;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'certificateName'     => 'certificate_name',
        'certificateType'     => 'certificate_type',
        'certificateNumber'   => 'certificate_number',
        'legalPersonCertName' => 'legal_person_cert_name',
        'legalPersonCertType' => 'legal_person_cert_type',
        'legalPersonCertNo'   => 'legal_person_cert_no',
        'phone'               => 'phone',
        'proxyData'           => 'proxy_data',
        'clientToken'         => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('certificateName', $this->certificateName, true);
        Model::validateRequired('certificateType', $this->certificateType, true);
        Model::validateRequired('certificateNumber', $this->certificateNumber, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('clientToken', $this->clientToken, true);
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
        if (null !== $this->certificateName) {
            $res['certificate_name'] = $this->certificateName;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->legalPersonCertName) {
            $res['legal_person_cert_name'] = $this->legalPersonCertName;
        }
        if (null !== $this->legalPersonCertType) {
            $res['legal_person_cert_type'] = $this->legalPersonCertType;
        }
        if (null !== $this->legalPersonCertNo) {
            $res['legal_person_cert_no'] = $this->legalPersonCertNo;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->proxyData) {
            $res['proxy_data'] = null !== $this->proxyData ? $this->proxyData->toMap() : null;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDciUsernocertRequest
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
        if (isset($map['certificate_name'])) {
            $model->certificateName = $map['certificate_name'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['legal_person_cert_name'])) {
            $model->legalPersonCertName = $map['legal_person_cert_name'];
        }
        if (isset($map['legal_person_cert_type'])) {
            $model->legalPersonCertType = $map['legal_person_cert_type'];
        }
        if (isset($map['legal_person_cert_no'])) {
            $model->legalPersonCertNo = $map['legal_person_cert_no'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['proxy_data'])) {
            $model->proxyData = ProxyData::fromMap($map['proxy_data']);
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }

        return $model;
    }
}
