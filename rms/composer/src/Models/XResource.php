<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XResource extends Model
{
    // 全球唯一标识符（32位）。
    // Update操作，必填
    // Create操作，非必填，默认不传，后端会自动生成。特殊情况可以传入，比如一些领域需要固定该UUID。
    /**
     * @example e69241aaf10411eb883d4a6a559bf02b
     *
     * @var string
     */
    public $uuid;

    // 名称。命名规则：^[a-zA-Z\u4E00-\u9FA5][a-zA-Z0-9_-\u4E00-\u9FA5]*$$
    /**
     * @example myname
     *
     * @var string
     */
    public $name;

    // 描述。
    //
    /**
     * @example my description
     *
     * @var string
     */
    public $description;

    // 父目录UUID。全球唯一标识符（32位）。
    // 00000000000000000000000000000000特指根目录UUID
    /**
     * @example 00000000000000000000000000000000
     *
     * @var string
     */
    public $parentUuid;

    // 作用范围
    /**
     * @example workspace, tenant, global
     *
     * @var string
     */
    public $scope;

    // 是否生效。默认true
    /**
     * @example true, false
     *
     * @var bool
     */
    public $enabled;

    // 是否开放。默认为false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $open;

    // 资源版本
    /**
     * @example 0,1,2
     *
     * @var int
     */
    public $version;

    // inner tenant id
    /**
     * @example
     *
     * @var int
     */
    public $tenantId;

    // inner workspace id
    /**
     * @example 0, 1, 2
     *
     * @var int
     */
    public $workspaceId;

    // 创建者
    /**
     * @example admin
     *
     * @var string
     */
    public $createdBy;

    // unix time 秒
    /**
     * @example
     *
     * @var int
     */
    public $createdAt;

    // 更新者
    /**
     * @example ""
     *
     * @var string
     */
    public $updatedBy;

    // 更新时间
    /**
     * @example
     *
     * @var int
     */
    public $updatedAt;

    // 资源类型
    /**
     * @example directory, collection, calculation, magi
     *
     * @var string
     */
    public $type;

    /**
     * @example
     *
     * @var string
     */
    public $md5;

    /**
     * @example low, medium, high
     *
     * @var string
     */
    public $priority;

    /**
     * @example week, month, year
     *
     * @var string
     */
    public $timeToLive;
    protected $_name = [
        'uuid'        => 'uuid',
        'name'        => 'name',
        'description' => 'description',
        'parentUuid'  => 'parent_uuid',
        'scope'       => 'scope',
        'enabled'     => 'enabled',
        'open'        => 'open',
        'version'     => 'version',
        'tenantId'    => 'tenant_id',
        'workspaceId' => 'workspace_id',
        'createdBy'   => 'created_by',
        'createdAt'   => 'created_at',
        'updatedBy'   => 'updated_by',
        'updatedAt'   => 'updated_at',
        'type'        => 'type',
        'md5'         => 'md5',
        'priority'    => 'priority',
        'timeToLive'  => 'time_to_live',
    ];

    public function validate()
    {
        Model::validateMaxLength('uuid', $this->uuid, 32);
        Model::validateMaxLength('name', $this->name, 64);
        Model::validateMaxLength('description', $this->description, 512);
        Model::validateMaxLength('parentUuid', $this->parentUuid, 32);
        Model::validateMinLength('uuid', $this->uuid, 32);
        Model::validateMinLength('name', $this->name, 1);
        Model::validateMinLength('description', $this->description, 1);
        Model::validateMinLength('parentUuid', $this->parentUuid, 32);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('parentUuid', $this->parentUuid, true);
        Model::validateRequired('scope', $this->scope, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->uuid) {
            $res['uuid'] = $this->uuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->parentUuid) {
            $res['parent_uuid'] = $this->parentUuid;
        }
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->open) {
            $res['open'] = $this->open;
        }
        if (null !== $this->version) {
            $res['version'] = $this->version;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->createdBy) {
            $res['created_by'] = $this->createdBy;
        }
        if (null !== $this->createdAt) {
            $res['created_at'] = $this->createdAt;
        }
        if (null !== $this->updatedBy) {
            $res['updated_by'] = $this->updatedBy;
        }
        if (null !== $this->updatedAt) {
            $res['updated_at'] = $this->updatedAt;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->md5) {
            $res['md5'] = $this->md5;
        }
        if (null !== $this->priority) {
            $res['priority'] = $this->priority;
        }
        if (null !== $this->timeToLive) {
            $res['time_to_live'] = $this->timeToLive;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XResource
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['uuid'])) {
            $model->uuid = $map['uuid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['parent_uuid'])) {
            $model->parentUuid = $map['parent_uuid'];
        }
        if (isset($map['scope'])) {
            $model->scope = $map['scope'];
        }
        if (isset($map['enabled'])) {
            $model->enabled = $map['enabled'];
        }
        if (isset($map['open'])) {
            $model->open = $map['open'];
        }
        if (isset($map['version'])) {
            $model->version = $map['version'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['created_by'])) {
            $model->createdBy = $map['created_by'];
        }
        if (isset($map['created_at'])) {
            $model->createdAt = $map['created_at'];
        }
        if (isset($map['updated_by'])) {
            $model->updatedBy = $map['updated_by'];
        }
        if (isset($map['updated_at'])) {
            $model->updatedAt = $map['updated_at'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['md5'])) {
            $model->md5 = $map['md5'];
        }
        if (isset($map['priority'])) {
            $model->priority = $map['priority'];
        }
        if (isset($map['time_to_live'])) {
            $model->timeToLive = $map['time_to_live'];
        }

        return $model;
    }
}
