// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 用户信息
    public class UserData : TeaModel {
        // 用户账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>18654362713</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=true)]
        public string Account { get; set; }

        // 账号类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>COPYRIGHT</para>
        /// </summary>
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 证件名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>11111111111</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>IDENTITY_CARD</para>
        /// </summary>
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 联系方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>186534672712</para>
        /// </summary>
        [NameInMap("contact_info")]
        [Validation(Required=false)]
        public string ContactInfo { get; set; }

        // 企业法人
        /// <summary>
        /// <b>Example:</b>
        /// <para>李四</para>
        /// </summary>
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 注册时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1603162178000</para>
        /// </summary>
        [NameInMap("reg_time")]
        [Validation(Required=true)]
        public long? RegTime { get; set; }

        // 账号状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用户类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSON</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
