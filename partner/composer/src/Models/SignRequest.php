<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class SignRequest extends Model
{
    // 合同类型
    /**
     * @example Standard（标准）、Custom（自定义）
     *
     * @var string
     */
    public $contractType;

    // 签约模式
    /**
     * @example ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
     *
     * @var string
     */
    public $sealMode;
    protected $_name = [
        'contractType' => 'contract_type',
        'sealMode'     => 'seal_mode',
    ];

    public function validate()
    {
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('sealMode', $this->sealMode, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->sealMode) {
            $res['seal_mode'] = $this->sealMode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SignRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['contract_type'])) {
            $model->contractType = $map['contract_type'];
        }
        if (isset($map['seal_mode'])) {
            $model->sealMode = $map['seal_mode'];
        }

        return $model;
    }
}
