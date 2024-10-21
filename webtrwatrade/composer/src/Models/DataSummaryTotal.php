<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\WEBTRWATRADE\Models;

use AlibabaCloud\Tea\Model;

class DataSummaryTotal extends Model
{
    // 原始币种资产价值列表
    /**
     * @example
     *
     * @var MultiCurrencyMoney[]
     */
    public $totalValueList;

    // 总项目数
    /**
     * @example 10
     *
     * @var int
     */
    public $totalProjects;

    // 总用户数
    /**
     * @example 1000
     *
     * @var int
     */
    public $totalHolders;

    // 最后更新时间戳
    /**
     * @example 1726024364000
     *
     * @var int
     */
    public $lastUpdatedTime;
    protected $_name = [
        'totalValueList'  => 'total_value_list',
        'totalProjects'   => 'total_projects',
        'totalHolders'    => 'total_holders',
        'lastUpdatedTime' => 'last_updated_time',
    ];

    public function validate()
    {
        Model::validateRequired('totalValueList', $this->totalValueList, true);
        Model::validateRequired('totalProjects', $this->totalProjects, true);
        Model::validateRequired('totalHolders', $this->totalHolders, true);
        Model::validateRequired('lastUpdatedTime', $this->lastUpdatedTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->totalValueList) {
            $res['total_value_list'] = [];
            if (null !== $this->totalValueList && \is_array($this->totalValueList)) {
                $n = 0;
                foreach ($this->totalValueList as $item) {
                    $res['total_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->totalProjects) {
            $res['total_projects'] = $this->totalProjects;
        }
        if (null !== $this->totalHolders) {
            $res['total_holders'] = $this->totalHolders;
        }
        if (null !== $this->lastUpdatedTime) {
            $res['last_updated_time'] = $this->lastUpdatedTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSummaryTotal
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['total_value_list'])) {
            if (!empty($map['total_value_list'])) {
                $model->totalValueList = [];
                $n                     = 0;
                foreach ($map['total_value_list'] as $item) {
                    $model->totalValueList[$n++] = null !== $item ? MultiCurrencyMoney::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['total_projects'])) {
            $model->totalProjects = $map['total_projects'];
        }
        if (isset($map['total_holders'])) {
            $model->totalHolders = $map['total_holders'];
        }
        if (isset($map['last_updated_time'])) {
            $model->lastUpdatedTime = $map['last_updated_time'];
        }

        return $model;
    }
}
