// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mscene.models;

import com.aliyun.tea.*;

public class MpaasUserGamecenterPaymentQuerystatusResponse extends TeaModel {
    // 订单状态。1-订单已创建。2-订单交易支付成功。3-订单交易支付失败
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("order_status")
    public String orderStatus;

    // 扩展参数。biz_order_id-平台侧订单号，payment-金额（单位：分），open_uid-开放平台用户ID
    /**
     * <strong>example:</strong>
     * <p>{&quot;payment&quot;:1200,&quot;open_uid&quot;:&quot;ez1Vz2gl/izliBRJxcPYTd2m8G3NE=&quot;,&quot;biz_order_id&quot;:&quot;5124555xxx&quot;}&quot;,&quot;orderStatus&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("cp_extra")
    public String cpExtra;

    public static MpaasUserGamecenterPaymentQuerystatusResponse build(java.util.Map<String, ?> map) throws Exception {
        MpaasUserGamecenterPaymentQuerystatusResponse self = new MpaasUserGamecenterPaymentQuerystatusResponse();
        return TeaModel.build(map, self);
    }

    public MpaasUserGamecenterPaymentQuerystatusResponse setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public String getOrderStatus() {
        return this.orderStatus;
    }

    public MpaasUserGamecenterPaymentQuerystatusResponse setCpExtra(String cpExtra) {
        this.cpExtra = cpExtra;
        return this;
    }
    public String getCpExtra() {
        return this.cpExtra;
    }

}
