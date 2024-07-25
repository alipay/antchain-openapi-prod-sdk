// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateIotlinkAppmanagerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用文件
        /// <summary>
        /// 待上传文件
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// 待上传文件名
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 应用模块名称，由查询应用类型列表获取。默认使用default模块
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // OTA升级包名称，需在iot账号下唯一，创建后不可修改。支持中文、英文字母、日文、数字、短划线（-）、下划线（_）和半角圆括号（()），必须以中文、英文、日文或数字开头，长度限制为1~40个字符。
        [NameInMap("apk_name")]
        [Validation(Required=true)]
        public string ApkName { get; set; }

        // 品类code
        [NameInMap("category_code")]
        [Validation(Required=true)]
        public string CategoryCode { get; set; }

        // 设备型号值
        [NameInMap("device_model_value")]
        [Validation(Required=false)]
        public string DeviceModelValue { get; set; }

        // 应用包描述
        // 最大字符为100
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 当前OTA升级包的版本号，仅支持英文字母、数字、半角句号（.）、短划线（-）和下划线（_）。长度限制为1~64个字符。
        // 最新模块版本好可通过查询应用类型列表接口获取
        [NameInMap("apk_version")]
        [Validation(Required=true)]
        public string ApkVersion { get; set; }

        // 项目编码
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 文件地址
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
