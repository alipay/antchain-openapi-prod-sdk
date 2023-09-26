<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class ChainInsightContractInterface extends Model
{
    // 展示的函数名称
    /**
     * @example functon
     *
     * @var string
     */
    public $name;

    // 接口中使用的函数名称标识符
    /**
     * @example functon
     *
     * @var string
     */
    public $nameSig;

    // 接口的类型，枚举：function, event, deposit
    /**
     * @example function
     *
     * @var string
     */
    public $type;

    // 对应的标准 ERC 事件/方法 的名称
    /**
     * @example TransferBatch
     *
     * @var string
     */
    public $standardErcName;

    // 参数列表
    /**
     * @example
     *
     * @var ChainInsightContractInterfaceArgument[]
     */
    public $args;
    protected $_name = [
        'name'            => 'name',
        'nameSig'         => 'name_sig',
        'type'            => 'type',
        'standardErcName' => 'standard_erc_name',
        'args'            => 'args',
    ];

    public function validate()
    {
        Model::validateRequired('nameSig', $this->nameSig, true);
        Model::validateRequired('type', $this->type, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nameSig) {
            $res['name_sig'] = $this->nameSig;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->standardErcName) {
            $res['standard_erc_name'] = $this->standardErcName;
        }
        if (null !== $this->args) {
            $res['args'] = [];
            if (null !== $this->args && \is_array($this->args)) {
                $n = 0;
                foreach ($this->args as $item) {
                    $res['args'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ChainInsightContractInterface
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['name_sig'])) {
            $model->nameSig = $map['name_sig'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['standard_erc_name'])) {
            $model->standardErcName = $map['standard_erc_name'];
        }
        if (isset($map['args'])) {
            if (!empty($map['args'])) {
                $model->args = [];
                $n           = 0;
                foreach ($map['args'] as $item) {
                    $model->args[$n++] = null !== $item ? ChainInsightContractInterfaceArgument::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
