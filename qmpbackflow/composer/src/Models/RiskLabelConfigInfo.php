<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RiskLabelConfigInfo extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 线索ID
    /**
     * @example 124
     *
     * @var string
     */
    public $tagId;

    // 标签文本
    /**
     * @example 233444
     *
     * @var string
     */
    public $tagText;

    // 风险维度
    /**
     * @example 风险维度
     *
     * @var string
     */
    public $riskDimensionType;

    // 线索类型
    /**
     * @example 列表
     *
     * @var string
     */
    public $riskDetailType;

    // 趋势图表名
    /**
     * @example XX趋势图
     *
     * @var string
     */
    public $tagTrendChartName;

    // 线索列表表头，英文逗号分隔
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

    // 标记删除
    /**
     * @example 0
     *
     * @var int
     */
    public $isDelete;

    // 创建时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtCreate;

    // 修改时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $gmtModified;

    // 操作人ID
    /**
     * @example 1233
     *
     * @var string
     */
    public $operatorId;
    protected $_name = [
        'id'                 => 'id',
        'tagId'              => 'tag_id',
        'tagText'            => 'tag_text',
        'riskDimensionType'  => 'risk_dimension_type',
        'riskDetailType'     => 'risk_detail_type',
        'tagTrendChartName'  => 'tag_trend_chart_name',
        'tagListHeaders'     => 'tag_list_headers',
        'tagListOrderColumn' => 'tag_list_order_column',
        'tagListOrderType'   => 'tag_list_order_type',
        'isDelete'           => 'is_delete',
        'gmtCreate'          => 'gmt_create',
        'gmtModified'        => 'gmt_modified',
        'operatorId'         => 'operator_id',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('tagId', $this->tagId, true);
        Model::validateRequired('tagText', $this->tagText, true);
        Model::validateRequired('riskDimensionType', $this->riskDimensionType, true);
        Model::validateRequired('riskDetailType', $this->riskDetailType, true);
        Model::validateRequired('tagTrendChartName', $this->tagTrendChartName, true);
        Model::validateRequired('tagListHeaders', $this->tagListHeaders, true);
        Model::validateRequired('tagListOrderColumn', $this->tagListOrderColumn, true);
        Model::validateRequired('tagListOrderType', $this->tagListOrderType, true);
        Model::validateRequired('isDelete', $this->isDelete, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('gmtModified', $this->gmtModified, true);
        Model::validateRequired('operatorId', $this->operatorId, true);
        Model::validatePattern('gmtCreate', $this->gmtCreate, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
        Model::validatePattern('gmtModified', $this->gmtModified, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tagId) {
            $res['tag_id'] = $this->tagId;
        }
        if (null !== $this->tagText) {
            $res['tag_text'] = $this->tagText;
        }
        if (null !== $this->riskDimensionType) {
            $res['risk_dimension_type'] = $this->riskDimensionType;
        }
        if (null !== $this->riskDetailType) {
            $res['risk_detail_type'] = $this->riskDetailType;
        }
        if (null !== $this->tagTrendChartName) {
            $res['tag_trend_chart_name'] = $this->tagTrendChartName;
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
        if (null !== $this->isDelete) {
            $res['is_delete'] = $this->isDelete;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->gmtModified) {
            $res['gmt_modified'] = $this->gmtModified;
        }
        if (null !== $this->operatorId) {
            $res['operator_id'] = $this->operatorId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RiskLabelConfigInfo
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['tag_id'])) {
            $model->tagId = $map['tag_id'];
        }
        if (isset($map['tag_text'])) {
            $model->tagText = $map['tag_text'];
        }
        if (isset($map['risk_dimension_type'])) {
            $model->riskDimensionType = $map['risk_dimension_type'];
        }
        if (isset($map['risk_detail_type'])) {
            $model->riskDetailType = $map['risk_detail_type'];
        }
        if (isset($map['tag_trend_chart_name'])) {
            $model->tagTrendChartName = $map['tag_trend_chart_name'];
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
        if (isset($map['is_delete'])) {
            $model->isDelete = $map['is_delete'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['gmt_modified'])) {
            $model->gmtModified = $map['gmt_modified'];
        }
        if (isset($map['operator_id'])) {
            $model->operatorId = $map['operator_id'];
        }

        return $model;
    }
}
