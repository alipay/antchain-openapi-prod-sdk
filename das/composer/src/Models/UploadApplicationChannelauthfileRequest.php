<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadApplicationChannelauthfileRequest extends Model
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

    // 服务id，开发者提供
    /**
     * @var string
     */
    public $serviceId;

    // 文件md5
    /**
     * @var string
     */
    public $fileMd5;

    // 文件ID
    /**
     * @description 待上传文件
     *
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     *
     * @var string
     */
    public $fileObjectName;

    /**
     * @var string
     */
    public $fileId;

    // 协议名称
    /**
     * @var string
     */
    public $fileName;

    // 授权协议文件版本号
    /**
     * @var string
     */
    public $fileVersion;

    // 客户ID
    /**
     * @var string
     */
    public $customerId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'serviceId'         => 'service_id',
        'fileMd5'           => 'file_md5',
        'fileId'            => 'file_id',
        'fileName'          => 'file_name',
        'fileVersion'       => 'file_version',
        'customerId'        => 'customer_id',
    ];

    public function validate()
    {
        Model::validateRequired('serviceId', $this->serviceId, true);
        Model::validateRequired('fileMd5', $this->fileMd5, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileVersion', $this->fileVersion, true);
        Model::validateRequired('customerId', $this->customerId, true);
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
        if (null !== $this->serviceId) {
            $res['service_id'] = $this->serviceId;
        }
        if (null !== $this->fileMd5) {
            $res['file_md5'] = $this->fileMd5;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileVersion) {
            $res['file_version'] = $this->fileVersion;
        }
        if (null !== $this->customerId) {
            $res['customer_id'] = $this->customerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadApplicationChannelauthfileRequest
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
        if (isset($map['service_id'])) {
            $model->serviceId = $map['service_id'];
        }
        if (isset($map['file_md5'])) {
            $model->fileMd5 = $map['file_md5'];
        }
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_version'])) {
            $model->fileVersion = $map['file_version'];
        }
        if (isset($map['customer_id'])) {
            $model->customerId = $map['customer_id'];
        }

        return $model;
    }
}
