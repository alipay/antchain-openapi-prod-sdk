<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class VerifyFirmRequest extends Model
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

    // 账号id
    /**
     * @var int
     */
    public $userId;

    // 企业名称
    /**
     * @var string
     */
    public $firmName;

    // 企业类型
    /**
     * @var string
     */
    public $firmType;

    // 企业营业执照注册号
    /**
     * @var string
     */
    public $certRegNo;

    // 企业营业执照图片，osskey
    /**
     * @var string
     */
    public $certRegFileId;

    // 法人证件类型
    /**
     * @var string
     */
    public $lpCertType;

    // 证件号码
    /**
     * @var string
     */
    public $lpCertNo;

    // 企业法人证件正面图片
    /**
     * @var string
     */
    public $lpCertFileFrontId;

    // 企业法人证件反面图片
    //
    //
    /**
     * @var string
     */
    public $lpCertFileReverseId;

    // JPEG,JPG
    /**
     * @var string
     */
    public $certRegFileType;

    // JPG
    /**
     * @var string
     */
    public $lpCertFileFrontType;

    // 身份证反面文件类型
    /**
     * @var string
     */
    public $lpCertFileReverseType;

    // 法人姓名
    /**
     * @var string
     */
    public $lpName;

    // 租户信息
    /**
     * @var string
     */
    public $tenantId;

    // 行业类型
    /**
     * @var string
     */
    public $industryType;

    // 公司所在地
    /**
     * @var string
     */
    public $firmAddress;

    // 提交类型
    /**
     * @var string
     */
    public $operationType;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'userId'                => 'user_id',
        'firmName'              => 'firm_name',
        'firmType'              => 'firm_type',
        'certRegNo'             => 'cert_reg_no',
        'certRegFileId'         => 'cert_reg_file_id',
        'lpCertType'            => 'lp_cert_type',
        'lpCertNo'              => 'lp_cert_no',
        'lpCertFileFrontId'     => 'lp_cert_file_front_id',
        'lpCertFileReverseId'   => 'lp_cert_file_reverse_id',
        'certRegFileType'       => 'cert_reg_file_type',
        'lpCertFileFrontType'   => 'lp_cert_file_front_type',
        'lpCertFileReverseType' => 'lp_cert_file_reverse_type',
        'lpName'                => 'lp_name',
        'tenantId'              => 'tenant_id',
        'industryType'          => 'industry_type',
        'firmAddress'           => 'firm_address',
        'operationType'         => 'operation_type',
    ];

    public function validate()
    {
        Model::validateRequired('userId', $this->userId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('operationType', $this->operationType, true);
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
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->firmType) {
            $res['firm_type'] = $this->firmType;
        }
        if (null !== $this->certRegNo) {
            $res['cert_reg_no'] = $this->certRegNo;
        }
        if (null !== $this->certRegFileId) {
            $res['cert_reg_file_id'] = $this->certRegFileId;
        }
        if (null !== $this->lpCertType) {
            $res['lp_cert_type'] = $this->lpCertType;
        }
        if (null !== $this->lpCertNo) {
            $res['lp_cert_no'] = $this->lpCertNo;
        }
        if (null !== $this->lpCertFileFrontId) {
            $res['lp_cert_file_front_id'] = $this->lpCertFileFrontId;
        }
        if (null !== $this->lpCertFileReverseId) {
            $res['lp_cert_file_reverse_id'] = $this->lpCertFileReverseId;
        }
        if (null !== $this->certRegFileType) {
            $res['cert_reg_file_type'] = $this->certRegFileType;
        }
        if (null !== $this->lpCertFileFrontType) {
            $res['lp_cert_file_front_type'] = $this->lpCertFileFrontType;
        }
        if (null !== $this->lpCertFileReverseType) {
            $res['lp_cert_file_reverse_type'] = $this->lpCertFileReverseType;
        }
        if (null !== $this->lpName) {
            $res['lp_name'] = $this->lpName;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->industryType) {
            $res['industry_type'] = $this->industryType;
        }
        if (null !== $this->firmAddress) {
            $res['firm_address'] = $this->firmAddress;
        }
        if (null !== $this->operationType) {
            $res['operation_type'] = $this->operationType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VerifyFirmRequest
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
        if (isset($map['user_id'])) {
            $model->userId = $map['user_id'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['firm_type'])) {
            $model->firmType = $map['firm_type'];
        }
        if (isset($map['cert_reg_no'])) {
            $model->certRegNo = $map['cert_reg_no'];
        }
        if (isset($map['cert_reg_file_id'])) {
            $model->certRegFileId = $map['cert_reg_file_id'];
        }
        if (isset($map['lp_cert_type'])) {
            $model->lpCertType = $map['lp_cert_type'];
        }
        if (isset($map['lp_cert_no'])) {
            $model->lpCertNo = $map['lp_cert_no'];
        }
        if (isset($map['lp_cert_file_front_id'])) {
            $model->lpCertFileFrontId = $map['lp_cert_file_front_id'];
        }
        if (isset($map['lp_cert_file_reverse_id'])) {
            $model->lpCertFileReverseId = $map['lp_cert_file_reverse_id'];
        }
        if (isset($map['cert_reg_file_type'])) {
            $model->certRegFileType = $map['cert_reg_file_type'];
        }
        if (isset($map['lp_cert_file_front_type'])) {
            $model->lpCertFileFrontType = $map['lp_cert_file_front_type'];
        }
        if (isset($map['lp_cert_file_reverse_type'])) {
            $model->lpCertFileReverseType = $map['lp_cert_file_reverse_type'];
        }
        if (isset($map['lp_name'])) {
            $model->lpName = $map['lp_name'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['industry_type'])) {
            $model->industryType = $map['industry_type'];
        }
        if (isset($map['firm_address'])) {
            $model->firmAddress = $map['firm_address'];
        }
        if (isset($map['operation_type'])) {
            $model->operationType = $map['operation_type'];
        }

        return $model;
    }
}
