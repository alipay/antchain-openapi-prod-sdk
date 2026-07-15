// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryPanoraindexPolicyResponse : TeaModel {
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

        // 唯一主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 政策正文内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 附件list详情
        [NameInMap("attachmentdatalist")]
        [Validation(Required=false)]
        public List<EpiAdmEnergyPolicyAttachment> Attachmentdatalist { get; set; }

        // 原文链接
        [NameInMap("sourceurl")]
        [Validation(Required=false)]
        public string Sourceurl { get; set; }

        // 政策发布日期
        [NameInMap("releasedate")]
        [Validation(Required=false)]
        public string Releasedate { get; set; }

        // 披露主体
        [NameInMap("issuingbody")]
        [Validation(Required=false)]
        public string Issuingbody { get; set; }

        // 政策对应的区域
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

        // 政策分类
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 政策文号
        [NameInMap("policynumber")]
        [Validation(Required=false)]
        public string Policynumber { get; set; }

        // 来源网站Code码
        [NameInMap("websitecode")]
        [Validation(Required=false)]
        public string Websitecode { get; set; }

        // 来源网站名称
        [NameInMap("websitename")]
        [Validation(Required=false)]
        public string Websitename { get; set; }

    }

}
