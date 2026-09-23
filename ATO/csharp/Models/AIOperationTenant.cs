// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // ai经营团队可操作租户信息
    public class AIOperationTenant : TeaModel {
        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>LDCJAHSJ</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 统一社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试企业</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 直连商户/一级服务商租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>91301010101010101A</para>
        /// </summary>
        [NameInMap("service_tenant_id")]
        [Validation(Required=true)]
        public string ServiceTenantId { get; set; }

        // 直连商户/一级服务商企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试服务商企业</para>
        /// </summary>
        [NameInMap("service_company_name")]
        [Validation(Required=true)]
        public string ServiceCompanyName { get; set; }

    }

}
