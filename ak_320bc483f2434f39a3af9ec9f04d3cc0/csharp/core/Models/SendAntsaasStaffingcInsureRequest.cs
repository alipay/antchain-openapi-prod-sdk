// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    public class SendAntsaasStaffingcInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 外部业务号（幂等、异步通知回传）
        [NameInMap("out_biz_no")]
        [Validation(Required=true)]
        public string OutBizNo { get; set; }

        // 企业名称
        [NameInMap("enterprise_name")]
        [Validation(Required=true)]
        public string EnterpriseName { get; set; }

        // 统一社会信用代码
        [NameInMap("social_credit_code")]
        [Validation(Required=true)]
        public string SocialCreditCode { get; set; }

        // 保险场景码: 
        // FLEXIBLE_EMPLOYMENT-日单（实时生效）
        // INITIATIVE_EMPLOYMENT- 长期（次日0点生效）
        [NameInMap("biz_code")]
        [Validation(Required=true)]
        public string BizCode { get; set; }

        // 投保的险种编码:
        // ACCIDENT: 意外险,
        // EMPLOYER_LIABILITY: 雇主险
        [NameInMap("insurance_type_code")]
        [Validation(Required=true)]
        public string InsuranceTypeCode { get; set; }

        // 产品ID
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 职业编码: 
        // default-1-一类职业; 
        // default-2-二类职业;
        // default-3-三类职业;
        // default-4-四类职业;
        // default-5-五类职业（雇主险60万和80万保额暂不支持）
        [NameInMap("job_code")]
        [Validation(Required=true)]
        public string JobCode { get; set; }

        // 保障周期：30D、360D（bizCode为长期时必传）
        [NameInMap("period")]
        [Validation(Required=false)]
        public string Period { get; set; }

        // 推荐编码
        [NameInMap("recom_flow_no")]
        [Validation(Required=false)]
        public string RecomFlowNo { get; set; }

        // 地址（bizCode为日单必传）
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 投保人列表，extra_msg需传递out_sub_biz_no，外部明细业务号（投保结果通知会回传，自行定义）
        [NameInMap("employee_list")]
        [Validation(Required=true)]
        public List<InsureEmployeeInfo> EmployeeList { get; set; }

    }

}
