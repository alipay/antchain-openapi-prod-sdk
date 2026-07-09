// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备注册结果对象
    public class IotBasicDeviceRegisterResult : TeaModel {
        // 设备did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:private:12dsadadadf</para>
        /// </summary>
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备密钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("private_key")]
        [Validation(Required=true)]
        public string PrivateKey { get; set; }

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
        /// <para>12321321</para>
        /// </summary>
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备认证密钥密文，需要下发安全认证SDK完成设备激活
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("sec_key")]
        [Validation(Required=false)]
        public string SecKey { get; set; }

        // 设备认证密钥状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>servicing</para>
        /// </summary>
        [NameInMap("service_status")]
        [Validation(Required=false)]
        public string ServiceStatus { get; set; }

    }

}
