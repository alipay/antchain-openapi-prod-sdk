<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DAS\Models;

use AlibabaCloud\Tea\Model;

class DataSourceInterface extends Model
{
    // 数据源接口访问地址
    /**
     * @example https://******
     *
     * @var string
     */
    public $address;

    // 数据源接口请求方法类型
    /**
     * @example POST
     *
     * @var string
     */
    public $interfaceRequestMethod;

    // 数据源接口入参列表
    /**
     * @example
     *
     * @var InterfaceInput[]
     */
    public $interfaceInput;

    // 数据源接口出参列表
    /**
     * @example
     *
     * @var InterfaceOutput[]
     */
    public $interfaceOutput;
    protected $_name = [
        'address'                => 'address',
        'interfaceRequestMethod' => 'interface_request_method',
        'interfaceInput'         => 'interface_input',
        'interfaceOutput'        => 'interface_output',
    ];

    public function validate()
    {
        Model::validateRequired('address', $this->address, true);
        Model::validateRequired('interfaceRequestMethod', $this->interfaceRequestMethod, true);
        Model::validateMaxLength('address', $this->address, 100);
        Model::validateMaxLength('interfaceRequestMethod', $this->interfaceRequestMethod, 50);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->interfaceRequestMethod) {
            $res['interface_request_method'] = $this->interfaceRequestMethod;
        }
        if (null !== $this->interfaceInput) {
            $res['interface_input'] = [];
            if (null !== $this->interfaceInput && \is_array($this->interfaceInput)) {
                $n = 0;
                foreach ($this->interfaceInput as $item) {
                    $res['interface_input'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->interfaceOutput) {
            $res['interface_output'] = [];
            if (null !== $this->interfaceOutput && \is_array($this->interfaceOutput)) {
                $n = 0;
                foreach ($this->interfaceOutput as $item) {
                    $res['interface_output'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DataSourceInterface
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['address'])) {
            $model->address = $map['address'];
        }
        if (isset($map['interface_request_method'])) {
            $model->interfaceRequestMethod = $map['interface_request_method'];
        }
        if (isset($map['interface_input'])) {
            if (!empty($map['interface_input'])) {
                $model->interfaceInput = [];
                $n                     = 0;
                foreach ($map['interface_input'] as $item) {
                    $model->interfaceInput[$n++] = null !== $item ? InterfaceInput::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['interface_output'])) {
            if (!empty($map['interface_output'])) {
                $model->interfaceOutput = [];
                $n                      = 0;
                foreach ($map['interface_output'] as $item) {
                    $model->interfaceOutput[$n++] = null !== $item ? InterfaceOutput::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
