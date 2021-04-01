// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationDatamodelPageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 模型业务ID
        [NameInMap("model_biz_id")]
        [Validation(Required=false)]
        public string ModelBizId { get; set; }

        // 模型名称
        [NameInMap("model_name")]
        [Validation(Required=false)]
        public string ModelName { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 提交人名字
        [NameInMap("submitter_name")]
        [Validation(Required=false)]
        public string SubmitterName { get; set; }

    }

}
