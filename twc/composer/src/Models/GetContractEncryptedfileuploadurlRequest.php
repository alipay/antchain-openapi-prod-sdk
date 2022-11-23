<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class GetContractEncryptedfileuploadurlRequest extends Model
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

    // 包含后缀的文件全名, 合同.pdf
    /**
     * @var string
     */
    public $fileName;

    // 是否已加密, 默认否
    /**
     * @var bool
     */
    public $encrypted;

    // 明文文件的md5码，用于完整性校验
    /**
     * @var string
     */
    public $md5;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'fileName'          => 'file_name',
        'encrypted'         => 'encrypted',
        'md5'               => 'md5',
    ];

    public function validate()
    {
        Model::validateRequired('fileName', $this->fileName, true);
        Model::validateRequired('md5', $this->md5, true);
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
        if (null !== $this->encrypted) {
            $res['encrypted'] = $this->encrypted;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetContractEncryptedfileuploadurlRequest
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
        if (isset($map['encrypted'])) {
            $model->encrypted = $map['encrypted'];
        }
        if (isset($map['md5'])) {
            $model->md5 = $map['md5'];
        }

        return $model;
    }
}
