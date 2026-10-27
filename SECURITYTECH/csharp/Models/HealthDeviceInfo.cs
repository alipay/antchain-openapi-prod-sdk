// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 设备信息
    public class HealthDeviceInfo : TeaModel {
        // 品牌方渠道标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>YIHU</para>
        /// </summary>
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 设备唯一id
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("tuid")]
        [Validation(Required=false)]
        public string Tuid { get; set; }

        // 设备sn号
        [NameInMap("sn")]
        [Validation(Required=false)]
        public string Sn { get; set; }

        // 设备类型 WATCH-手表
        /// <summary>
        /// <b>Example:</b>
        /// <para>WATCH</para>
        /// </summary>
        [NameInMap("device_type")]
        [Validation(Required=false)]
        public string DeviceType { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=false)]
        public string DeviceModel { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>爸爸的手表</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=false)]
        public string DeviceName { get; set; }

        // 设备状态：0-未激活 1-在线 2-离线
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 电量百分比（0~100）
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("battery")]
        [Validation(Required=false)]
        public long? Battery { get; set; }

        // 佩戴状态：true-已佩戴 false-未佩戴
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("wear")]
        [Validation(Required=false)]
        public bool? Wear { get; set; }

        // 预留可扩展字段json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
