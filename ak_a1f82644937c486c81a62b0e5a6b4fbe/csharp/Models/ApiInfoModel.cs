// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_a1f82644937c486c81a62b0e5a6b4fbe.Models
{
    // api信息结构体
    public class ApiInfoModel : TeaModel {
        // api名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>demo.sss.ss.ss.bind</para>
        /// </summary>
        [NameInMap("api_name")]
        [Validation(Required=true)]
        public string ApiName { get; set; }

        // API所属网关技术产品码
        /// <summary>
        /// <b>Example:</b>
        /// <para>demo</para>
        /// </summary>
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 是否是内部接口 0对外 1对内
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("internal")]
        [Validation(Required=true)]
        public long? Internal { get; set; }

        // api版本号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0</para>
        /// </summary>
        [NameInMap("api_version")]
        [Validation(Required=true)]
        public string ApiVersion { get; set; }

        // api描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试用api</para>
        /// </summary>
        [NameInMap("api_desc")]
        [Validation(Required=true)]
        public string ApiDesc { get; set; }

        // api所属网关产品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>0000567567</para>
        /// </summary>
        [NameInMap("provider_id")]
        [Validation(Required=true)]
        public string ProviderId { get; set; }

    }

}
