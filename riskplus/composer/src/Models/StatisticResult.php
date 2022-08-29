<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class StatisticResult extends Model
{
    // 有效任务总数量
    /**
     * @example 123
     *
     * @var int
     */
    public $validCount;

    // 各类actionDriverCode的统计结果集合
    /**
     * @example List<StatisticInfoDetail>
     *
     * @var StatisticInfoDetail[]
     */
    public $statisticInfoDetailList;
    protected $_name = [
        'validCount'              => 'valid_count',
        'statisticInfoDetailList' => 'statistic_info_detail_list',
    ];

    public function validate()
    {
        Model::validateRequired('validCount', $this->validCount, true);
        Model::validateRequired('statisticInfoDetailList', $this->statisticInfoDetailList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->validCount) {
            $res['valid_count'] = $this->validCount;
        }
        if (null !== $this->statisticInfoDetailList) {
            $res['statistic_info_detail_list'] = [];
            if (null !== $this->statisticInfoDetailList && \is_array($this->statisticInfoDetailList)) {
                $n = 0;
                foreach ($this->statisticInfoDetailList as $item) {
                    $res['statistic_info_detail_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return StatisticResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['valid_count'])) {
            $model->validCount = $map['valid_count'];
        }
        if (isset($map['statistic_info_detail_list'])) {
            if (!empty($map['statistic_info_detail_list'])) {
                $model->statisticInfoDetailList = [];
                $n                              = 0;
                foreach ($map['statistic_info_detail_list'] as $item) {
                    $model->statisticInfoDetailList[$n++] = null !== $item ? StatisticInfoDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
