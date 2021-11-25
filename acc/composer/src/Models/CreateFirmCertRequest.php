<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class CreateFirmCertRequest extends Model
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

    // 云蚂侧企业id
    /**
     * @var int
     */
    public $firmId;

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

    // 行业类型
    /**
     * @var string
     */
    public $industryType;

    // 企业地址省份
    /**
     * @var string
     */
    public $firmAddress;

    // 企业营业执照注册号
    /**
     * @var string
     */
    public $certRegNo;

    // 营业执照图片id，应用侧fileId
    /**
     * @var int
     */
    public $certRegFile;

    // 营业执照图片类型(JPEG,JPG)
    /**
     * @var string
     */
    public $certRegFileType;

    // 法定代表人证件类型
    /**
     * @var string
     */
    public $lpCertType;

    // 法人证件号码
    /**
     * @var string
     */
    public $lpCertNo;

    // 法人姓名
    /**
     * @var string
     */
    public $lpName;

    // 法人身份证正面图片id，应用侧FileId
    /**
     * @var int
     */
    public $lpCertFileFront;

    // 法人身份证正面图片文件类型(JPEG,JPG)
    /**
     * @var string
     */
    public $lpCertFileFrontType;

    // 法人身份证反面图片id，应用侧FileId
    /**
     * @var int
     */
    public $lpCertFileReverse;

    // 法人身份证反面图片id，应用侧FileId
    /**
     * @var string
     */
    public $lpCertFileReverseType;
    protected $_name = [
        'authToken'             => 'auth_token',
        'productInstanceId'     => 'product_instance_id',
        'firmId'                => 'firm_id',
        'firmName'              => 'firm_name',
        'firmType'              => 'firm_type',
        'industryType'          => 'industry_type',
        'firmAddress'           => 'firm_address',
        'certRegNo'             => 'cert_reg_no',
        'certRegFile'           => 'cert_reg_file',
        'certRegFileType'       => 'cert_reg_file_type',
        'lpCertType'            => 'lp_cert_type',
        'lpCertNo'              => 'lp_cert_no',
        'lpName'                => 'lp_name',
        'lpCertFileFront'       => 'lp_cert_file_front',
        'lpCertFileFrontType'   => 'lp_cert_file_front_type',
        'lpCertFileReverse'     => 'lp_cert_file_reverse',
        'lpCertFileReverseType' => 'lp_cert_file_reverse_type',
    ];

    public function validate()
    {
        Model::validateRequired('firmId', $this->firmId, true);
        Model::validateRequired('firmName', $this->firmName, true);
        Model::validateRequired('industryType', $this->industryType, true);
        Model::validateRequired('firmAddress', $this->firmAddress, true);
        Model::validateRequired('certRegNo', $this->certRegNo, true);
        Model::validateRequired('certRegFile', $this->certRegFile, true);
        Model::validateRequired('certRegFileType', $this->certRegFileType, true);
        Model::validateRequired('lpCertType', $this->lpCertType, true);
        Model::validateRequired('lpCertNo', $this->lpCertNo, true);
        Model::validateRequired('lpName', $this->lpName, true);
        Model::validateRequired('lpCertFileFront', $this->lpCertFileFront, true);
        Model::validateRequired('lpCertFileFrontType', $this->lpCertFileFrontType, true);
        Model::validateRequired('lpCertFileReverse', $this->lpCertFileReverse, true);
        Model::validateRequired('lpCertFileReverseType', $this->lpCertFileReverseType, true);
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
        if (null !== $this->firmId) {
            $res['firm_id'] = $this->firmId;
        }
        if (null !== $this->firmName) {
            $res['firm_name'] = $this->firmName;
        }
        if (null !== $this->firmType) {
            $res['firm_type'] = $this->firmType;
        }
        if (null !== $this->industryType) {
            $res['industry_type'] = $this->industryType;
        }
        if (null !== $this->firmAddress) {
            $res['firm_address'] = $this->firmAddress;
        }
        if (null !== $this->certRegNo) {
            $res['cert_reg_no'] = $this->certRegNo;
        }
        if (null !== $this->certRegFile) {
            $res['cert_reg_file'] = $this->certRegFile;
        }
        if (null !== $this->certRegFileType) {
            $res['cert_reg_file_type'] = $this->certRegFileType;
        }
        if (null !== $this->lpCertType) {
            $res['lp_cert_type'] = $this->lpCertType;
        }
        if (null !== $this->lpCertNo) {
            $res['lp_cert_no'] = $this->lpCertNo;
        }
        if (null !== $this->lpName) {
            $res['lp_name'] = $this->lpName;
        }
        if (null !== $this->lpCertFileFront) {
            $res['lp_cert_file_front'] = $this->lpCertFileFront;
        }
        if (null !== $this->lpCertFileFrontType) {
            $res['lp_cert_file_front_type'] = $this->lpCertFileFrontType;
        }
        if (null !== $this->lpCertFileReverse) {
            $res['lp_cert_file_reverse'] = $this->lpCertFileReverse;
        }
        if (null !== $this->lpCertFileReverseType) {
            $res['lp_cert_file_reverse_type'] = $this->lpCertFileReverseType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateFirmCertRequest
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
        if (isset($map['firm_id'])) {
            $model->firmId = $map['firm_id'];
        }
        if (isset($map['firm_name'])) {
            $model->firmName = $map['firm_name'];
        }
        if (isset($map['firm_type'])) {
            $model->firmType = $map['firm_type'];
        }
        if (isset($map['industry_type'])) {
            $model->industryType = $map['industry_type'];
        }
        if (isset($map['firm_address'])) {
            $model->firmAddress = $map['firm_address'];
        }
        if (isset($map['cert_reg_no'])) {
            $model->certRegNo = $map['cert_reg_no'];
        }
        if (isset($map['cert_reg_file'])) {
            $model->certRegFile = $map['cert_reg_file'];
        }
        if (isset($map['cert_reg_file_type'])) {
            $model->certRegFileType = $map['cert_reg_file_type'];
        }
        if (isset($map['lp_cert_type'])) {
            $model->lpCertType = $map['lp_cert_type'];
        }
        if (isset($map['lp_cert_no'])) {
            $model->lpCertNo = $map['lp_cert_no'];
        }
        if (isset($map['lp_name'])) {
            $model->lpName = $map['lp_name'];
        }
        if (isset($map['lp_cert_file_front'])) {
            $model->lpCertFileFront = $map['lp_cert_file_front'];
        }
        if (isset($map['lp_cert_file_front_type'])) {
            $model->lpCertFileFrontType = $map['lp_cert_file_front_type'];
        }
        if (isset($map['lp_cert_file_reverse'])) {
            $model->lpCertFileReverse = $map['lp_cert_file_reverse'];
        }
        if (isset($map['lp_cert_file_reverse_type'])) {
            $model->lpCertFileReverseType = $map['lp_cert_file_reverse_type'];
        }

        return $model;
    }
}
