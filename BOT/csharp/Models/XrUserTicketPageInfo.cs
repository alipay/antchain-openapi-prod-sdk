// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // xr用户通行证分页结果信息
    public class XrUserTicketPageInfo : TeaModel {
        // 用户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2088**</para>
        /// </summary>
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户通行证编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>2739875205</para>
        /// </summary>
        [NameInMap("xr_ticket_code")]
        [Validation(Required=true)]
        public string XrTicketCode { get; set; }

        // xr通行证资源池名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源池001</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源001</para>
        /// </summary>
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // 用户通行证状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>VALID</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 有效期
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-04-06</para>
        /// </summary>
        [NameInMap("valid_time")]
        [Validation(Required=true)]
        public string ValidTime { get; set; }

        // 所属业务
        /// <summary>
        /// <b>Example:</b>
        /// <para>XR_LEASE</para>
        /// </summary>
        [NameInMap("biz_scene")]
        [Validation(Required=true)]
        public string BizScene { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>QWERTYUI</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

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
