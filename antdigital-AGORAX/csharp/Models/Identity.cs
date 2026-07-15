// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 可信存证身份识别信息
    public class Identity : TeaModel {
        // 经办人姓名，企业认证必选
        /// <summary>
        /// <b>Example:</b>
        /// <para>小明</para>
        /// </summary>
        [NameInMap("agent")]
        [Validation(Required=false)]
        public string Agent { get; set; }

        // 经办人身份证
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123123123</para>
        /// </summary>
        [NameInMap("agent_id")]
        [Validation(Required=false)]
        public string AgentId { get; set; }

        // 用户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>小王</para>
        /// </summary>
        [NameInMap("cert_name")]
        [Validation(Required=true)]
        public string CertName { get; set; }

        // 证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>12332112312312</para>
        /// </summary>
        [NameInMap("cert_no")]
        [Validation(Required=true)]
        public string CertNo { get; set; }

        // 证件类型，个人只支持身份证IDENTITY_CARD，企业支持UNIFIED_SOCIAL_CREDIT_CODE（统一社会信用代码）和ENTERPRISE_REGISTERED_NUMBER（企业工商注册号
        /// <summary>
        /// <b>Example:</b>
        /// <para>IDENTITY_CARD</para>
        /// </summary>
        [NameInMap("cert_type")]
        [Validation(Required=true)]
        public string CertType { get; set; }

        // 法人姓名，企业认证必选
        /// <summary>
        /// <b>Example:</b>
        /// <para>小李</para>
        /// </summary>
        [NameInMap("legal_person")]
        [Validation(Required=false)]
        public string LegalPerson { get; set; }

        // 法人身份证,  企业认证必选
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123321123</para>
        /// </summary>
        [NameInMap("legal_person_id")]
        [Validation(Required=false)]
        public string LegalPersonId { get; set; }

        // 用户手机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>1231231231</para>
        /// </summary>
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 扩展属性
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;key&quot;:&quot;value&quot;}</para>
        /// </summary>
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 用户类型，PERSON或者ENTERPRISE
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSON</para>
        /// </summary>
        [NameInMap("user_type")]
        [Validation(Required=true)]
        public string UserType { get; set; }

    }

}
