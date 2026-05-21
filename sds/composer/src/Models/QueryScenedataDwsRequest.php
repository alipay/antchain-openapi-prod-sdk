<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SDS\Models;

use AlibabaCloud\Tea\Model;

class QueryScenedataDwsRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 任务批次号
    /**
     * @var string
     */
    public $batchNo;

    // 业务类型
    /**
     * @var string
     */
    public $bizType;

    // 维度列表
    /**
     * @var string[]
     */
    public $dimensionList;

    // 度量列表
    /**
     * @var Metric[]
     */
    public $metricList;

    // 过滤条件列表
    /**
     * @var FilterCondition[]
     */
    public $filterConditionList;

    // 页码,默认1
    /**
     * @var int
     */
    public $pageNum;

    // 每页数量,默认50
    /**
     * @var int
     */
    public $pageSize;
    protected $_name = [
        'authToken'           => 'auth_token',
        'productInstanceId'   => 'product_instance_id',
        'batchNo'             => 'batch_no',
        'bizType'             => 'biz_type',
        'dimensionList'       => 'dimension_list',
        'metricList'          => 'metric_list',
        'filterConditionList' => 'filter_condition_list',
        'pageNum'             => 'page_num',
        'pageSize'            => 'page_size',
    ];

    public function validate()
    {
        Model::validateRequired('batchNo', $this->batchNo, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('dimensionList', $this->dimensionList, true);
        Model::validateRequired('metricList', $this->metricList, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->batchNo) {
            $res['batch_no'] = $this->batchNo;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->dimensionList) {
            $res['dimension_list'] = $this->dimensionList;
        }
        if (null !== $this->metricList) {
            $res['metric_list'] = [];
            if (null !== $this->metricList && \is_array($this->metricList)) {
                $n = 0;
                foreach ($this->metricList as $item) {
                    $res['metric_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->filterConditionList) {
            $res['filter_condition_list'] = [];
            if (null !== $this->filterConditionList && \is_array($this->filterConditionList)) {
                $n = 0;
                foreach ($this->filterConditionList as $item) {
                    $res['filter_condition_list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryScenedataDwsRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['batch_no'])) {
            $model->batchNo = $map['batch_no'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['dimension_list'])) {
            if (!empty($map['dimension_list'])) {
                $model->dimensionList = $map['dimension_list'];
            }
        }
        if (isset($map['metric_list'])) {
            if (!empty($map['metric_list'])) {
                $model->metricList = [];
                $n                 = 0;
                foreach ($map['metric_list'] as $item) {
                    $model->metricList[$n++] = null !== $item ? Metric::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['filter_condition_list'])) {
            if (!empty($map['filter_condition_list'])) {
                $model->filterConditionList = [];
                $n                          = 0;
                foreach ($map['filter_condition_list'] as $item) {
                    $model->filterConditionList[$n++] = null !== $item ? FilterCondition::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }

        return $model;
    }
}
