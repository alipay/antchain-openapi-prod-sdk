<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class ExecAppmarketPrivacymodelRequest extends Model
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

    // 文件标识，文件上传时的入参
    /**
     * @var string
     */
    public $fileId;

    // 结构化入参
    /**
     * @var string
     */
    public $structInput;
    protected $_name = [
        'authToken'   => 'auth_token',
        'instanceId'  => 'instance_id',
        'fileId'      => 'file_id',
        'structInput' => 'struct_input',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAppmarketPrivacymodelRequest
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

        return $model;
    }
}
