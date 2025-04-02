<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopStarCompanyInfo extends Model
{
    // 行业
    /**
     * @example
     *
     * @var string[]
     */
    public $categories;

    // 经营地址
    /**
     * @example 广东省珠海市前山金鸡西路
     *
     * @var string
     */
    public $operatingPlace;

    // 经营省份
    /**
     * @example 湖北省
     *
     * @var string
     */
    public $operatingProvince;

    // 企业名称
    /**
     * @example 珠海格力电器股份有限公司
     *
     * @var string
     */
    public $orgName;

    // 风险分数
    /**
     * @example 80
     *
     * @var int
     */
    public $riskScore;

    // 风险标签
    /**
     * @example ["内部被投诉","法定代表人名下企业超过6家"]
     *
     * @var string[]
     */
    public $riskTags;

    // 风险线索
    /**
     * @example
     *
     * @var RtopRiskTag[]
     */
    public $riskTagDetails;

    // 风险标签Id集合
    /**
     * @example ["CMN00025", "CMN00011"]
     *
     * @var string[]
     */
    public $riskTagIds;

    // 统一社会信用代码
    /**
     * @example 91440400192548256N
     *
     * @var string
     */
    public $ucCode;
    protected $_name = [
        'categories'        => 'categories',
        'operatingPlace'    => 'operating_place',
        'operatingProvince' => 'operating_province',
        'orgName'           => 'org_name',
        'riskScore'         => 'risk_score',
        'riskTags'          => 'risk_tags',
        'riskTagDetails'    => 'risk_tag_details',
        'riskTagIds'        => 'risk_tag_ids',
        'ucCode'            => 'uc_code',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->categories) {
            $res['categories'] = $this->categories;
        }
        if (null !== $this->operatingPlace) {
            $res['operating_place'] = $this->operatingPlace;
        }
        if (null !== $this->operatingProvince) {
            $res['operating_province'] = $this->operatingProvince;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskTags) {
            $res['risk_tags'] = $this->riskTags;
        }
        if (null !== $this->riskTagDetails) {
            $res['risk_tag_details'] = [];
            if (null !== $this->riskTagDetails && \is_array($this->riskTagDetails)) {
                $n = 0;
                foreach ($this->riskTagDetails as $item) {
                    $res['risk_tag_details'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->riskTagIds) {
            $res['risk_tag_ids'] = $this->riskTagIds;
        }
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopStarCompanyInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['categories'])) {
            if (!empty($map['categories'])) {
                $model->categories = $map['categories'];
            }
        }
        if (isset($map['operating_place'])) {
            $model->operatingPlace = $map['operating_place'];
        }
        if (isset($map['operating_province'])) {
            $model->operatingProvince = $map['operating_province'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['risk_tags'])) {
            if (!empty($map['risk_tags'])) {
                $model->riskTags = $map['risk_tags'];
            }
        }
        if (isset($map['risk_tag_details'])) {
            if (!empty($map['risk_tag_details'])) {
                $model->riskTagDetails = [];
                $n                     = 0;
                foreach ($map['risk_tag_details'] as $item) {
                    $model->riskTagDetails[$n++] = null !== $item ? RtopRiskTag::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['risk_tag_ids'])) {
            if (!empty($map['risk_tag_ids'])) {
                $model->riskTagIds = $map['risk_tag_ids'];
            }
        }
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }

        return $model;
    }
}
