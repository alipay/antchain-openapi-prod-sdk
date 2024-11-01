<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ASSET\Models;

use AlibabaCloud\Tea\Model;

class MetricData extends Model
{
    // 租户指标: OPERATING_INCOME, REPAY_AMOUNT, REPAY_NUMBER, REPAY_USER_NUMBER, REPAY_AVG_AMOUNT, ALI_DST_AMT
    /**
     * @example OPERATING_INCOME
     *
     * @var string
     */
    public $type;

    // 指标值
    /**
     * @example ds190c968e87a001b951spfinassetopprod
     *
     * @var string
     */
    public $total;

    // 子指标列表
    /**
     * @example [{"date":"2024-09-11","type":"OPERATING_INCOME","value":"634744.89"},{"date":"2024-09-12","type":"OPERATING_INCOME","value":"891762.89"}]
     *
     * @var SubMetricData[]
     */
    public $subList;
    protected $_name = [
        'type'    => 'type',
        'total'   => 'total',
        'subList' => 'sub_list',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('total', $this->total, true);
        Model::validateRequired('subList', $this->subList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->total) {
            $res['total'] = $this->total;
        }
        if (null !== $this->subList) {
            $res['sub_list'] = [];
            if (null !== $this->subList && \is_array($this->subList)) {
                $n = 0;
                foreach ($this->subList as $item) {
                    $res['sub_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MetricData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['total'])) {
            $model->total = $map['total'];
        }
        if (isset($map['sub_list'])) {
            if (!empty($map['sub_list'])) {
                $model->subList = [];
                $n              = 0;
                foreach ($map['sub_list'] as $item) {
                    $model->subList[$n++] = null !== $item ? SubMetricData::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
