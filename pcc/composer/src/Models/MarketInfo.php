<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PCC\Models;

use AlibabaCloud\Tea\Model;

class MarketInfo extends Model
{
    // 市场逻辑
    /**
     * @example test
     *
     * @var string
     */
    public $marketLogic;

    // 潜客接受度
    /**
     * @example test
     *
     * @var AcceptanceDetail[]
     */
    public $acceptanceDetails;

    // 基于竞品及加成
    /**
     * @example test
     *
     * @var AdditionDetail[]
     */
    public $additionDetails;
    protected $_name = [
        'marketLogic'       => 'market_logic',
        'acceptanceDetails' => 'acceptance_details',
        'additionDetails'   => 'addition_details',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->marketLogic) {
            $res['market_logic'] = $this->marketLogic;
        }
        if (null !== $this->acceptanceDetails) {
            $res['acceptance_details'] = [];
            if (null !== $this->acceptanceDetails && \is_array($this->acceptanceDetails)) {
                $n = 0;
                foreach ($this->acceptanceDetails as $item) {
                    $res['acceptance_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->additionDetails) {
            $res['addition_details'] = [];
            if (null !== $this->additionDetails && \is_array($this->additionDetails)) {
                $n = 0;
                foreach ($this->additionDetails as $item) {
                    $res['addition_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MarketInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['market_logic'])) {
            $model->marketLogic = $map['market_logic'];
        }
        if (isset($map['acceptance_details'])) {
            if (!empty($map['acceptance_details'])) {
                $model->acceptanceDetails = [];
                $n                        = 0;
                foreach ($map['acceptance_details'] as $item) {
                    $model->acceptanceDetails[$n++] = null !== $item ? AcceptanceDetail::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['addition_details'])) {
            if (!empty($map['addition_details'])) {
                $model->additionDetails = [];
                $n                      = 0;
                foreach ($map['addition_details'] as $item) {
                    $model->additionDetails[$n++] = null !== $item ? AdditionDetail::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
