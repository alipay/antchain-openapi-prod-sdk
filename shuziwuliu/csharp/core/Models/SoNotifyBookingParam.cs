// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // so通知关联的订舱单
    public class SoNotifyBookingParam : TeaModel {
        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 订舱单号
        [NameInMap("booking_no")]
        [Validation(Required=true)]
        public string BookingNo { get; set; }

        // 船公司  业务必填 
        [NameInMap("carrier")]
        [Validation(Required=false)]
        public string Carrier { get; set; }

        // 箱型箱量 json格式 业务必填
        // [{"containerVolume":"33","containerType":"22"}]
        // containerVolume--箱量 业务必填
        // containerType--箱型 业务必填
        [NameInMap("container_params")]
        [Validation(Required=false)]
        public string ContainerParams { get; set; }

        // 截关时间
        [NameInMap("customs_clearance")]
        [Validation(Required=false)]
        public long? CustomsClearance { get; set; }

        // 场站
        [NameInMap("cy")]
        [Validation(Required=false)]
        public string Cy { get; set; }

        // 截港时间
        [NameInMap("cy_closing")]
        [Validation(Required=false)]
        public long? CyClosing { get; set; }

        // 预计船期
        [NameInMap("etd")]
        [Validation(Required=false)]
        public long? Etd { get; set; }

        // 港口
        [NameInMap("port")]
        [Validation(Required=false)]
        public string Port { get; set; }

        // 截单时间
        [NameInMap("si_closing")]
        [Validation(Required=false)]
        public long? SiClosing { get; set; }

        // 船名  业务必填
        [NameInMap("vessel")]
        [Validation(Required=false)]
        public string Vessel { get; set; }

        // 航次 业务必填
        [NameInMap("voyage")]
        [Validation(Required=false)]
        public string Voyage { get; set; }

    }

}
