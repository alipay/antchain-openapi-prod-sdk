<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BCCR\Models;

use AlibabaCloud\Tea\Model;

class LabelRiskData extends Model
{
    // 识别出的标签名称
    /**
     * @example 识别出的标签名称
     *
     * @var string
     */
    public $labelName;

    // 识别出的标签是否与用户选择的标签匹配
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isMatch;

    // 识别出的标签匹配度
    /**
     * @example 识别出的标签匹配度
     *
     * @var string
     */
    public $matchValue;
    protected $_name = [
        'labelName'  => 'label_name',
        'isMatch'    => 'is_match',
        'matchValue' => 'match_value',
    ];

    public function validate()
    {
        Model::validateRequired('labelName', $this->labelName, true);
        Model::validateRequired('isMatch', $this->isMatch, true);
        Model::validateRequired('matchValue', $this->matchValue, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->labelName) {
            $res['label_name'] = $this->labelName;
        }
        if (null !== $this->isMatch) {
            $res['is_match'] = $this->isMatch;
        }
        if (null !== $this->matchValue) {
            $res['match_value'] = $this->matchValue;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return LabelRiskData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label_name'])) {
            $model->labelName = $map['label_name'];
        }
        if (isset($map['is_match'])) {
            $model->isMatch = $map['is_match'];
        }
        if (isset($map['match_value'])) {
            $model->matchValue = $map['match_value'];
        }

        return $model;
    }
}
