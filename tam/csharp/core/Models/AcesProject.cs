// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAM.Models
{
    // ACES系统接收的项目信息
    public class AcesProject : TeaModel {
        // 项目id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目名称
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

        // 客户名称
        [NameInMap("customer_name")]
        [Validation(Required=true)]
        public string CustomerName { get; set; }

        // 产品线
        [NameInMap("project_line")]
        [Validation(Required=false)]
        public string ProjectLine { get; set; }

        // 业务线
        [NameInMap("work_line")]
        [Validation(Required=false)]
        public string WorkLine { get; set; }

        // 业务分类
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 项目大阶段
        [NameInMap("project_big_stage")]
        [Validation(Required=false)]
        public string ProjectBigStage { get; set; }

        // 转维状态
        [NameInMap("op_status")]
        [Validation(Required=false)]
        public string OpStatus { get; set; }

        // 交付阶段
        [NameInMap("deliver")]
        [Validation(Required=false)]
        public string Deliver { get; set; }

        // 是否售后
        [NameInMap("after_sale")]
        [Validation(Required=false)]
        public bool? AfterSale { get; set; }

        //  
        [NameInMap("aliyun_bpid")]
        [Validation(Required=false)]
        public string AliyunBpid { get; set; }

        // 解决方案架构师
        [NameInMap("sa")]
        [Validation(Required=true)]
        public string Sa { get; set; }

        // 项目经理
        [NameInMap("pm")]
        [Validation(Required=true)]
        public string Pm { get; set; }

        // 商务经理
        [NameInMap("bd")]
        [Validation(Required=true)]
        public string Bd { get; set; }

        // 交付经理
        [NameInMap("tm")]
        [Validation(Required=true)]
        public string Tm { get; set; }

        // 项目状态
        [NameInMap("project_stage")]
        [Validation(Required=false)]
        public string ProjectStage { get; set; }

        // 项目交付状态（未启动、已启动等）
        [NameInMap("project_status")]
        [Validation(Required=false)]
        public string ProjectStatus { get; set; }

        // 是否需要交付 1需要 0不需要
        [NameInMap("need_deliver")]
        [Validation(Required=true)]
        public string NeedDeliver { get; set; }

        // 是否需要提前进场 1需要 0不需要
        [NameInMap("need_ad_entry")]
        [Validation(Required=true)]
        public string NeedAdEntry { get; set; }

        // 是否需要竞标 1需要 0不需要
        [NameInMap("need_tender")]
        [Validation(Required=true)]
        public string NeedTender { get; set; }

    }

}
