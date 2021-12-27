<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskStormLabelResp extends Model
{
    // 标签次数
    /**
     * @example 10
     *
     * @var int
     */
    public $labelCount;

    // 标签id
    /**
     * @example cancelled
     *
     * @var string
     */
    public $labelId;

    // 标签名称
    /**
     * @example 注销
     *
     * @var string
     */
    public $labelName;
    protected $_name = [
        'labelCount' => 'label_count',
        'labelId'    => 'label_id',
        'labelName'  => 'label_name',
    ];

    public function validate()
    {
        Model::validateRequired('labelCount', $this->labelCount, true);
        Model::validateRequired('labelId', $this->labelId, true);
        Model::validateRequired('labelName', $this->labelName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->labelCount) {
            $res['label_count'] = $this->labelCount;
        }
        if (null !== $this->labelId) {
            $res['label_id'] = $this->labelId;
        }
        if (null !== $this->labelName) {
            $res['label_name'] = $this->labelName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskStormLabelResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label_count'])) {
            $model->labelCount = $map['label_count'];
        }
        if (isset($map['label_id'])) {
            $model->labelId = $map['label_id'];
        }
        if (isset($map['label_name'])) {
            $model->labelName = $map['label_name'];
        }

        return $model;
    }
}
