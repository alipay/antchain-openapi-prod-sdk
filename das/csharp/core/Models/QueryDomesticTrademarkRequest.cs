// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryDomesticTrademarkRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商标名称
        [NameInMap("tm_name")]
        [Validation(Required=false)]
        public string TmName { get; set; }

        // 商标注册证号
        [NameInMap("tm_reg_num")]
        [Validation(Required=false)]
        public string TmRegNum { get; set; }

        // 商标所有人名称
        [NameInMap("tm_owner_name")]
        [Validation(Required=false)]
        public string TmOwnerName { get; set; }

        // 商标所有人社会信用统一代码
        [NameInMap("tm_owner_uscc")]
        [Validation(Required=false)]
        public string TmOwnerUscc { get; set; }

        // 数据集ID
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 每页的数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 当前页码，从0开始。
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

    }

}
