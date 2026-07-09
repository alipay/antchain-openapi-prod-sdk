// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 通行证批量创建失败列表
    public class XrTicketPoolFailList : TeaModel {
        // 券名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>券名称</para>
        /// </summary>
        [NameInMap("xr_ticket_pool_name")]
        [Validation(Required=true)]
        public string XrTicketPoolName { get; set; }

        // 资源id
        /// <summary>
        /// <b>Example:</b>
        /// <para>资源id</para>
        /// </summary>
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ok</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>租户id</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>错误信息</para>
        /// </summary>
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

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
