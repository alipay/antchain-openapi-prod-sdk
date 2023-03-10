// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    public class QueryIdentifypointResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 品类名称
        [NameInMap("category_name")]
        [Validation(Required=false)]
        public string CategoryName { get; set; }

        // 品牌名称
        [NameInMap("brand_name")]
        [Validation(Required=false)]
        public string BrandName { get; set; }

        // 款式名称
        [NameInMap("style_name")]
        [Validation(Required=false)]
        public string StyleName { get; set; }

        // 款式编号
        [NameInMap("style_code")]
        [Validation(Required=false)]
        public string StyleCode { get; set; }

        // 至少上传鉴定点数量
        [NameInMap("at_least_num")]
        [Validation(Required=false)]
        public long? AtLeastNum { get; set; }

        // 鉴定点信息列表
        [NameInMap("identify_point_list")]
        [Validation(Required=false)]
        public List<IdentifyPointResp> IdentifyPointList { get; set; }

    }

}
