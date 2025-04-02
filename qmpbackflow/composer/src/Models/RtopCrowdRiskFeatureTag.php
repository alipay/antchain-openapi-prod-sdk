<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCrowdRiskFeatureTag extends Model
{
    // 标签描述
    /**
     * @example XXX公司法人发生变更
     *
     * @var string
     */
    public $tagExplanation;

    // 标签名称
    /**
     * @example 法人变更
     *
     * @var string
     */
    public $tagName;
    protected $_name = [
        'tagExplanation' => 'tag_explanation',
        'tagName'        => 'tag_name',
    ];

    public function validate()
    {
        Model::validateRequired('tagExplanation', $this->tagExplanation, true);
        Model::validateRequired('tagName', $this->tagName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tagExplanation) {
            $res['tag_explanation'] = $this->tagExplanation;
        }
        if (null !== $this->tagName) {
            $res['tag_name'] = $this->tagName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCrowdRiskFeatureTag
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tag_explanation'])) {
            $model->tagExplanation = $map['tag_explanation'];
        }
        if (isset($map['tag_name'])) {
            $model->tagName = $map['tag_name'];
        }

        return $model;
    }
}
