// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 法人信息修改
    public class LegalInfoUpdate : TeaModel {
        // 法人名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人名称</para>
        /// </summary>
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 法人证件号
        /// <summary>
        /// <b>Example:</b>
        /// <para>法人证件号</para>
        /// </summary>
        [NameInMap("legal_cert_no")]
        [Validation(Required=false)]
        public string LegalCertNo { get; set; }

        // 法人证件正面
        [NameInMap("legal_cert_front_file")]
        [Validation(Required=false)]
        public FileInfo LegalCertFrontFile { get; set; }

        // 法人证件反面
        [NameInMap("legal_cert_back_file")]
        [Validation(Required=false)]
        public FileInfo LegalCertBackFile { get; set; }

    }

}
