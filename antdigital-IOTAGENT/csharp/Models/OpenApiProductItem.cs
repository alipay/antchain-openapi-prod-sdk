// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 产品信息（I-0133）
    public class OpenApiProductItem : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("product_key")]
        [Validation(Required=true)]
        public string ProductKey { get; set; }

        // 产品业务云实例，非网关product_instance_id；由服务端按认证租户和productKey映射
        /// <summary>
        /// <b>Example:</b>
        /// <para>business_instance_example</para>
        /// </summary>
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>测试产品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>示例说明</para>
        /// </summary>
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("category_id")]
        [Validation(Required=true)]
        public string CategoryId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("service_form")]
        [Validation(Required=true)]
        public string ServiceForm { get; set; }

        // 枚举:LICENSE,INSTANCE
        /// <summary>
        /// <b>Example:</b>
        /// <para>LICENSE</para>
        /// </summary>
        [NameInMap("authorization_mode")]
        [Validation(Required=true)]
        public string AuthorizationMode { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("activation_type")]
        [Validation(Required=true)]
        public string ActivationType { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("network_mode")]
        [Validation(Required=false)]
        public string NetworkMode { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("external_id")]
        [Validation(Required=false)]
        public string ExternalId { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("long_memory_enabled")]
        [Validation(Required=true)]
        public bool? LongMemoryEnabled { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>2026-11-17T00:00:00+08:00</para>
        /// </summary>
        [NameInMap("created_at")]
        [Validation(Required=true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("default_template")]
        [Validation(Required=true)]
        public OpenApiTemplateInfo DefaultTemplate { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("plugins")]
        [Validation(Required=true)]
        public List<OpenApiPluginInfo> Plugins { get; set; }

    }

}
