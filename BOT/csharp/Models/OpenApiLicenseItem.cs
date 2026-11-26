// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // License信息（I-0133）
    public class OpenApiLicenseItem : TeaModel {
        // 仅认证租户可见，不记日志
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("license_code")]
        [Validation(Required=true)]
        public string LicenseCode { get; set; }

        // 枚举:INACTIVE,ACTIVE,EXPIRED
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("activation_state")]
        [Validation(Required=true)]
        public string ActivationState { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("device_id")]
        [Validation(Required=true)]
        public string DeviceId { get; set; }

        // 枚举:AGENT_REQUEST
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 枚举:QUOTA_POINT
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("used")]
        [Validation(Required=true)]
        public long? Used { get; set; }

        // total-used，保留负值
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("remaining")]
        [Validation(Required=true)]
        public long? Remaining { get; set; }

    }

}
