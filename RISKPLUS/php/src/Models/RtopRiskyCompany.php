<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRiskyCompany extends Model {
    protected $_name = [
        'changeLevel' => 'change_level',
        'changeScore' => 'change_score',
        'companyId' => 'company_id',
        'dataTime' => 'data_time',
        'headRegisterPlace' => 'head_register_place',
        'newAddedTime' => 'new_added_time',
    ];
    public function validate() {
        Model::validateRequired('changeLevel', $this->changeLevel, true);
        Model::validateRequired('changeScore', $this->changeScore, true);
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('dataTime', $this->dataTime, true);
        Model::validateRequired('headRegisterPlace', $this->headRegisterPlace, true);
        Model::validateRequired('newAddedTime', $this->newAddedTime, true);
        Model::validatePattern('newAddedTime', $this->newAddedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]');
    }
    public function toMap() {
        $res = [];
        if (null !== $this->changeLevel) {
            $res['change_level'] = $this->changeLevel;
        }
        if (null !== $this->changeScore) {
            $res['change_score'] = $this->changeScore;
        }
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->dataTime) {
            $res['data_time'] = $this->dataTime;
        }
        if (null !== $this->headRegisterPlace) {
            $res['head_register_place'] = $this->headRegisterPlace;
        }
        if (null !== $this->newAddedTime) {
            $res['new_added_time'] = $this->newAddedTime;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return RtopRiskyCompany
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['change_level'])){
            $model->changeLevel = $map['change_level'];
        }
        if(isset($map['change_score'])){
            $model->changeScore = $map['change_score'];
        }
        if(isset($map['company_id'])){
            $model->companyId = $map['company_id'];
        }
        if(isset($map['data_time'])){
            $model->dataTime = $map['data_time'];
        }
        if(isset($map['head_register_place'])){
            $model->headRegisterPlace = $map['head_register_place'];
        }
        if(isset($map['new_added_time'])){
            $model->newAddedTime = $map['new_added_time'];
        }
        return $model;
    }
    // 异动程度
    /**
     * @example 1
     * @var string
     */
    public $changeLevel;

    // 异动分数
    /**
     * @example 1
     * @var string
     */
    public $changeScore;

    // 企业ID
    /**
     * @example 1
     * @var string
     */
    public $companyId;

    // 数据的时间
    /**
     * @example 1
     * @var string
     */
    public $dataTime;

    // 总公司注册地
    /**
     * @example 1
     * @var string
     */
    public $headRegisterPlace;

    // 新增企业的时间
    /**
     * @example 2018-10-10T10:10:00Z
     * @var string
     */
    public $newAddedTime;

}
