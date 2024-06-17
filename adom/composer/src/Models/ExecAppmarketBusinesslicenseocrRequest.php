<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ADOM\Models;

use AlibabaCloud\Tea\Model;

class ExecAppmarketBusinesslicenseocrRequest extends Model
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

    // 文件key
    /**
     * @var string
     */
    public $fileKey;

    // 文件url
    /**
     * @var string
     */
    public $fileUrl;

    // 扩展信息
    /**
     * @var string
     */
    public $ext;
    protected $_name = [
        'authToken'  => 'auth_token',
        'instanceId' => 'instance_id',
        'fileKey'    => 'file_key',
        'fileUrl'    => 'file_url',
        'ext'        => 'ext',
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
        if (null !== $this->fileKey) {
            $res['file_key'] = $this->fileKey;
        }
        if (null !== $this->fileUrl) {
            $res['file_url'] = $this->fileUrl;
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ExecAppmarketBusinesslicenseocrRequest
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
        if (isset($map['file_key'])) {
            $model->fileKey = $map['file_key'];
        }
        if (isset($map['file_url'])) {
            $model->fileUrl = $map['file_url'];
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
