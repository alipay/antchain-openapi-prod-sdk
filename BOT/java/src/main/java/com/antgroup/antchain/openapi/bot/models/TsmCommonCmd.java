// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class TsmCommonCmd extends TeaModel {
    // private byte cla;
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("cla")
    @Validation(required = true)
    public Long cla;

    //  host challenge data.
    /**
     * <strong>example:</strong>
     * <p>[0,0]</p>
     */
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<Long> data;

    // private byte ins;
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("ins")
    @Validation(required = true)
    public Long ins;

    //  private byte lc;
    /**
     * <strong>example:</strong>
     * <p>lc</p>
     */
    @NameInMap("lc")
    @Validation(required = true)
    public Long lc;

    // private byte le = (byte) 0x00;
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("le")
    public Long le;

    // private Boolean needSecurityHandle = Boolean.TRUE;
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("need_security_handle")
    public Boolean needSecurityHandle;

    // private byte p1;
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("p1")
    @Validation(required = true)
    public Long p1;

    // private byte p2 = (byte) 0x00;
    /**
     * <strong>example:</strong>
     * <p>00</p>
     */
    @NameInMap("p2")
    @Validation(required = true)
    public Long p2;

    public static TsmCommonCmd build(java.util.Map<String, ?> map) throws Exception {
        TsmCommonCmd self = new TsmCommonCmd();
        return TeaModel.build(map, self);
    }

    public TsmCommonCmd setCla(Long cla) {
        this.cla = cla;
        return this;
    }
    public Long getCla() {
        return this.cla;
    }

    public TsmCommonCmd setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public TsmCommonCmd setIns(Long ins) {
        this.ins = ins;
        return this;
    }
    public Long getIns() {
        return this.ins;
    }

    public TsmCommonCmd setLc(Long lc) {
        this.lc = lc;
        return this;
    }
    public Long getLc() {
        return this.lc;
    }

    public TsmCommonCmd setLe(Long le) {
        this.le = le;
        return this;
    }
    public Long getLe() {
        return this.le;
    }

    public TsmCommonCmd setNeedSecurityHandle(Boolean needSecurityHandle) {
        this.needSecurityHandle = needSecurityHandle;
        return this;
    }
    public Boolean getNeedSecurityHandle() {
        return this.needSecurityHandle;
    }

    public TsmCommonCmd setP1(Long p1) {
        this.p1 = p1;
        return this;
    }
    public Long getP1() {
        return this.p1;
    }

    public TsmCommonCmd setP2(Long p2) {
        this.p2 = p2;
        return this;
    }
    public Long getP2() {
        return this.p2;
    }

}
