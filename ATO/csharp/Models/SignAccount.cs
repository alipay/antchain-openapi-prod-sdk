// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 签署人账户
    public class SignAccount : TeaModel {
        // 公司统一社会信用代码（userType=ORGANIZATION必传）
        /// <summary>
        /// <b>Example:</b>
        /// <para>91310101MA1FPCXA3G</para>
        /// </summary>
        [NameInMap("company_id")]
        [Validation(Required=false)]
        public string CompanyId { get; set; }

        // 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
        /// <summary>
        /// <b>Example:</b>
        /// <para>MERCHANT</para>
        /// </summary>
        [NameInMap("company_role")]
        [Validation(Required=false)]
        public string CompanyRole { get; set; }

        // 用户姓名（userType=PERSON必传，需要RSA加密）
        /// <summary>
        /// <b>Example:</b>
        /// <para>RSA(用户姓名)</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=false)]
        public string UserName { get; set; }

        // 用户身份证号（userType=PERSON必传，需要RSA加密）
        /// <summary>
        /// <b>Example:</b>
        /// <para>RSA(用户身份证号)</para>
        /// </summary>
        [NameInMap("user_id_number")]
        [Validation(Required=false)]
        public string UserIdNumber { get; set; }

        // 签署人类型，PERSON=个人;ORGANIZATION=机构
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSON</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

        // 用户邮箱（userType=PERSON必传，需要RSA加密）
        /// <summary>
        /// <b>Example:</b>
        /// <para>RSA(用户邮箱)</para>
        /// </summary>
        [NameInMap("user_email")]
        [Validation(Required=false)]
        public string UserEmail { get; set; }

        // 用户手机号（userType=PERSON必传，需要RSA加密）
        /// <summary>
        /// <b>Example:</b>
        /// <para>RSA(用户手机号)</para>
        /// </summary>
        [NameInMap("user_mobile")]
        [Validation(Required=false)]
        public string UserMobile { get; set; }

        // 签署标签（对应模版配置中的tag）
        /// <summary>
        /// <b>Example:</b>
        /// <para>jiafang</para>
        /// </summary>
        [NameInMap("tag")]
        [Validation(Required=true)]
        public string Tag { get; set; }

        // 是否获取签署链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("get_sign_url")]
        [Validation(Required=false)]
        public bool? GetSignUrl { get; set; }

    }

}
