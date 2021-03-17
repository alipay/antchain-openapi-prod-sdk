// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class InitRcpMgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 抵押单号
        [NameInMap("mg_order_no")]
        [Validation(Required=true)]
        public string MgOrderNo { get; set; }

        // 确认预抵押结论，Y-表示继续，N-表示中止
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 中止抵押的原因code
        [NameInMap("fail_code")]
        [Validation(Required=false)]
        public string FailCode { get; set; }

        // 中止抵押的原因描述
        [NameInMap("fail_desc")]
        [Validation(Required=false)]
        public string FailDesc { get; set; }

        // 抵押登记相关合同变量和值全集，Map<String,String>的json格式
        [NameInMap("ar_var_value_json")]
        [Validation(Required=true)]
        public string ArVarValueJson { get; set; }

        // 抵押担保信息
        [NameInMap("mg_order_mort_guarantee")]
        [Validation(Required=true)]
        public MortGuaranteeInfo MgOrderMortGuarantee { get; set; }

    }

}
