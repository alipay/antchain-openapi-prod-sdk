<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\GATEWAYX\Models;

use AlibabaCloud\Tea\Model;

class GetFileDownloadRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 文件唯一id
    /**
     * @var string
     */
    public $fileId;
    protected $_name = [
        'authToken' => 'auth_token',
        'fileId'    => 'file_id',
    ];

    public function validate()
    {
        Model::validateRequired('fileId', $this->fileId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetFileDownloadRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }

        return $model;
    }
}
