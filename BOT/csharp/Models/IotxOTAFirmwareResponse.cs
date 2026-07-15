// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 统一物联OTA固件信息响应
    public class IotxOTAFirmwareResponse : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>632909854293495808</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783934538000</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1783934538000</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>POPVPRVV</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 可信物联唯一产品标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>FuPsO4bwFbyLSrQIiL</para>
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

        // 固件包id
        /// <summary>
        /// <b>Example:</b>
        /// <para>kzDuv4OzIInE0VH5z2x5030100</para>
        /// </summary>
        [NameInMap("firmware_id")]
        [Validation(Required=false)]
        public string FirmwareId { get; set; }

        // OTA升级包名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA升级包名称</para>
        /// </summary>
        [NameInMap("firmware_name")]
        [Validation(Required=false)]
        public string FirmwareName { get; set; }

        // 固件包URL
        /// <summary>
        /// <b>Example:</b>
        /// <para>two_wheel_car/ota/GdzHGreIr4yBhJYHEg/jf_V1.0.65_hws-26-04-23_636999bb.bin</para>
        /// </summary>
        [NameInMap("firmware_url")]
        [Validation(Required=false)]
        public string FirmwareUrl { get; set; }

        // 当前OTA升级包版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("dest_version")]
        [Validation(Required=false)]
        public string DestVersion { get; set; }

        // OTA升级包内容的签名值
        /// <summary>
        /// <b>Example:</b>
        /// <list type="bullet">
        /// <item><description></description></item>
        /// </list>
        /// </summary>
        [NameInMap("firmware_sign")]
        [Validation(Required=false)]
        public string FirmwareSign { get; set; }

        // 升级包签名方法
        /// <summary>
        /// <b>Example:</b>
        /// <para>MD5</para>
        /// </summary>
        [NameInMap("sign_method")]
        [Validation(Required=false)]
        public string SignMethod { get; set; }

        // OTA升级包描述信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>OTA升级包描述信息</para>
        /// </summary>
        [NameInMap("firmware_desc")]
        [Validation(Required=false)]
        public string FirmwareDesc { get; set; }

        // 升级包文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>2204591</para>
        /// </summary>
        [NameInMap("firmware_size")]
        [Validation(Required=false)]
        public long? FirmwareSize { get; set; }

        // 升级包类型  0：整包升级包, 1: 差分升级包
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("firmware_type")]
        [Validation(Required=false)]
        public long? FirmwareType { get; set; }

        // 待升级OTA模块版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("src_version")]
        [Validation(Required=false)]
        public string SrcVersion { get; set; }

        // OTA模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>CAT1_OTA</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // 是否需要在创建批量升级任务前通过升级包验证：0-不需要；1-需要
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("need_to_verify")]
        [Validation(Required=false)]
        public long? NeedToVerify { get; set; }

        // 推送给设备的自定义信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>推送给设备的自定义信息</para>
        /// </summary>
        [NameInMap("udi")]
        [Validation(Required=false)]
        public string Udi { get; set; }

        // 升级包验证状态：0-未验证、1-已验证
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("verify_status")]
        [Validation(Required=false)]
        public long? VerifyStatus { get; set; }

        // 发布状态：0-未发布、1-已发布
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("publish_status")]
        [Validation(Required=false)]
        public long? PublishStatus { get; set; }

        // 固件包支持通道列表
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("support_channels")]
        [Validation(Required=false)]
        public List<string> SupportChannels { get; set; }

    }

}
