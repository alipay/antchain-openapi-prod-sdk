// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOTSG.Models
{
    // 事件数据
    public class EventData : TeaModel {
        // 数据内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>{ &quot;DEVICE-ID&quot;: &quot;ABC123&quot;, &quot;IMEI&quot;: &quot;868331011992179&quot;, &quot;HEART-BEAT-TIME&quot;: 1699053387008 }</para>
        /// </summary>
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 可信设备ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>7213004826408435712</para>
        /// </summary>
        [NameInMap("trust_iot_device_id")]
        [Validation(Required=false)]
        public long? TrustIotDeviceId { get; set; }

        // 业务ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240815</para>
        /// </summary>
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 数据签名
        /// <summary>
        /// <b>Example:</b>
        /// <para>8e084d95c5ac9198b01b9f6b8040b2daa35a3e2706a472295f52ec0966119383d7654eb2c1f67eb563194ab9d2197fcd8fcb5232308927e708257ebea8ce1cda</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

        // 设备数据间接上报时，服务端补充数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;PRICE&quot;:2.2,&quot;NUMBER&quot;:3}</para>
        /// </summary>
        [NameInMap("extra_data")]
        [Validation(Required=false)]
        public string ExtraData { get; set; }

    }

}
