// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 企业法人信息
    public class EnterpriseLegalPersonInfo : TeaModel {
        // 法人姓名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("legal_person_cert_name")]
        [Validation(Required=false)]
        public string LegalPersonCertName { get; set; }

        // 法人证件类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>IDENTITY_CARD</para>
        /// </summary>
        [NameInMap("legal_person_cert_type")]
        [Validation(Required=false)]
        public string LegalPersonCertType { get; set; }

        // 法人证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>341227199711226752</para>
        /// </summary>
        [NameInMap("legal_person_cert_no")]
        [Validation(Required=false)]
        public string LegalPersonCertNo { get; set; }

    }

}
