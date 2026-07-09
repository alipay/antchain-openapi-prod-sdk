// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class BindEntityrelationRequest : TeaModel {
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

        // [宾]场景码（当[宾]实体唯一ID为空时，此项必填）
        [NameInMap("object_scene")]
        [Validation(Required=false)]
        public string ObjectScene { get; set; }

        // [宾]实体ID（当[宾]实体唯一ID为空时，此项必填）
        [NameInMap("object_entity_id")]
        [Validation(Required=false)]
        public string ObjectEntityId { get; set; }

        // [宾]平台唯一ID，与[宾]实体场景码+[宾]实体ID（object_scene+object_entity_id）不能同时为空
        [NameInMap("object_trustiot_id")]
        [Validation(Required=false)]
        public long? ObjectTrustiotId { get; set; }

        // 绑定请求中，主语或宾语有历史关系，是否删除历史，写入新关系
        // (只处理1对1关系，即生效的前提是{RelationProperty}的maxObjectCount=1 & maxSubjectCount=1)
        [NameInMap("upsert")]
        [Validation(Required=true)]
        public bool? Upsert { get; set; }

        // 备注
        [NameInMap("remark")]
        [Validation(Required=false)]
        public string Remark { get; set; }

        // 自定义实体信息（如果object_entity_type=CUSTOMER_ENTITY，则custom_entity_info必填）
        [NameInMap("custom_entity_info")]
        [Validation(Required=false)]
        public CustomEntityInfo CustomEntityInfo { get; set; }

    }

}
