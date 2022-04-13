<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class OBTenant extends Model
{
    // 租户描述
    /**
     * @example test
     *
     * @var string
     */
    public $description;

    // 扩展属性，序列化后的JSON字符串
    /**
     * @example "{}"
     *
     * @var string
     */
    public $extendProperties;

    // 唯一标识
    /**
     * @example 123456
     *
     * @var string
     */
    public $id;

    // 租户名称
    /**
     * @example ob_tenant1
     *
     * @var string
     */
    public $name;

    // 租户类型（单库GZONE|分片库RZONE）：存放对应业务库
    /**
     * @example GZONE|RZONE
     *
     * @var string
     */
    public $type;

    // 租户对应uid分段，用于存放对应的业务分片库
    /**
     * @example [0,1,2,...9]
     *
     * @var int[]
     */
    public $uids;

    // 工作空间组唯一标识
    /**
     * @example 123456
     *
     * @var string
     */
    public $workspaceGroupId;

    // 创建日期
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $createdTime;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $modifiedTime;
    protected $_name = [
        'description'      => 'description',
        'extendProperties' => 'extend_properties',
        'id'               => 'id',
        'name'             => 'name',
        'type'             => 'type',
        'uids'             => 'uids',
        'workspaceGroupId' => 'workspace_group_id',
        'createdTime'      => 'created_time',
        'modifiedTime'     => 'modified_time',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('workspaceGroupId', $this->workspaceGroupId, true);
        Model::validatePattern('createdTime', $this->createdTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('modifiedTime', $this->modifiedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->extendProperties) {
            $res['extend_properties'] = $this->extendProperties;
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
        if (null !== $this->uids) {
            $res['uids'] = $this->uids;
        }
        if (null !== $this->workspaceGroupId) {
            $res['workspace_group_id'] = $this->workspaceGroupId;
        }
        if (null !== $this->createdTime) {
            $res['created_time'] = $this->createdTime;
        }
        if (null !== $this->modifiedTime) {
            $res['modified_time'] = $this->modifiedTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OBTenant
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['extend_properties'])) {
            $model->extendProperties = $map['extend_properties'];
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
        if (isset($map['uids'])) {
            if (!empty($map['uids'])) {
                $model->uids = $map['uids'];
            }
        }
        if (isset($map['workspace_group_id'])) {
            $model->workspaceGroupId = $map['workspace_group_id'];
        }
        if (isset($map['created_time'])) {
            $model->createdTime = $map['created_time'];
        }
        if (isset($map['modified_time'])) {
            $model->modifiedTime = $map['modified_time'];
        }

        return $model;
    }
}
