<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUNQING\Models;

use AlibabaCloud\Tea\Model;

class AppDeployInitOption extends Model
{
    // 应用name
    /**
     * @example acimacore
     *
     * @var string
     */
    public $name;

    // 产品内应用的依赖关系，决定应用的执行顺序
    /**
     * @example 1
     *
     * @var int
     */
    public $releaseOrder;

    // 分组策略：
    // TWO_GROUP("TWO_GROUP", "分两组"),
    // ALL_ONE("ALL_ONE", "共分一组"),
    // EACH_ONE("EACH_ONE", "每台一组"),
    // SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐")
    /**
     * @example EACH_ONE
     *
     * @var string
     */
    public $groupStrategy;

    // 分组是否需要手动确认，默认false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $needConfirm;
    protected $_name = [
        'name'          => 'name',
        'releaseOrder'  => 'release_order',
        'groupStrategy' => 'group_strategy',
        'needConfirm'   => 'need_confirm',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('releaseOrder', $this->releaseOrder, true);
        Model::validateRequired('groupStrategy', $this->groupStrategy, true);
        Model::validateRequired('needConfirm', $this->needConfirm, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->releaseOrder) {
            $res['release_order'] = $this->releaseOrder;
        }
        if (null !== $this->groupStrategy) {
            $res['group_strategy'] = $this->groupStrategy;
        }
        if (null !== $this->needConfirm) {
            $res['need_confirm'] = $this->needConfirm;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppDeployInitOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['release_order'])) {
            $model->releaseOrder = $map['release_order'];
        }
        if (isset($map['group_strategy'])) {
            $model->groupStrategy = $map['group_strategy'];
        }
        if (isset($map['need_confirm'])) {
            $model->needConfirm = $map['need_confirm'];
        }

        return $model;
    }
}
