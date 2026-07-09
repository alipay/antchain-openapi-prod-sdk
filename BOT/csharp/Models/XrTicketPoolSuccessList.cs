// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // xr通行证批量创建成功列表
    public class XrTicketPoolSuccessList : TeaModel {
        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>租户id</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 资源id
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源id</para>
        /// </summary>
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022-10-02</para>
        /// </summary>
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 体验时长
        /// <summary>
        /// <b>Example:</b>
        /// <para>60(单位分)</para>
        /// </summary>
        [NameInMap("test_time")]
        [Validation(Required=true)]
        public long? TestTime { get; set; }

        // vr设备集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>json或数组</para>
        /// </summary>
        [NameInMap("xr_apps")]
        [Validation(Required=false)]
        public string XrApps { get; set; }

        // 券池最大数
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("max_pool_count")]
        [Validation(Required=true)]
        public long? MaxPoolCount { get; set; }

        // 券池名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>券池名称</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 核销类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_DEVICE</para>
        /// </summary>
        [NameInMap("xr_verification_type")]
        [Validation(Required=true)]
        public string XrVerificationType { get; set; }

    }

}
