<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\YUQING\Models;

use AlibabaCloud\Tea\Model;

class SaveAnalysisSubmitRequest extends Model
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

    // 分析类型
    /**
     * @var string
     */
    public $analyseType;

    // 查询条件
    /**
     * @var SearchCondition
     */
    public $searchCondition;

    // team_hash_id
    /**
     * @var string
     */
    public $teamHashId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'analyseType'       => 'analyse_type',
        'searchCondition'   => 'search_condition',
        'teamHashId'        => 'team_hash_id',
    ];

    public function validate()
    {
        Model::validateRequired('analyseType', $this->analyseType, true);
        Model::validateRequired('searchCondition', $this->searchCondition, true);
        Model::validateRequired('teamHashId', $this->teamHashId, true);
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
        if (null !== $this->analyseType) {
            $res['analyse_type'] = $this->analyseType;
        }
        if (null !== $this->searchCondition) {
            $res['search_condition'] = null !== $this->searchCondition ? $this->searchCondition->toMap() : null;
        }
        if (null !== $this->teamHashId) {
            $res['team_hash_id'] = $this->teamHashId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return SaveAnalysisSubmitRequest
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
        if (isset($map['analyse_type'])) {
            $model->analyseType = $map['analyse_type'];
        }
        if (isset($map['search_condition'])) {
            $model->searchCondition = SearchCondition::fromMap($map['search_condition']);
        }
        if (isset($map['team_hash_id'])) {
            $model->teamHashId = $map['team_hash_id'];
        }

        return $model;
    }
}
