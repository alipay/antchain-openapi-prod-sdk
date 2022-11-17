// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryNotaryFeedetailResponse : TeaModel {
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

        // 本次公证出证需支付的总费用
        [NameInMap("total_price_rmb_fen")]
        [Validation(Required=false)]
        public long? TotalPriceRmbFen { get; set; }

        // 本次申请中每一类证据的数量明细列表
        [NameInMap("notary_fee_evid_type_data_list")]
        [Validation(Required=false)]
        public List<NotaryFeeEvidTypeData> NotaryFeeEvidTypeDataList { get; set; }

        // 本次需支付费用的分项明细列表
        [NameInMap("notary_fee_item_list")]
        [Validation(Required=false)]
        public List<NotaryFeeItem> NotaryFeeItemList { get; set; }

        // 收费规则描述
        [NameInMap("notary_fee_rule_list")]
        [Validation(Required=false)]
        public List<string> NotaryFeeRuleList { get; set; }

    }

}
