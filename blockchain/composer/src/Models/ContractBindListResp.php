<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractBindListResp extends Model
{
    // 合约关联列表
    /**
     * @example
     *
     * @var ContractBindResp[]
     */
    public $list;
    protected $_name = [
        'list' => 'list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractBindListResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? ContractBindResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
