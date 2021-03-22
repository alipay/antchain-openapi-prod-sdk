// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class StartIpAuthtradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 采购者的链上账户Id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // IP ID
        [NameInMap("ip_id")]
        [Validation(Required=true)]
        public string IpId { get; set; }

        // 授权计费比例
        [NameInMap("auth_rate")]
        [Validation(Required=true)]
        public string AuthRate { get; set; }

        // 授权合作开始期限（毫秒时间戳）
        [NameInMap("auth_begin_time")]
        [Validation(Required=true)]
        public long? AuthBeginTime { get; set; }

        // 授权合作结束期限（毫秒时间戳）
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public long? AuthEndTime { get; set; }

        // 合同（文件URL）
        [NameInMap("contract")]
        [Validation(Required=true)]
        public string Contract { get; set; }

        // 设计稿（文件URL）
        [NameInMap("design_draft")]
        [Validation(Required=true)]
        public string DesignDraft { get; set; }

        // 备注消息(不超过256个字符)
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

    }

}
