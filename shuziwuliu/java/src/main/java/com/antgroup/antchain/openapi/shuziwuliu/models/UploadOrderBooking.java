// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class UploadOrderBooking extends TeaModel {
    // 订舱单号
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 集装箱号  json字符串上传
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
