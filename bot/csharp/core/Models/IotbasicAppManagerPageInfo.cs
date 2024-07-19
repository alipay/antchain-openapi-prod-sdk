// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic-应用列表信息
    public class IotbasicAppManagerPageInfo : TeaModel {
        // 应用类型
        [NameInMap("file_format")]
        [Validation(Required=true)]
        public string FileFormat { get; set; }

        // 应用大小
        [NameInMap("file_size")]
        [Validation(Required=true)]
        public long? FileSize { get; set; }

        // 应用模块名称
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // 设备品类code
        [NameInMap("device_category")]
        [Validation(Required=true)]
        public string DeviceCategory { get; set; }

        // 设备品类名称
        [NameInMap("device_category_name")]
        [Validation(Required=true)]
        public string DeviceCategoryName { get; set; }

        // 应用模块包名
        [NameInMap("package_name")]
        [Validation(Required=true)]
        public string PackageName { get; set; }

        // 应用描述
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 应用版本号
        [NameInMap("apk_version")]
        [Validation(Required=true)]
        public string ApkVersion { get; set; }

        // 应用包类型（整包：0/差分：1）
        [NameInMap("apk_type")]
        [Validation(Required=true)]
        public long? ApkType { get; set; }

        // 应用名称
        [NameInMap("apk_name")]
        [Validation(Required=true)]
        public string ApkName { get; set; }

        // 应用包id
        [NameInMap("apk_id")]
        [Validation(Required=true)]
        public string ApkId { get; set; }

        // 下载次数
        [NameInMap("download_count")]
        [Validation(Required=true)]
        public long? DownloadCount { get; set; }

        // 安装次数
        [NameInMap("install_count")]
        [Validation(Required=true)]
        public long? InstallCount { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

    }

}
