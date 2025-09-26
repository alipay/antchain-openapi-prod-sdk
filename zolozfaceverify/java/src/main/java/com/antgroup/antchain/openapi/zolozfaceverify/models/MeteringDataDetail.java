// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.zolozfaceverify.models;

import com.aliyun.tea.*;

public class MeteringDataDetail extends TeaModel {
    // 比对通过
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("identify_passed_pv")
    public Long identifyPassedPv;

    // 上传服务端成功
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("identify_succeed_pv")
    public Long identifySucceedPv;

    // 计量类型
    /**
     * <strong>example:</strong>
     * <p>计量类型</p>
     */
    @NameInMap("metering_type")
    public String meteringType;

    // 产品渲染（SDK唤起）
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("prod_start_pv")
    public Long prodStartPv;

    // 查询结果通过
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("query_passed_pv")
    public Long queryPassedPv;

    // 发起查询
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("query_succeed_pv")
    public Long querySucceedPv;

    // 可用性检查通过
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("usable_passed_pv")
    public Long usablePassedPv;

    // 可用性检查开始
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("usable_start_pv")
    public Long usableStartPv;

    public static MeteringDataDetail build(java.util.Map<String, ?> map) throws Exception {
        MeteringDataDetail self = new MeteringDataDetail();
        return TeaModel.build(map, self);
    }

    public MeteringDataDetail setIdentifyPassedPv(Long identifyPassedPv) {
        this.identifyPassedPv = identifyPassedPv;
        return this;
    }
    public Long getIdentifyPassedPv() {
        return this.identifyPassedPv;
    }

    public MeteringDataDetail setIdentifySucceedPv(Long identifySucceedPv) {
        this.identifySucceedPv = identifySucceedPv;
        return this;
    }
    public Long getIdentifySucceedPv() {
        return this.identifySucceedPv;
    }

    public MeteringDataDetail setMeteringType(String meteringType) {
        this.meteringType = meteringType;
        return this;
    }
    public String getMeteringType() {
        return this.meteringType;
    }

    public MeteringDataDetail setProdStartPv(Long prodStartPv) {
        this.prodStartPv = prodStartPv;
        return this;
    }
    public Long getProdStartPv() {
        return this.prodStartPv;
    }

    public MeteringDataDetail setQueryPassedPv(Long queryPassedPv) {
        this.queryPassedPv = queryPassedPv;
        return this;
    }
    public Long getQueryPassedPv() {
        return this.queryPassedPv;
    }

    public MeteringDataDetail setQuerySucceedPv(Long querySucceedPv) {
        this.querySucceedPv = querySucceedPv;
        return this;
    }
    public Long getQuerySucceedPv() {
        return this.querySucceedPv;
    }

    public MeteringDataDetail setUsablePassedPv(Long usablePassedPv) {
        this.usablePassedPv = usablePassedPv;
        return this;
    }
    public Long getUsablePassedPv() {
        return this.usablePassedPv;
    }

    public MeteringDataDetail setUsableStartPv(Long usableStartPv) {
        this.usableStartPv = usableStartPv;
        return this;
    }
    public Long getUsableStartPv() {
        return this.usableStartPv;
    }

}
