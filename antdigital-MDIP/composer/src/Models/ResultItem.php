<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\MDIP\Models;

use AlibabaCloud\Tea\Model;

class ResultItem extends Model {
    protected $_name = [
        'dataId' => 'data_id',
        'score' => 'score',
        'featureJson' => 'feature_json',
        'status' => 'status',
        'scoreJson' => 'score_json',
    ];
    public function validate() {
        Model::validateRequired('dataId', $this->dataId, true);
        Model::validateRequired('score', $this->score, true);
        Model::validateRequired('scoreJson', $this->scoreJson, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->dataId) {
            $res['data_id'] = $this->dataId;
        }
        if (null !== $this->score) {
            $res['score'] = $this->score;
        }
        if (null !== $this->featureJson) {
            $res['feature_json'] = $this->featureJson;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->scoreJson) {
            $res['score_json'] = $this->scoreJson;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ResultItem
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['data_id'])){
            $model->dataId = $map['data_id'];
        }
        if(isset($map['score'])){
            $model->score = $map['score'];
        }
        if(isset($map['feature_json'])){
            $model->featureJson = $map['feature_json'];
        }
        if(isset($map['status'])){
            $model->status = $map['status'];
        }
        if(isset($map['score_json'])){
            $model->scoreJson = $map['score_json'];
        }
        return $model;
    }
    // dataId
    /**
     * @example 46052e46721417297df682ef88a8ab91
     * @var string
     */
    public $dataId;

    // 分值
    /**
     * @example 0.32223
     * @var string
     */
    public $score;

    // 特征值
    /**
     * @example {"feature1":0.223,"feature2":0.33,"feature3":0.323}
     * @var string
     */
    public $featureJson;

    // 单调样本数据处理结果
    // 初始化/处理中/成功/失败
    /**
     * @example INIT/PROCESS/SUCCESS/FAIL
     * @var string
     */
    public $status;

    // 各个子分
    /**
     * @example {"score1":0.22233,"score2":0.34234,"score3":0.34343}
     * @var string
     */
    public $scoreJson;

}
