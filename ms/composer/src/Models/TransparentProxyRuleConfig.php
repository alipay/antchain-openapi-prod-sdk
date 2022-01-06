<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class TransparentProxyRuleConfig extends Model
{
    // 入方向配置
    /**
     * @example
     *
     * @var TransparentProxyBound[]
     */
    public $inBound;

    // 出方向配置
    /**
     * @example
     *
     * @var TransparentProxyBound[]
     */
    public $outBound;
    protected $_name = [
        'inBound'  => 'in_bound',
        'outBound' => 'out_bound',
    ];

    public function validate()
    {
        Model::validateRequired('inBound', $this->inBound, true);
        Model::validateRequired('outBound', $this->outBound, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->inBound) {
            $res['in_bound'] = [];
            if (null !== $this->inBound && \is_array($this->inBound)) {
                $n = 0;
                foreach ($this->inBound as $item) {
                    $res['in_bound'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->outBound) {
            $res['out_bound'] = [];
            if (null !== $this->outBound && \is_array($this->outBound)) {
                $n = 0;
                foreach ($this->outBound as $item) {
                    $res['out_bound'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TransparentProxyRuleConfig
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['in_bound'])) {
            if (!empty($map['in_bound'])) {
                $model->inBound = [];
                $n              = 0;
                foreach ($map['in_bound'] as $item) {
                    $model->inBound[$n++] = null !== $item ? TransparentProxyBound::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['out_bound'])) {
            if (!empty($map['out_bound'])) {
                $model->outBound = [];
                $n               = 0;
                foreach ($map['out_bound'] as $item) {
                    $model->outBound[$n++] = null !== $item ? TransparentProxyBound::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
