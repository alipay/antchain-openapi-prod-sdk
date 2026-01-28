// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // 分区结果查询信息
    public class PartitionObject : TeaModel {
        // tableGuid
        [NameInMap("table_guid")]
        [Validation(Required=true)]
        public string TableGuid { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // last_modify_time
        [NameInMap("last_modify_time")]
        [Validation(Required=true)]
        public string LastModifyTime { get; set; }

        // panguFileSize
        [NameInMap("pangu_file_size")]
        [Validation(Required=true)]
        public long? PanguFileSize { get; set; }

        // recordCnt 记录数目
        [NameInMap("record_cnt")]
        [Validation(Required=true)]
        public long? RecordCnt { get; set; }

    }

}
