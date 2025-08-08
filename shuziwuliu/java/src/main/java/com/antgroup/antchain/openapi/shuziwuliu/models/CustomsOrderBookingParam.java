// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class CustomsOrderBookingParam extends TeaModel {
    // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("action")
    public String action;

    // 订舱单号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    public static CustomsOrderBookingParam build(java.util.Map<String, ?> map) throws Exception {
        CustomsOrderBookingParam self = new CustomsOrderBookingParam();
        return TeaModel.build(map, self);
    }

    public CustomsOrderBookingParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public CustomsOrderBookingParam setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

}
