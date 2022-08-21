<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class AddDciUserRequest extends Model
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
    public $userName;

    // 用户类型
    /**
     * @var string
     */
    public $userType;

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

    // 证件有效期限起始日期
    /**
     * @var string
     */
    public $certificateStartTime;

    // 证件有效期限终止日期
    /**
     * @var string
     */
    public $certificateEndTime;

    // 证件正面OSS filePath
    /**
     * @var string
     */
    public $certificateFrontFilePath;

    // 证件反面OSS filePath
    /**
     * @var string
     */
    public $certificateBackFilePath;

    // 法人名称
    /**
     * @var string
     */
    public $legalPersonCertName;

    // 法人证件类型
    /**
     * @var string
     */
    public $legalPersonCertType;

    // 法人证件号
    /**
     * @var string
     */
    public $legalPersonCertNo;

    // 手机号
    /**
     * @var string
     */
    public $phone;

    // 地址
    /**
     * @var string
     */
    public $address;

    // 用户身份开始时间
    /**
     * @var string
     */
    public $identityStartTime;

    // 所属地区
    /**
     * @var string
     */
    public $areaType;

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
        'authToken'                => 'auth_token',
        'productInstanceId'        => 'product_instance_id',
        'userName'                 => 'user_name',
        'userType'                 => 'user_type',
        'certificateType'          => 'certificate_type',
        'certificateNumber'        => 'certificate_number',
        'certificateStartTime'     => 'certificate_start_time',
        'certificateEndTime'       => 'certificate_end_time',
        'certificateFrontFilePath' => 'certificate_front_file_path',
        'certificateBackFilePath'  => 'certificate_back_file_path',
        'legalPersonCertName'      => 'legal_person_cert_name',
        'legalPersonCertType'      => 'legal_person_cert_type',
        'legalPersonCertNo'        => 'legal_person_cert_no',
        'phone'                    => 'phone',
        'address'                  => 'address',
        'identityStartTime'        => 'identity_start_time',
        'areaType'                 => 'area_type',
        'proxyData'                => 'proxy_data',
        'clientToken'              => 'client_token',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('userType', $this->userType, true);
        Model::validateRequired('certificateType', $this->certificateType, true);
        Model::validateRequired('certificateNumber', $this->certificateNumber, true);
        Model::validateRequired('certificateFrontFilePath', $this->certificateFrontFilePath, true);
        Model::validateRequired('phone', $this->phone, true);
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('identityStartTime', $this->identityStartTime, true);
        Model::validateRequired('areaType', $this->areaType, true);
        Model::validateRequired('proxyData', $this->proxyData, true);
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
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->userType) {
            $res['user_type'] = $this->userType;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->certificateNumber) {
            $res['certificate_number'] = $this->certificateNumber;
        }
        if (null !== $this->certificateStartTime) {
            $res['certificate_start_time'] = $this->certificateStartTime;
        }
        if (null !== $this->certificateEndTime) {
            $res['certificate_end_time'] = $this->certificateEndTime;
        }
        if (null !== $this->certificateFrontFilePath) {
            $res['certificate_front_file_path'] = $this->certificateFrontFilePath;
        }
        if (null !== $this->certificateBackFilePath) {
            $res['certificate_back_file_path'] = $this->certificateBackFilePath;
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
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->identityStartTime) {
            $res['identity_start_time'] = $this->identityStartTime;
        }
        if (null !== $this->areaType) {
            $res['area_type'] = $this->areaType;
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
     * @return AddDciUserRequest
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
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['user_type'])) {
            $model->userType = $map['user_type'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['certificate_number'])) {
            $model->certificateNumber = $map['certificate_number'];
        }
        if (isset($map['certificate_start_time'])) {
            $model->certificateStartTime = $map['certificate_start_time'];
        }
        if (isset($map['certificate_end_time'])) {
            $model->certificateEndTime = $map['certificate_end_time'];
        }
        if (isset($map['certificate_front_file_path'])) {
            $model->certificateFrontFilePath = $map['certificate_front_file_path'];
        }
        if (isset($map['certificate_back_file_path'])) {
            $model->certificateBackFilePath = $map['certificate_back_file_path'];
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
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['identity_start_time'])) {
            $model->identityStartTime = $map['identity_start_time'];
        }
        if (isset($map['area_type'])) {
            $model->areaType = $map['area_type'];
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
