<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SECURITYTECH\Models;

use AlibabaCloud\Tea\Model;

class BizQueryParam extends Model
{
    // 参数列表，数组
    /**
     * @example
     *
     * @var BizParam[]
     */
    public $bizParams;
    protected $_name = [
        'bizParams' => 'biz_params',
    ];

    public function validate()
    {
        Model::validateRequired('bizParams', $this->bizParams, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->bizParams) {
            $res['biz_params'] = [];
            if (null !== $this->bizParams && \is_array($this->bizParams)) {
                $n = 0;
                foreach ($this->bizParams as $item) {
                    $res['biz_params'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BizQueryParam
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['biz_params'])) {
            if (!empty($map['biz_params'])) {
                $model->bizParams = [];
                $n                = 0;
                foreach ($map['biz_params'] as $item) {
                    $model->bizParams[$n++] = null !== $item ? BizParam::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
