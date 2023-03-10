// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    public class OperateIdentifyResponse : TeaModel {
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

        // 鉴定单编号
        [NameInMap("identify_number")]
        [Validation(Required=false)]
        public string IdentifyNumber { get; set; }

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

        //  整体鉴定结果
        // SUCCESS：符合鉴定标准
        // FAILED：不符合鉴定标准
        // NOT_IDENTIFY：无法鉴定
        [NameInMap("identify_result")]
        [Validation(Required=false)]
        public string IdentifyResult { get; set; }

        // 鉴定描述
        [NameInMap("identify_desc")]
        [Validation(Required=false)]
        public string IdentifyDesc { get; set; }

        // 鉴定点结果列表
        [NameInMap("identify_point_result_list")]
        [Validation(Required=false)]
        public List<IdentifyPointResultResp> IdentifyPointResultList { get; set; }

    }

}
