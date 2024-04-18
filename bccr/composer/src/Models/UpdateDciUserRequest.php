<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class UpdateDciUserRequest extends Model
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

    // dci用户ID
    /**
     * @var string
     */
    public $dciUserId;

    // 证件正面oss fileId
    /**
     * @var string
     */
    public $certFrontFileId;

    // 证件背面oss fileId
    /**
     * @var string
     */
    public $certBackFileId;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 客户端令牌
    /**
     * @var string
     */
    public $clientToken;

    // 版权认证方式:UGC-用户生成内容，AIGC-AI生成内容，SOFTWARE_WORKS-软件作品认证，如果不传默认为UGC
    /**
     * @var string
     */
    public $copyrightCertificationType;

    // 法人信息
    /**
     * @var EnterpriseLegalPersonInfo
     */
    public $legalPersonInfo;

    // true,false
    /**
     * @var bool
     */
    public $longTermValid;

    // 证件有效期开始时间
    /**
     * @var string
     */
    public $certificateStartTime;

    // 证件有效期终止时间
    /**
     * @var string
     */
    public $certificateEndTime;

    // 成立日期或出生日期
    /**
     * @var string
     */
    public $identityStartTime;

    // 地址信息
    /**
     * @var string
     */
    public $address;

    // 著作权人名称
    /**
     * @var string
     */
    public $certName;

    // 著作权人证件号
    /**
     * @var string
     */
    public $certificateNumber;

    // 著作权人证件类型
    /**
     * @var string
     */
    public $certificateType;
    protected $_name = [
        'authToken'                  => 'auth_token',
        'productInstanceId'          => 'product_instance_id',
        'dciUserId'                  => 'dci_user_id',
        'certFrontFileId'            => 'cert_front_file_id',
        'certBackFileId'             => 'cert_back_file_id',
        'phone'                      => 'phone',
        'clientToken'                => 'client_token',
        'copyrightCertificationType' => 'copyright_certification_type',
        'legalPersonInfo'            => 'legal_person_info',
        'longTermValid'              => 'long_term_valid',
        'certificateStartTime'       => 'certificate_start_time',
        'certificateEndTime'         => 'certificate_end_time',
        'identityStartTime'          => 'identity_start_time',
        'address'                    => 'address',
        'certName'                   => 'cert_name',
        'certificateNumber'          => 'certificate_number',
        'certificateType'            => 'certificate_type',
    ];

    public function validate()
    {
        Model::validateRequired('dciUserId', $this->dciUserId, true);
        Model::validateRequired('certFrontFileId', $this->certFrontFileId, true);
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
        if (null !== $this->dciUserId) {
            $res['dci_user_id'] = $this->dciUserId;
        }
        if (null !== $this->certFrontFileId) {
            $res['cert_front_file_id'] = $this->certFrontFileId;
        }
        if (null !== $this->certBackFileId) {
            $res['cert_back_file_id'] = $this->certBackFileId;
        }
        if (null !== $this->phone) {
            $res['phone'] = $this->phone;
        }
        if (null !== $this->clientToken) {
            $res['client_token'] = $this->clientToken;
        }
        if (null !== $this->copyrightCertificationType) {
            $res['copyright_certification_type'] = $this->copyrightCertificationType;
        }
        if (null !== $this->legalPersonInfo) {
            $res['legal_person_info'] = null !== $this->legalPersonInfo ? $this->legalPersonInfo->toMap() : null;
        }
        if (null !== $this->longTermValid) {
            $res['long_term_valid'] = $this->longTermValid;
        }
        if (null !== $this->certificateStartTime) {
            $res['certificate_start_time'] = $this->certificateStartTime;
        }
        if (null !== $this->certificateEndTime) {
            $res['certificate_end_time'] = $this->certificateEndTime;
        }
        if (null !== $this->identityStartTime) {
            $res['identity_start_time'] = $this->identityStartTime;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDciUserRequest
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
        if (isset($map['dci_user_id'])) {
            $model->dciUserId = $map['dci_user_id'];
        }
        if (isset($map['cert_front_file_id'])) {
            $model->certFrontFileId = $map['cert_front_file_id'];
        }
        if (isset($map['cert_back_file_id'])) {
            $model->certBackFileId = $map['cert_back_file_id'];
        }
        if (isset($map['phone'])) {
            $model->phone = $map['phone'];
        }
        if (isset($map['client_token'])) {
            $model->clientToken = $map['client_token'];
        }
        if (isset($map['copyright_certification_type'])) {
            $model->copyrightCertificationType = $map['copyright_certification_type'];
        }
        if (isset($map['legal_person_info'])) {
            $model->legalPersonInfo = EnterpriseLegalPersonInfo::fromMap($map['legal_person_info']);
        }
        if (isset($map['long_term_valid'])) {
            $model->longTermValid = $map['long_term_valid'];
        }
        if (isset($map['certificate_start_time'])) {
            $model->certificateStartTime = $map['certificate_start_time'];
        }
        if (isset($map['certificate_end_time'])) {
            $model->certificateEndTime = $map['certificate_end_time'];
        }
        if (isset($map['identity_start_time'])) {
            $model->identityStartTime = $map['identity_start_time'];
        }
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }

        return $model;
    }
}
