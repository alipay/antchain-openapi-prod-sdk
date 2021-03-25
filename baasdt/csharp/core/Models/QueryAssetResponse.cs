// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryAssetResponse : TeaModel {
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

        // 资产完整信息
        // {
        //             "asset_id": "CT::Asset001",
        //             "asset_name": "CTPoints",
        //             "tenant_id": "OREDKOCN",
        //             "admin_id": "f46857d8796fc2b829862e2752bda38f7eefeec5581ad41398002f50a3ad8ccd",
        //             "currency": "CNY",
        //             "asset_rate": "1000.0000",
        //             "total_issue_balance": "11111111.0000",
        //             "issue_account_balance": "0.0000",
        //             "relay_Account_balance": "0.0000",
        //             "receive_payment_account_balance": "0.0000",
        //             "overdue_recovery_account_balance": "",
        //             "status": 76,
        //             "asset_ext_info": {
        //                 "dispense_tenant_id": "",
        //                 "dispense_balance": "",
        //                 "user_id": "",
        //                 "user_credit_balance": ""
        //             }
        //         }
        [NameInMap("asset")]
        [Validation(Required=false)]
        public Asset Asset { get; set; }

    }

}
