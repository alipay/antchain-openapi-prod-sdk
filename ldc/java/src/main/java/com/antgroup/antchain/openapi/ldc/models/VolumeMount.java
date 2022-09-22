// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class VolumeMount extends TeaModel {
    // 引用Configmap&Secret的存储。
    @NameInMap("configmap_secret_volume_source")
    public ConfigmapSecretVolumeSource configmapSecretVolumeSource;

    // 基于empty dir的存储。
    @NameInMap("empty_dir_volume_source")
    public EmptyDirVolumeSource emptyDirVolumeSource;

    // 基于本地磁盘的存储资源。
    @NameInMap("local_disk_volume_source")
    public LocalDiskVolumeSource localDiskVolumeSource;

    // 容器内挂载路径。
    @NameInMap("mount_path")
    @Validation(required = true)
    public String mountPath;

    // 引用的volume名称。
    @NameInMap("name")
    public String name;

    // 是否只读。
    @NameInMap("read_only")
    @Validation(required = true)
    public Boolean readOnly;

    // 容器内挂载路径子路径。
    @NameInMap("sub_path")
    public String subPath;

    // 数据卷类型，取值 LOCAL_STORAGE：主机挂载， CONFIGMAP：配置项， SECRET：保密字典
    @NameInMap("volume_source_category_type")
    @Validation(required = true)
    public String volumeSourceCategoryType;

    // 引用的PVC信息。
    @NameInMap("pvc_source")
    public PersistentVolumeClaimSource pvcSource;

    // 容器内挂载子路径的表达式，与sub_path互斥
    @NameInMap("sub_path_expr")
    public String subPathExpr;

    // nfs volume
    @NameInMap("nfs_volume_source")
    public NFSVolumeSource nfsVolumeSource;

    public static VolumeMount build(java.util.Map<String, ?> map) throws Exception {
        VolumeMount self = new VolumeMount();
        return TeaModel.build(map, self);
    }

    public VolumeMount setConfigmapSecretVolumeSource(ConfigmapSecretVolumeSource configmapSecretVolumeSource) {
        this.configmapSecretVolumeSource = configmapSecretVolumeSource;
        return this;
    }
    public ConfigmapSecretVolumeSource getConfigmapSecretVolumeSource() {
        return this.configmapSecretVolumeSource;
    }

    public VolumeMount setEmptyDirVolumeSource(EmptyDirVolumeSource emptyDirVolumeSource) {
        this.emptyDirVolumeSource = emptyDirVolumeSource;
        return this;
    }
    public EmptyDirVolumeSource getEmptyDirVolumeSource() {
        return this.emptyDirVolumeSource;
    }

    public VolumeMount setLocalDiskVolumeSource(LocalDiskVolumeSource localDiskVolumeSource) {
        this.localDiskVolumeSource = localDiskVolumeSource;
        return this;
    }
    public LocalDiskVolumeSource getLocalDiskVolumeSource() {
        return this.localDiskVolumeSource;
    }

    public VolumeMount setMountPath(String mountPath) {
        this.mountPath = mountPath;
        return this;
    }
    public String getMountPath() {
        return this.mountPath;
    }

    public VolumeMount setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VolumeMount setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public VolumeMount setSubPath(String subPath) {
        this.subPath = subPath;
        return this;
    }
    public String getSubPath() {
        return this.subPath;
    }

    public VolumeMount setVolumeSourceCategoryType(String volumeSourceCategoryType) {
        this.volumeSourceCategoryType = volumeSourceCategoryType;
        return this;
    }
    public String getVolumeSourceCategoryType() {
        return this.volumeSourceCategoryType;
    }

    public VolumeMount setPvcSource(PersistentVolumeClaimSource pvcSource) {
        this.pvcSource = pvcSource;
        return this;
    }
    public PersistentVolumeClaimSource getPvcSource() {
        return this.pvcSource;
    }

    public VolumeMount setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
        return this;
    }
    public String getSubPathExpr() {
        return this.subPathExpr;
    }

    public VolumeMount setNfsVolumeSource(NFSVolumeSource nfsVolumeSource) {
        this.nfsVolumeSource = nfsVolumeSource;
        return this;
    }
    public NFSVolumeSource getNfsVolumeSource() {
        return this.nfsVolumeSource;
    }

}
