// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class DomainNode extends TeaModel {
    // node字段
    // 目前可选枚举：CENTER, ODPS, MANUAL, SLS;
    //   也可以自定义
    /**
     * <strong>example:</strong>
     * <p>CENTER</p>
     */
    @NameInMap("code")
    public String code;

    // node英文名称
    /**
     * <strong>example:</strong>
     * <p>node英文名称</p>
     */
    @NameInMap("english_name")
    public String englishName;

    // 中文名称
    /**
     * <strong>example:</strong>
     * <p>中文名称</p>
     */
    @NameInMap("chinese_name")
    public String chineseName;

    // 默认需要check
    /**
     * <strong>example:</strong>
     * <p>true, false</p>
     */
    @NameInMap("need_check")
    public Boolean needCheck;

    // 默认超时时间,单位:m
    @NameInMap("time_out")
    public Long timeOut;

    // 描述
    /**
     * <strong>example:</strong>
     * <p>描述</p>
     */
    @NameInMap("memo")
    public String memo;

    // 状态
    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("status")
    public String status;

    public static DomainNode build(java.util.Map<String, ?> map) throws Exception {
        DomainNode self = new DomainNode();
        return TeaModel.build(map, self);
    }

    public DomainNode setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DomainNode setEnglishName(String englishName) {
        this.englishName = englishName;
        return this;
    }
    public String getEnglishName() {
        return this.englishName;
    }

    public DomainNode setChineseName(String chineseName) {
        this.chineseName = chineseName;
        return this;
    }
    public String getChineseName() {
        return this.chineseName;
    }

    public DomainNode setNeedCheck(Boolean needCheck) {
        this.needCheck = needCheck;
        return this;
    }
    public Boolean getNeedCheck() {
        return this.needCheck;
    }

    public DomainNode setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
        return this;
    }
    public Long getTimeOut() {
        return this.timeOut;
    }

    public DomainNode setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public DomainNode setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
