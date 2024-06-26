<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class UploadJzqFailRequest extends Model
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

    // 文件上传
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

    // 预发验证
    /**
     * @var PreTestUse
     */
    public $struct1;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileId'            => 'file_id',
        'struct1'           => 'struct_1',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('struct1', $this->struct1, true);
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
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->struct1) {
            $res['struct_1'] = null !== $this->struct1 ? $this->struct1->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadJzqFailRequest
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
        if (isset($map['fileObject'])) {
            $model->fileObject = $map['fileObject'];
        }
        if (isset($map['fileObjectName'])) {
            $model->fileObjectName = $map['fileObjectName'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['struct_1'])) {
            $model->struct1 = PreTestUse::fromMap($map['struct_1']);
        }

        return $model;
    }
}
