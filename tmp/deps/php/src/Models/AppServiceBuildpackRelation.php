<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class AppServiceBuildpackRelation extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'appServiceId' => 'app_service_id',
        'buildpackArch' => 'buildpack_arch',
        'buildpackFullVersion' => 'buildpack_full_version',
        'buildpackId' => 'buildpack_id',
        'creationTime' => 'creation_time',
        'extraInfo' => 'extra_info',
        'id' => 'id',
        'modificationTime' => 'modification_time',
        'techstackId' => 'techstack_id',
        'techstackIdentity' => 'techstack_identity',
        'techstackName' => 'techstack_name',
        'workspaceId' => 'workspace_id',
    ];
    public function validate() {
        Model::validatePattern('creationTime', $this->creationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
        Model::validatePattern('modificationTime', $this->modificationTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appServiceId) {
            $res['app_service_id'] = $this->appServiceId;
        }
        if (null !== $this->buildpackArch) {
            $res['buildpack_arch'] = $this->buildpackArch;
        }
        if (null !== $this->buildpackFullVersion) {
            $res['buildpack_full_version'] = $this->buildpackFullVersion;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->creationTime) {
            $res['creation_time'] = $this->creationTime;
        }
        if (null !== $this->extraInfo) {
            $res['extra_info'] = $this->extraInfo;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modificationTime) {
            $res['modification_time'] = $this->modificationTime;
        }
        if (null !== $this->techstackId) {
            $res['techstack_id'] = $this->techstackId;
        }
        if (null !== $this->techstackIdentity) {
            $res['techstack_identity'] = $this->techstackIdentity;
        }
        if (null !== $this->techstackName) {
            $res['techstack_name'] = $this->techstackName;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppServiceBuildpackRelation
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_service_id'])){
            $model->appServiceId = $map['app_service_id'];
        }
        if(isset($map['buildpack_arch'])){
            $model->buildpackArch = $map['buildpack_arch'];
        }
        if(isset($map['buildpack_full_version'])){
            $model->buildpackFullVersion = $map['buildpack_full_version'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['creation_time'])){
            $model->creationTime = $map['creation_time'];
        }
        if(isset($map['extra_info'])){
            $model->extraInfo = $map['extra_info'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modification_time'])){
            $model->modificationTime = $map['modification_time'];
        }
        if(isset($map['techstack_id'])){
            $model->techstackId = $map['techstack_id'];
        }
        if(isset($map['techstack_identity'])){
            $model->techstackIdentity = $map['techstack_identity'];
        }
        if(isset($map['techstack_name'])){
            $model->techstackName = $map['techstack_name'];
        }
        if(isset($map['workspace_id'])){
            $model->workspaceId = $map['workspace_id'];
        }
        return $model;
    }
    // app_id
    /**
     * @example app_id
     * @var string
     */
    public $appId;

    // app_service_id
    /**
     * @example app_service_id
     * @var string
     */
    public $appServiceId;

    // buildpack_arch
    /**
     * @example buildpack_arch
     * @var string
     */
    public $buildpackArch;

    // buildpack_full_version
    /**
     * @example buildpack_full_version
     * @var string
     */
    public $buildpackFullVersion;

    // buildpack_id
    /**
     * @example buildpack_id
     * @var string
     */
    public $buildpackId;

    // creation_time
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $creationTime;

    // extra_info
    /**
     * @example extra_info
     * @var string
     */
    public $extraInfo;

    // id
    /**
     * @example id
     * @var string
     */
    public $id;

    // modification_time
    /**
     * @example modification_time
     * @var string
     */
    public $modificationTime;

    // techstack_id
    /**
     * @example 
     * @var int
     */
    public $techstackId;

    // techstack_identity
    /**
     * @example techstack_identity
     * @var string
     */
    public $techstackIdentity;

    // techstack_name
    /**
     * @example techstack_name
     * @var string
     */
    public $techstackName;

    // workspace_id
    /**
     * @example workspace_id
     * @var string
     */
    public $workspaceId;

}
