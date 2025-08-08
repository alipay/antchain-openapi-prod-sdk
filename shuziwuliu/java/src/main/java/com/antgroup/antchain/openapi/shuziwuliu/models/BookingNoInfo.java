// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class BookingNoInfo extends TeaModel {
    // 订舱单唯一标识
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("booking_no")
    public String bookingNo;

    // 订舱号
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("bkg_no")
    public String bkgNo;

    public static BookingNoInfo build(java.util.Map<String, ?> map) throws Exception {
        BookingNoInfo self = new BookingNoInfo();
        return TeaModel.build(map, self);
    }

    public BookingNoInfo setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public BookingNoInfo setBkgNo(String bkgNo) {
        this.bkgNo = bkgNo;
        return this;
    }
    public String getBkgNo() {
        return this.bkgNo;
    }

}
