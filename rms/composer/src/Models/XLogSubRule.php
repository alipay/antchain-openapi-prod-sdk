<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class XLogSubRule extends Model
{
    // log path
    /**
     * @example /home/admin/logs/a.log
     *
     * @var string
     */
    public $path;

    /**
     * @example
     *
     * @var XExpression[]
     */
    public $metrics;

    /**
     * @example
     *
     * @var XExpression[]
     */
    public $ruleTags;

    // 白名单
    /**
     * @example
     *
     * @var XExpression[]
     */
    public $includeLines;

    /**
     * @example
     *
     * @var XExpression[]
     */
    public $excludeLines;

    // x
    /**
     * @example x
     *
     * @var string[]
     */
    public $paths;

    // x
    /**
     * @example x
     *
     * @var string
     */
    public $pathLinkPrefix;

    /**
     * @example
     *
     * @var XExpression
     */
    public $pathExpression;
    protected $_name = [
        'path'           => 'path',
        'metrics'        => 'metrics',
        'ruleTags'       => 'rule_tags',
        'includeLines'   => 'include_lines',
        'excludeLines'   => 'exclude_lines',
        'paths'          => 'paths',
        'pathLinkPrefix' => 'path_link_prefix',
        'pathExpression' => 'path_expression',
    ];

    public function validate()
    {
        Model::validateRequired('metrics', $this->metrics, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->path) {
            $res['path'] = $this->path;
        }
        if (null !== $this->metrics) {
            $res['metrics'] = [];
            if (null !== $this->metrics && \is_array($this->metrics)) {
                $n = 0;
                foreach ($this->metrics as $item) {
                    $res['metrics'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->ruleTags) {
            $res['rule_tags'] = [];
            if (null !== $this->ruleTags && \is_array($this->ruleTags)) {
                $n = 0;
                foreach ($this->ruleTags as $item) {
                    $res['rule_tags'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->includeLines) {
            $res['include_lines'] = [];
            if (null !== $this->includeLines && \is_array($this->includeLines)) {
                $n = 0;
                foreach ($this->includeLines as $item) {
                    $res['include_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->excludeLines) {
            $res['exclude_lines'] = [];
            if (null !== $this->excludeLines && \is_array($this->excludeLines)) {
                $n = 0;
                foreach ($this->excludeLines as $item) {
                    $res['exclude_lines'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->paths) {
            $res['paths'] = $this->paths;
        }
        if (null !== $this->pathLinkPrefix) {
            $res['path_link_prefix'] = $this->pathLinkPrefix;
        }
        if (null !== $this->pathExpression) {
            $res['path_expression'] = null !== $this->pathExpression ? $this->pathExpression->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return XLogSubRule
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['path'])) {
            $model->path = $map['path'];
        }
        if (isset($map['metrics'])) {
            if (!empty($map['metrics'])) {
                $model->metrics = [];
                $n              = 0;
                foreach ($map['metrics'] as $item) {
                    $model->metrics[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['rule_tags'])) {
            if (!empty($map['rule_tags'])) {
                $model->ruleTags = [];
                $n               = 0;
                foreach ($map['rule_tags'] as $item) {
                    $model->ruleTags[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['include_lines'])) {
            if (!empty($map['include_lines'])) {
                $model->includeLines = [];
                $n                   = 0;
                foreach ($map['include_lines'] as $item) {
                    $model->includeLines[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['exclude_lines'])) {
            if (!empty($map['exclude_lines'])) {
                $model->excludeLines = [];
                $n                   = 0;
                foreach ($map['exclude_lines'] as $item) {
                    $model->excludeLines[$n++] = null !== $item ? XExpression::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['paths'])) {
            if (!empty($map['paths'])) {
                $model->paths = $map['paths'];
            }
        }
        if (isset($map['path_link_prefix'])) {
            $model->pathLinkPrefix = $map['path_link_prefix'];
        }
        if (isset($map['path_expression'])) {
            $model->pathExpression = XExpression::fromMap($map['path_expression']);
        }

        return $model;
    }
}
