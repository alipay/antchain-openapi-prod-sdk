// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 租户信息
    public class PermissionedTenantModel : TeaModel {
        // 主键Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2018-10-10 10:10:00</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 租户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>testTenant</para>
        /// </summary>
        [NameInMap("tenant_name")]
        [Validation(Required=true)]
        public string TenantName { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay</para>
        /// </summary>
        [NameInMap("org_name")]
        [Validation(Required=true)]
        public string OrgName { get; set; }

        // 租户所有人标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>alipay</para>
        /// </summary>
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 网关私钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>MEUCIDxNw...</para>
        /// </summary>
        [NameInMap("gateway_private_key")]
        [Validation(Required=false)]
        public string GatewayPrivateKey { get; set; }

        // 网关公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>MEUCID...</para>
        /// </summary>
        [NameInMap("gateway_public_key")]
        [Validation(Required=false)]
        public string GatewayPublicKey { get; set; }

    }

}
