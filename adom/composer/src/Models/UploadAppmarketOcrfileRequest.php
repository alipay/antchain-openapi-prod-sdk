<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class UploadAppmarketOcrfileRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所购商品实例id
    /**
     * @var string
     */
    public $instanceId;

    // 文件名
    /**
     * @var string
     */
    public $fileName;
    protected $_name = [
        'authToken'  => 'auth_token',
        'instanceId' => 'instance_id',
        'fileName'   => 'file_name',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('fileName', $this->fileName, true);
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
        if (null !== $this->fileName) {
            $res['file_name'] = $this->fileName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UploadAppmarketOcrfileRequest
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
        if (isset($map['file_name'])) {
            $model->fileName = $map['file_name'];
        }

        return $model;
    }
}
