// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // LCA碳足迹分析计算数据
    public class LcaCarbonDatum : TeaModel {
        // LCA碳排放总量
        [NameInMap("lca_carbon_amount")]
        [Validation(Required=true)]
        public string LcaCarbonAmount { get; set; }

        // 足迹报告pdf文件下载地址（30分钟内下载有效）
        [NameInMap("lca_report_file_url")]
        [Validation(Required=true)]
        public string LcaReportFileUrl { get; set; }

        // 足迹分析结果详情文件地址（30分钟内下载有效）
        [NameInMap("lca_detail_file_url")]
        [Validation(Required=true)]
        public string LcaDetailFileUrl { get; set; }

        // B2B-从摇篮到大门，B2C-从摇篮到坟墓
        [NameInMap("life_cycle_boundary")]
        [Validation(Required=true)]
        public string LifeCycleBoundary { get; set; }

        // 足迹开始时间，格式：yyyyMMdd
        [NameInMap("lca_start_date")]
        [Validation(Required=true)]
        public string LcaStartDate { get; set; }

        // 足迹结束时间 格式：yyyyMMdd
        [NameInMap("lca_end_date")]
        [Validation(Required=true)]
        public string LcaEndDate { get; set; }

        // 分阶段碳排放量列表
        [NameInMap("lca_stage_carbon_datum")]
        [Validation(Required=true)]
        public List<LcaStageCarbonItem> LcaStageCarbonDatum { get; set; }

    }

}
