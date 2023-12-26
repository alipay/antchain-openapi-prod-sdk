// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 应用授权列表
    public class ApplicationPageListResp : TeaModel {
        // 应用标识
        [NameInMap("application_id")]
        [Validation(Required=false)]
        public string ApplicationId { get; set; }

        // 链ID
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // 合约(创建实例时填写的合约名称。)
        [NameInMap("name_list")]
        [Validation(Required=false)]
        public List<string> NameList { get; set; }

    }

}
