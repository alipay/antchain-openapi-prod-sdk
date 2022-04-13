// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Pod container VolumeMount info。
    public class VolumeMount : TeaModel {
        // 引用Configmap&Secret的存储。
        [NameInMap("configmap_secret_volume_source")]
        [Validation(Required=false)]
        public ConfigmapSecretVolumeSource ConfigmapSecretVolumeSource { get; set; }

        // 基于empty dir的存储。
        [NameInMap("empty_dir_volume_source")]
        [Validation(Required=false)]
        public EmptyDirVolumeSource EmptyDirVolumeSource { get; set; }

        // 基于本地磁盘的存储资源。
        [NameInMap("local_disk_volume_source")]
        [Validation(Required=false)]
        public LocalDiskVolumeSource LocalDiskVolumeSource { get; set; }

        // 容器内挂载路径。
        [NameInMap("mount_path")]
        [Validation(Required=true)]
        public string MountPath { get; set; }

        // 引用的volume名称。
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 是否只读。
        [NameInMap("read_only")]
        [Validation(Required=true)]
        public bool? ReadOnly { get; set; }

        // 容器内挂载路径子路径。
        [NameInMap("sub_path")]
        [Validation(Required=false)]
        public string SubPath { get; set; }

        // 数据卷类型，取值 LOCAL_STORAGE：主机挂载， CONFIGMAP：配置项， SECRET：保密字典
        [NameInMap("volume_source_category_type")]
        [Validation(Required=true)]
        public string VolumeSourceCategoryType { get; set; }

        // 引用的PVC信息。
        [NameInMap("pvc_source")]
        [Validation(Required=false)]
        public PersistentVolumeClaimSource PvcSource { get; set; }

        // 容器内挂载子路径的表达式，与sub_path互斥
        [NameInMap("sub_path_expr")]
        [Validation(Required=false)]
        public string SubPathExpr { get; set; }

    }

}
