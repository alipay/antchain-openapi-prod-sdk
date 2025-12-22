// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class WitnessSignData extends TeaModel {
    // 印章图片fileKey列表
    @NameInMap("seal_file_keys")
    public java.util.List<String> sealFileKeys;

    // 印章id列表
    @NameInMap("seal_ids")
    public java.util.List<String> sealIds;

    // 待签署文档摘要值，批量签时必传
    /**
     * <strong>example:</strong>
     * <p>04181b49ee5d7eb0099a289ac8a45df6afb5aa2679c5284444698a9790099269</p>
     */
    @NameInMap("sign_hash")
    public String signHash;

    // 签署位置信息
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("sign_pos_data")
    public String signPosData;

    // 第三方文档id，批量签时必传
    /**
     * <strong>example:</strong>
     * 
     */
    @NameInMap("third_doc_id")
    public String thirdDocId;

    public static WitnessSignData build(java.util.Map<String, ?> map) throws Exception {
        WitnessSignData self = new WitnessSignData();
        return TeaModel.build(map, self);
    }

    public WitnessSignData setSealFileKeys(java.util.List<String> sealFileKeys) {
        this.sealFileKeys = sealFileKeys;
        return this;
    }
    public java.util.List<String> getSealFileKeys() {
        return this.sealFileKeys;
    }

    public WitnessSignData setSealIds(java.util.List<String> sealIds) {
        this.sealIds = sealIds;
        return this;
    }
    public java.util.List<String> getSealIds() {
        return this.sealIds;
    }

    public WitnessSignData setSignHash(String signHash) {
        this.signHash = signHash;
        return this;
    }
    public String getSignHash() {
        return this.signHash;
    }

    public WitnessSignData setSignPosData(String signPosData) {
        this.signPosData = signPosData;
        return this;
    }
    public String getSignPosData() {
        return this.signPosData;
    }

    public WitnessSignData setThirdDocId(String thirdDocId) {
        this.thirdDocId = thirdDocId;
        return this;
    }
    public String getThirdDocId() {
        return this.thirdDocId;
    }

}
