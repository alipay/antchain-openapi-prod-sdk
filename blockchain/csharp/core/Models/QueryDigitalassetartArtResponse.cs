// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDigitalassetartArtResponse : TeaModel {
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

        // 艺术品id
        [NameInMap("art_id")]
        [Validation(Required=false)]
        public string ArtId { get; set; }

        // 艺术品名称
        [NameInMap("art_name")]
        [Validation(Required=false)]
        public string ArtName { get; set; }

        // 艺术品代码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 艺术品所在交易所代码
        [NameInMap("exchanges")]
        [Validation(Required=false)]
        public List<string> Exchanges { get; set; }

        // 艺术品鉴定者列表
        [NameInMap("identifiers")]
        [Validation(Required=false)]
        public List<string> Identifiers { get; set; }

        // 艺术品图片哈希
        [NameInMap("image_hash")]
        [Validation(Required=false)]
        public List<string> ImageHash { get; set; }

        // 发行方账户信息
        [NameInMap("issue_account")]
        [Validation(Required=false)]
        public string IssueAccount { get; set; }

        // 艺术品在链上发行时间
        [NameInMap("issue_date")]
        [Validation(Required=false)]
        public long? IssueDate { get; set; }

        // 艺术品所属主分类
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 艺术品拥有者id
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // 艺术品状态信息
        // 1未发行 
        // 2已发行 
        // 3冻结 
        // 4回购
        [NameInMap("state")]
        [Validation(Required=false)]
        public long? State { get; set; }

        // 艺术品所属分类次分类
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 艺术品视频哈希
        [NameInMap("vedio_hash")]
        [Validation(Required=false)]
        public string VedioHash { get; set; }

    }

}
