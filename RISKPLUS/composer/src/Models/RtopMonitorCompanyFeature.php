<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopMonitorCompanyFeature extends Model
{
    // 特征的描述
    /**
     * @example 有企业地址变更历史，变更过经营范围
     *
     * @var string
     */
    public $description;

    // 特征的名称
    /**
     * @example 关联风险
     *
     * @var string
     */
    public $name;

    // 特征里的风险标签列表
    /**
     * @example
     *
     * @var string[]
     */
    public $riskTags;

    // 特征的评分
    /**
     * @example 80
     *
     * @var int
     */
    public $score;
    protected $_name = [
        'description' => 'description',
        'name'        => 'name',
        'riskTags'    => 'risk_tags',
        'score'       => 'score',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('score', $this->score, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = $this->riskTags;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopMonitorCompanyFeature
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['risk_tags'])) {
            if (!empty($map['risk_tags'])) {
                $model->riskTags = $map['risk_tags'];
            }
        }
        if (isset($map['score'])) {
            $model->score = $map['score'];
        }

        return $model;
    }
}
