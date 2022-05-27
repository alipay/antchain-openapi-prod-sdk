<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MYTC\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadAntiImagesyncRequest extends Model
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

    // 防伪码类型
    /**
     * @var string
     */
    public $codeType;

    // 防伪码码值
    /**
     * @var string
     */
    public $code;

    // 批次号码
    /**
     * @var string
     */
    public $batchNo;

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
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'codeType'          => 'code_type',
        'code'              => 'code',
        'batchNo'           => 'batch_no',
        'fileId'            => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('codeType', $this->codeType, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('batchNo', $this->batchNo, true);
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
        if (null !== $this->codeType) {
            $res['code_type'] = $this->codeType;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadAntiImagesyncRequest
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
        if (isset($map['code_type'])) {
            $model->codeType = $map['code_type'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
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

        return $model;
    }
}
