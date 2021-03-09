<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class AppPackageListView extends Model
{
    // app_id
    /**
     * @example app_id
     *
     * @var string
     */
    public $appId;

    // app_name
    /**
     * @example app_name
     *
     * @var string
     */
    public $appName;

    // app_owner_id
    /**
     * @example app_owner_id
     *
     * @var string
     */
    public $appOwnerId;

    // app_owner_name
    /**
     * @example app_owner_name
     *
     * @var string
     */
    public $appOwnerName;

    // app_status
    /**
     * @example app_status
     *
     * @var string
     */
    public $appStatus;

    // buildpack_id
    /**
     * @example buildpack_id
     *
     * @var string
     */
    public $buildpackId;

    // buildpack_name
    /**
     * @example buildpack_name
     *
     * @var string
     */
    public $buildpackName;

    // buildpack_version
    /**
     * @example buildpack_version
     *
     * @var string
     */
    public $buildpackVersion;

    // latest_package
    /**
     * @example
     *
     * @var AppManifest
     */
    public $latestPackage;

    // package_count
    /**
     * @example
     *
     * @var int
     */
    public $packageCount;
    protected $_name = [
        'appId'            => 'app_id',
        'appName'          => 'app_name',
        'appOwnerId'       => 'app_owner_id',
        'appOwnerName'     => 'app_owner_name',
        'appStatus'        => 'app_status',
        'buildpackId'      => 'buildpack_id',
        'buildpackName'    => 'buildpack_name',
        'buildpackVersion' => 'buildpack_version',
        'latestPackage'    => 'latest_package',
        'packageCount'     => 'package_count',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appOwnerId) {
            $res['app_owner_id'] = $this->appOwnerId;
        }
        if (null !== $this->appOwnerName) {
            $res['app_owner_name'] = $this->appOwnerName;
        }
        if (null !== $this->appStatus) {
            $res['app_status'] = $this->appStatus;
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
        if (null !== $this->latestPackage) {
            $res['latest_package'] = null !== $this->latestPackage ? $this->latestPackage->toMap() : null;
        }
        if (null !== $this->packageCount) {
            $res['package_count'] = $this->packageCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppPackageListView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_owner_id'])) {
            $model->appOwnerId = $map['app_owner_id'];
        }
        if (isset($map['app_owner_name'])) {
            $model->appOwnerName = $map['app_owner_name'];
        }
        if (isset($map['app_status'])) {
            $model->appStatus = $map['app_status'];
        }
        if (isset($map['buildpack_id'])) {
            $model->buildpackId = $map['buildpack_id'];
        }
        if (isset($map['buildpack_name'])) {
            $model->buildpackName = $map['buildpack_name'];
        }
        if (isset($map['buildpack_version'])) {
            $model->buildpackVersion = $map['buildpack_version'];
        }
        if (isset($map['latest_package'])) {
            $model->latestPackage = AppManifest::fromMap($map['latest_package']);
        }
        if (isset($map['package_count'])) {
            $model->packageCount = $map['package_count'];
        }

        return $model;
    }
}
