// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 进件分页对象
    public class MerchantAgentPage : TeaModel {
        // 进件id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231234343423423</para>
        /// </summary>
        [NameInMap("pay_expand_id")]
        [Validation(Required=true)]
        public string PayExpandId { get; set; }

        // 	
        // 代理企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx商户</para>
        /// </summary>
        [NameInMap("agent_name")]
        [Validation(Required=true)]
        public string AgentName { get; set; }

        // 租户8位id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SADWQWAW</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务类型</para>
        /// </summary>
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 进件审核状态 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("pay_expand_status")]
        [Validation(Required=true)]
        public string PayExpandStatus { get; set; }

    }

}
