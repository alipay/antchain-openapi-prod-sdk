// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthAssetIssueRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，查询等。
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 具体的业务类型，长度不超过32字符，具体需要与DIS小组业务对接商定新增的业务类型。
        [NameInMap("biz_type")]
        [Validation(Required=true)]
        public string BizType { get; set; }

        // 目前区分content的两种数据：
        // - "b_total"：商户维度聚合数据，（分城市消费者统计数据），相关商家属性。
        // - "c_deposit"：C类个人充值数据，未来扩展C类核销，退款等数据类型，"c_"前缀。
        // - "c_total"：C类个人充值数据聚合(安心充+学费码整体去重按照地理位置维度聚合)
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 当 type参数为："b_total"
        // 主要设定“商户统一信用码” ，其name字段从mif如果获取到也填入：
        // {"name": "XXXX",
        // "certNo":"信用码"}，
        // 
        // 当type参数为："c_deposit"时，设定C类用户信息，使用uid，如果有二要素信息，则计算二要素“姓名+身份证号”的拼接字符串计算Hash得到twoMeta：
        // {"userId": "XXXX",
        // "twoMeta":"SHA256(姓名+身份证号码)"}
        // 
        // 当 type参数为："c_total"，可以不设定此参数。
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // 可能两种类型数据：
        // 商户维度的统计数据，是聚合的数据结果
        // C类充值数据，包含 充值明细数据，目标商户信用码，商户所在城市地理位置信息等。
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 传递的附加信息说明，暂时未定义
        [NameInMap("extension")]
        [Validation(Required=false)]
        public string Extension { get; set; }

    }

}
