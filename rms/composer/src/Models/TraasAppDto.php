<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class TraasAppDto extends Model
{
    // uuid
    /**
     * @example uuid
     *
     * @var string
     */
    public $uuid;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // display_name
    /**
     * @example display_name
     *
     * @var string
     */
    public $displayName;

    // tenant_uuid
    /**
     * @example tenant_uuid
     *
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @example tenant_name
     *
     * @var string
     */
    public $tenantName;

    // outside_id
    /**
     * @example outside_id
     *
     * @var string
     */
    public $outsideId;

    // source_from
    /**
     * @example source_from
     *
     * @var string
     */
    public $sourceFrom;

    // extension
    /**
     * @example extension
     *
     * @var string
     */
    public $extension;

    // gmt_create
    /**
     * @example
     *
     * @var string
     */
    public $gmtCreate;

    // gmt_modified
    /**
     * @example
     *
     * @var string
     */
    public $gmtModified;

    // 应用所属的上层所有祖先分组
    /**
     * @example
     *
     * @var TraasAppGroupDto[]
     */
    public $ancestorAppGroups;

    // app_group_uuid
    /**
     * @example app_group_uuid
     *
     * @var string
     */
    public $appGroupUuid;

    // app_group_name
    /**
     * @example app_group_name
     *
     * @var string
     */
    public $appGroupName;

    // app_server_count
    /**
     * @example app_server_count
     *
     * @var int
     */
    public $appServerCount;
    protected $_name = [
        'uuid'              => 'uuid',
        'name'              => 'name',
        'displayName'       => 'display_name',
        'tenantUuid'        => 'tenant_uuid',
        'tenantName'        => 'tenant_name',
        'outsideId'         => 'outside_id',
        'sourceFrom'        => 'source_from',
        'extension'         => 'extension',
        'gmtCreate'         => 'gmt_create',
        'gmtModified'       => 'gmt_modified',
        'ancestorAppGroups' => 'ancestor_app_groups',
        'appGroupUuid'      => 'app_group_uuid',
        'appGroupName'      => 'app_group_name',
        'appServerCount'    => 'app_server_count',
    ];

    public function validate()
    {
        Model::validateRequired('uuid', $this->uuid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('sourceFrom', $this->sourceFrom, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->outsideId) {
            $res['outside_id'] = $this->outsideId;
        }
        if (null !== $this->sourceFrom) {
            $res['source_from'] = $this->sourceFrom;
        }
        if (null !== $this->extension) {
            $res['extension'] = $this->extension;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->ancestorAppGroups) {
            $res['ancestor_app_groups'] = [];
            if (null !== $this->ancestorAppGroups && \is_array($this->ancestorAppGroups)) {
                $n = 0;
                foreach ($this->ancestorAppGroups as $item) {
                    $res['ancestor_app_groups'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appGroupUuid) {
            $res['app_group_uuid'] = $this->appGroupUuid;
        }
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->appServerCount) {
            $res['app_server_count'] = $this->appServerCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TraasAppDto
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
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['outside_id'])) {
            $model->outsideId = $map['outside_id'];
        }
        if (isset($map['source_from'])) {
            $model->sourceFrom = $map['source_from'];
        }
        if (isset($map['extension'])) {
            $model->extension = $map['extension'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['ancestor_app_groups'])) {
            if (!empty($map['ancestor_app_groups'])) {
                $model->ancestorAppGroups = [];
                $n                        = 0;
                foreach ($map['ancestor_app_groups'] as $item) {
                    $model->ancestorAppGroups[$n++] = null !== $item ? TraasAppGroupDto::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['app_group_uuid'])) {
            $model->appGroupUuid = $map['app_group_uuid'];
        }
        if (isset($map['app_group_name'])) {
            $model->appGroupName = $map['app_group_name'];
        }
        if (isset($map['app_server_count'])) {
            $model->appServerCount = $map['app_server_count'];
        }

        return $model;
    }
}
