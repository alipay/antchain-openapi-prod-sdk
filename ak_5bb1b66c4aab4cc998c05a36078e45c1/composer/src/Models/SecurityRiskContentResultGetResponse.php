<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ak_5bb1b66c4aab4cc998c05a36078e45c1\Models;

use AlibabaCloud\Tea\Model;

class SecurityRiskContentResultGetResponse extends Model
{
    // 命中次数
    /**
     * @example
     *
     * @var InfoSecHitDetectItem[]
     */
    public $hitDetectItems;

    // 返回结果
    /**
     * @example PASSED
     *
     * @var string
     */
    public $resultAction;
    protected $_name = [
        'hitDetectItems' => 'hit_detect_items',
        'resultAction'   => 'result_action',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->hitDetectItems) {
            $res['hit_detect_items'] = [];
            if (null !== $this->hitDetectItems && \is_array($this->hitDetectItems)) {
                $n = 0;
                foreach ($this->hitDetectItems as $item) {
                    $res['hit_detect_items'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->resultAction) {
            $res['result_action'] = $this->resultAction;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SecurityRiskContentResultGetResponse
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['hit_detect_items'])) {
            if (!empty($map['hit_detect_items'])) {
                $model->hitDetectItems = [];
                $n                     = 0;
                foreach ($map['hit_detect_items'] as $item) {
                    $model->hitDetectItems[$n++] = null !== $item ? InfoSecHitDetectItem::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['result_action'])) {
            $model->resultAction = $map['result_action'];
        }

        return $model;
    }
}
