// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRcpHqRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 房产查询场景,NO_AUTH_QUERY=无授权直查
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 助贷平台
        [NameInMap("loan_assist_platform")]
        [Validation(Required=true)]
        public string LoanAssistPlatform { get; set; }

        // 房产链内部银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 外部业务单号
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 房产信息
        [NameInMap("house")]
        [Validation(Required=true)]
        public House House { get; set; }

        // 查询产权
        [NameInMap("house_owner")]
        [Validation(Required=true)]
        public HouseOwner HouseOwner { get; set; }

        // 办理业务分支行
        [NameInMap("branch_bank")]
        [Validation(Required=true)]
        public Bank BranchBank { get; set; }

    }

}
