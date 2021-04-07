<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateSecuritygroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 描述
    /**
     * @var string
     */
    public $description;

    // 安全域/组 名称
    /**
     * @var string
     */
    public $name;

    // 所在区域
    /**
     * @var string
     */
    public $region;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspace;

    // SECURITY_GROUP | SECURITY_ZONE
    // 默认为安全组
    /**
     * @var string
     */
    public $type;
    protected $_name = [
        'authToken'   => 'auth_token',
        'description' => 'description',
        'name'        => 'name',
        'region'      => 'region',
        'workspace'   => 'workspace',
        'type'        => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('region', $this->region, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateSecuritygroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
