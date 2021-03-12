// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDataauthorizationDataModelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=true)]
        public string BizUid { get; set; }

        // 数据模型描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模型字段详细信息
        [NameInMap("field_detail")]
        [Validation(Required=true)]
        public string FieldDetail { get; set; }

        // 数据模型业务ID
        [NameInMap("model_biz_id")]
        [Validation(Required=false)]
        public string ModelBizId { get; set; }

        // 数据模型名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=false)]
        public string SpaceId { get; set; }

        // 提交人ID
        [NameInMap("submitter_id")]
        [Validation(Required=false)]
        public string SubmitterId { get; set; }

    }

}
