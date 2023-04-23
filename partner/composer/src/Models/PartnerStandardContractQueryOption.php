<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\PARTNER\Models;

use AlibabaCloud\Tea\Model;

class PartnerStandardContractQueryOption extends Model
{
    // 是否渲染
    /**
     * @example true, false
     *
     * @var bool
     */
    public $renderContract;

    // 合同渲染上下文，jsonString格式，key值需要提前约定好
    //
    /**
     * @example {"key1": "value1", "key2": "value2"}
     *
     * @var string
     */
    public $renderContext;
    protected $_name = [
        'renderContract' => 'render_contract',
        'renderContext'  => 'render_context',
    ];

    public function validate()
    {
        Model::validateRequired('renderContract', $this->renderContract, true);
        Model::validateRequired('renderContext', $this->renderContext, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->renderContract) {
            $res['render_contract'] = $this->renderContract;
        }
        if (null !== $this->renderContext) {
            $res['render_context'] = $this->renderContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PartnerStandardContractQueryOption
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['render_contract'])) {
            $model->renderContract = $map['render_contract'];
        }
        if (isset($map['render_context'])) {
            $model->renderContext = $map['render_context'];
        }

        return $model;
    }
}
