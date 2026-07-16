// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 租户协议分页对象
    public class AgreementPage : TeaModel {
        // 协议id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231234343423423</para>
        /// </summary>
        [NameInMap("agreement_id")]
        [Validation(Required=true)]
        public string AgreementId { get; set; }

        // 代理企业名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司</para>
        /// </summary>
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 租户8位id
        /// <summary>
        /// <b>Example:</b>
        /// <para>SADWQWAW</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务类型 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>业务类型</para>
        /// </summary>
        [NameInMap("product_main_class")]
        [Validation(Required=true)]
        public string ProductMainClass { get; set; }

        // 协议类型 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>协议类型</para>
        /// </summary>
        [NameInMap("agreement_type")]
        [Validation(Required=true)]
        public string AgreementType { get; set; }

        // 租户签约状态 枚举
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("sign_status")]
        [Validation(Required=true)]
        public string SignStatus { get; set; }

    }

}
