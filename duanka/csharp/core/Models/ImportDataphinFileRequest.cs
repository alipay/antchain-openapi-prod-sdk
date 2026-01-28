// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class ImportDataphinFileRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // orderId
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // userId
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // fileKey
        [NameInMap("file_key")]
        [Validation(Required=true)]
        public string FileKey { get; set; }

        // headerList
        [NameInMap("header_list")]
        [Validation(Required=true)]
        public List<string> HeaderList { get; set; }

        // targetList
        [NameInMap("target_list")]
        [Validation(Required=true)]
        public List<string> TargetList { get; set; }

        // tableProject
        [NameInMap("table_project")]
        [Validation(Required=true)]
        public string TableProject { get; set; }

        // tableName
        [NameInMap("table_name")]
        [Validation(Required=true)]
        public string TableName { get; set; }

        // partition
        [NameInMap("partition")]
        [Validation(Required=true)]
        public string Partition { get; set; }

        // OcDataphinProjectEnum枚举
        [NameInMap("project")]
        [Validation(Required=true)]
        public string Project { get; set; }

    }

}
