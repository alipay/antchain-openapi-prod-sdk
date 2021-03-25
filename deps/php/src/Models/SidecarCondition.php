<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SidecarCondition extends Model {
    protected $_name = [
        'workspaceGroups' => 'workspace_groups',
        'cells' => 'cells',
    ];
    public function validate() {
        Model::validateRequired('workspaceGroups', $this->workspaceGroups, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->workspaceGroups) {
            $res['workspace_groups'] = $this->workspaceGroups;
        }
        if (null !== $this->cells) {
            $res['cells'] = $this->cells;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarCondition
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['workspace_groups'])){
            $model->workspaceGroups = $map['workspace_groups'];
        }
        if(isset($map['cells'])){
            $model->cells = $map['cells'];
        }
        return $model;
    }
    // 支持的workspaceGroup
    /**
     * @example dev 或 dev,pub
     * @var string
     */
    public $workspaceGroups;

    // 支持的cell列表
    /**
     * @example gz00a 或gz00a,gz00b
     * @var string
     */
    public $cells;

}
