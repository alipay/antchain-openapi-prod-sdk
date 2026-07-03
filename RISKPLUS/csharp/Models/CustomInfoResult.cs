// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 客户信息结果
    public class CustomInfoResult : TeaModel {
        // 社会信用代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>923231293311125216</para>
        /// </summary>
        [NameInMap("credit_code")]
        [Validation(Required=true)]
        public string CreditCode { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>测试查询科技有限公司</para>
        /// </summary>
        [NameInMap("company_name")]
        [Validation(Required=true)]
        public string CompanyName { get; set; }

        // 法人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>王华</para>
        /// </summary>
        [NameInMap("legal_name")]
        [Validation(Required=true)]
        public string LegalName { get; set; }

        // 身份证号
        /// <summary>
        /// <b>Example:</b>
        /// <para>320101111111111111</para>
        /// </summary>
        [NameInMap("id_card")]
        [Validation(Required=true)]
        public string IdCard { get; set; }

        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>15899998888</para>
        /// </summary>
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 密码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1111111</para>
        /// </summary>
        [NameInMap("password")]
        [Validation(Required=true)]
        public string Password { get; set; }

    }

}
