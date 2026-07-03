// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktCardsmsAnalysisResponse : TeaModel {
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

        // 卡片短信解析服务业务流水id，与渲染回执中的bizId保持一致
        [NameInMap("biz_card_id")]
        [Validation(Required=false)]
        public string BizCardId { get; set; }

        // 不支持卡片短信的手机号，以,分隔
        [NameInMap("not_media_mobiles")]
        [Validation(Required=false)]
        public string NotMediaMobiles { get; set; }

        // 卡短解析短链返回参数
        [NameInMap("short_url_infos")]
        [Validation(Required=false)]
        public List<ShortUrlInfo> ShortUrlInfos { get; set; }

    }

}
