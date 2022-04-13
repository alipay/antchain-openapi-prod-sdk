<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateDbflowObtenantRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组
    /**
     * @var string
     */
    public $workspaceGroup;

    // OB租户唯一标识
    /**
     * @var string
     */
    public $id;

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

    // 租户描述
    /**
     * @var string
     */
    public $description;

    // 对应uid分片段，用于存放对应分片库
    /**
     * @var int[]
     */
    public $uids;

    // 租户扩展属性，格式为序列化后的json字符串
    /**
     * @var string
     */
    public $extendProperties;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceGroup'   => 'workspace_group',
        'id'               => 'id',
        'name'             => 'name',
        'type'             => 'type',
        'description'      => 'description',
        'uids'             => 'uids',
        'extendProperties' => 'extend_properties',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->uids) {
            $res['uids'] = $this->uids;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateDbflowObtenantRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['uids'])) {
            if (!empty($map['uids'])) {
                $model->uids = $map['uids'];
            }
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
        }

        return $model;
    }
}
