// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class DrmDataCellInfo extends TeaModel {
    // 单元信息列表
    @NameInMap("cell_infos")
    public java.util.List<CellInfo> cellInfos;

    // 所有单元中是否存在有特殊推送过值的单元
    @NameInMap("has_special_cell")
    public Boolean hasSpecialCell;

    public static DrmDataCellInfo build(java.util.Map<String, ?> map) throws Exception {
        DrmDataCellInfo self = new DrmDataCellInfo();
        return TeaModel.build(map, self);
    }

    public DrmDataCellInfo setCellInfos(java.util.List<CellInfo> cellInfos) {
        this.cellInfos = cellInfos;
        return this;
    }
    public java.util.List<CellInfo> getCellInfos() {
        return this.cellInfos;
    }

    public DrmDataCellInfo setHasSpecialCell(Boolean hasSpecialCell) {
        this.hasSpecialCell = hasSpecialCell;
        return this;
    }
    public Boolean getHasSpecialCell() {
        return this.hasSpecialCell;
    }

}
