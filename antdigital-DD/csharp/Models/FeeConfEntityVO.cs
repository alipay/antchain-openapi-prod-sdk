// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 计量计费配置模型（展示变更）
    public class FeeConfEntityVO : TeaModel {
        // 计量域配置信息
        [NameInMap("domain_config_param")]
        [Validation(Required=false)]
        public DomainConfigVO DomainConfigParam { get; set; }

        // 计费计划配置
        [NameInMap("billing_rule_meta")]
        [Validation(Required=false)]
        public BillingPlanVO BillingRuleMeta { get; set; }

        // 资源包配置
        [NameInMap("res_package_template_meta")]
        [Validation(Required=false)]
        public List<RespackageConfVO> ResPackageTemplateMeta { get; set; }

        // 新资源包模板
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("res_package_template_new_meta")]
        [Validation(Required=false)]
        public List<ResPackageTemplateNewMeta> ResPackageTemplateNewMeta { get; set; }

    }

}
