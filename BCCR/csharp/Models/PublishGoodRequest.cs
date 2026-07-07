// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class PublishGoodRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 文件id,最长64个字符
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // 商品标题，最长64个字符
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 商品名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 商品分类
        [NameInMap("classification")]
        [Validation(Required=false)]
        public string Classification { get; set; }

        // 售价（分）
        [NameInMap("standard_price_in_cent")]
        [Validation(Required=true)]
        public long? StandardPriceInCent { get; set; }

        // 上架/下架，默认上架
        [NameInMap("goods_status")]
        [Validation(Required=false)]
        public string GoodsStatus { get; set; }

        // 发布时间，默认直接发布
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

        // 授权期限起始时间
        [NameInMap("auth_start_time")]
        [Validation(Required=true)]
        public long? AuthStartTime { get; set; }

        // 授权期限结束时间（传-1 则为永久）
        [NameInMap("auth_end_time")]
        [Validation(Required=true)]
        public long? AuthEndTime { get; set; }

        // 是否是作者
        [NameInMap("is_author")]
        [Validation(Required=true)]
        public bool? IsAuthor { get; set; }

        // 作者姓名，如果isAuthor为false则必填，最长30个字符
        [NameInMap("author_cert_name")]
        [Validation(Required=false)]
        public string AuthorCertName { get; set; }

        // 作者身份证号,如果isAuthor为false则必填
        [NameInMap("author_cert_no")]
        [Validation(Required=false)]
        public string AuthorCertNo { get; set; }

        // 幂等号，可以保证请求的幂等性。从您的客户端生成一个参数值，确保不同请求间该参数值唯一。clientToken只支持ASCII字符，且不能超过64个字符。更多详情，请参见如何保证幂等性。
        [NameInMap("client_token")]
        [Validation(Required=false)]
        public string ClientToken { get; set; }

        // 授权信息
        [NameInMap("auth_info")]
        [Validation(Required=true)]
        public List<AuthInfo> AuthInfo { get; set; }

    }

}
