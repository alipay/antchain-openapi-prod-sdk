// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryAuthVcRealtimeResponse : TeaModel {
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

        // 业务类型场景码，与入参相同。
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 实际返回的结果数目，如果真是数据量小于request中的size的情况下，total 不等于 size，否则 total 与size值相等。
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 列表结果，其中每个元素是一个json的string，这个json实际就是数据源提供的数据上链之前的内容。
        // 
        // {
        //   "key":"vc:mychain:01364d9acbda8d09d8c30d94987b40b28f2c28d4ff8f86dbe16197a8f2b0c031",
        //   "name": "张三",           //个人姓名
        //   "certNo": "210XXXXXX90", //个人证件号码
        //   "mobile": "138XXXXXX90", //个人手机号码
        //   "orgName": "XXX检测中心",      //检测机构名称
        //   "orgNo": "90XXXX00",    //检测机构编号 (可选)
        //   "type":"1",             //具体类型说明：1：核酸检测证明，2：疫苗接种证明，其他类型后续扩展
        //   "result":"阴性",
        //   "date":"2021-03-09",    //检测的日期，请统一使用此标准
        //   "timestamp":"检测准确时间戳"   //其它字段可以再补充
        // }
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<string> List { get; set; }

    }

}
