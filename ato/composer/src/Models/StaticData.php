<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class StaticData extends Model
{
    // 商户类型
    /**
     * @example merchantType
     *
     * @var string
     */
    public $moduleName;

    // 静态数据详情
    /**
     * @example
     *
     * @var StaticDataModuleDetail[]
     */
    public $moduleDetailList;
    protected $_name = [
        'moduleName'       => 'module_name',
        'moduleDetailList' => 'module_detail_list',
    ];

    public function validate()
    {
        Model::validateRequired('moduleName', $this->moduleName, true);
        Model::validateRequired('moduleDetailList', $this->moduleDetailList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->moduleName) {
            $res['module_name'] = $this->moduleName;
        }
        if (null !== $this->moduleDetailList) {
            $res['module_detail_list'] = [];
            if (null !== $this->moduleDetailList && \is_array($this->moduleDetailList)) {
                $n = 0;
                foreach ($this->moduleDetailList as $item) {
                    $res['module_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StaticData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['module_name'])) {
            $model->moduleName = $map['module_name'];
        }
        if (isset($map['module_detail_list'])) {
            if (!empty($map['module_detail_list'])) {
                $model->moduleDetailList = [];
                $n                       = 0;
                foreach ($map['module_detail_list'] as $item) {
                    $model->moduleDetailList[$n++] = null !== $item ? StaticDataModuleDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
