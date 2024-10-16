<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\AITECH\Models;

use AlibabaCloud\Tea\Model;

class AuditSyncLabel extends Model
{
    // 标签名：sex-色情
    /**
     * @example sex
     *
     * @var string
     */
    public $label;

    // 检测到单个风险标签的置信度：66.25
    /**
     * @example 66.25
     *
     * @var int
     */
    public $probability;

    // 风险标签说明
    /**
     * @example 疑似色情内容
     *
     * @var string
     */
    public $description;

    // 检测到的敏感词，多个词用逗号分隔，部分标签不会返回敏感词：AA,BB,CC
    /**
     * @example AA,BB,CC
     *
     * @var string
     */
    public $riskWords;
    protected $_name = [
        'label'       => 'label',
        'probability' => 'probability',
        'description' => 'description',
        'riskWords'   => 'risk_words',
    ];

    public function validate()
    {
        Model::validateRequired('label', $this->label, true);
        Model::validateRequired('probability', $this->probability, true);
        Model::validateRequired('riskWords', $this->riskWords, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->label) {
            $res['label'] = $this->label;
        }
        if (null !== $this->probability) {
            $res['probability'] = $this->probability;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->riskWords) {
            $res['risk_words'] = $this->riskWords;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AuditSyncLabel
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['label'])) {
            $model->label = $map['label'];
        }
        if (isset($map['probability'])) {
            $model->probability = $map['probability'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['risk_words'])) {
            $model->riskWords = $map['risk_words'];
        }

        return $model;
    }
}
