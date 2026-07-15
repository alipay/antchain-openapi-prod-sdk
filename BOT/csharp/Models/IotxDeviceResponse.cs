// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 统一物联设备响应体
    public class IotxDeviceResponse : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>656431049086242816</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-07-14 15:54:45</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-07-14 15:54:45</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>XQBKTRQV</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 使用租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>XQBKTRQV</para>
        /// </summary>
        [NameInMap("usage_tenant_id")]
        [Validation(Required=false)]
        public string UsageTenantId { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF1020260409B6305762869</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 产品key
        /// <summary>
        /// <b>Example:</b>
        /// <para>iiH0DAhcM46xR1Bm</para>
        /// </summary>
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 设备昵称
        /// <summary>
        /// <b>Example:</b>
        /// <para>604C6472CDA911149D5F88D869452848</para>
        /// </summary>
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 设备秘钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>7f0f205e13d2a3fbe6e2117dc0771745</para>
        /// </summary>
        [NameInMap("device_secret")]
        [Validation(Required=false)]
        public string DeviceSecret { get; set; }

        // 设备状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONLINE</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=false)]
        public string DeviceStatus { get; set; }

        // 禁用状态：0-未禁用；1-已禁用
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("disable_status")]
        [Validation(Required=false)]
        public string DisableStatus { get; set; }

        // ekyt设备唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>FF9999995FF1020260409A0C53CC331F</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 可信产品唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>rSJhq6L0DcALjUlEW0</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 可信物联唯一设备标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>device_7447891005096624128</para>
        /// </summary>
        [NameInMap("trust_device_id")]
        [Validation(Required=false)]
        public string TrustDeviceId { get; set; }

        // ota固件版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;CAT1_OTA&quot;:&quot;1.0.4&quot;,&quot;BLE&quot;:&quot;1.0.2&quot;}</para>
        /// </summary>
        [NameInMap("ota_version")]
        [Validation(Required=false)]
        public string OtaVersion { get; set; }

        // 设备注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-09 14:21:14</para>
        /// </summary>
        [NameInMap("regist_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string RegistTime { get; set; }

        // 设备激活时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-14 12:40:24</para>
        /// </summary>
        [NameInMap("active_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ActiveTime { get; set; }

        // 最近在线时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-15 09:51:48</para>
        /// </summary>
        [NameInMap("last_online_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastOnlineTime { get; set; }

        // 最近离线时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-15 09:51:49</para>
        /// </summary>
        [NameInMap("last_offline_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastOfflineTime { get; set; }

        // 最近通讯时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-04-15 09:51:47</para>
        /// </summary>
        [NameInMap("last_communication_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastCommunicationTime { get; set; }

    }

}
