<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\CodeCommit;

class AppManifest extends Model {
    protected $_name = [
        'id' => 'id',
        'workspaceId' => 'workspace_id',
        'appId' => 'app_id',
        'appVersion' => 'app_version',
        'name' => 'name',
        'storeLocation' => 'store_location',
        'location' => 'location',
        'etag' => 'etag',
        'remark' => 'remark',
        'codeCommit' => 'code_commit',
        'utcCreate' => 'utc_create',
        'utcModified' => 'utc_modified',
    ];
    public function validate() {
        Model::validatePattern('utcCreate', $this->utcCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('utcModified', $this->utcModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->storeLocation) {
            $res['store_location'] = $this->storeLocation;
        }
        if (null !== $this->location) {
            $res['location'] = $this->location;
        }
        if (null !== $this->etag) {
            $res['etag'] = $this->etag;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }
        if (null !== $this->codeCommit) {
            $res['code_commit'] = null !== $this->codeCommit ? $this->codeCommit->toMap() : null;
        }
        if (null !== $this->utcCreate) {
            $res['utc_create'] = $this->utcCreate;
        }
        if (null !== $this->utcModified) {
            $res['utc_modified'] = $this->utcModified;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppManifest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_version'])){
            $model->appVersion = $map['app_version'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['store_location'])){
            $model->storeLocation = $map['store_location'];
        }
        if(isset($map['location'])){
            $model->location = $map['location'];
        }
        if(isset($map['etag'])){
            $model->etag = $map['etag'];
        }
        if(isset($map['remark'])){
            $model->remark = $map['remark'];
        }
        if(isset($map['code_commit'])){
            $model->codeCommit = CodeCommit::fromMap($map['code_commit']);
        }
        if(isset($map['utc_create'])){
            $model->utcCreate = $map['utc_create'];
        }
        if(isset($map['utc_modified'])){
            $model->utcModified = $map['utc_modified'];
        }
        return $model;
    }
    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // workspaceId
    /**
     * @example workspaceId
     * @var string
     */
    public $workspaceId;

    // appId
    /**
     * @example appId
     * @var string
     */
    public $appId;

    // version
    /**
     * @example version
     * @var string
     */
    public $appVersion;

    // name
    /**
     * @example name
     * @var string
     */
    public $name;

    // storeLocation
    /**
     * @example storeLocation
     * @var string
     */
    public $storeLocation;

    // location
    /**
     * @example location
     * @var string
     */
    public $location;

    // etag
    /**
     * @example etag
     * @var string
     */
    public $etag;

    // remark
    /**
     * @example remark
     * @var string
     */
    public $remark;

    // 代码提交
    /**
     * @example 
     * @var CodeCommit
     */
    public $codeCommit;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $utcModified;

}
