<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightSearchResultItem extends Model
{
    // 结果类型，枚举：Chain、ChainData、ChainAddress、ChainBlock、ChainTx、ChainTxTimeline
    /**
     * @example ChainData
     *
     * @var string
     */
    public $type;

    // 结果所在的链ID
    /**
     * @example c3179e0d54a340a38d338664fe71d54c
     *
     * @var string
     */
    public $bizId;

    // 结果与搜索请求的相关性程度，(0, 10000000]
    /**
     * @example 9500000
     *
     * @var int
     */
    public $score;

    // 搜索结果值
    /**
     * @example
     *
     * @var MapEntry[]
     */
    public $values;
    protected $_name = [
        'type'   => 'type',
        'bizId'  => 'biz_id',
        'score'  => 'score',
        'values' => 'values',
    ];

    public function validate()
    {
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('bizId', $this->bizId, true);
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('values', $this->values, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->values) {
            $res['values'] = [];
            if (null !== $this->values && \is_array($this->values)) {
                $n = 0;
                foreach ($this->values as $item) {
                    $res['values'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightSearchResultItem
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }
        if (isset($map['values'])) {
            if (!empty($map['values'])) {
                $model->values = [];
                $n             = 0;
                foreach ($map['values'] as $item) {
                    $model->values[$n++] = null !== $item ? MapEntry::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
