// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 线下场设备元素
    public class XrVerificationModelVo : TeaModel {
        // 核销资源生成的实例，xr设备对应设备did
        /// <summary>
        /// <b>Example:</b>
        /// <para>qsdfskjes</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 生成的实例名称，xr设备就的对应的具体设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>设备sn</para>
        /// </summary>
        [NameInMap("instance_name")]
        [Validation(Required=true)]
        public string InstanceName { get; set; }

        // 线下场有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-02 09:10:09</para>
        /// </summary>
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 服务状态：INIT初始化、SERVICING服务中、PAUSED已暂停、EXPIRED停用
        /// <summary>
        /// <b>Example:</b>
        /// <para>INIT</para>
        /// </summary>
        [NameInMap("sevice_status")]
        [Validation(Required=true)]
        public string SeviceStatus { get; set; }

        // 设备状态：INIT 初始化、ONLINE 在线、OFFLINE 离线、FAULT 故障、ACTIVATED 激活
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONLINE</para>
        /// </summary>
        [NameInMap("device_status")]
        [Validation(Required=true)]
        public string DeviceStatus { get; set; }

        // 唯一ID，对应线下场code
        /// <summary>
        /// <b>Example:</b>
        /// <para>唯一ID，对应线下场code</para>
        /// </summary>
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 对应线下场名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>对应线下场名称</para>
        /// </summary>
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 核销类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_DEVICE</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
