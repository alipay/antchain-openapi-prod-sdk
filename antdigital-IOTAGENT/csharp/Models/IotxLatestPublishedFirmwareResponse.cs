// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 产品模块最新已发布固件包响应
    public class IotxLatestPublishedFirmwareResponse : TeaModel {
        // 可信产品唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>可信产品唯一标识</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // OTA 模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 模块名称</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // OTA 固件包唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 固件包唯一标识</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // OTA 固件包名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 固件包名称</para>
        /// </summary>
        [NameInMap("firmware_name")]
        [Validation(Required=false)]
        public string FirmwareName { get; set; }

        // OTA 固件包下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 固件包下载地址</para>
        /// </summary>
        [NameInMap("firmware_url")]
        [Validation(Required=false)]
        public string FirmwareUrl { get; set; }

        // 目标版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>目标版本号</para>
        /// </summary>
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // OTA 固件包内容签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 固件包内容签名</para>
        /// </summary>
        [NameInMap("firmware_sign")]
        [Validation(Required=false)]
        public string FirmwareSign { get; set; }

        // 签名算法
        /// <summary>
        /// <b>Example:</b>
        /// <para>签名算法</para>
        /// </summary>
        [NameInMap("sign_method")]
        [Validation(Required=false)]
        public string SignMethod { get; set; }

        // OTA 固件包描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA 固件包描述</para>
        /// </summary>
        [NameInMap("firmware_desc")]
        [Validation(Required=false)]
        public string FirmwareDesc { get; set; }

        // 固件包文件大小，单位为字节
        /// <summary>
        /// <b>Example:</b>
        /// <para>固件包文件大小，单位为字节</para>
        /// </summary>
        [NameInMap("firmware_size")]
        [Validation(Required=false)]
        public string FirmwareSize { get; set; }

        // 固件包类型编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>固件包类型编码</para>
        /// </summary>
        [NameInMap("firmware_type")]
        [Validation(Required=false)]
        public string FirmwareType { get; set; }

        // 差分固件源版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>差分固件源版本号</para>
        /// </summary>
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public string SrcVersion { get; set; }

        // 是否需要验证，0 表示不需要，1 表示需要
        /// <summary>
        /// <b>Example:</b>
        /// <para>是否需要验证，0 表示不需要，1 表示需要</para>
        /// </summary>
        [NameInMap("need_to_verify")]
        [Validation(Required=false)]
        public string NeedToVerify { get; set; }

        // 固件包验证状态编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>固件包验证状态编码</para>
        /// </summary>
        [NameInMap("verify_status")]
        [Validation(Required=false)]
        public string VerifyStatus { get; set; }

        // 推送给设备的自定义信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>推送给设备的自定义信息</para>
        /// </summary>
        [NameInMap("udi")]
        [Validation(Required=false)]
        public string Udi { get; set; }

        // 发布状态，固定为 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>发布状态，固定为 1</para>
        /// </summary>
        [NameInMap("publish_status")]
        [Validation(Required=false)]
        public string PublishStatus { get; set; }

        // 固件包支持的升级通道列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("support_channels")]
        [Validation(Required=false)]
        public List<string> SupportChannels { get; set; }

    }

}
