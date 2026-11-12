// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CORLAB.Models
{
    public class CreateFeatureminingPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据来源
        [NameInMap("data_source")]
        [Validation(Required=true)]
        public string DataSource { get; set; }

        // 业务领域
        [NameInMap("risk_domain")]
        [Validation(Required=true)]
        public string RiskDomain { get; set; }

        // 业务版块
        [NameInMap("risk_category")]
        [Validation(Required=true)]
        public string RiskCategory { get; set; }

        // 业务场景
        [NameInMap("risk_scene")]
        [Validation(Required=true)]
        public string RiskScene { get; set; }

        // agent目标导向
        [NameInMap("demand_detail")]
        [Validation(Required=false)]
        public string DemandDetail { get; set; }

        // 交易表/浏览表
        [NameInMap("depend_tables")]
        [Validation(Required=true)]
        public string DependTables { get; set; }

        // 运行小时数
        [NameInMap("run_hours")]
        [Validation(Required=true)]
        public long? RunHours { get; set; }

        // 15
        [NameInMap("run_minutes")]
        [Validation(Required=false)]
        public long? RunMinutes { get; set; }

        // 100
        [NameInMap("feature_num")]
        [Validation(Required=true)]
        public long? FeatureNum { get; set; }

        // iv要求
        [NameInMap("iv")]
        [Validation(Required=false)]
        public string Iv { get; set; }

        // 1702
        /// <summary>
        /// <para>待上传文件</para>
        /// </summary>
        [NameInMap("fileObject")]
        [Validation(Required=false)]
        public Stream FileObject { get; set; }

        /// <summary>
        /// <para>待上传文件名</para>
        /// </summary>
        [NameInMap("fileObjectName")]
        [Validation(Required=false)]
        public string FileObjectName { get; set; }

        [NameInMap("file_id")]
        [Validation(Required=true)]
        public long? FileId { get; set; }

        // 客群
        [NameInMap("customer_group")]
        [Validation(Required=false)]
        public string CustomerGroup { get; set; }

        // 是否进行模型评估
        [NameInMap("model_evaluate")]
        [Validation(Required=true)]
        public bool? ModelEvaluate { get; set; }

        // 基模选择
        [NameInMap("basic_model")]
        [Validation(Required=true)]
        public string BasicModel { get; set; }

        // baseLine信息
        [NameInMap("base_line_ids")]
        [Validation(Required=true)]
        public List<long?> BaseLineIds { get; set; }

        // 结果判断，后期使用
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

        // 计划开始时间
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 结束时间
        [NameInMap("end_date")]
        [Validation(Required=false)]
        public string EndDate { get; set; }

    }

}
