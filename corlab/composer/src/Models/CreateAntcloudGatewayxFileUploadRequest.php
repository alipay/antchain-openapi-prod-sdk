<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;

class CreateAntcloudGatewayxFileUploadRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 上传文件作用的openapi method
    /**
     * @var string
     */
    public $apiCode;

    // 文件标签，多个标签;分割
    /**
     * @var string
     */
    public $fileLabel;

    // 自定义的文件元数据
    /**
     * @var string
     */
    public $fileMetadata;

    // 文件名，不传则随机生成文件名
    /**
     * @var string
     */
    public $fileName;

    // 文件的多媒体类型
    /**
     * @var string
     */
    public $mimeType;

    // 产品方的api归属集群，即productInstanceId
    /**
     * @var string
     */
    public $apiCluster;
    protected $_name = [
        'authToken'    => 'auth_token',
        'apiCode'      => 'api_code',
        'fileLabel'    => 'file_label',
        'fileMetadata' => 'file_metadata',
        'fileName'     => 'file_name',
        'mimeType'     => 'mime_type',
        'apiCluster'   => 'api_cluster',
    ];

    public function validate()
    {
        Model::validateRequired('apiCode', $this->apiCode, true);
        Model::validateMaxLength('fileLabel', $this->fileLabel, 100);
        Model::validateMaxLength('fileMetadata', $this->fileMetadata, 1000);
        Model::validateMaxLength('fileName', $this->fileName, 100);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->apiCode) {
            $res['api_code'] = $this->apiCode;
        }
        if (null !== $this->fileLabel) {
            $res['file_label'] = $this->fileLabel;
        }
        if (null !== $this->fileMetadata) {
            $res['file_metadata'] = $this->fileMetadata;
        }
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->mimeType) {
            $res['mime_type'] = $this->mimeType;
        }
        if (null !== $this->apiCluster) {
            $res['api_cluster'] = $this->apiCluster;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntcloudGatewayxFileUploadRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['api_code'])) {
            $model->apiCode = $map['api_code'];
        }
        if (isset($map['file_label'])) {
            $model->fileLabel = $map['file_label'];
        }
        if (isset($map['file_metadata'])) {
            $model->fileMetadata = $map['file_metadata'];
        }
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['mime_type'])) {
            $model->mimeType = $map['mime_type'];
        }
        if (isset($map['api_cluster'])) {
            $model->apiCluster = $map['api_cluster'];
        }

        return $model;
    }
}
