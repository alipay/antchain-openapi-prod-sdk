// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    public class QueryTppAllinfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 累计全部参与收益
        [NameInMap("accumulative_revenue")]
        [Validation(Required=false)]
        public Revenue AccumulativeRevenue { get; set; }

        // 累计参与用书
        [NameInMap("accumulative_users")]
        [Validation(Required=false)]
        public long? AccumulativeUsers { get; set; }

        // 用户资产详情列表
        [NameInMap("asset_detail_list")]
        [Validation(Required=false)]
        public List<AssetDetail> AssetDetailList { get; set; }

        // 用户当前累计收益
        [NameInMap("current_accumulative_revenue")]
        [Validation(Required=false)]
        public Revenue CurrentAccumulativeRevenue { get; set; }

        // 当前用户收益
        [NameInMap("current_revenue")]
        [Validation(Required=false)]
        public Revenue CurrentRevenue { get; set; }

    }

}
