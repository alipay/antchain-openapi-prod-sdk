// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateJusticeCasewritebackRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保证请求幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

        // 自动进件案件基础信息
        [NameInMap("case_basic_info")]
        [Validation(Required=true)]
        public CaseBasicInfo CaseBasicInfo { get; set; }

        // 发起人对象列表
        [NameInMap("proposer_objects")]
        [Validation(Required=true)]
        public List<ProposerObject> ProposerObjects { get; set; }

        // 答辩人对象列表
        [NameInMap("pleader_objects")]
        [Validation(Required=true)]
        public List<PleaderObject> PleaderObjects { get; set; }

        // 自动进件证据要素
        [NameInMap("lease_evidential_element")]
        [Validation(Required=true)]
        public LeaseEvidentialElement LeaseEvidentialElement { get; set; }

        // 证据清单列表
        [NameInMap("evidential_check_list")]
        [Validation(Required=true)]
        public List<EvidentialCheckList> EvidentialCheckList { get; set; }

    }

}
