// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 品类目录项（I-0133）
    public class OpenApiCategoryInfo : TeaModel {
        /// <summary>
        /// <b>Example:</b>
        /// <para>id_example</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>测试产品</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("service_forms")]
        [Validation(Required=true)]
        public List<string> ServiceForms { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("network_modes")]
        [Validation(Required=true)]
        public List<string> NetworkModes { get; set; }

        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("activation_types")]
        [Validation(Required=true)]
        public List<string> ActivationTypes { get; set; }

    }

}
