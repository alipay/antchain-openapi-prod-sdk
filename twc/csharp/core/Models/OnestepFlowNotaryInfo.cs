// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 数字票根一键全流程存证相关参数
    public class OnestepFlowNotaryInfo : TeaModel {
        // 全流程模板id，需要提前创建好模板才能获取
        [NameInMap("template_id")]
        [Validation(Required=true)]
        public string TemplateId { get; set; }

        // 流程名称，同一个租户下同一个模板，建议唯一不重复
        [NameInMap("flow_name")]
        [Validation(Required=true)]
        public string FlowName { get; set; }

        // 存证关联实体（个人/企业）的身份识别信息
        [NameInMap("notary_user")]
        [Validation(Required=true)]
        public NotaryUser NotaryUser { get; set; }

        // 阶段存证内容列表，根据模板定义传入
        [NameInMap("phase_notary_list")]
        [Validation(Required=true)]
        public List<PhaseNotary> PhaseNotaryList { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

    }

}
