<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class FolderDO extends Model
{
    // 文件夹ID
    /**
     * @example 123
     *
     * @var int
     */
    public $id;

    // 文件夹名称
    /**
     * @example test
     *
     * @var string
     */
    public $name;

    // 父目录 ID
    /**
     * @example -1
     *
     * @var string
     */
    public $parentFolderId;

    // 排序号
    /**
     * @example 3
     *
     * @var string
     */
    public $sortIndex;

    // 监控租户 ID
    /**
     * @example 1
     *
     * @var int
     */
    public $tenantId;

    // 监控工作空间 ID
    /**
     * @example 3
     *
     * @var string
     */
    public $workspaceId;

    // 创建者
    /**
     * @example rms
     *
     * @var string
     */
    public $creater;

    // 创建时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example
     *
     * @var int
     */
    public $gmtModified;

    // 修改者
    /**
     * @example rms
     *
     * @var string
     */
    public $modifier;

    // 是否告警
    /**
     * @example true, false
     *
     * @var bool
     */
    public $alarmed;

    // 是否置顶
    /**
     * @example true, false
     *
     * @var bool
     */
    public $top;
    protected $_name = [
        'id'             => 'id',
        'name'           => 'name',
        'parentFolderId' => 'parent_folder_id',
        'sortIndex'      => 'sort_index',
        'tenantId'       => 'tenant_id',
        'workspaceId'    => 'workspace_id',
        'creater'        => 'creater',
        'gmtCreate'      => 'gmt_create',
        'gmtModified'    => 'gmt_modified',
        'modifier'       => 'modifier',
        'alarmed'        => 'alarmed',
        'top'            => 'top',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('parentFolderId', $this->parentFolderId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('creater', $this->creater, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('modifier', $this->modifier, true);
        Model::validateRequired('alarmed', $this->alarmed, true);
        Model::validateRequired('top', $this->top, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->parentFolderId) {
            $res['parent_folder_id'] = $this->parentFolderId;
        }
        if (null !== $this->sortIndex) {
            $res['sort_index'] = $this->sortIndex;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->modifier) {
            $res['modifier'] = $this->modifier;
        }
        if (null !== $this->alarmed) {
            $res['alarmed'] = $this->alarmed;
        }
        if (null !== $this->top) {
            $res['top'] = $this->top;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FolderDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['parent_folder_id'])) {
            $model->parentFolderId = $map['parent_folder_id'];
        }
        if (isset($map['sort_index'])) {
            $model->sortIndex = $map['sort_index'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['modifier'])) {
            $model->modifier = $map['modifier'];
        }
        if (isset($map['alarmed'])) {
            $model->alarmed = $map['alarmed'];
        }
        if (isset($map['top'])) {
            $model->top = $map['top'];
        }

        return $model;
    }
}
