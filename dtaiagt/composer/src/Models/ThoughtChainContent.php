<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTAIAGT\Models;

use AlibabaCloud\Tea\Model;

class ThoughtChainContent extends Model
{
    // id
    /**
     * @example id
     *
     * @var string
     */
    public $id;

    // source
    /**
     * @example source
     *
     * @var string
     */
    public $source;

    // children
    /**
     * @example children
     *
     * @var string
     */
    public $children;

    // timeConsuming
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $timeConsuming;

    // timeConsumingEpoch
    /**
     * @example
     *
     * @var int
     */
    public $timeConsumingEpoch;

    // latency
    /**
     * @example
     *
     * @var int
     */
    public $latency;

    // type
    /**
     * @example type
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'id'                 => 'id',
        'source'             => 'source',
        'children'           => 'children',
        'timeConsuming'      => 'time_consuming',
        'timeConsumingEpoch' => 'time_consuming_epoch',
        'latency'            => 'latency',
        'type'               => 'type',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('source', $this->source, true);
        Model::validateRequired('children', $this->children, true);
        Model::validateRequired('timeConsuming', $this->timeConsuming, true);
        Model::validateRequired('timeConsumingEpoch', $this->timeConsumingEpoch, true);
        Model::validateRequired('latency', $this->latency, true);
        Model::validateRequired('type', $this->type, true);
        Model::validatePattern('timeConsuming', $this->timeConsuming, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->source) {
            $res['source'] = $this->source;
        }
        if (null !== $this->children) {
            $res['children'] = $this->children;
        }
        if (null !== $this->timeConsuming) {
            $res['time_consuming'] = $this->timeConsuming;
        }
        if (null !== $this->timeConsumingEpoch) {
            $res['time_consuming_epoch'] = $this->timeConsumingEpoch;
        }
        if (null !== $this->latency) {
            $res['latency'] = $this->latency;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ThoughtChainContent
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['source'])) {
            $model->source = $map['source'];
        }
        if (isset($map['children'])) {
            $model->children = $map['children'];
        }
        if (isset($map['time_consuming'])) {
            $model->timeConsuming = $map['time_consuming'];
        }
        if (isset($map['time_consuming_epoch'])) {
            $model->timeConsumingEpoch = $map['time_consuming_epoch'];
        }
        if (isset($map['latency'])) {
            $model->latency = $map['latency'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
