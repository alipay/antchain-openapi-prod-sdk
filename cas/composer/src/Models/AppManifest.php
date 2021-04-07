<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppManifest extends Model
{
    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // app_version
    /**
     * @example app_version
     *
     * @var string
     */
    public $appVersion;

    // code_commit
    /**
     * @example code_commit
     *
     * @var CodeCommit
     */
    public $codeCommit;

    // etag
    /**
     * @example etag
     *
     * @var string
     */
    public $etag;

    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // location
    /**
     * @example location
     *
     * @var string
     */
    public $location;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // remark
    /**
     * @example remark
     *
     * @var string
     */
    public $remark;

    // store_location
    /**
     * @example store_location
     *
     * @var string
     */
    public $storeLocation;

    // utc_create
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $utcCreate;

    // utc_modified
    /**
     * @example utc_modified
     *
     * @var string
     */
    public $utcModified;

    // workspace_id
    /**
     * @example workspace_id
     *
     * @var string
     */
    public $workspaceId;
    protected $_name = [
        'appId'         => 'app_id',
        'appVersion'    => 'app_version',
        'codeCommit'    => 'code_commit',
        'etag'          => 'etag',
        'id'            => 'id',
        'location'      => 'location',
        'name'          => 'name',
        'remark'        => 'remark',
        'storeLocation' => 'store_location',
        'utcCreate'     => 'utc_create',
        'utcModified'   => 'utc_modified',
        'workspaceId'   => 'workspace_id',
    ];

    public function validate()
    {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->codeCommit) {
            $res['code_commit'] = null !== $this->codeCommit ? $this->codeCommit->toMap() : null;
        }
        if (null !== $this->etag) {
            $res['etag'] = $this->etag;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->storeLocation) {
            $res['store_location'] = $this->storeLocation;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppManifest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }
        if (isset($map['code_commit'])) {
            $model->codeCommit = CodeCommit::fromMap($map['code_commit']);
        }
        if (isset($map['etag'])) {
            $model->etag = $map['etag'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['location'])) {
            $model->location = $map['location'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }
        if (isset($map['store_location'])) {
            $model->storeLocation = $map['store_location'];
        }
        if (isset($map['utc_create'])) {
            $model->utcCreate = $map['utc_create'];
        }
        if (isset($map['utc_modified'])) {
            $model->utcModified = $map['utc_modified'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }

        return $model;
    }
}
