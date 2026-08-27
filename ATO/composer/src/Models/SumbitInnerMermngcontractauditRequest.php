<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ATO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ATO\Models\FileInfo;

class SumbitInnerMermngcontractauditRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'traceId' => 'trace_id',
        'tenantId' => 'tenant_id',
        'buIdList' => 'bu_id_list',
        'contractType' => 'contract_type',
        'contractFile' => 'contract_file',
        'stance' => 'stance',
        'businessGoals' => 'business_goals',
        'aiBaselineFlag' => 'ai_baseline_flag',
    ];
    public function validate() {
        Model::validateRequired('traceId', $this->traceId, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('buIdList', $this->buIdList, true);
        Model::validateRequired('contractType', $this->contractType, true);
        Model::validateRequired('contractFile', $this->contractFile, true);
        Model::validateRequired('stance', $this->stance, true);
        Model::validateRequired('aiBaselineFlag', $this->aiBaselineFlag, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->traceId) {
            $res['trace_id'] = $this->traceId;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->buIdList) {
            $res['bu_id_list'] = $this->buIdList;
        }
        if (null !== $this->contractType) {
            $res['contract_type'] = $this->contractType;
        }
        if (null !== $this->contractFile) {
            $res['contract_file'] = null !== $this->contractFile ? $this->contractFile->toMap() : null;
        }
        if (null !== $this->stance) {
            $res['stance'] = $this->stance;
        }
        if (null !== $this->businessGoals) {
            $res['business_goals'] = $this->businessGoals;
        }
        if (null !== $this->aiBaselineFlag) {
            $res['ai_baseline_flag'] = $this->aiBaselineFlag;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SumbitInnerMermngcontractauditRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['trace_id'])){
            $model->traceId = $map['trace_id'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['bu_id_list'])){
            if(!empty($map['bu_id_list'])){
                $model->buIdList = $map['bu_id_list'];
            }
        }
        if(isset($map['contract_type'])){
            $model->contractType = $map['contract_type'];
        }
        if(isset($map['contract_file'])){
            $model->contractFile = FileInfo::fromMap($map['contract_file']);
        }
        if(isset($map['stance'])){
            $model->stance = $map['stance'];
        }
        if(isset($map['business_goals'])){
            $model->businessGoals = $map['business_goals'];
        }
        if(isset($map['ai_baseline_flag'])){
            $model->aiBaselineFlag = $map['ai_baseline_flag'];
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

    // traceid
    /**
     * @var string
     */
    public $traceId;

    // 租户id
    /**
     * @var string
     */
    public $tenantId;

    // 业务单元Id列表
    /**
     * @var string[]
     */
    public $buIdList;

    // 合同类型
    /**
     * @var string
     */
    public $contractType;

    // 待审核合同信息
    /**
     * @var FileInfo
     */
    public $contractFile;

    // 审核立场
    /**
     * @var string
     */
    public $stance;

    // 业务目标
    /**
     * @var string
     */
    public $businessGoals;

    // 是否开启 AI 基准线审核,默认 false
    /**
     * @var bool
     */
    public $aiBaselineFlag;

}
