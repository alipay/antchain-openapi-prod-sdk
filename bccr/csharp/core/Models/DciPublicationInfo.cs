// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci作品发表信息
    public class DciPublicationInfo : TeaModel {
        // 作品发表状态
        [NameInMap("publication_status")]
        [Validation(Required=true)]
        public string PublicationStatus { get; set; }

        // 首次发表日期
        [NameInMap("first_publication_date")]
        [Validation(Required=true)]
        public string FirstPublicationDate { get; set; }

        // 首次发表地址
        [NameInMap("first_publication_place")]
        [Validation(Required=true)]
        public string FirstPublicationPlace { get; set; }

    }

}
