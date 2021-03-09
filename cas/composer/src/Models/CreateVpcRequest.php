<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateVpcRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 专有网络网段
    /**
     * @var string
     */
    public $cidrLock;

    // 名称
    /**
     * @var string
     */
    public $name;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken' => 'auth_token',
        'cidrLock'  => 'cidr_lock',
        'name'      => 'name',
        'workspace' => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('cidrLock', $this->cidrLock, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->cidrLock) {
            $res['cidr_lock'] = $this->cidrLock;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateVpcRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['cidr_lock'])) {
            $model->cidrLock = $map['cidr_lock'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
