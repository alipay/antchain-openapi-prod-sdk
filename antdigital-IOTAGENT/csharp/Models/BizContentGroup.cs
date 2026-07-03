// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 设备业务数据
    public class BizContentGroup : TeaModel {
        // 设备链上ID（与scene参数、可信设备ID至少有一个参数不为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>txhash123</para>
        /// </summary>
        [NameInMap("chain_device_id")]
        [Validation(Required=false)]
        public string ChainDeviceId { get; set; }

        // 可信设备ID（与scene参数、设备链上ID至少有一个参数不为空）
        /// <summary>
        /// <b>Example:</b>
        /// <para>7006071575519457281</para>
        /// </summary>
        [NameInMap("trustiot_device_id")]
        [Validation(Required=false)]
        public long? TrustiotDeviceId { get; set; }

        // 业务Id
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 业务类型
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 数据内容 JSON字符串
        // 
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;&quot;:&quot;&quot;,&quot;&quot;}</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
