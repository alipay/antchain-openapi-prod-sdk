<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class CheckAistudioModelRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 业务唯一码（可填model_id）
    /**
     * @var string
     */
    public $bizCode;

    // 业务类型（TDI平台填TDI）
    /**
     * @var string
     */
    public $bizType;

    // 模型类型（1：离线模型，2：在线模型，3：既是离线也是在线）
    /**
     * @var int
     */
    public $modelType;

    // 所需要验收服务的list
    // 1. PRESSURE
    // 2. RUNTIMUE
    // 3. SAFETY
    /**
     * @var string
     */
    public $serviceSelector;

    // 离线模型oss路径
    /**
     * @var string
     */
    public $offlineModelPath;

    // 在线模型oss路径
    /**
     * @var string
     */
    public $onlineModelPath;

    // 模型脚本oss路径
    /**
     * @var string
     */
    public $scriptPath;

    // 验证样本（csv格式，包括保留列、特征列和分数）的OSS路径
    /**
     * @var string
     */
    public $samplePath;

    // 验证样本保留列的list
    /**
     * @var string
     */
    public $remainList;

    // 验证样本特征列的list
    /**
     * @var string
     */
    public $featureList;

    // 验证样本分数列
    /**
     * @var string
     */
    public $scoreCol;

    // aistudio docker镜像指定，若未指定，则默认为
    // reg.docker.alibaba-inc.com/aii/aistudio:aistudio-108521006-1633157052-1690290565806
    /**
     * @var string
     */
    public $dockerImage;

    // 在线模型压测核数，默认为1
    /**
     * @var int
     */
    public $pmCore;

    // 在线模型压测内存大小（GB），默认为2
    /**
     * @var int
     */
    public $pmMem;

    // 离线模型批次大小，默认2000
    /**
     * @var int
     */
    public $batchSize;

    // 验证所用样本数，默认50000
    /**
     * @var int
     */
    public $verificationNum;
    protected $_name = [
        'authToken'        => 'auth_token',
        'bizCode'          => 'biz_code',
        'bizType'          => 'biz_type',
        'modelType'        => 'model_type',
        'serviceSelector'  => 'service_selector',
        'offlineModelPath' => 'offline_model_path',
        'onlineModelPath'  => 'online_model_path',
        'scriptPath'       => 'script_path',
        'samplePath'       => 'sample_path',
        'remainList'       => 'remain_list',
        'featureList'      => 'feature_list',
        'scoreCol'         => 'score_col',
        'dockerImage'      => 'docker_image',
        'pmCore'           => 'pm_core',
        'pmMem'            => 'pm_mem',
        'batchSize'        => 'batch_size',
        'verificationNum'  => 'verification_num',
    ];

    public function validate()
    {
        Model::validateRequired('bizCode', $this->bizCode, true);
        Model::validateRequired('bizType', $this->bizType, true);
        Model::validateRequired('modelType', $this->modelType, true);
        Model::validateRequired('serviceSelector', $this->serviceSelector, true);
        Model::validateRequired('scriptPath', $this->scriptPath, true);
        Model::validateRequired('samplePath', $this->samplePath, true);
        Model::validateRequired('remainList', $this->remainList, true);
        Model::validateRequired('featureList', $this->featureList, true);
        Model::validateRequired('scoreCol', $this->scoreCol, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->bizCode) {
            $res['biz_code'] = $this->bizCode;
        }
        if (null !== $this->bizType) {
            $res['biz_type'] = $this->bizType;
        }
        if (null !== $this->modelType) {
            $res['model_type'] = $this->modelType;
        }
        if (null !== $this->serviceSelector) {
            $res['service_selector'] = $this->serviceSelector;
        }
        if (null !== $this->offlineModelPath) {
            $res['offline_model_path'] = $this->offlineModelPath;
        }
        if (null !== $this->onlineModelPath) {
            $res['online_model_path'] = $this->onlineModelPath;
        }
        if (null !== $this->scriptPath) {
            $res['script_path'] = $this->scriptPath;
        }
        if (null !== $this->samplePath) {
            $res['sample_path'] = $this->samplePath;
        }
        if (null !== $this->remainList) {
            $res['remain_list'] = $this->remainList;
        }
        if (null !== $this->featureList) {
            $res['feature_list'] = $this->featureList;
        }
        if (null !== $this->scoreCol) {
            $res['score_col'] = $this->scoreCol;
        }
        if (null !== $this->dockerImage) {
            $res['docker_image'] = $this->dockerImage;
        }
        if (null !== $this->pmCore) {
            $res['pm_core'] = $this->pmCore;
        }
        if (null !== $this->pmMem) {
            $res['pm_mem'] = $this->pmMem;
        }
        if (null !== $this->batchSize) {
            $res['batch_size'] = $this->batchSize;
        }
        if (null !== $this->verificationNum) {
            $res['verification_num'] = $this->verificationNum;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CheckAistudioModelRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['biz_code'])) {
            $model->bizCode = $map['biz_code'];
        }
        if (isset($map['biz_type'])) {
            $model->bizType = $map['biz_type'];
        }
        if (isset($map['model_type'])) {
            $model->modelType = $map['model_type'];
        }
        if (isset($map['service_selector'])) {
            $model->serviceSelector = $map['service_selector'];
        }
        if (isset($map['offline_model_path'])) {
            $model->offlineModelPath = $map['offline_model_path'];
        }
        if (isset($map['online_model_path'])) {
            $model->onlineModelPath = $map['online_model_path'];
        }
        if (isset($map['script_path'])) {
            $model->scriptPath = $map['script_path'];
        }
        if (isset($map['sample_path'])) {
            $model->samplePath = $map['sample_path'];
        }
        if (isset($map['remain_list'])) {
            $model->remainList = $map['remain_list'];
        }
        if (isset($map['feature_list'])) {
            $model->featureList = $map['feature_list'];
        }
        if (isset($map['score_col'])) {
            $model->scoreCol = $map['score_col'];
        }
        if (isset($map['docker_image'])) {
            $model->dockerImage = $map['docker_image'];
        }
        if (isset($map['pm_core'])) {
            $model->pmCore = $map['pm_core'];
        }
        if (isset($map['pm_mem'])) {
            $model->pmMem = $map['pm_mem'];
        }
        if (isset($map['batch_size'])) {
            $model->batchSize = $map['batch_size'];
        }
        if (isset($map['verification_num'])) {
            $model->verificationNum = $map['verification_num'];
        }

        return $model;
    }
}
