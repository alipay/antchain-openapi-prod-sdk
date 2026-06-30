// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    // 投保人
    public class Applicant : TeaModel {
        // 投保人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>李三</para>
        /// </summary>
        [NameInMap("applicant_name")]
        [Validation(Required=true, MaxLength=32)]
        public string ApplicantName { get; set; }

        // 投保人证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01--居民身份证、03--营业执照</para>
        /// </summary>
        [NameInMap("applicant_card_type")]
        [Validation(Required=true, MaxLength=32)]
        public string ApplicantCardType { get; set; }

        // 投保人证件号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("applicant_card_code")]
        [Validation(Required=true, MaxLength=32)]
        public string ApplicantCardCode { get; set; }

        // 投保人联系方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456789</para>
        /// </summary>
        [NameInMap("applicant_contact_info")]
        [Validation(Required=false, MaxLength=128)]
        public string ApplicantContactInfo { get; set; }

    }

}
