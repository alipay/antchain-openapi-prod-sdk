// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryBizMasterblResponse : TeaModel {
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

        // 船公司
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 收货人
        [NameInMap("consignee")]
        [Validation(Required=false)]
        public string Consignee { get; set; }

        // 目的地
        [NameInMap("delivery_place")]
        [Validation(Required=false)]
        public string DeliveryPlace { get; set; }

        // 卸货港
        [NameInMap("discharge_port")]
        [Validation(Required=false)]
        public string DischargePort { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=false)]
        public string ForwarderDid { get; set; }

        // 运费
        [NameInMap("freight")]
        [Validation(Required=false)]
        public string Freight { get; set; }

        // 提单货物数据列表
        [NameInMap("goods_dtos")]
        [Validation(Required=false)]
        public List<MasterBlGoodsDto> GoodsDtos { get; set; }

        // 起运港
        [NameInMap("loading_port")]
        [Validation(Required=false)]
        public string LoadingPort { get; set; }

        // master提单号
        [NameInMap("master_bl_no")]
        [Validation(Required=false)]
        public string MasterBlNo { get; set; }

        // 通知方
        [NameInMap("notify_party")]
        [Validation(Required=false)]
        public string NotifyParty { get; set; }

        // 前程运输
        [NameInMap("pr_carriage")]
        [Validation(Required=false)]
        public string PrCarriage { get; set; }

        // 发货人
        [NameInMap("shipper")]
        [Validation(Required=false)]
        public string Shipper { get; set; }

        // 航名
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

    }

}
