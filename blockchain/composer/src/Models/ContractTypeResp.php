<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractTypeResp extends Model
{
    // 合约服务类型
    /**
     * @example
     *
     * @var ContractTypeListResp[]
     */
    public $typeList;
    protected $_name = [
        'typeList' => 'type_list',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->typeList) {
            $res['type_list'] = [];
            if (null !== $this->typeList && \is_array($this->typeList)) {
                $n = 0;
                foreach ($this->typeList as $item) {
                    $res['type_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractTypeResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['type_list'])) {
            if (!empty($map['type_list'])) {
                $model->typeList = [];
                $n               = 0;
                foreach ($map['type_list'] as $item) {
                    $model->typeList[$n++] = null !== $item ? ContractTypeListResp::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
