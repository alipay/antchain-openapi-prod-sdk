// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMOSDK.Models
{
    // DEMOSDK结构体A·edit for test18
    public class DemosdkStructA : TeaModel {
        // 【公司名称】
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=false)]
        public string CompanyName { get; set; }

        // 【业务类型】
        /// <summary>
        /// <b>Example:</b>
        /// <para>运营</para>
        /// </summary>
        [NameInMap("product_main_class")]
        [Validation(Required=false)]
        public string ProductMainClass { get; set; }

        // 【公司地址】
        /// <summary>
        /// <b>Example:</b>
        /// <para>xx市xx区</para>
        /// </summary>
        [NameInMap("company_address")]
        [Validation(Required=false)]
        public string CompanyAddress { get; set; }

        // 【联系人】
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("contact_name")]
        [Validation(Required=false)]
        public string ContactName { get; set; }

        // 【联系人手机号】
        /// <summary>
        /// <b>Example:</b>
        /// <para>13688888888</para>
        /// </summary>
        [NameInMap("contact_mobile")]
        [Validation(Required=false)]
        public string ContactMobile { get; set; }

    }

}
