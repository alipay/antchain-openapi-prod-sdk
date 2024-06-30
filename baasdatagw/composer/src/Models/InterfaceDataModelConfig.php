<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDATAGW\Models;

use AlibabaCloud\Tea\Model;

class InterfaceDataModelConfig extends Model
{
    // 接口名称
    /**
     * @example func1
     *
     * @var string
     */
    public $name;

    // 接口签名，SOLIDITY 合约必填
    /**
     * @example 02fe5305
     *
     * @var string
     */
    public $nameSig;

    // 接口类型，当前 event 暂不支持。
    // function / deposit / event
    /**
     * @example function
     *
     * @var string
     */
    public $type;

    // 接口参数配置列表，保序传递。
    /**
     * @example
     *
     * @var DataModelConfig[]
     */
    public $argConfigs;
    protected $_name = [
        'name'       => 'name',
        'nameSig'    => 'name_sig',
        'type'       => 'type',
        'argConfigs' => 'arg_configs',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->argConfigs) {
            $res['arg_configs'] = [];
            if (null !== $this->argConfigs && \is_array($this->argConfigs)) {
                $n = 0;
                foreach ($this->argConfigs as $item) {
                    $res['arg_configs'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InterfaceDataModelConfig
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
        if (isset($map['arg_configs'])) {
            if (!empty($map['arg_configs'])) {
                $model->argConfigs = [];
                $n                 = 0;
                foreach ($map['arg_configs'] as $item) {
                    $model->argConfigs[$n++] = null !== $item ? DataModelConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
