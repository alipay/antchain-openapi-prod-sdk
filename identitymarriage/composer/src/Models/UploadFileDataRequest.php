<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IDENTITYMARRIAGE\Models;

use AlibabaCloud\Tea\Model;

class UploadFileDataRequest extends Model
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

    // 文件名
    /**
     * @var string
     */
    public $fileName;

    // 文件流
    /**
     * @var string
     */
    public $file;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileName'          => 'file_name',
        'file'              => 'file',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('file', $this->file, true);
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
        if (null !== $this->file) {
            $res['file'] = $this->file;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadFileDataRequest
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
        if (isset($map['file'])) {
            $model->file = $map['file'];
        }

        return $model;
    }
}
