<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class ContractIdeConfigResult extends Model
{
    // 合约链的配置信息，可包含多个合约链的配置
    /**
     * @example
     *
     * @var ContractIdeConfig[]
     */
    public $contractIdeConfigList;
    protected $_name = [
        'contractIdeConfigList' => 'contract_ide_config_list',
    ];

    public function validate()
    {
        Model::validateRequired('contractIdeConfigList', $this->contractIdeConfigList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractIdeConfigList) {
            $res['contract_ide_config_list'] = [];
            if (null !== $this->contractIdeConfigList && \is_array($this->contractIdeConfigList)) {
                $n = 0;
                foreach ($this->contractIdeConfigList as $item) {
                    $res['contract_ide_config_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractIdeConfigResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_ide_config_list'])) {
            if (!empty($map['contract_ide_config_list'])) {
                $model->contractIdeConfigList = [];
                $n                            = 0;
                foreach ($map['contract_ide_config_list'] as $item) {
                    $model->contractIdeConfigList[$n++] = null !== $item ? ContractIdeConfig::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
