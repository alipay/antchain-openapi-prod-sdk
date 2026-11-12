<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\CORLAB\Models;

use AlibabaCloud\Tea\Model;
use GuzzleHttp\Psr7\Stream;

class CreateFeatureminingPlanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'dataSource' => 'data_source',
        'riskDomain' => 'risk_domain',
        'riskCategory' => 'risk_category',
        'riskScene' => 'risk_scene',
        'demandDetail' => 'demand_detail',
        'dependTables' => 'depend_tables',
        'runHours' => 'run_hours',
        'runMinutes' => 'run_minutes',
        'featureNum' => 'feature_num',
        'iv' => 'iv',
        'fileId' => 'file_id',
        'customerGroup' => 'customer_group',
        'modelEvaluate' => 'model_evaluate',
        'basicModel' => 'basic_model',
        'baseLineIds' => 'base_line_ids',
        'direction' => 'direction',
        'startDate' => 'start_date',
        'endDate' => 'end_date',
    ];
    public function validate() {
        Model::validateRequired('dataSource', $this->dataSource, true);
        Model::validateRequired('riskDomain', $this->riskDomain, true);
        Model::validateRequired('riskCategory', $this->riskCategory, true);
        Model::validateRequired('riskScene', $this->riskScene, true);
        Model::validateRequired('dependTables', $this->dependTables, true);
        Model::validateRequired('runHours', $this->runHours, true);
        Model::validateRequired('featureNum', $this->featureNum, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('modelEvaluate', $this->modelEvaluate, true);
        Model::validateRequired('basicModel', $this->basicModel, true);
        Model::validateRequired('baseLineIds', $this->baseLineIds, true);
        Model::validateRequired('startDate', $this->startDate, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->dataSource) {
            $res['data_source'] = $this->dataSource;
        }
        if (null !== $this->riskDomain) {
            $res['risk_domain'] = $this->riskDomain;
        }
        if (null !== $this->riskCategory) {
            $res['risk_category'] = $this->riskCategory;
        }
        if (null !== $this->riskScene) {
            $res['risk_scene'] = $this->riskScene;
        }
        if (null !== $this->demandDetail) {
            $res['demand_detail'] = $this->demandDetail;
        }
        if (null !== $this->dependTables) {
            $res['depend_tables'] = $this->dependTables;
        }
        if (null !== $this->runHours) {
            $res['run_hours'] = $this->runHours;
        }
        if (null !== $this->runMinutes) {
            $res['run_minutes'] = $this->runMinutes;
        }
        if (null !== $this->featureNum) {
            $res['feature_num'] = $this->featureNum;
        }
        if (null !== $this->iv) {
            $res['iv'] = $this->iv;
        }
        if (null !== $this->fileObject) {
            $res['fileObject'] = $this->fileObject;
        }
        if (null !== $this->fileObjectName) {
            $res['fileObjectName'] = $this->fileObjectName;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->customerGroup) {
            $res['customer_group'] = $this->customerGroup;
        }
        if (null !== $this->modelEvaluate) {
            $res['model_evaluate'] = $this->modelEvaluate;
        }
        if (null !== $this->basicModel) {
            $res['basic_model'] = $this->basicModel;
        }
        if (null !== $this->baseLineIds) {
            $res['base_line_ids'] = $this->baseLineIds;
        }
        if (null !== $this->direction) {
            $res['direction'] = $this->direction;
        }
        if (null !== $this->startDate) {
            $res['start_date'] = $this->startDate;
        }
        if (null !== $this->endDate) {
            $res['end_date'] = $this->endDate;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateFeatureminingPlanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['data_source'])){
            $model->dataSource = $map['data_source'];
        }
        if(isset($map['risk_domain'])){
            $model->riskDomain = $map['risk_domain'];
        }
        if(isset($map['risk_category'])){
            $model->riskCategory = $map['risk_category'];
        }
        if(isset($map['risk_scene'])){
            $model->riskScene = $map['risk_scene'];
        }
        if(isset($map['demand_detail'])){
            $model->demandDetail = $map['demand_detail'];
        }
        if(isset($map['depend_tables'])){
            $model->dependTables = $map['depend_tables'];
        }
        if(isset($map['run_hours'])){
            $model->runHours = $map['run_hours'];
        }
        if(isset($map['run_minutes'])){
            $model->runMinutes = $map['run_minutes'];
        }
        if(isset($map['feature_num'])){
            $model->featureNum = $map['feature_num'];
        }
        if(isset($map['iv'])){
            $model->iv = $map['iv'];
        }
        if(isset($map['fileObject'])){
            $model->fileObject = $map['fileObject'];
        }
        if(isset($map['fileObjectName'])){
            $model->fileObjectName = $map['fileObjectName'];
        }
        if(isset($map['file_id'])){
            $model->fileId = $map['file_id'];
        }
        if(isset($map['customer_group'])){
            $model->customerGroup = $map['customer_group'];
        }
        if(isset($map['model_evaluate'])){
            $model->modelEvaluate = $map['model_evaluate'];
        }
        if(isset($map['basic_model'])){
            $model->basicModel = $map['basic_model'];
        }
        if(isset($map['base_line_ids'])){
            if(!empty($map['base_line_ids'])){
                $model->baseLineIds = $map['base_line_ids'];
            }
        }
        if(isset($map['direction'])){
            $model->direction = $map['direction'];
        }
        if(isset($map['start_date'])){
            $model->startDate = $map['start_date'];
        }
        if(isset($map['end_date'])){
            $model->endDate = $map['end_date'];
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

    // 数据来源
    /**
     * @var string
     */
    public $dataSource;

    // 业务领域
    /**
     * @var string
     */
    public $riskDomain;

    // 业务版块
    /**
     * @var string
     */
    public $riskCategory;

    // 业务场景
    /**
     * @var string
     */
    public $riskScene;

    // agent目标导向
    /**
     * @var string
     */
    public $demandDetail;

    // 交易表/浏览表
    /**
     * @var string
     */
    public $dependTables;

    // 运行小时数
    /**
     * @var int
     */
    public $runHours;

    // 15
    /**
     * @var int
     */
    public $runMinutes;

    // 100
    /**
     * @var int
     */
    public $featureNum;

    // iv要求
    /**
     * @var string
     */
    public $iv;

    // 1702
    /**
     * @description 待上传文件
     * @var Stream
     */
    public $fileObject;

    /**
     * @description 待上传文件名
     * @var string
     */
    public $fileObjectName;

    /**
     * @var int
     */
    public $fileId;

    // 客群
    /**
     * @var string
     */
    public $customerGroup;

    // 是否进行模型评估
    /**
     * @var bool
     */
    public $modelEvaluate;

    // 基模选择
    /**
     * @var string
     */
    public $basicModel;

    // baseLine信息
    /**
     * @var int[]
     */
    public $baseLineIds;

    // 结果判断，后期使用
    /**
     * @var string
     */
    public $direction;

    // 计划开始时间
    /**
     * @var string
     */
    public $startDate;

    // 结束时间
    /**
     * @var string
     */
    public $endDate;

}
