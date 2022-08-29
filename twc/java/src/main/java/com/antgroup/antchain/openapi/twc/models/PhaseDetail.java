// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class PhaseDetail extends TeaModel {
    // 阶段id
    @NameInMap("phase_id")
    @Validation(required = true)
    public String phaseId;

    // 阶段编号
    @NameInMap("phase_no")
    @Validation(required = true)
    public Long phaseNo;

    // 阶段存证时间
    @NameInMap("register_time")
    @Validation(required = true)
    public Long registerTime;

    // 阶段存证凭据
    @NameInMap("tx_hash")
    @Validation(required = true)
    public String txHash;

    // 模板字段类型，Hash/Structure，(Hash->哈希,Structure->结构化)
    @NameInMap("data_type")
    @Validation(required = true)
    public String dataType;

    // 阶段存证内容
    // 如果模板数据类型定义是Hash(哈希)则返回存证时Hash
    // 如果定义是Structure(结构化)，则返回所有字段json对象的字符串Base64后的值
    @NameInMap("notary_content")
    @Validation(required = true)
    public String notaryContent;

    // 模板字段类型为Structure时才有值，结构化数据里面英文key对应的中文名称关系，json格式，key为字段英文名，value为字段中文名称
    @NameInMap("data_type_key")
    @Validation(required = true)
    public String dataTypeKey;

    public static PhaseDetail build(java.util.Map<String, ?> map) throws Exception {
        PhaseDetail self = new PhaseDetail();
        return TeaModel.build(map, self);
    }

    public PhaseDetail setPhaseId(String phaseId) {
        this.phaseId = phaseId;
        return this;
    }
    public String getPhaseId() {
        return this.phaseId;
    }

    public PhaseDetail setPhaseNo(Long phaseNo) {
        this.phaseNo = phaseNo;
        return this;
    }
    public Long getPhaseNo() {
        return this.phaseNo;
    }

    public PhaseDetail setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

    public PhaseDetail setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public PhaseDetail setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public PhaseDetail setNotaryContent(String notaryContent) {
        this.notaryContent = notaryContent;
        return this;
    }
    public String getNotaryContent() {
        return this.notaryContent;
    }

    public PhaseDetail setDataTypeKey(String dataTypeKey) {
        this.dataTypeKey = dataTypeKey;
        return this;
    }
    public String getDataTypeKey() {
        return this.dataTypeKey;
    }

}
