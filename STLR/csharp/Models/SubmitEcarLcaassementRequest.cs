// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class SubmitEcarLcaassementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单编号，碳矩阵关联的订单编号，业务主键
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // LCA产品评估状态，返回约定的状态编码
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 项目摘要信息，包括有关产品详情和报告时间等，JSON格式，按照约定的格式解析成碳矩阵对应的碳足迹项目和产品信息
        [NameInMap("project_summary")]
        [Validation(Required=false)]
        public string ProjectSummary { get; set; }

        // 产品工序数据，JSON格式，按照约定的格式解析成碳矩阵对应的工序信息
        [NameInMap("process_datum")]
        [Validation(Required=false)]
        public string ProcessDatum { get; set; }

        // 碳足迹评估结果数据，JSON格式，按照约定的格式解析成碳矩阵对应的评估结果
        [NameInMap("assement_result")]
        [Validation(Required=false)]
        public string AssementResult { get; set; }

        // 碳足迹评估报告，包括一些报告文件地址等，JSON格式，碳矩阵下载保存对应的报告文件
        [NameInMap("assement_report")]
        [Validation(Required=false)]
        public string AssementReport { get; set; }

        // 扩展信息，JSON格式，预留需提交的数据
        [NameInMap("extra_datum")]
        [Validation(Required=false)]
        public string ExtraDatum { get; set; }

    }

}
