<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XCalculationExpression extends Model
{
    // x
    /**
     * @example x
     *
     * @var string
     */
    public $function;

    // x
    /**
     * @example x
     *
     * @var XCalculationParameter[]
     */
    public $parameters;

    // PromQL
    /**
     * @example
     *
     * @var string
     */
    public $query;

    /**
     * @example
     *
     * @var XMetricQueryMetadata[]
     */
    public $queryMetadatas;

    // calculation type
    /**
     * @example PQL
     *
     * @var string
     */
    public $type;
    protected $_name = [
        'function'       => 'function',
        'parameters'     => 'parameters',
        'query'          => 'query',
        'queryMetadatas' => 'query_metadatas',
        'type'           => 'type',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->function) {
            $res['function'] = $this->function;
        }
        if (null !== $this->parameters) {
            $res['parameters'] = [];
            if (null !== $this->parameters && \is_array($this->parameters)) {
                $n = 0;
                foreach ($this->parameters as $item) {
                    $res['parameters'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->query) {
            $res['query'] = $this->query;
        }
        if (null !== $this->queryMetadatas) {
            $res['query_metadatas'] = [];
            if (null !== $this->queryMetadatas && \is_array($this->queryMetadatas)) {
                $n = 0;
                foreach ($this->queryMetadatas as $item) {
                    $res['query_metadatas'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XCalculationExpression
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['function'])) {
            $model->function = $map['function'];
        }
        if (isset($map['parameters'])) {
            if (!empty($map['parameters'])) {
                $model->parameters = [];
                $n                 = 0;
                foreach ($map['parameters'] as $item) {
                    $model->parameters[$n++] = null !== $item ? XCalculationParameter::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['query'])) {
            $model->query = $map['query'];
        }
        if (isset($map['query_metadatas'])) {
            if (!empty($map['query_metadatas'])) {
                $model->queryMetadatas = [];
                $n                     = 0;
                foreach ($map['query_metadatas'] as $item) {
                    $model->queryMetadatas[$n++] = null !== $item ? XMetricQueryMetadata::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }

        return $model;
    }
}
