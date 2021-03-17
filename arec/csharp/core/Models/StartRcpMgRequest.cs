// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    public class StartRcpMgRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 待签署的合同列表
        [NameInMap("agreements")]
        [Validation(Required=true)]
        public List<Agreement> Agreements { get; set; }

        // 材料清单列表
        [NameInMap("archives")]
        [Validation(Required=false)]
        public List<Archive> Archives { get; set; }

        // 合同变量和值的全集，Map<String,String>的json格式
        [NameInMap("ar_var_value_json")]
        [Validation(Required=true)]
        public string ArVarValueJson { get; set; }

        // 银行编号
        [NameInMap("bank_no")]
        [Validation(Required=true)]
        public string BankNo { get; set; }

        // 借款人
        [NameInMap("borrower")]
        [Validation(Required=true)]
        public Person Borrower { get; set; }

        // 扩展字段
        [NameInMap("extend_json")]
        [Validation(Required=false)]
        public string ExtendJson { get; set; }

        // 抵押房产
        [NameInMap("house")]
        [Validation(Required=true)]
        public House House { get; set; }

        // 婚姻状况,比如：MARRIED=已婚
        [NameInMap("marital_status")]
        [Validation(Required=true)]
        public string MaritalStatus { get; set; }

        // 外部业务单号，银行提供
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 登记设立原因，比如：LOAN=借贷
        [NameInMap("reg_reason")]
        [Validation(Required=true)]
        public string RegReason { get; set; }

        // 登记设立原因备注
        [NameInMap("reg_reason_remark")]
        [Validation(Required=false)]
        public string RegReasonRemark { get; set; }

        // 登记权利,比如：MORTGAGE_RIGHTS=抵押权
        [NameInMap("reg_rights")]
        [Validation(Required=true)]
        public string RegRights { get; set; }

        // 登记类型，比如：FIRST_REG=首次登记
        [NameInMap("reg_type")]
        [Validation(Required=true)]
        public string RegType { get; set; }

        // 配偶
        [NameInMap("spouse")]
        [Validation(Required=false)]
        public Person Spouse { get; set; }

    }

}
