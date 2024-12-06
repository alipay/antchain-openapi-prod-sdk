// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_f9cb6523d99f4d089e97d549f141e6e4.Models
{
    public class ExecBlockchainTaxIcmSyncgatheringRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 机构号码
        [NameInMap("inst_code")]
        [Validation(Required=true)]
        public string InstCode { get; set; }

        // 请求流水号(必填),调用方保证每次请求号唯一，受理方用来校验唯一性，同一受理号返回请求结果一致
        [NameInMap("biz_request_id")]
        [Validation(Required=true)]
        public string BizRequestId { get; set; }

        // 纳税人识别号(必填)
        [NameInMap("identity_id")]
        [Validation(Required=true)]
        public string IdentityId { get; set; }

        // 授权类型(必填)
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 补充内容,如果不动产中字段为空的话查的就是授权中的cityCode
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 查询类型
        // NORMAL 正常调用
        // BATCH_HAND  批刷
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 子机构编码，字典由系统预设白名单
        [NameInMap("sub_tenant")]
        [Validation(Required=false)]
        public string SubTenant { get; set; }

        // 优先级，越大优先级越高
        [NameInMap("use_priority")]
        [Validation(Required=false)]
        public string UsePriority { get; set; }

    }

}
