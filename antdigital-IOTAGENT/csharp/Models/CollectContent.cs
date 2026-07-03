// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 收集信息
    public class CollectContent : TeaModel {
        // 链上设备ID（与可信设备ID至少填一项）
        /// <summary>
        /// <b>Example:</b>
        /// <para>1122</para>
        /// </summary>
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 可信设备ID（与链上设备ID至少填一项）
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575519457281</para>
        /// </summary>
        [NameInMap("trustiot_device_id")]
        [Validation(Required=false)]
        public long? TrustiotDeviceId { get; set; }

        // 收集的内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;,&quot;1&quot;}</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 对内容的签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>wwexe02j</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

        // 服务端发送的扩展数据（非可信设备直接产生的数据）
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;extraKey&quot;:&quot;extraValue&quot;}</para>
        /// </summary>
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

        // 数据模型Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>00000001</para>
        /// </summary>
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

    }

}
