<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Osp\Models;

use AlibabaCloud\Tea\Model;

class MeterDataModel extends Model
{
    // 时间
    /**
     * @example 2022-11-14 16:00:00
     *
     * @var string
     */
    public $meterDate;

    // 计量数据项
    /**
     * @example
     *
     * @var MeterDataItemModel[]
     */
    public $meterDataItemList;
    protected $_name = [
        'meterDate'         => 'meter_date',
        'meterDataItemList' => 'meter_data_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('meterDate', $this->meterDate, true);
        Model::validateRequired('meterDataItemList', $this->meterDataItemList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->meterDate) {
            $res['meter_date'] = $this->meterDate;
        }
        if (null !== $this->meterDataItemList) {
            $res['meter_data_item_list'] = [];
            if (null !== $this->meterDataItemList && \is_array($this->meterDataItemList)) {
                $n = 0;
                foreach ($this->meterDataItemList as $item) {
                    $res['meter_data_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MeterDataModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['meter_date'])) {
            $model->meterDate = $map['meter_date'];
        }
        if (isset($map['meter_data_item_list'])) {
            if (!empty($map['meter_data_item_list'])) {
                $model->meterDataItemList = [];
                $n                        = 0;
                foreach ($map['meter_data_item_list'] as $item) {
                    $model->meterDataItemList[$n++] = null !== $item ? MeterDataItemModel::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
