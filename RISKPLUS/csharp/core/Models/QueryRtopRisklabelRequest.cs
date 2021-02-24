// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopRisklabelRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // mct_one_id  -- search after使用
        [NameInMap("mct_one_id")]
        [Validation(Required=false)]
        public string MctOneId { get; set; }

        // pageNo
        [NameInMap("page_no")]
        [Validation(Required=true)]
        public long? PageNo { get; set; }

        // pageSize
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // scroll_id
        [NameInMap("scroll_id")]
        [Validation(Required=false)]
        public string ScrollId { get; set; }

        // tag_id  -- search after使用
        [NameInMap("tag_id")]
        [Validation(Required=false)]
        public string TagId { get; set; }

        // 数据更新日期
        [NameInMap("update_date")]
        [Validation(Required=true)]
        public string UpdateDate { get; set; }

    }

}
