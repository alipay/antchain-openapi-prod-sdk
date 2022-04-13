<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarReleaseInfo extends Model
{
    // sidecar类型名称
    /**
     * @example odp
     *
     * @var string
     */
    public $sidecarName;

    // sidecar的发布版本
    /**
     * @example 0.0.1
     *
     * @var string
     */
    public $sidecarVersion;

    // mosn对应打开的feature-gates配置。
    /**
     * @example gateway,redis,sofarpc
     *
     * @var string
     */
    public $featureGates;

    // 所用的image
    /**
     * @example reg.docker.alibaba-inc.com/antmesh/mosn:1.23.0-45402f78-nightly_cloud
     *
     * @var string
     */
    public $image;

    // 应用基线当前所用的自定义env
    /**
     * @example A=a,B=b
     *
     * @var string
     */
    public $changeEnvs;

    // sidecar的发布版本号
    /**
     * @example 1877282423
     *
     * @var string
     */
    public $releaseVersion;

    // 上一次的发布版本号
    /**
     * @example 1719817898
     *
     * @var string
     */
    public $lastReleaseVersion;
    protected $_name = [
        'sidecarName'        => 'sidecar_name',
        'sidecarVersion'     => 'sidecar_version',
        'featureGates'       => 'feature_gates',
        'image'              => 'image',
        'changeEnvs'         => 'change_envs',
        'releaseVersion'     => 'release_version',
        'lastReleaseVersion' => 'last_release_version',
    ];

    public function validate()
    {
        Model::validateRequired('sidecarName', $this->sidecarName, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
        Model::validateRequired('image', $this->image, true);
        Model::validateRequired('releaseVersion', $this->releaseVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->sidecarName) {
            $res['sidecar_name'] = $this->sidecarName;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        if (null !== $this->featureGates) {
            $res['feature_gates'] = $this->featureGates;
        }
        if (null !== $this->image) {
            $res['image'] = $this->image;
        }
        if (null !== $this->changeEnvs) {
            $res['change_envs'] = $this->changeEnvs;
        }
        if (null !== $this->releaseVersion) {
            $res['release_version'] = $this->releaseVersion;
        }
        if (null !== $this->lastReleaseVersion) {
            $res['last_release_version'] = $this->lastReleaseVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarReleaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sidecar_name'])) {
            $model->sidecarName = $map['sidecar_name'];
        }
        if (isset($map['sidecar_version'])) {
            $model->sidecarVersion = $map['sidecar_version'];
        }
        if (isset($map['feature_gates'])) {
            $model->featureGates = $map['feature_gates'];
        }
        if (isset($map['image'])) {
            $model->image = $map['image'];
        }
        if (isset($map['change_envs'])) {
            $model->changeEnvs = $map['change_envs'];
        }
        if (isset($map['release_version'])) {
            $model->releaseVersion = $map['release_version'];
        }
        if (isset($map['last_release_version'])) {
            $model->lastReleaseVersion = $map['last_release_version'];
        }

        return $model;
    }
}
