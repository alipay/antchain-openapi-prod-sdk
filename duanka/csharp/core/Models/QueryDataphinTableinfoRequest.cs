// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class QueryDataphinTableinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // projectSpaceName
        [NameInMap("project_space_name")]
        [Validation(Required=true)]
        public string ProjectSpaceName { get; set; }

        // tableName
        [NameInMap("table_name")]
        [Validation(Required=true)]
        public string TableName { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

    }

}
