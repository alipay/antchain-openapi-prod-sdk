<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppServiceSidecarReleaseInfo extends Model
{
    // 服务所属app名称
    /**
     * @example test-app
     *
     * @var string
     */
    public $appName;

    // 应用服务名
    /**
     * @example sidecar-serivce-demo
     *
     * @var string
     */
    public $containerServiceName;

    // 应用服务所包含的sidecar配置信息，可以有mosn，odp等等不同sidecar类型的配置
    /**
     * @example
     *
     * @var SidecarReleaseInfo[]
     */
    public $releaseInfos;
    protected $_name = [
        'appName'              => 'app_name',
        'containerServiceName' => 'container_service_name',
        'releaseInfos'         => 'release_infos',
    ];

    public function validate()
    {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('containerServiceName', $this->containerServiceName, true);
        Model::validateRequired('releaseInfos', $this->releaseInfos, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->containerServiceName) {
            $res['container_service_name'] = $this->containerServiceName;
        }
        if (null !== $this->releaseInfos) {
            $res['release_infos'] = [];
            if (null !== $this->releaseInfos && \is_array($this->releaseInfos)) {
                $n = 0;
                foreach ($this->releaseInfos as $item) {
                    $res['release_infos'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppServiceSidecarReleaseInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['container_service_name'])) {
            $model->containerServiceName = $map['container_service_name'];
        }
        if (isset($map['release_infos'])) {
            if (!empty($map['release_infos'])) {
                $model->releaseInfos = [];
                $n                   = 0;
                foreach ($map['release_infos'] as $item) {
                    $model->releaseInfos[$n++] = null !== $item ? SidecarReleaseInfo::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
