// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // metedata分页对象
    public class SchemaMetadataPageDO : TeaModel {
        // Metadata列表内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<SchemaMetadataDO> Content { get; set; }

        // 页号
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总个数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
