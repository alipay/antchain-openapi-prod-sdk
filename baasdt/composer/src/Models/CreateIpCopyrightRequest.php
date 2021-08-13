<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class CreateIpCopyrightRequest extends Model
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

    // 基础参数
    /**
     * @var BaseRequestInfo
     */
    public $baseRequest;

    // 【暂不支持中文】文件名称
    /**
     * @var string
     */
    public $fileName;

    // 文件oss地址
    /**
     * @var string
     */
    public $fileUrl;

    // 文件类型，IMAGE：图片文件；TEXT：文本文件；VIDEO：视屏；AUDIO：音频；ZIP：压缩包；FILE：其他文件
    /**
     * @var string
     */
    public $fileType;

    // 【需要真实的】版权方法人证件名称
    /**
     * @var string
     */
    public $certName;

    // 证件类型
    /**
     * @var string
     */
    public $certType;

    // 【需要真实的】版权方法人证件号码
    /**
     * @var string
     */
    public $certNo;

    // 是否创建证书，此时默认选true
    /**
     * @var bool
     */
    public $createCertificate;

    // 证书类型，公证处证书，值为NotaryOffice
    /**
     * @var string
     */
    public $certificateType;

    // 是否创建证据包，默认选否，如果没有创建公证书，不支持证据包
    /**
     * @var bool
     */
    public $certificatePackage;

    // 公证处ID，默认为LUJIANG，鹭江公证处
    /**
     * @var string
     */
    public $orgId;

    // 电话号码，生成公证处证书需要，格式范例，(86-573)2651630或(86)13738258505
    /**
     * @var string
     */
    public $phoneNum;

    // 备注，最长不超过512字符
    /**
     * @var string
     */
    public $memo;
    protected $_name = [
        'authToken'          => 'auth_token',
        'productInstanceId'  => 'product_instance_id',
        'baseRequest'        => 'base_request',
        'fileName'           => 'file_name',
        'fileUrl'            => 'file_url',
        'fileType'           => 'file_type',
        'certName'           => 'cert_name',
        'certType'           => 'cert_type',
        'certNo'             => 'cert_no',
        'createCertificate'  => 'create_certificate',
        'certificateType'    => 'certificate_type',
        'certificatePackage' => 'certificate_package',
        'orgId'              => 'org_id',
        'phoneNum'           => 'phone_num',
        'memo'               => 'memo',
    ];

    public function validate()
    {
        Model::validateRequired('baseRequest', $this->baseRequest, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileUrl', $this->fileUrl, true);
        Model::validateRequired('fileType', $this->fileType, true);
        Model::validateRequired('certName', $this->certName, true);
        Model::validateRequired('certType', $this->certType, true);
        Model::validateRequired('certNo', $this->certNo, true);
        Model::validateRequired('createCertificate', $this->createCertificate, true);
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
        if (null !== $this->baseRequest) {
            $res['base_request'] = null !== $this->baseRequest ? $this->baseRequest->toMap() : null;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }
        if (null !== $this->certName) {
            $res['cert_name'] = $this->certName;
        }
        if (null !== $this->certType) {
            $res['cert_type'] = $this->certType;
        }
        if (null !== $this->certNo) {
            $res['cert_no'] = $this->certNo;
        }
        if (null !== $this->createCertificate) {
            $res['create_certificate'] = $this->createCertificate;
        }
        if (null !== $this->certificateType) {
            $res['certificate_type'] = $this->certificateType;
        }
        if (null !== $this->certificatePackage) {
            $res['certificate_package'] = $this->certificatePackage;
        }
        if (null !== $this->orgId) {
            $res['org_id'] = $this->orgId;
        }
        if (null !== $this->phoneNum) {
            $res['phone_num'] = $this->phoneNum;
        }
        if (null !== $this->memo) {
            $res['memo'] = $this->memo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateIpCopyrightRequest
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
        if (isset($map['base_request'])) {
            $model->baseRequest = BaseRequestInfo::fromMap($map['base_request']);
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }
        if (isset($map['cert_name'])) {
            $model->certName = $map['cert_name'];
        }
        if (isset($map['cert_type'])) {
            $model->certType = $map['cert_type'];
        }
        if (isset($map['cert_no'])) {
            $model->certNo = $map['cert_no'];
        }
        if (isset($map['create_certificate'])) {
            $model->createCertificate = $map['create_certificate'];
        }
        if (isset($map['certificate_type'])) {
            $model->certificateType = $map['certificate_type'];
        }
        if (isset($map['certificate_package'])) {
            $model->certificatePackage = $map['certificate_package'];
        }
        if (isset($map['org_id'])) {
            $model->orgId = $map['org_id'];
        }
        if (isset($map['phone_num'])) {
            $model->phoneNum = $map['phone_num'];
        }
        if (isset($map['memo'])) {
            $model->memo = $map['memo'];
        }

        return $model;
    }
}
