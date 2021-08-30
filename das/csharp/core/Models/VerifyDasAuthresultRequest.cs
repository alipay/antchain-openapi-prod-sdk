// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class VerifyDasAuthresultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源ID列表
        [NameInMap("data_source_info")]
        [Validation(Required=true)]
        public List<string> DataSourceInfo { get; set; }

        // 被授权企业接入应用名称
        [NameInMap("be_authed_person_app_name")]
        [Validation(Required=true)]
        public string BeAuthedPersonAppName { get; set; }

        // 授权企业信息
        [NameInMap("auth_person_enterprise_info")]
        [Validation(Required=false)]
        public AuthPersonEnterpriseInfo AuthPersonEnterpriseInfo { get; set; }

        // 授权人信息
        [NameInMap("auth_person_individual_info")]
        [Validation(Required=false)]
        public AuthPersonIndividualInfo AuthPersonIndividualInfo { get; set; }

    }

}
