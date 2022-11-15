<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadApplicationBatchqueryfileRequest extends Model
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

    // 文件md5
    /**
     * @var string
     */
    public $fileMd5;

    // 文件id
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

    // 数据集id，开发者提供
    /**
     * @var string
     */
    public $dataSetId;

    // 幂等id，同一批任务需使用相同的uniqueId，文件不一样但uniqueId一样，只会有一个任务，任务信息以第一次请求为准
    /**
     * @var string
     */
    public $uniqueId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileMd5'           => 'file_md5',
        'fileId'            => 'file_id',
        'dataSetId'         => 'data_set_id',
        'uniqueId'          => 'unique_id',
    ];

    public function validate()
    {
        Model::validateRequired('fileMd5', $this->fileMd5, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('dataSetId', $this->dataSetId, true);
        Model::validateRequired('uniqueId', $this->uniqueId, true);
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
        if (null !== $this->dataSetId) {
            $res['data_set_id'] = $this->dataSetId;
        }
        if (null !== $this->uniqueId) {
            $res['unique_id'] = $this->uniqueId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadApplicationBatchqueryfileRequest
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
        if (isset($map['data_set_id'])) {
            $model->dataSetId = $map['data_set_id'];
        }
        if (isset($map['unique_id'])) {
            $model->uniqueId = $map['unique_id'];
        }

        return $model;
    }
}
