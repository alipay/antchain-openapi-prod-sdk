<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

class SummaryAgenticnexusDashboardRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'module' => 'module',
        'input' => 'input',
        'rawData' => 'raw_data',
        'date' => 'date',
    ];
    public function validate() {
        Model::validateRequired('module', $this->module, true);
        Model::validateRequired('input', $this->input, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->module) {
            $res['module'] = $this->module;
        }
        if (null !== $this->input) {
            $res['input'] = $this->input;
        }
        if (null !== $this->rawData) {
            $res['raw_data'] = $this->rawData;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SummaryAgenticnexusDashboardRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['module'])){
            $model->module = $map['module'];
        }
        if(isset($map['input'])){
            $model->input = $map['input'];
        }
        if(isset($map['raw_data'])){
            $model->rawData = $map['raw_data'];
        }
        if(isset($map['date'])){
            $model->date = $map['date'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 目标领域: PREFILTER 前筛 / PURCHASE 采买 / DISTRIBUTION 分发 / SENTINEL 预警
    /**
     * @var string
     */
    public $module;

    // 待总结的输入内容（该领域指标/观察文本）
    /**
     * @var string
     */
    public $input;

    // 原始数据 JSON 字符串（补充上下文）
    /**
     * @var string
     */
    public $rawData;

    // 数据日期 yyyyMMdd，仅作上下文/记录,默认当天
    /**
     * @var string
     */
    public $date;

}
