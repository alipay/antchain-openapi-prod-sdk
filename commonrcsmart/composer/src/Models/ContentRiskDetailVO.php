<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\COMMONRCSMART\Models;

use AlibabaCloud\Tea\Model;

class ContentRiskDetailVO extends Model
{
    // 风险等级
    /**
     * @example 高
     *
     * @var string
     */
    public $riskLevel;

    // 风险提示
    /**
     * @example ["不得使用绝对化、极限词"]
     *
     * @var string
     */
    public $notice;

    // 命中词
    /**
     * @example 第一、最先、国家级、首发
     *
     * @var string
     */
    public $violaWords;
    protected $_name = [
        'riskLevel'  => 'risk_level',
        'notice'     => 'notice',
        'violaWords' => 'viola_words',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->riskLevel) {
            $res['risk_level'] = $this->riskLevel;
        }
        if (null !== $this->notice) {
            $res['notice'] = $this->notice;
        }
        if (null !== $this->violaWords) {
            $res['viola_words'] = $this->violaWords;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContentRiskDetailVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['risk_level'])) {
            $model->riskLevel = $map['risk_level'];
        }
        if (isset($map['notice'])) {
            $model->notice = $map['notice'];
        }
        if (isset($map['viola_words'])) {
            $model->violaWords = $map['viola_words'];
        }

        return $model;
    }
}
