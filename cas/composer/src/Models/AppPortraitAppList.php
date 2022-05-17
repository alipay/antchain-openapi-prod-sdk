<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPortraitAppList extends Model
{
    // 应用id
    /**
     * @example app_id
     *
     * @var string
     */
    public $id;

    // 应用名称
    /**
     * @example app_name
     *
     * @var string
     */
    public $name;

    // 应用分组名称
    /**
     * @example app_group_name
     *
     * @var string
     */
    public $appGroupName;

    // 应用所属分组id
    /**
     * @example app_group_id
     *
     * @var string
     */
    public $appGroupId;

    // 应用负责人
    /**
     * @example owner_display_name
     *
     * @var string
     */
    public $ownerDisplayName;

    // 应用描述
    /**
     * @example description
     *
     * @var string
     */
    public $description;

    // 技术栈名称
    /**
     * @example buildpack_name
     *
     * @var string
     */
    public $buildpackName;

    // 技术栈版本
    /**
     * @example buildpack_version
     *
     * @var string
     */
    public $buildpackVersion;
    protected $_name = [
        'id'               => 'id',
        'name'             => 'name',
        'appGroupName'     => 'app_group_name',
        'appGroupId'       => 'app_group_id',
        'ownerDisplayName' => 'owner_display_name',
        'description'      => 'description',
        'buildpackName'    => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->appGroupName) {
            $res['app_group_name'] = $this->appGroupName;
        }
        if (null !== $this->appGroupId) {
            $res['app_group_id'] = $this->appGroupId;
        }
        if (null !== $this->ownerDisplayName) {
            $res['owner_display_name'] = $this->ownerDisplayName;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPortraitAppList
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
        if (isset($map['app_group_name'])) {
            $model->appGroupName = $map['app_group_name'];
        }
        if (isset($map['app_group_id'])) {
            $model->appGroupId = $map['app_group_id'];
        }
        if (isset($map['owner_display_name'])) {
            $model->ownerDisplayName = $map['owner_display_name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['buildpack_name'])) {
            $model->buildpackName = $map['buildpack_name'];
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }

        return $model;
    }
}
