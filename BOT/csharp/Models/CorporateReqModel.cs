// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 组织请求注册更新结构体，应用在注册/更新API的ThingExtraParams
    public class CorporateReqModel : TeaModel {
        // 组织地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxx</para>
        /// </summary>
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 运营地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("business_address")]
        [Validation(Required=false)]
        public string BusinessAddress { get; set; }

        // 经营类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("business_scope")]
        [Validation(Required=false)]
        public string BusinessScope { get; set; }

        // 注册时间，字符串类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;注册时间&quot;</para>
        /// </summary>
        [NameInMap("certify_date")]
        [Validation(Required=false)]
        public string CertifyDate { get; set; }

        // 营业执照有效期，字符串
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("licence_expire_date")]
        [Validation(Required=false)]
        public string LicenceExpireDate { get; set; }

        // 国家
        /// <summary>
        /// <b>Example:</b>
        /// <para>CN</para>
        /// </summary>
        [NameInMap("nation")]
        [Validation(Required=false)]
        public string Nation { get; set; }

        // 组织类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>LimitedCompany</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
