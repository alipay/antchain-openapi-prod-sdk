<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopCompanyRiskInfo extends Model
{
    // 区域类型
    /**
     * @example place_type
     *
     * @var string
     */
    public $placeType;

    // 区域
    /**
     * @example 天津市
     *
     * @var string
     */
    public $placeName;

    // 企业唯一id
    /**
     * @example mct_one_id
     *
     * @var string
     */
    public $mctOneId;

    // 企业统一社会信用代码
    /**
     * @example uc_code
     *
     * @var string
     */
    public $ucCode;

    // 工商注册号
    /**
     * @example reg_no
     *
     * @var string
     */
    public $regNo;

    // 组织机构代码
    /**
     * @example org_code
     *
     * @var string
     */
    public $orgCode;

    // 企业名
    /**
     * @example org_name
     *
     * @var string
     */
    public $orgName;

    // 风险评分
    /**
     * @example risk_score
     *
     * @var string
     */
    public $riskScore;

    // 风险变化程度排序，根据分值波动大小，标签变更次数排序
    /**
     * @example risk_shift_rank
     *
     * @var string
     */
    public $riskShiftRank;

    // 风险定性
    /**
     * @example risk_type
     *
     * @var string
     */
    public $riskType;

    // 风险标签id列表
    /**
     * @example
     *
     * @var string[]
     */
    public $riskTagsId;

    // 线索
    /**
     * @example tags_clue
     *
     * @var string
     */
    public $tagsClue;

    // 风险线索明细
    /**
     * @example tags_clue_detail
     *
     * @var string
     */
    public $tagsClueDetail;
    protected $_name = [
        'placeType'      => 'place_type',
        'placeName'      => 'place_name',
        'mctOneId'       => 'mct_one_id',
        'ucCode'         => 'uc_code',
        'regNo'          => 'reg_no',
        'orgCode'        => 'org_code',
        'orgName'        => 'org_name',
        'riskScore'      => 'risk_score',
        'riskShiftRank'  => 'risk_shift_rank',
        'riskType'       => 'risk_type',
        'riskTagsId'     => 'risk_tags_id',
        'tagsClue'       => 'tags_clue',
        'tagsClueDetail' => 'tags_clue_detail',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->placeType) {
            $res['place_type'] = $this->placeType;
        }
        if (null !== $this->placeName) {
            $res['place_name'] = $this->placeName;
        }
        if (null !== $this->mctOneId) {
            $res['mct_one_id'] = $this->mctOneId;
        }
        if (null !== $this->ucCode) {
            $res['uc_code'] = $this->ucCode;
        }
        if (null !== $this->regNo) {
            $res['reg_no'] = $this->regNo;
        }
        if (null !== $this->orgCode) {
            $res['org_code'] = $this->orgCode;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->riskScore) {
            $res['risk_score'] = $this->riskScore;
        }
        if (null !== $this->riskShiftRank) {
            $res['risk_shift_rank'] = $this->riskShiftRank;
        }
        if (null !== $this->riskType) {
            $res['risk_type'] = $this->riskType;
        }
        if (null !== $this->riskTagsId) {
            $res['risk_tags_id'] = $this->riskTagsId;
        }
        if (null !== $this->tagsClue) {
            $res['tags_clue'] = $this->tagsClue;
        }
        if (null !== $this->tagsClueDetail) {
            $res['tags_clue_detail'] = $this->tagsClueDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopCompanyRiskInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['place_type'])) {
            $model->placeType = $map['place_type'];
        }
        if (isset($map['place_name'])) {
            $model->placeName = $map['place_name'];
        }
        if (isset($map['mct_one_id'])) {
            $model->mctOneId = $map['mct_one_id'];
        }
        if (isset($map['uc_code'])) {
            $model->ucCode = $map['uc_code'];
        }
        if (isset($map['reg_no'])) {
            $model->regNo = $map['reg_no'];
        }
        if (isset($map['org_code'])) {
            $model->orgCode = $map['org_code'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['risk_score'])) {
            $model->riskScore = $map['risk_score'];
        }
        if (isset($map['risk_shift_rank'])) {
            $model->riskShiftRank = $map['risk_shift_rank'];
        }
        if (isset($map['risk_type'])) {
            $model->riskType = $map['risk_type'];
        }
        if (isset($map['risk_tags_id'])) {
            if (!empty($map['risk_tags_id'])) {
                $model->riskTagsId = $map['risk_tags_id'];
            }
        }
        if (isset($map['tags_clue'])) {
            $model->tagsClue = $map['tags_clue'];
        }
        if (isset($map['tags_clue_detail'])) {
            $model->tagsClueDetail = $map['tags_clue_detail'];
        }

        return $model;
    }
}
