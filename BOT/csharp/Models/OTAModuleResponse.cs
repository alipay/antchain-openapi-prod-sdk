// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // OTA升级包模块响应
    public class OTAModuleResponse : TeaModel {
        // 主键id
        /// <summary>
        /// <b>Example:</b>
        /// <para>636804107650338816</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 租户id
        /// <summary>
        /// <b>Example:</b>
        /// <para>POPVPRVV</para>
        /// </summary>
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 可信物联唯一产品标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>B7uwSpw2dAaxhZ8nJt</para>
        /// </summary>
        [NameInMap("trust_product_key")]
        [Validation(Required=false)]
        public string TrustProductKey { get; set; }

        // 产品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>产品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 模块名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>CAT1_OTA</para>
        /// </summary>
        [NameInMap("module_name")]
        [Validation(Required=false)]
        public string ModuleName { get; set; }

        // 模块别名
        /// <summary>
        /// <b>Example:</b>
        /// <para>模块别名</para>
        /// </summary>
        [NameInMap("alias_name")]
        [Validation(Required=false)]
        public string AliasName { get; set; }

        // 模块描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>模块描述</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // KYT模块唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>2bace9c5bdd54b2781a5d325055ada57</para>
        /// </summary>
        [NameInMap("mid")]
        [Validation(Required=false)]
        public string Mid { get; set; }

        // 创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1773998631000</para>
        /// </summary>
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1773998631000</para>
        /// </summary>
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

    }

}
