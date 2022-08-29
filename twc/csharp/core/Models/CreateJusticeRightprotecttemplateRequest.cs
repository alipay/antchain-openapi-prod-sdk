// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeRightprotecttemplateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 维权要素模板名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 维权要素模板业务类型
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 维权措施，枚举值，包括：
        // ARBITRATION，仲裁
        // ARBITRATION_EXECUTION，仲裁执行
        // MEDIATION，调解
        [NameInMap("right_protect_type")]
        [Validation(Required=true)]
        public string RightProtectType { get; set; }

        // 要素模板关联的案件要素模板ID，要素模板和案件模板必须属于同一个业务类型才可以关联
        [NameInMap("case_template_id")]
        [Validation(Required=true)]
        public string CaseTemplateId { get; set; }

        // 维权要素模板文件下载地址，文件为excel格式，包含维权要素的所有算法信息、字段信息和文件附件信息
        [NameInMap("template_file_url")]
        [Validation(Required=true)]
        public string TemplateFileUrl { get; set; }

    }

}
