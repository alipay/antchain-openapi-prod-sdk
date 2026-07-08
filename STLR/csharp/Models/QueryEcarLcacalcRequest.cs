// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class QueryEcarLcacalcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 速算记录编号列表
        [NameInMap("record_no_list")]
        [Validation(Required=false)]
        public List<string> RecordNoList { get; set; }

        // 开始日期，yyyy-MM-dd
        [NameInMap("start_date")]
        [Validation(Required=false)]
        public string StartDate { get; set; }

        // 结束日期，yyyy-MM-dd
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

        // 分页查询页码，从1开始，不传时默认为1
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 每页记录条数，取值范围[10, 200]，不传时默认为20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
