// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // ColumnDTO
    public class ColumnDTO : TeaModel {
        // tableGuid
        [NameInMap("table_guid")]
        [Validation(Required=true)]
        public string TableGuid { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // desc
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // dataType
        [NameInMap("data_type")]
        [Validation(Required=true)]
        public string DataType { get; set; }

        // columnSeq
        [NameInMap("column_seq")]
        [Validation(Required=true)]
        public long? ColumnSeq { get; set; }

        // securityLevel
        [NameInMap("security_level")]
        [Validation(Required=true)]
        public string SecurityLevel { get; set; }

        // true, false
        [NameInMap("is_p_k")]
        [Validation(Required=true)]
        public bool? IsPK { get; set; }

        // isPartition
        [NameInMap("is_partition")]
        [Validation(Required=true)]
        public bool? IsPartition { get; set; }

        // columnId
        [NameInMap("column_id")]
        [Validation(Required=true)]
        public string ColumnId { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // visitCount
        [NameInMap("visit_count")]
        [Validation(Required=true)]
        public long? VisitCount { get; set; }

    }

}
