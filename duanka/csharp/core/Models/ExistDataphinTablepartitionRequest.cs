// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class ExistDataphinTablepartitionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // operator操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // project项目空间
        [NameInMap("project")]
        [Validation(Required=true)]
        public string Project { get; set; }

        // tableName
        [NameInMap("table_name")]
        [Validation(Required=true)]
        public string TableName { get; set; }

        // 分区
        [NameInMap("partition")]
        [Validation(Required=true)]
        public string Partition { get; set; }

    }

}
