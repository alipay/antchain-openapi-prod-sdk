// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UnbindEntityrelationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // [主]实体场景码
        [NameInMap("subject_scene")]
        [Validation(Required=true)]
        public string SubjectScene { get; set; }

        // [主]实体ID（当[主]实体平台唯一ID（subject_trustiot_id）为空时，此项不能为空）
        [NameInMap("subject_entity_id")]
        [Validation(Required=false)]
        public string SubjectEntityId { get; set; }

        // [主]实体平台唯一ID（当[主]实体ID（subject_entity_id）为空时，此项不能为空）
        [NameInMap("subject_trustiot_id")]
        [Validation(Required=false)]
        public long? SubjectTrustiotId { get; set; }

        // 关系谓语, 取值范围：SUB_DEVICE、USER、LOCATION
        [NameInMap("predicate")]
        [Validation(Required=true)]
        public string Predicate { get; set; }

        // [宾]实体类型，取值范围：DEVICE、PERIPHERAL、LABEL、CUSTOMER_ENTITY
        [NameInMap("object_entity_type")]
        [Validation(Required=true)]
        public string ObjectEntityType { get; set; }

        // [宾]场景码（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
        [NameInMap("object_scene")]
        [Validation(Required=false)]
        public string ObjectScene { get; set; }

        // [宾]实体ID列表（当[宾]实体唯一ID列表(object_trustiotiot_id_list)为空时，此项必填）
        // 
        [NameInMap("object_entity_id_list")]
        [Validation(Required=false)]
        public List<string> ObjectEntityIdList { get; set; }

        // [宾]实体唯一ID列表,与[宾]实体场景码+[宾]实体ID列表（object_scene+object_entity_id）不能同时为空
        [NameInMap("object_trustiotiot_id_list")]
        [Validation(Required=false)]
        public List<long?> ObjectTrustiotiotIdList { get; set; }

    }

}
