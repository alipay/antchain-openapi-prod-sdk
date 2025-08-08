// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class SoNotifyBookingParam extends TeaModel {
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
     * <p>123456789</p>
     */
    @NameInMap("booking_no")
    @Validation(required = true)
    public String bookingNo;

    // 船公司  业务必填 
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("carrier")
    public String carrier;

    // 箱型箱量 json格式 业务必填
    // [{"containerVolume":"33","containerType":"22"}]
    // containerVolume--箱量 业务必填
    // containerType--箱型 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("container_params")
    public String containerParams;

    // 截关时间
    @NameInMap("customs_clearance")
    public Long customsClearance;

    // 场站
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("cy")
    public String cy;

    // 截港时间
    @NameInMap("cy_closing")
    public Long cyClosing;

    // 预计船期
    @NameInMap("etd")
    public Long etd;

    // 港口
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("port")
    public String port;

    // 截单时间
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("si_closing")
    public Long siClosing;

    // 船名  业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("vessel")
    public String vessel;

    // 航次 业务必填
    /**
     * <strong>example:</strong>
     * <p>暂无</p>
     */
    @NameInMap("voyage")
    public String voyage;

    public static SoNotifyBookingParam build(java.util.Map<String, ?> map) throws Exception {
        SoNotifyBookingParam self = new SoNotifyBookingParam();
        return TeaModel.build(map, self);
    }

    public SoNotifyBookingParam setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public SoNotifyBookingParam setBookingNo(String bookingNo) {
        this.bookingNo = bookingNo;
        return this;
    }
    public String getBookingNo() {
        return this.bookingNo;
    }

    public SoNotifyBookingParam setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public SoNotifyBookingParam setContainerParams(String containerParams) {
        this.containerParams = containerParams;
        return this;
    }
    public String getContainerParams() {
        return this.containerParams;
    }

    public SoNotifyBookingParam setCustomsClearance(Long customsClearance) {
        this.customsClearance = customsClearance;
        return this;
    }
    public Long getCustomsClearance() {
        return this.customsClearance;
    }

    public SoNotifyBookingParam setCy(String cy) {
        this.cy = cy;
        return this;
    }
    public String getCy() {
        return this.cy;
    }

    public SoNotifyBookingParam setCyClosing(Long cyClosing) {
        this.cyClosing = cyClosing;
        return this;
    }
    public Long getCyClosing() {
        return this.cyClosing;
    }

    public SoNotifyBookingParam setEtd(Long etd) {
        this.etd = etd;
        return this;
    }
    public Long getEtd() {
        return this.etd;
    }

    public SoNotifyBookingParam setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public SoNotifyBookingParam setSiClosing(Long siClosing) {
        this.siClosing = siClosing;
        return this;
    }
    public Long getSiClosing() {
        return this.siClosing;
    }

    public SoNotifyBookingParam setVessel(String vessel) {
        this.vessel = vessel;
        return this;
    }
    public String getVessel() {
        return this.vessel;
    }

    public SoNotifyBookingParam setVoyage(String voyage) {
        this.voyage = voyage;
        return this;
    }
    public String getVoyage() {
        return this.voyage;
    }

}
