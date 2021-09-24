// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class PullIpCodeResponse : TeaModel {
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

        // 正版码列表(小程序扫描可跳转)
        [NameInMap("code_list")]
        [Validation(Required=false)]
        public List<string> CodeList { get; set; }

        // 展示码列表(和code_list一一对应)
        [NameInMap("show_code_list")]
        [Validation(Required=false)]
        public List<string> ShowCodeList { get; set; }

        // 交易订单ID
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // IP商家的链上账户ID
        [NameInMap("buyer_account_id")]
        [Validation(Required=false)]
        public string BuyerAccountId { get; set; }

        // IP版权方的链上账户ID
        [NameInMap("seller_account_id")]
        [Validation(Required=false)]
        public string SellerAccountId { get; set; }

        // IPID
        [NameInMap("ip_id")]
        [Validation(Required=false)]
        public string IpId { get; set; }

        // IP名称
        [NameInMap("ip_name")]
        [Validation(Required=false)]
        public string IpName { get; set; }

        // IP主图的OSS地址
        [NameInMap("ip_image")]
        [Validation(Required=false)]
        public string IpImage { get; set; }

        // IP描述
        [NameInMap("ip_desc")]
        [Validation(Required=false)]
        public string IpDesc { get; set; }

        // 该批次正版码的过期时间戳(毫秒)
        [NameInMap("expired_date")]
        [Validation(Required=false)]
        public long? ExpiredDate { get; set; }

        // 已经申请的总数量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
