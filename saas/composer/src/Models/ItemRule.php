<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SAAS\Models;

use AlibabaCloud\Tea\Model;

class ItemRule extends Model
{
    // 上报次数
    /**
     * @example INVOKE_COUNT
     *
     * @var string
     */
    public $meteringItem;

    // 计量项列表
    /**
     * @example [{"meteringMatchingRule":"method == _identity.marriage.marriage.info_","meteringValue":"M"}]
     *
     * @var ItemMatchingRule[]
     */
    public $itemMatchingRules;
    protected $_name = [
        'meteringItem'      => 'metering_item',
        'itemMatchingRules' => 'item_matching_rules',
    ];

    public function validate()
    {
        Model::validateRequired('meteringItem', $this->meteringItem, true);
        Model::validateRequired('itemMatchingRules', $this->itemMatchingRules, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->meteringItem) {
            $res['metering_item'] = $this->meteringItem;
        }
        if (null !== $this->itemMatchingRules) {
            $res['item_matching_rules'] = [];
            if (null !== $this->itemMatchingRules && \is_array($this->itemMatchingRules)) {
                $n = 0;
                foreach ($this->itemMatchingRules as $item) {
                    $res['item_matching_rules'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ItemRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metering_item'])) {
            $model->meteringItem = $map['metering_item'];
        }
        if (isset($map['item_matching_rules'])) {
            if (!empty($map['item_matching_rules'])) {
                $model->itemMatchingRules = [];
                $n                        = 0;
                foreach ($map['item_matching_rules'] as $item) {
                    $model->itemMatchingRules[$n++] = null !== $item ? ItemMatchingRule::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
