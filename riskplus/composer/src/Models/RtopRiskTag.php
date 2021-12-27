<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRiskTag extends Model
{
    // 标签ID
    /**
     * @example CMN00010
     *
     * @var string
     */
    public $tagId;

    // 标签名称
    /**
     * @example 网站失联
     *
     * @var string
     */
    public $tagName;

    // 标签类型
    /**
     * @example CMN
     *
     * @var string
     */
    public $tagType;

    // 标签文本
    /**
     * @example 网站失联
     *
     * @var string
     */
    public $tagText;

    // 线索概览
    /**
     * @example 企业已列入经营异常名录
     *
     * @var string
     */
    public $tagClue;

    // 线索明细类型
    /**
     * @example 01
     *
     * @var string
     */
    public $clueDetailType;

    // 线索明细
    /**
     * @example 通过登记的住所或者经营场所无法联系
     *
     * @var string
     */
    public $tagClueDetail;
    protected $_name = [
        'tagId'          => 'tag_id',
        'tagName'        => 'tag_name',
        'tagType'        => 'tag_type',
        'tagText'        => 'tag_text',
        'tagClue'        => 'tag_clue',
        'clueDetailType' => 'clue_detail_type',
        'tagClueDetail'  => 'tag_clue_detail',
    ];

    public function validate()
    {
        Model::validateRequired('tagId', $this->tagId, true);
        Model::validateRequired('tagName', $this->tagName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }
        if (null !== $this->tagName) {
            $res['tag_name'] = $this->tagName;
        }
        if (null !== $this->tagType) {
            $res['tag_type'] = $this->tagType;
        }
        if (null !== $this->tagText) {
            $res['tag_text'] = $this->tagText;
        }
        if (null !== $this->tagClue) {
            $res['tag_clue'] = $this->tagClue;
        }
        if (null !== $this->clueDetailType) {
            $res['clue_detail_type'] = $this->clueDetailType;
        }
        if (null !== $this->tagClueDetail) {
            $res['tag_clue_detail'] = $this->tagClueDetail;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopRiskTag
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }
        if (isset($map['tag_name'])) {
            $model->tagName = $map['tag_name'];
        }
        if (isset($map['tag_type'])) {
            $model->tagType = $map['tag_type'];
        }
        if (isset($map['tag_text'])) {
            $model->tagText = $map['tag_text'];
        }
        if (isset($map['tag_clue'])) {
            $model->tagClue = $map['tag_clue'];
        }
        if (isset($map['clue_detail_type'])) {
            $model->clueDetailType = $map['clue_detail_type'];
        }
        if (isset($map['tag_clue_detail'])) {
            $model->tagClueDetail = $map['tag_clue_detail'];
        }

        return $model;
    }
}
