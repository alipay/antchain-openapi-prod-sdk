// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class VerifyDasEnterpriseRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被授权企业接入应用ID
        [NameInMap("auth_instance_biz_uuid")]
        [Validation(Required=true)]
        public string AuthInstanceBizUuid { get; set; }

        // VC完整内容
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

        // 被授权企业信息
        [NameInMap("be_authed_person_info")]
        [Validation(Required=true)]
        public BeAuthedPersonInfo BeAuthedPersonInfo { get; set; }

        // 授权人企业信息
        [NameInMap("auth_person_enterprise_info")]
        [Validation(Required=true)]
        public AuthPersonEnterpriseInfo AuthPersonEnterpriseInfo { get; set; }

        // 需要访问的数据源信息列表
        [NameInMap("data_source_info")]
        [Validation(Required=true)]
        public List<DataSource> DataSourceInfo { get; set; }

    }

}
