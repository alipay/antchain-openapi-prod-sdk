// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备注册 请求对象
    public class IotBasicDeviceRegisterInfo : TeaModel {
        // 设备规格
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("device_specs")]
        [Validation(Required=true)]
        public string DeviceSpecs { get; set; }

        // 设备型号
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // 设备名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备sn
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备标签
        /// <summary>
        /// <b>Example:</b>
        /// <para>telpo</para>
        /// </summary>
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 安装位置
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备扩展信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{ &quot;txHash&quot; : &quot;2c952456827828cdedad06afccef75a9f2c2840cbb6b0b659f653da1e5916cb2&quot; }]</para>
        /// </summary>
        [NameInMap("device_ext")]
        [Validation(Required=false)]
        public string DeviceExt { get; set; }

        // 设备安全认证ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>secid</para>
        /// </summary>
        [NameInMap("sec_id")]
        [Validation(Required=false)]
        public string SecId { get; set; }

    }

}
