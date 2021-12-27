<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskLabelInfo extends Model
{
    // 线索明细类型(字段停用)
    /**
     * @example s d d f d f
     *
     * @var string
     */
    public $clueDetailType;

    // odps数据产出时间，冗余字段，业务上不需要，以备错误排查
    /**
     * @example 20190823
     *
     * @var string
     */
    public $dt;

    // 数据产生时间
    /**
     * @example yyyy-MM-dd hh:mm:ss
     *
     * @var string
     */
    public $gmtCreate;

    // 记录唯一ID
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 0-正常 1-删除
    /**
     * @example is_deleted
     *
     * @var int
     */
    public $isDeleted;

    // 企业ID
    /**
     * @example A123445
     *
     * @var string
     */
    public $mctOneId;

    // 操作人ID
    /**
     * @example 123
     *
     * @var string
     */
    public $operatorId;

    // 操作类型
    // add、delete、update
    /**
     * @example add
     *
     * @var string
     */
    public $opType;

    // 企业名称
    /**
     * @example 东方财富公司
     *
     * @var string
     */
    public $orgName;

    // 线索类型
    /**
     * @example 列表
     *
     * @var string
     */
    public $riskDetailType;

    // 风险维度
    //
    /**
     * @example 风险维度
     *
     * @var string
     */
    public $riskDimensionType;

    // 线索概览
    /**
     * @example s d f g
     *
     * @var string
     */
    public $tagClue;

    // 线索明细
    /**
     * @example 11
     *
     * @var string
     */
    public $tagClueDetail;

    // 标签ID
    /**
     * @example NM23
     *
     * @var string
     */
    public $tagId;

    // 线索列表表头，英文逗号分隔
    //
    /**
     * @example 日期
     *
     * @var string
     */
    public $tagListHeaders;

    // 标签列表，排序字段
    /**
     * @example 日期
     *
     * @var string
     */
    public $tagListOrderColumn;

    // 标签列表排序方式
    /**
     * @example 顺序
     *
     * @var string
     */
    public $tagListOrderType;

    // 标签文本
    /**
     * @example 1233
     *
     * @var string
     */
    public $tagText;

    // 趋势图表名
    /**
     * @example XX趋势图
     *
     * @var string
     */
    public $tagTrendChartName;

    // 数据同步到公有云时间(业务上赋值当天)
    /**
     * @example 20190823
     *
     * @var string
     */
    public $updateDate;
    protected $_name = [
        'clueDetailType'     => 'clue_detail_type',
        'dt'                 => 'dt',
        'gmtCreate'          => 'gmt_create',
        'id'                 => 'id',
        'isDeleted'          => 'is_deleted',
        'mctOneId'           => 'mct_one_id',
        'operatorId'         => 'operator_id',
        'opType'             => 'op_type',
        'orgName'            => 'org_name',
        'riskDetailType'     => 'risk_detail_type',
        'riskDimensionType'  => 'risk_dimension_type',
        'tagClue'            => 'tag_clue',
        'tagClueDetail'      => 'tag_clue_detail',
        'tagId'              => 'tag_id',
        'tagListHeaders'     => 'tag_list_headers',
        'tagListOrderColumn' => 'tag_list_order_column',
        'tagListOrderType'   => 'tag_list_order_type',
        'tagText'            => 'tag_text',
        'tagTrendChartName'  => 'tag_trend_chart_name',
        'updateDate'         => 'update_date',
    ];

    public function validate()
    {
        Model::validateRequired('clueDetailType', $this->clueDetailType, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('isDeleted', $this->isDeleted, true);
        Model::validateRequired('mctOneId', $this->mctOneId, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validateRequired('opType', $this->opType, true);
        Model::validateRequired('orgName', $this->orgName, true);
        Model::validateRequired('riskDetailType', $this->riskDetailType, true);
        Model::validateRequired('riskDimensionType', $this->riskDimensionType, true);
        Model::validateRequired('tagClue', $this->tagClue, true);
        Model::validateRequired('tagClueDetail', $this->tagClueDetail, true);
        Model::validateRequired('tagId', $this->tagId, true);
        Model::validateRequired('tagListHeaders', $this->tagListHeaders, true);
        Model::validateRequired('tagListOrderColumn', $this->tagListOrderColumn, true);
        Model::validateRequired('tagListOrderType', $this->tagListOrderType, true);
        Model::validateRequired('tagText', $this->tagText, true);
        Model::validateRequired('tagTrendChartName', $this->tagTrendChartName, true);
        Model::validateRequired('updateDate', $this->updateDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->clueDetailType) {
            $res['clue_detail_type'] = $this->clueDetailType;
        }
        if (null !== $this->dt) {
            $res['dt'] = $this->dt;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->isDeleted) {
            $res['is_deleted'] = $this->isDeleted;
        }
        if (null !== $this->mctOneId) {
            $res['mct_one_id'] = $this->mctOneId;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }
        if (null !== $this->opType) {
            $res['op_type'] = $this->opType;
        }
        if (null !== $this->orgName) {
            $res['org_name'] = $this->orgName;
        }
        if (null !== $this->riskDetailType) {
            $res['risk_detail_type'] = $this->riskDetailType;
        }
        if (null !== $this->riskDimensionType) {
            $res['risk_dimension_type'] = $this->riskDimensionType;
        }
        if (null !== $this->tagClue) {
            $res['tag_clue'] = $this->tagClue;
        }
        if (null !== $this->tagClueDetail) {
            $res['tag_clue_detail'] = $this->tagClueDetail;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }
        if (null !== $this->tagListHeaders) {
            $res['tag_list_headers'] = $this->tagListHeaders;
        }
        if (null !== $this->tagListOrderColumn) {
            $res['tag_list_order_column'] = $this->tagListOrderColumn;
        }
        if (null !== $this->tagListOrderType) {
            $res['tag_list_order_type'] = $this->tagListOrderType;
        }
        if (null !== $this->tagText) {
            $res['tag_text'] = $this->tagText;
        }
        if (null !== $this->tagTrendChartName) {
            $res['tag_trend_chart_name'] = $this->tagTrendChartName;
        }
        if (null !== $this->updateDate) {
            $res['update_date'] = $this->updateDate;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskLabelInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['clue_detail_type'])) {
            $model->clueDetailType = $map['clue_detail_type'];
        }
        if (isset($map['dt'])) {
            $model->dt = $map['dt'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['is_deleted'])) {
            $model->isDeleted = $map['is_deleted'];
        }
        if (isset($map['mct_one_id'])) {
            $model->mctOneId = $map['mct_one_id'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }
        if (isset($map['op_type'])) {
            $model->opType = $map['op_type'];
        }
        if (isset($map['org_name'])) {
            $model->orgName = $map['org_name'];
        }
        if (isset($map['risk_detail_type'])) {
            $model->riskDetailType = $map['risk_detail_type'];
        }
        if (isset($map['risk_dimension_type'])) {
            $model->riskDimensionType = $map['risk_dimension_type'];
        }
        if (isset($map['tag_clue'])) {
            $model->tagClue = $map['tag_clue'];
        }
        if (isset($map['tag_clue_detail'])) {
            $model->tagClueDetail = $map['tag_clue_detail'];
        }
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }
        if (isset($map['tag_list_headers'])) {
            $model->tagListHeaders = $map['tag_list_headers'];
        }
        if (isset($map['tag_list_order_column'])) {
            $model->tagListOrderColumn = $map['tag_list_order_column'];
        }
        if (isset($map['tag_list_order_type'])) {
            $model->tagListOrderType = $map['tag_list_order_type'];
        }
        if (isset($map['tag_text'])) {
            $model->tagText = $map['tag_text'];
        }
        if (isset($map['tag_trend_chart_name'])) {
            $model->tagTrendChartName = $map['tag_trend_chart_name'];
        }
        if (isset($map['update_date'])) {
            $model->updateDate = $map['update_date'];
        }

        return $model;
    }
}
