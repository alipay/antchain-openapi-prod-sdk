<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppGroupSimpleView extends Model
{
    // 应用id列表
    /**
     * @example 0000000103039151
     *
     * @var string[]
     */
    public $appIdList;

    // 服务分组id
    /**
     * @example 0000000103243151
     *
     * @var string
     */
    public $id;

    // 状态
    /**
     * @example DEPLOYED
     *
     * @var string
     */
    public $state;

    // 蓝绿发布专用
    /**
     * @example gz00a
     *
     * @var string
     */
    public $bgCellName;

    // 蓝绿发布专用，traffic或release
    /**
     * @example traffic
     *
     * @var string
     */
    public $bgGroupType;
    protected $_name = [
        'appIdList'   => 'app_id_list',
        'id'          => 'id',
        'state'       => 'state',
        'bgCellName'  => 'bg_cell_name',
        'bgGroupType' => 'bg_group_type',
    ];

    public function validate()
    {
        Model::validateRequired('appIdList', $this->appIdList, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('state', $this->state, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appIdList) {
            $res['app_id_list'] = $this->appIdList;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->bgCellName) {
            $res['bg_cell_name'] = $this->bgCellName;
        }
        if (null !== $this->bgGroupType) {
            $res['bg_group_type'] = $this->bgGroupType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppGroupSimpleView
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_id_list'])) {
            if (!empty($map['app_id_list'])) {
                $model->appIdList = $map['app_id_list'];
            }
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['bg_cell_name'])) {
            $model->bgCellName = $map['bg_cell_name'];
        }
        if (isset($map['bg_group_type'])) {
            $model->bgGroupType = $map['bg_group_type'];
        }

        return $model;
    }
}
