<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\AppManifest;

class AppPackageListView extends Model {
    protected $_name = [
        'appId' => 'app_id',
        'appName' => 'app_name',
        'packageCount' => 'package_count',
        'buildpackId' => 'buildpack_id',
        'buildpackName' => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
        'appOwnerId' => 'app_owner_id',
        'appOwnerName' => 'app_owner_name',
        'latestPackage' => 'latest_package',
        'appStatus' => 'app_status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->packageCount) {
            $res['package_count'] = $this->packageCount;
        }
        if (null !== $this->buildpackId) {
            $res['buildpack_id'] = $this->buildpackId;
        }
        if (null !== $this->buildpackName) {
            $res['buildpack_name'] = $this->buildpackName;
        }
        if (null !== $this->buildpackVersion) {
            $res['buildpack_version'] = $this->buildpackVersion;
        }
        if (null !== $this->appOwnerId) {
            $res['app_owner_id'] = $this->appOwnerId;
        }
        if (null !== $this->appOwnerName) {
            $res['app_owner_name'] = $this->appOwnerName;
        }
        if (null !== $this->latestPackage) {
            $res['latest_package'] = null !== $this->latestPackage ? $this->latestPackage->toMap() : null;
        }
        if (null !== $this->appStatus) {
            $res['app_status'] = $this->appStatus;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppPackageListView
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['app_id'])){
            $model->appId = $map['app_id'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['package_count'])){
            $model->packageCount = $map['package_count'];
        }
        if(isset($map['buildpack_id'])){
            $model->buildpackId = $map['buildpack_id'];
        }
        if(isset($map['buildpack_name'])){
            $model->buildpackName = $map['buildpack_name'];
        }
        if(isset($map['buildpack_version'])){
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if(isset($map['app_owner_id'])){
            $model->appOwnerId = $map['app_owner_id'];
        }
        if(isset($map['app_owner_name'])){
            $model->appOwnerName = $map['app_owner_name'];
        }
        if(isset($map['latest_package'])){
            $model->latestPackage = AppManifest::fromMap($map['latest_package']);
        }
        if(isset($map['app_status'])){
            $model->appStatus = $map['app_status'];
        }
        return $model;
    }
    // appId
    /**
     * @example appId
     * @var string
     */
    public $appId;

    // appName
    /**
     * @example appName
     * @var string
     */
    public $appName;

    // packageCount
    /**
     * @example 
     * @var int
     */
    public $packageCount;

    // buildpackId
    /**
     * @example buildpackId
     * @var string
     */
    public $buildpackId;

    // buildpackName
    /**
     * @example buildpackName
     * @var string
     */
    public $buildpackName;

    // buildpackVersion
    /**
     * @example buildpackVersion
     * @var string
     */
    public $buildpackVersion;

    // appOwnerId
    /**
     * @example appOwnerId
     * @var string
     */
    public $appOwnerId;

    // appOwnerName
    /**
     * @example appOwnerName
     * @var string
     */
    public $appOwnerName;

    // latestPackage
    /**
     * @example 
     * @var AppManifest
     */
    public $latestPackage;

    // appStatus
    /**
     * @example appStatus
     * @var string
     */
    public $appStatus;

}
