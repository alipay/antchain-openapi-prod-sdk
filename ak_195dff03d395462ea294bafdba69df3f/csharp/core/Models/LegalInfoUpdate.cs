// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    // 法人信息修改
    public class LegalInfoUpdate : TeaModel {
        // 法人名称
        [NameInMap("legal_name")]
        [Validation(Required=false)]
        public string LegalName { get; set; }

        // 法人证件号
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
