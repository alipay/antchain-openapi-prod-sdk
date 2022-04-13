<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class CreateDbflowObtenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 描述信息
    /**
     * @var string
     */
    public $description;

    // 租户扩展属性，格式为序列化后的json字符串
    /**
     * @var string
     */
    public $extendProperties;

    // OB租户名称
    /**
     * @var string
     */
    public $name;

    // 用于存放对应的业务库租户类型：单库类型或分片库
    /**
     * @var string
     */
    public $type;

    // 租户存放的uid段，用于存放对应业务分片库
    /**
     * @var int[]
     */
    public $uids;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;
    protected $_name = [
        'authToken'        => 'auth_token',
        'description'      => 'description',
        'extendProperties' => 'extend_properties',
        'name'             => 'name',
        'type'             => 'type',
        'uids'             => 'uids',
        'workspaceGroup'   => 'workspace_group',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
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
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->uids) {
            $res['uids'] = $this->uids;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateDbflowObtenantRequest
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
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['uids'])) {
            if (!empty($map['uids'])) {
                $model->uids = $map['uids'];
            }
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }

        return $model;
    }
}
