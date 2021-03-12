// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDigitalassetExchangeEpinfoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 版通锚定物
        [NameInMap("ep_anchor")]
        [Validation(Required=false)]
        public string EpAnchor { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=false)]
        public string EpCode { get; set; }

        // 版通首发量
        [NameInMap("ep_first_amount")]
        [Validation(Required=false)]
        public long? EpFirstAmount { get; set; }

        // 版通发行方账户
        [NameInMap("ep_issue_account")]
        [Validation(Required=false)]
        public string EpIssueAccount { get; set; }

        // 版通发行日时间戳
        [NameInMap("ep_issue_date")]
        [Validation(Required=false)]
        public long? EpIssueDate { get; set; }

        // 版通历史发行记录
        [NameInMap("ep_issue_history")]
        [Validation(Required=false)]
        public List<EPIssueHisInfo> EpIssueHistory { get; set; }

        // 版通名称
        [NameInMap("ep_name")]
        [Validation(Required=false)]
        public string EpName { get; set; }

        // 版通线下发行量
        [NameInMap("ep_offline_issue_amount")]
        [Validation(Required=false)]
        public long? EpOfflineIssueAmount { get; set; }

        // 版通线下日解限量
        [NameInMap("ep_offline_unfreeze")]
        [Validation(Required=false)]
        public long? EpOfflineUnfreeze { get; set; }

        // 版通线上发行量
        [NameInMap("ep_online_issue_amount")]
        [Validation(Required=false)]
        public long? EpOnlineIssueAmount { get; set; }

        // 版通发行方自持量
        [NameInMap("ep_self_amount")]
        [Validation(Required=false)]
        public long? EpSelfAmount { get; set; }

        // 版通自持日解限量
        [NameInMap("ep_self_unfreeze")]
        [Validation(Required=false)]
        public long? EpSelfUnfreeze { get; set; }

        // 版通状态 0:正常 1:锁定
        [NameInMap("ep_status")]
        [Validation(Required=false)]
        public long? EpStatus { get; set; }

        // 版通总发行量
        [NameInMap("ep_total_amount")]
        [Validation(Required=false)]
        public long? EpTotalAmount { get; set; }

        // 版通类型
        [NameInMap("ep_type")]
        [Validation(Required=false)]
        public string EpType { get; set; }

        // 扩展字段
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

    }

}
