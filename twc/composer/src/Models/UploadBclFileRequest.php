<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UploadBclFileRequest extends Model
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

    // 文件名称
    /**
     * @var string
     */
    public $fileName;

    // 文件的Base64编码，需小于1M
    /**
     * @var string
     */
    public $fileContent;

    // 文件类型
    /**
     * @var string
     */
    public $fileType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileName'          => 'file_name',
        'fileContent'       => 'file_content',
        'fileType'          => 'file_type',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('fileContent', $this->fileContent, true);
        Model::validateRequired('fileType', $this->fileType, true);
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
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }
        if (null !== $this->fileContent) {
            $res['file_content'] = $this->fileContent;
        }
        if (null !== $this->fileType) {
            $res['file_type'] = $this->fileType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadBclFileRequest
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
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }
        if (isset($map['file_content'])) {
            $model->fileContent = $map['file_content'];
        }
        if (isset($map['file_type'])) {
            $model->fileType = $map['file_type'];
        }

        return $model;
    }
}
