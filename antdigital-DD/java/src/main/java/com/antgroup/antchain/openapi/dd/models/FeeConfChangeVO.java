// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class FeeConfChangeVO extends TeaModel {
    // 原本的计财配置
    @NameInMap("old_conf_entity")
    public FeeConfEntityVO oldConfEntity;

    // 新的计财配置实体
    @NameInMap("new_conf_entity")
    public FeeConfEntityVO newConfEntity;

    // 变更字段列表
    @NameInMap("change_factor_list")
    public java.util.List<FeeChangeFactorVO> changeFactorList;

    // 失败的变更列表
    @NameInMap("fail_chang_factor_list")
    public java.util.List<FailChangeFactor> failChangFactorList;

    public static FeeConfChangeVO build(java.util.Map<String, ?> map) throws Exception {
        FeeConfChangeVO self = new FeeConfChangeVO();
        return TeaModel.build(map, self);
    }

    public FeeConfChangeVO setOldConfEntity(FeeConfEntityVO oldConfEntity) {
        this.oldConfEntity = oldConfEntity;
        return this;
    }
    public FeeConfEntityVO getOldConfEntity() {
        return this.oldConfEntity;
    }

    public FeeConfChangeVO setNewConfEntity(FeeConfEntityVO newConfEntity) {
        this.newConfEntity = newConfEntity;
        return this;
    }
    public FeeConfEntityVO getNewConfEntity() {
        return this.newConfEntity;
    }

    public FeeConfChangeVO setChangeFactorList(java.util.List<FeeChangeFactorVO> changeFactorList) {
        this.changeFactorList = changeFactorList;
        return this;
    }
    public java.util.List<FeeChangeFactorVO> getChangeFactorList() {
        return this.changeFactorList;
    }

    public FeeConfChangeVO setFailChangFactorList(java.util.List<FailChangeFactor> failChangFactorList) {
        this.failChangFactorList = failChangFactorList;
        return this;
    }
    public java.util.List<FailChangeFactor> getFailChangFactorList() {
        return this.failChangFactorList;
    }

}
