<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_e902915b72a94e92bc07149e85544a3c\Models;

use AlibabaCloud\Tea\Model;

class CountAntchainCarbonEcarActivedataRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 盘查排放项编码
    /**
     * @var string
     */
    public $inventoryItemNo;

    // 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
    /**
     * @var string
     */
    public $occurrenceStartTime;

    // 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
    /**
     * @var string
     */
    public $occurrenceEndTime;

    // 活动数据附加要素信息，将统计满足相关要素值的活动数据
    /**
     * @var AnyKeywordItem[]
     */
    public $emissionSourceElementList;

    // 活动数据扩展信息，将统计满足相关要素值的活动数据
    /**
     * @var AnyKeywordItem[]
     */
    public $extensionValueList;

    // 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
    // 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
    // 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
    /**
     * @var AnyKeywordItem[]
     */
    public $extraStatisticItemList;
    protected $_name = [
        'authToken'                 => 'auth_token',
        'productInstanceId'         => 'product_instance_id',
        'inventoryItemNo'           => 'inventory_item_no',
        'occurrenceStartTime'       => 'occurrence_start_time',
        'occurrenceEndTime'         => 'occurrence_end_time',
        'emissionSourceElementList' => 'emission_source_element_list',
        'extensionValueList'        => 'extension_value_list',
        'extraStatisticItemList'    => 'extra_statistic_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('inventoryItemNo', $this->inventoryItemNo, true);
        Model::validateRequired('occurrenceStartTime', $this->occurrenceStartTime, true);
        Model::validateRequired('occurrenceEndTime', $this->occurrenceEndTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->inventoryItemNo) {
            $res['inventory_item_no'] = $this->inventoryItemNo;
        }
        if (null !== $this->occurrenceStartTime) {
            $res['occurrence_start_time'] = $this->occurrenceStartTime;
        }
        if (null !== $this->occurrenceEndTime) {
            $res['occurrence_end_time'] = $this->occurrenceEndTime;
        }
        if (null !== $this->emissionSourceElementList) {
            $res['emission_source_element_list'] = [];
            if (null !== $this->emissionSourceElementList && \is_array($this->emissionSourceElementList)) {
                $n = 0;
                foreach ($this->emissionSourceElementList as $item) {
                    $res['emission_source_element_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extensionValueList) {
            $res['extension_value_list'] = [];
            if (null !== $this->extensionValueList && \is_array($this->extensionValueList)) {
                $n = 0;
                foreach ($this->extensionValueList as $item) {
                    $res['extension_value_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->extraStatisticItemList) {
            $res['extra_statistic_item_list'] = [];
            if (null !== $this->extraStatisticItemList && \is_array($this->extraStatisticItemList)) {
                $n = 0;
                foreach ($this->extraStatisticItemList as $item) {
                    $res['extra_statistic_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CountAntchainCarbonEcarActivedataRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['inventory_item_no'])) {
            $model->inventoryItemNo = $map['inventory_item_no'];
        }
        if (isset($map['occurrence_start_time'])) {
            $model->occurrenceStartTime = $map['occurrence_start_time'];
        }
        if (isset($map['occurrence_end_time'])) {
            $model->occurrenceEndTime = $map['occurrence_end_time'];
        }
        if (isset($map['emission_source_element_list'])) {
            if (!empty($map['emission_source_element_list'])) {
                $model->emissionSourceElementList = [];
                $n                                = 0;
                foreach ($map['emission_source_element_list'] as $item) {
                    $model->emissionSourceElementList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extension_value_list'])) {
            if (!empty($map['extension_value_list'])) {
                $model->extensionValueList = [];
                $n                         = 0;
                foreach ($map['extension_value_list'] as $item) {
                    $model->extensionValueList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['extra_statistic_item_list'])) {
            if (!empty($map['extra_statistic_item_list'])) {
                $model->extraStatisticItemList = [];
                $n                             = 0;
                foreach ($map['extra_statistic_item_list'] as $item) {
                    $model->extraStatisticItemList[$n++] = null !== $item ? AnyKeywordItem::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
