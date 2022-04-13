<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class UpdateCellgroupDisasterinfoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 灾备信息。
    /**
     * @var DisasterInfo[]
     */
    public $disasterInfo;

    // 逻辑单元名称。
    /**
     * @var string
     */
    public $name;

    // 所属环境名称。
    /**
     * @var string
     */
    public $workspaceGroup;

    // 操作人。
    /**
     * @var string
     */
    public $operator;
    protected $_name = [
        'authToken'      => 'auth_token',
        'disasterInfo'   => 'disaster_info',
        'name'           => 'name',
        'workspaceGroup' => 'workspace_group',
        'operator'       => 'operator',
    ];

    public function validate()
    {
        Model::validateRequired('disasterInfo', $this->disasterInfo, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaceGroup', $this->workspaceGroup, true);
        Model::validateRequired('operator', $this->operator, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->disasterInfo) {
            $res['disaster_info'] = [];
            if (null !== $this->disasterInfo && \is_array($this->disasterInfo)) {
                $n = 0;
                foreach ($this->disasterInfo as $item) {
                    $res['disaster_info'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceGroup) {
            $res['workspace_group'] = $this->workspaceGroup;
        }
        if (null !== $this->operator) {
            $res['operator'] = $this->operator;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateCellgroupDisasterinfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['disaster_info'])) {
            if (!empty($map['disaster_info'])) {
                $model->disasterInfo = [];
                $n                   = 0;
                foreach ($map['disaster_info'] as $item) {
                    $model->disasterInfo[$n++] = null !== $item ? DisasterInfo::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace_group'])) {
            $model->workspaceGroup = $map['workspace_group'];
        }
        if (isset($map['operator'])) {
            $model->operator = $map['operator'];
        }

        return $model;
    }
}
