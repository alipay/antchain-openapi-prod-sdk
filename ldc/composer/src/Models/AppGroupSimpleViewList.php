<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class AppGroupSimpleViewList extends Model
{
    // 应用分组列表
    /**
     * @example
     *
     * @var AppGroupSimpleView[]
     */
    public $appGroupList;
    protected $_name = [
        'appGroupList' => 'app_group_list',
    ];

    public function validate()
    {
        Model::validateRequired('appGroupList', $this->appGroupList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->appGroupList) {
            $res['app_group_list'] = [];
            if (null !== $this->appGroupList && \is_array($this->appGroupList)) {
                $n = 0;
                foreach ($this->appGroupList as $item) {
                    $res['app_group_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AppGroupSimpleViewList
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['app_group_list'])) {
            if (!empty($map['app_group_list'])) {
                $model->appGroupList = [];
                $n                   = 0;
                foreach ($map['app_group_list'] as $item) {
                    $model->appGroupList[$n++] = null !== $item ? AppGroupSimpleView::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
