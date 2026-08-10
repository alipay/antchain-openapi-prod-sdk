// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryCutpaymentsubTransactionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位和授权核查。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 二级商户账户号
        [NameInMap("contract_no")]
        [Validation(Required=true)]
        public string ContractNo { get; set; }

        // 明细开始时间，格式为：yyyy-MM-dd HH:mm:ss
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public string StartTime { get; set; }

        // 明细结束时间，格式为：yyyy-MM-dd HH:mm:ss，查询间隔最大支持一个月
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public string EndTime { get; set; }

        // 当前页
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public string PageNum { get; set; }

        // 每页数量，每页最多100条数据
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public string PageSize { get; set; }

        // 一级商户商户号
        [NameInMap("first_level_memberid")]
        [Validation(Required=true)]
        public string FirstLevelMemberid { get; set; }

        // 一级商户终端号
        [NameInMap("first_level_terminalid")]
        [Validation(Required=true)]
        public string FirstLevelTerminalid { get; set; }

    }

}
