// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 可信签约查询数据
    public class TrustSignQueryData : TeaModel {
        // 请求唯一标识Id
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 订单状态
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // 签约方案码
        [NameInMap("solution_code")]
        [Validation(Required=true)]
        public string SolutionCode { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true)]
        public string GmtModified { get; set; }

        // 签约文件列表
        [NameInMap("file_list")]
        [Validation(Required=true)]
        public List<string> FileList { get; set; }

    }

}
