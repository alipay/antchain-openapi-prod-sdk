// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class SubmitInvestigateCaseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 报案号 - 外部唯一ID
        [NameInMap("report_no")]
        [Validation(Required=true)]
        public string ReportNo { get; set; }

        // 外部单据号
        [NameInMap("out_case_no")]
        [Validation(Required=true)]
        public string OutCaseNo { get; set; }

        // 案件号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 委托的保司ID
        [NameInMap("entrust_insurance_company_id")]
        [Validation(Required=true)]
        public string EntrustInsuranceCompanyId { get; set; }

        // 要求完成时间，时间戳
        [NameInMap("invest_end_time")]
        [Validation(Required=true)]
        public long? InvestEndTime { get; set; }

        // 委托联系人
        [NameInMap("entrust_name")]
        [Validation(Required=true)]
        public string EntrustName { get; set; }

        // 委托联系人电话
        [NameInMap("entrust_tel")]
        [Validation(Required=true)]
        public string EntrustTel { get; set; }

        // 委托时间，时间戳
        [NameInMap("entrust_time")]
        [Validation(Required=true)]
        public long? EntrustTime { get; set; }

        // 出险人电话号码
        [NameInMap("accident_tel")]
        [Validation(Required=true)]
        public string AccidentTel { get; set; }

        // 出险人姓名
        [NameInMap("accident_name")]
        [Validation(Required=true)]
        public string AccidentName { get; set; }

        // 出险人证件号
        [NameInMap("accident_card_no")]
        [Validation(Required=true)]
        public string AccidentCardNo { get; set; }

        // 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
        [NameInMap("accident_card_type")]
        [Validation(Required=true)]
        public string AccidentCardType { get; set; }

        // 出险经过
        [NameInMap("accident_desc")]
        [Validation(Required=true)]
        public string AccidentDesc { get; set; }

        // 出险人地址中文名
        [NameInMap("accident_address_info")]
        [Validation(Required=true)]
        public string AccidentAddressInfo { get; set; }

        // 出险人详细住址
        [NameInMap("accident_address_detail")]
        [Validation(Required=true)]
        public string AccidentAddressDetail { get; set; }

        // 出险日期，时间戳
        [NameInMap("accident_time")]
        [Validation(Required=true)]
        public long? AccidentTime { get; set; }

        // 报案人电话号码
        [NameInMap("reporter_tel")]
        [Validation(Required=true)]
        public string ReporterTel { get; set; }

        // 报案人姓名
        [NameInMap("reporter_name")]
        [Validation(Required=true)]
        public string ReporterName { get; set; }

        // 报案人证件号
        [NameInMap("reporter_card_no")]
        [Validation(Required=true)]
        public string ReporterCardNo { get; set; }

        // 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
        [NameInMap("reporter_card_type")]
        [Validation(Required=true)]
        public string ReporterCardType { get; set; }

        // 报案人与出险人的关系
        // 1本人，2配偶，3父母，4子女，5其他
        [NameInMap("reporter_relation_to_accident")]
        [Validation(Required=true)]
        public string ReporterRelationToAccident { get; set; }

        // 报案时间，时间戳
        [NameInMap("report_time")]
        [Validation(Required=false)]
        public long? ReportTime { get; set; }

        // 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
        [NameInMap("event_address_info")]
        [Validation(Required=true)]
        public string EventAddressInfo { get; set; }

        // 事故发生详细地点
        [NameInMap("event_address_detail")]
        [Validation(Required=true)]
        public string EventAddressDetail { get; set; }

        // 确诊医院
        [NameInMap("confirm_hospital")]
        [Validation(Required=true)]
        public string ConfirmHospital { get; set; }

        // 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
        [NameInMap("confirm_hospital_address_info")]
        [Validation(Required=true)]
        public string ConfirmHospitalAddressInfo { get; set; }

        // 确诊疾病名称
        [NameInMap("confirm_illness_name")]
        [Validation(Required=true)]
        public string ConfirmIllnessName { get; set; }

        // 产品大类 重疾或者医疗险
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 文件列表
        [NameInMap("file_list")]
        [Validation(Required=true)]
        public List<FileNode> FileList { get; set; }

        // 委托险种集合信息
        [NameInMap("entrust_guarantee_product_list")]
        [Validation(Required=true)]
        public List<EntrustGuaranteeProduct> EntrustGuaranteeProductList { get; set; }

    }

}
