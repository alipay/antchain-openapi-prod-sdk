<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XPrometheusData extends Model
{
    /**
     * @example
     *
     * @var XExpression[]
     */
    public $metrics;

    /**
     * @example
     *
     * @var XPrometheusQuery
     */
    public $query;
    protected $_name = [
        'metrics' => 'metrics',
        'query'   => 'query',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->metrics) {
            $res['metrics'] = [];
            if (null !== $this->metrics && \is_array($this->metrics)) {
                $n = 0;
                foreach ($this->metrics as $item) {
                    $res['metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->query) {
            $res['query'] = null !== $this->query ? $this->query->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XPrometheusData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = [];
                $n              = 0;
                foreach ($map['metrics'] as $item) {
                    $model->metrics[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['query'])) {
            $model->query = XPrometheusQuery::fromMap($map['query']);
        }

        return $model;
    }
}
