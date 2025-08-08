// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadOrderBooking extends TeaModel {
    // 订舱单号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 集装箱号  json字符串上传
    /**
     * <strong>example:</strong>
     * <p>{&quot;123&quot;,&quot;123&quot;}</p>
     */
    @NameInMap("container_nos")
    @Validation(required = true)
    public String containerNos;

    public static UploadOrderBooking build(java.util.Map<String, ?> map) throws Exception {
        UploadOrderBooking self = new UploadOrderBooking();
        return TeaModel.build(map, self);
    }

    public UploadOrderBooking setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public UploadOrderBooking setContainerNos(String containerNos) {
        this.containerNos = containerNos;
        return this;
    }
    public String getContainerNos() {
        return this.containerNos;
    }

}
