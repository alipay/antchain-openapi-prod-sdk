// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMerchantResponse : TeaModel {
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

        // 商户完整信息
        // {
        //             "tenant_id": "Z",
        //             "did": "did:mychain:ct",
        //             "admin_id": "ed7b3acb718e2f91bc8fab6a5e7cc3c061",
        //             "fund_manager_id": "b7ecd55bde04827b3e611a741d",
        //             "description": "SK",
        //             "is_equity_provider": true,
        //             "is_equity_consumer": true,
        //             "is_asset_issuer": true,
        //             "status": 0,
        //             "provision": {
        //                 "currency": "CNY",
        //                 "debit": "99999999.0000",
        //                 "credit_max": "99999999.0000",
        //                 "credit_used": "0.0000"
        //             }
        //         }
        [NameInMap("merchant")]
        [Validation(Required=false)]
        public Merchant Merchant { get; set; }

        // 查询商户信息时的区块高度
        [NameInMap("block_number")]
        [Validation(Required=false)]
        public long? BlockNumber { get; set; }

    }

}
