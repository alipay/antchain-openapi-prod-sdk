<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_31dc9f55b9684fe29acc7c0125a5d7a2\Models;

use AlibabaCloud\Tea\Model;

class SubmitAntcloudAdomAppmarketPrivacymodelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 商品实例id
    /**
     * @var string
     */
    public $instanceId;

    // 文件名称
    /**
     * @var string
     */
    public $fileId;

    // 结构化入参
    /**
     * @var string
     */
    public $structInput;

    // 上传的数据文件是否为密文，默认非密文
    /**
     * @var bool
     */
    public $isEncryptFile;

    // 大模型调用时鉴权token
    /**
     * @var string
     */
    public $reqToken;
    protected $_name = [
        'authToken'     => 'auth_token',
        'instanceId'    => 'instance_id',
        'fileId'        => 'file_id',
        'structInput'   => 'struct_input',
        'isEncryptFile' => 'is_encrypt_file',
        'reqToken'      => 'req_token',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->structInput) {
            $res['struct_input'] = $this->structInput;
        }
        if (null !== $this->isEncryptFile) {
            $res['is_encrypt_file'] = $this->isEncryptFile;
        }
        if (null !== $this->reqToken) {
            $res['req_token'] = $this->reqToken;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubmitAntcloudAdomAppmarketPrivacymodelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['struct_input'])) {
            $model->structInput = $map['struct_input'];
        }
        if (isset($map['is_encrypt_file'])) {
            $model->isEncryptFile = $map['is_encrypt_file'];
        }
        if (isset($map['req_token'])) {
            $model->reqToken = $map['req_token'];
        }

        return $model;
    }
}
