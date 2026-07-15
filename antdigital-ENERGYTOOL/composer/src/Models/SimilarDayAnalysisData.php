<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

use AntChain\ENERGYTOOL\Models\SimilarFeatureData;

class SimilarDayAnalysisData extends Model {
    protected $_name = [
        'comSimilarValue' => 'com_similar_value',
        'featureSimilarValue' => 'feature_similar_value',
        'similarFeatureData' => 'similar_feature_data',
    ];
    public function validate() {
        Model::validateRequired('comSimilarValue', $this->comSimilarValue, true);
        Model::validateRequired('featureSimilarValue', $this->featureSimilarValue, true);
        Model::validateRequired('similarFeatureData', $this->similarFeatureData, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->comSimilarValue) {
            $res['com_similar_value'] = $this->comSimilarValue;
        }
        if (null !== $this->featureSimilarValue) {
            $res['feature_similar_value'] = $this->featureSimilarValue;
        }
        if (null !== $this->similarFeatureData) {
            $res['similar_feature_data'] = [];
            if(null !== $this->similarFeatureData && is_array($this->similarFeatureData)){
                $n = 0;
                foreach($this->similarFeatureData as $item){
                    $res['similar_feature_data'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SimilarDayAnalysisData
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['com_similar_value'])){
            $model->comSimilarValue = $map['com_similar_value'];
        }
        if(isset($map['feature_similar_value'])){
            $model->featureSimilarValue = $map['feature_similar_value'];
        }
        if(isset($map['similar_feature_data'])){
            if(!empty($map['similar_feature_data'])){
                $model->similarFeatureData = [];
                $n = 0;
                foreach($map['similar_feature_data'] as $item) {
                    $model->similarFeatureData[$n++] = null !== $item ? SimilarFeatureData::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    // 综合相似度，单位%
    /**
     * @example 10.0
     * @var string
     */
    public $comSimilarValue;

    // 特征相似度，单位%
    /**
     * @example 10.0
     * @var string
     */
    public $featureSimilarValue;

    // 特征数据列表
    /**
     * @example 
     * @var SimilarFeatureData[]
     */
    public $similarFeatureData;

}
