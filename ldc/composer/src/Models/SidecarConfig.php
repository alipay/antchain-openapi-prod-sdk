<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class SidecarConfig extends Model
{
    // Sidercar 名称
    /**
     * @example mosn
     *
     * @var string
     */
    public $name;

    // 表达是否修改feature
    /**
     * @example true, false
     *
     * @var bool
     */
    public $changeFeature;

    // FEATURE_GATES
    /**
     * @example CloudMultiTenantMode=true,CloudTraceEnabled=true
     *
     * @var string
     */
    public $featureGates;

    // 镜像地址
    /**
     * @example reg.docker.alibaba-inc.com/antmesh/mosn:1.23.0-45402f78-nightly_cloud
     *
     * @var string
     */
    public $image;

    // 需要修改或自定义新增的sidecar环境变量。
    /**
     * @example MSG_ENCRYPT_ENABLE:false, IS_INJECTED:true
     *
     * @var string
     */
    public $changeEnvs;

    // sidecar的pvc挂载配置
    /**
     * @example
     *
     * @var VolumeMount[]
     */
    public $volumeMounts;

    // 扩展字段
    /**
     * @example ext
     *
     * @var string
     */
    public $ext;
    protected $_name = [
        'name'          => 'name',
        'changeFeature' => 'change_feature',
        'featureGates'  => 'feature_gates',
        'image'         => 'image',
        'changeEnvs'    => 'change_envs',
        'volumeMounts'  => 'volume_mounts',
        'ext'           => 'ext',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('changeFeature', $this->changeFeature, true);
        Model::validateRequired('image', $this->image, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->changeFeature) {
            $res['change_feature'] = $this->changeFeature;
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
        if (null !== $this->volumeMounts) {
            $res['volume_mounts'] = [];
            if (null !== $this->volumeMounts && \is_array($this->volumeMounts)) {
                $n = 0;
                foreach ($this->volumeMounts as $item) {
                    $res['volume_mounts'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ext) {
            $res['ext'] = $this->ext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SidecarConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['change_feature'])) {
            $model->changeFeature = $map['change_feature'];
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
        if (isset($map['volume_mounts'])) {
            if (!empty($map['volume_mounts'])) {
                $model->volumeMounts = [];
                $n                   = 0;
                foreach ($map['volume_mounts'] as $item) {
                    $model->volumeMounts[$n++] = null !== $item ? VolumeMount::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['ext'])) {
            $model->ext = $map['ext'];
        }

        return $model;
    }
}
