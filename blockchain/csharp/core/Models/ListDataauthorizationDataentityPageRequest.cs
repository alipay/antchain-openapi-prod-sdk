// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationDataentityPageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权状态
        [NameInMap("auth_status")]
        [Validation(Required=false)]
        public string AuthStatus { get; set; }

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

        // 参与方DID
        [NameInMap("participant_id")]
        [Validation(Required=true)]
        public string ParticipantId { get; set; }

        // 数据模型业务ID
        [NameInMap("model_biz_id")]
        [Validation(Required=false)]
        public string ModelBizId { get; set; }

    }

}
