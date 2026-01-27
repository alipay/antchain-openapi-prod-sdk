<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class SubLabelModel extends Model
{
    // 二级标签
    /**
     * @example 正常
     *
     * @var string
     */
    public $subLabel;

    // 风险关键词列表
    /**
     * @example
     *
     * @var string[]
     */
    public $riskWords;

    // 风险关键词索引列表
    /**
     * @example
     *
     * @var string[]
     */
    public $riskWordsIndex;

    // 三级标签列表
    /**
     * @example
     *
     * @var string[]
     */
    public $thirdLabels;
    protected $_name = [
        'subLabel'       => 'sub_label',
        'riskWords'      => 'risk_words',
        'riskWordsIndex' => 'risk_words_index',
        'thirdLabels'    => 'third_labels',
    ];

    public function validate()
    {
        Model::validateRequired('subLabel', $this->subLabel, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->subLabel) {
            $res['sub_label'] = $this->subLabel;
        }
        if (null !== $this->riskWords) {
            $res['risk_words'] = $this->riskWords;
        }
        if (null !== $this->riskWordsIndex) {
            $res['risk_words_index'] = $this->riskWordsIndex;
        }
        if (null !== $this->thirdLabels) {
            $res['third_labels'] = $this->thirdLabels;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SubLabelModel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['sub_label'])) {
            $model->subLabel = $map['sub_label'];
        }
        if (isset($map['risk_words'])) {
            if (!empty($map['risk_words'])) {
                $model->riskWords = $map['risk_words'];
            }
        }
        if (isset($map['risk_words_index'])) {
            if (!empty($map['risk_words_index'])) {
                $model->riskWordsIndex = $map['risk_words_index'];
            }
        }
        if (isset($map['third_labels'])) {
            if (!empty($map['third_labels'])) {
                $model->thirdLabels = $map['third_labels'];
            }
        }

        return $model;
    }
}
