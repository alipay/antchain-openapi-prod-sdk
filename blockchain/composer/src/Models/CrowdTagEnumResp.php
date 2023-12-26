<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class CrowdTagEnumResp extends Model
{
    // 人群标签code
    /**
     * @example xx
     *
     * @var string
     */
    public $crowdTag;

    // 人群标签枚举列表对象
    /**
     * @example
     *
     * @var CrowdTagEnumItemDTO[]
     */
    public $crowTagEnumItemList;
    protected $_name = [
        'crowdTag'            => 'crowd_tag',
        'crowTagEnumItemList' => 'crow_tag_enum_item_list',
    ];

    public function validate()
    {
        Model::validateRequired('crowdTag', $this->crowdTag, true);
        Model::validateRequired('crowTagEnumItemList', $this->crowTagEnumItemList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->crowdTag) {
            $res['crowd_tag'] = $this->crowdTag;
        }
        if (null !== $this->crowTagEnumItemList) {
            $res['crow_tag_enum_item_list'] = [];
            if (null !== $this->crowTagEnumItemList && \is_array($this->crowTagEnumItemList)) {
                $n = 0;
                foreach ($this->crowTagEnumItemList as $item) {
                    $res['crow_tag_enum_item_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CrowdTagEnumResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['crowd_tag'])) {
            $model->crowdTag = $map['crowd_tag'];
        }
        if (isset($map['crow_tag_enum_item_list'])) {
            if (!empty($map['crow_tag_enum_item_list'])) {
                $model->crowTagEnumItemList = [];
                $n                          = 0;
                foreach ($map['crow_tag_enum_item_list'] as $item) {
                    $model->crowTagEnumItemList[$n++] = null !== $item ? CrowdTagEnumItemDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
