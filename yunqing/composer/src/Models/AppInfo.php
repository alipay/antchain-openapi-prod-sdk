<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppInfo extends Model
{
    // 集群里面该app的namespace
    /**
     * @example lks-na
     *
     * @var string
     */
    public $namespace;

    // pod信息列表
    /**
     * @example podxx
     *
     * @var PodInfo[]
     */
    public $podList;

    // 应用名称
    /**
     * @example xxx_name
     *
     * @var string
     */
    public $appName;

    // ap version
    /**
     * @example 1.2.3
     *
     * @var string
     */
    public $appVersion;
    protected $_name = [
        'namespace'  => 'namespace',
        'podList'    => 'pod_list',
        'appName'    => 'app_name',
        'appVersion' => 'app_version',
    ];

    public function validate()
    {
        Model::validateRequired('namespace', $this->namespace, true);
        Model::validateRequired('podList', $this->podList, true);
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('appVersion', $this->appVersion, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->namespace) {
            $res['namespace'] = $this->namespace;
        }
        if (null !== $this->podList) {
            $res['pod_list'] = [];
            if (null !== $this->podList && \is_array($this->podList)) {
                $n = 0;
                foreach ($this->podList as $item) {
                    $res['pod_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->appVersion) {
            $res['app_version'] = $this->appVersion;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['namespace'])) {
            $model->namespace = $map['namespace'];
        }
        if (isset($map['pod_list'])) {
            if (!empty($map['pod_list'])) {
                $model->podList = [];
                $n              = 0;
                foreach ($map['pod_list'] as $item) {
                    $model->podList[$n++] = null !== $item ? PodInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['app_version'])) {
            $model->appVersion = $map['app_version'];
        }

        return $model;
    }
}
