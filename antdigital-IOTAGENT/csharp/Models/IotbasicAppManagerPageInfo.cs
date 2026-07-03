// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // iotbasic-应用列表信息
    public class IotbasicAppManagerPageInfo : TeaModel {
        // 应用类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>apk</para>
        /// </summary>
        [NameInMap("file_format")]
        [Validation(Required=true)]
        public string FileFormat { get; set; }

        // 应用大小
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public long? FileSize { get; set; }

        // 应用模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>温控设备客户端</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // 设备品类code
        /// <summary>
        /// <b>Example:</b>
        /// <para>code</para>
        /// </summary>
        [NameInMap("device_category")]
        [Validation(Required=true)]
        public string DeviceCategory { get; set; }

        // 设备品类名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("device_category_name")]
        [Validation(Required=true)]
        public string DeviceCategoryName { get; set; }

        // 应用模块包名
        /// <summary>
        /// <b>Example:</b>
        /// <para>packageName</para>
        /// </summary>
        [NameInMap("package_name")]
        [Validation(Required=true)]
        public string PackageName { get; set; }

        // 应用描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>desc</para>
        /// </summary>
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 应用版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0</para>
        /// </summary>
        [NameInMap("apk_version")]
        [Validation(Required=true)]
        public string ApkVersion { get; set; }

        // 应用包类型（整包：0/差分：1）
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("apk_type")]
        [Validation(Required=true)]
        public long? ApkType { get; set; }

        // 应用名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>apkName</para>
        /// </summary>
        [NameInMap("apk_name")]
        [Validation(Required=true)]
        public string ApkName { get; set; }

        // 应用包id
        /// <summary>
        /// <b>Example:</b>
        /// <para>apkId</para>
        /// </summary>
        [NameInMap("apk_id")]
        [Validation(Required=true)]
        public string ApkId { get; set; }

        // 下载次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("download_count")]
        [Validation(Required=true)]
        public long? DownloadCount { get; set; }

        // 安装次数
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("install_count")]
        [Validation(Required=true)]
        public long? InstallCount { get; set; }

        // 设备型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>model</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

    }

}
