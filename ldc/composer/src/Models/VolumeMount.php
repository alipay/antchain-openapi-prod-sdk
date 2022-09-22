<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class VolumeMount extends Model
{
    // 引用Configmap&Secret的存储。
    /**
     * @example {}
     *
     * @var ConfigmapSecretVolumeSource
     */
    public $configmapSecretVolumeSource;

    // 基于empty dir的存储。
    /**
     * @example {}
     *
     * @var EmptyDirVolumeSource
     */
    public $emptyDirVolumeSource;

    // 基于本地磁盘的存储资源。
    /**
     * @example {}
     *
     * @var LocalDiskVolumeSource
     */
    public $localDiskVolumeSource;

    // 容器内挂载路径。
    /**
     * @example /home/admin/logs
     *
     * @var string
     */
    public $mountPath;

    // 引用的volume名称。
    /**
     * @example volume mount
     *
     * @var string
     */
    public $name;

    // 是否只读。
    /**
     * @example true, false
     *
     * @var bool
     */
    public $readOnly;

    // 容器内挂载路径子路径。
    /**
     * @example /home/admin/logs/
     *
     * @var string
     */
    public $subPath;

    // 数据卷类型，取值 LOCAL_STORAGE：主机挂载， CONFIGMAP：配置项， SECRET：保密字典
    /**
     * @example LOCAL_STORAGE
     *
     * @var string
     */
    public $volumeSourceCategoryType;

    // 引用的PVC信息。
    /**
     * @example {}
     *
     * @var PersistentVolumeClaimSource
     */
    public $pvcSource;

    // 容器内挂载子路径的表达式，与sub_path互斥
    /**
     * @example $(POD_NAME)
     *
     * @var string
     */
    public $subPathExpr;

    // nfs volume
    /**
     * @example {}
     *
     * @var NFSVolumeSource
     */
    public $nfsVolumeSource;
    protected $_name = [
        'configmapSecretVolumeSource' => 'configmap_secret_volume_source',
        'emptyDirVolumeSource'        => 'empty_dir_volume_source',
        'localDiskVolumeSource'       => 'local_disk_volume_source',
        'mountPath'                   => 'mount_path',
        'name'                        => 'name',
        'readOnly'                    => 'read_only',
        'subPath'                     => 'sub_path',
        'volumeSourceCategoryType'    => 'volume_source_category_type',
        'pvcSource'                   => 'pvc_source',
        'subPathExpr'                 => 'sub_path_expr',
        'nfsVolumeSource'             => 'nfs_volume_source',
    ];

    public function validate()
    {
        Model::validateRequired('mountPath', $this->mountPath, true);
        Model::validateRequired('readOnly', $this->readOnly, true);
        Model::validateRequired('volumeSourceCategoryType', $this->volumeSourceCategoryType, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->configmapSecretVolumeSource) {
            $res['configmap_secret_volume_source'] = null !== $this->configmapSecretVolumeSource ? $this->configmapSecretVolumeSource->toMap() : null;
        }
        if (null !== $this->emptyDirVolumeSource) {
            $res['empty_dir_volume_source'] = null !== $this->emptyDirVolumeSource ? $this->emptyDirVolumeSource->toMap() : null;
        }
        if (null !== $this->localDiskVolumeSource) {
            $res['local_disk_volume_source'] = null !== $this->localDiskVolumeSource ? $this->localDiskVolumeSource->toMap() : null;
        }
        if (null !== $this->mountPath) {
            $res['mount_path'] = $this->mountPath;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->readOnly) {
            $res['read_only'] = $this->readOnly;
        }
        if (null !== $this->subPath) {
            $res['sub_path'] = $this->subPath;
        }
        if (null !== $this->volumeSourceCategoryType) {
            $res['volume_source_category_type'] = $this->volumeSourceCategoryType;
        }
        if (null !== $this->pvcSource) {
            $res['pvc_source'] = null !== $this->pvcSource ? $this->pvcSource->toMap() : null;
        }
        if (null !== $this->subPathExpr) {
            $res['sub_path_expr'] = $this->subPathExpr;
        }
        if (null !== $this->nfsVolumeSource) {
            $res['nfs_volume_source'] = null !== $this->nfsVolumeSource ? $this->nfsVolumeSource->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VolumeMount
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['configmap_secret_volume_source'])) {
            $model->configmapSecretVolumeSource = ConfigmapSecretVolumeSource::fromMap($map['configmap_secret_volume_source']);
        }
        if (isset($map['empty_dir_volume_source'])) {
            $model->emptyDirVolumeSource = EmptyDirVolumeSource::fromMap($map['empty_dir_volume_source']);
        }
        if (isset($map['local_disk_volume_source'])) {
            $model->localDiskVolumeSource = LocalDiskVolumeSource::fromMap($map['local_disk_volume_source']);
        }
        if (isset($map['mount_path'])) {
            $model->mountPath = $map['mount_path'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['read_only'])) {
            $model->readOnly = $map['read_only'];
        }
        if (isset($map['sub_path'])) {
            $model->subPath = $map['sub_path'];
        }
        if (isset($map['volume_source_category_type'])) {
            $model->volumeSourceCategoryType = $map['volume_source_category_type'];
        }
        if (isset($map['pvc_source'])) {
            $model->pvcSource = PersistentVolumeClaimSource::fromMap($map['pvc_source']);
        }
        if (isset($map['sub_path_expr'])) {
            $model->subPathExpr = $map['sub_path_expr'];
        }
        if (isset($map['nfs_volume_source'])) {
            $model->nfsVolumeSource = NFSVolumeSource::fromMap($map['nfs_volume_source']);
        }

        return $model;
    }
}
