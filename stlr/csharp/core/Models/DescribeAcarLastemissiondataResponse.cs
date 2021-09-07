// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class DescribeAcarLastemissiondataResponse : TeaModel {
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

        // 主体活动编码
        [NameInMap("enterprise_no")]
        [Validation(Required=false)]
        public string EnterpriseNo { get; set; }

        // 盘查范围编码
        [NameInMap("inventory_scope_no")]
        [Validation(Required=false)]
        public string InventoryScopeNo { get; set; }

        // 盘查范围名称
        [NameInMap("inventory_scope_name")]
        [Validation(Required=false)]
        public string InventoryScopeName { get; set; }

        // 排放类型编码
        [NameInMap("emission_category_no")]
        [Validation(Required=false)]
        public string EmissionCategoryNo { get; set; }

        // 排放类型名称
        [NameInMap("emission_category_name")]
        [Validation(Required=false)]
        public string EmissionCategoryName { get; set; }

        // 排放源编码
        [NameInMap("emission_source_no")]
        [Validation(Required=false)]
        public string EmissionSourceNo { get; set; }

        // 排放源名称
        [NameInMap("emission_source_name")]
        [Validation(Required=false)]
        public string EmissionSourceName { get; set; }

        // 活动场馆编码
        [NameInMap("enterprise_workspace_no")]
        [Validation(Required=false)]
        public string EnterpriseWorkspaceNo { get; set; }

        // 活动场馆名称
        [NameInMap("enterprise_workspace_name")]
        [Validation(Required=false)]
        public string EnterpriseWorkspaceName { get; set; }

        // 排放量计算要素编码
        [NameInMap("emissions_analysis_factor_no")]
        [Validation(Required=false)]
        public string EmissionsAnalysisFactorNo { get; set; }

        // 排放量计算要素值
        [NameInMap("emissions_analysis_factor_value")]
        [Validation(Required=false)]
        public string EmissionsAnalysisFactorValue { get; set; }

        // 发生日期
        [NameInMap("occurrence_date")]
        [Validation(Required=false)]
        public string OccurrenceDate { get; set; }

        // 排放数据录入明细编码
        [NameInMap("emission_data_entry_item_no")]
        [Validation(Required=false)]
        public string EmissionDataEntryItemNo { get; set; }

        // 排放源用量
        [NameInMap("emission_dource_dosage")]
        [Validation(Required=false)]
        public long? EmissionDourceDosage { get; set; }

        // 用量单位：
        // WNm3("万Nm3","天然气消耗用量单位"),
        // GJ("GJ","燃烧产生的热量单位或外购热力单位"),
        // t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
        // MWh("MWh","外购电力或数据中心用电量单位"),
        // km("km","公里，通勤用车或员工差旅旅程单位"),
        // tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
        // PCT("%","百分比，如碳氧化率，或者气体逸散率");
        [NameInMap("dosage_unit")]
        [Validation(Required=false)]
        public string DosageUnit { get; set; }

        // 数据录入人账号
        [NameInMap("submitter_no")]
        [Validation(Required=false)]
        public string SubmitterNo { get; set; }

        // 提交人姓名
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

        // 数据录入时间
        [NameInMap("submission_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SubmissionTime { get; set; }

        // 盘查排放类型的数据录入方式：
        // ManualEntry("手动录入方式"),
        // FileUpload("文件导入方式"),
        // AutoGeneration("自动产生");
        [NameInMap("data_entry_type")]
        [Validation(Required=false)]
        public string DataEntryType { get; set; }

    }

}
