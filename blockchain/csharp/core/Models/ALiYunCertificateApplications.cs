// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云蚂蚁区块链证书列表信息
    public class ALiYunCertificateApplications : TeaModel {
        // pagination
        [NameInMap("pagination")]
        [Validation(Required=false)]
        public ALiYunPagination Pagination { get; set; }

        // certificate_application
        [NameInMap("certificate_applications")]
        [Validation(Required=false)]
        public List<ALiYunCertificateApplication> CertificateApplications { get; set; }

    }

}
