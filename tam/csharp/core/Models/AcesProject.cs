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

    }

}
