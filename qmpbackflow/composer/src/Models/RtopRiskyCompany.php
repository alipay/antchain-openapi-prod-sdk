<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class RtopRiskyCompany extends Model
{
    // 企业ID
    /**
     * @example 1
     *
     * @var string
     */
    public $companyId;

    // 异动分数
    /**
     * @example 1
     *
     * @var string
     */
    public $changeScore;

    // 异动程度
    /**
     * @example 1
     *
     * @var string
     */
    public $changeLevel;

    // 新增企业的时间
    /**
     * @example 2018-10-10T10:10:00Z
     *
     * @var string
     */
    public $newAddedTime;

    // 总公司注册地
    /**
     * @example 1
     *
     * @var string
     */
    public $headRegisterPlace;

    // 数据的时间
    /**
     * @example 1
     *
     * @var string
     */
    public $dataTime;
    protected $_name = [
        'companyId'         => 'company_id',
        'changeScore'       => 'change_score',
        'changeLevel'       => 'change_level',
        'newAddedTime'      => 'new_added_time',
        'headRegisterPlace' => 'head_register_place',
        'dataTime'          => 'data_time',
    ];

    public function validate()
    {
        Model::validateRequired('companyId', $this->companyId, true);
        Model::validateRequired('changeScore', $this->changeScore, true);
        Model::validateRequired('changeLevel', $this->changeLevel, true);
        Model::validateRequired('newAddedTime', $this->newAddedTime, true);
        Model::validateRequired('headRegisterPlace', $this->headRegisterPlace, true);
        Model::validateRequired('dataTime', $this->dataTime, true);
        Model::validatePattern('newAddedTime', $this->newAddedTime, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->companyId) {
            $res['company_id'] = $this->companyId;
        }
        if (null !== $this->changeScore) {
            $res['change_score'] = $this->changeScore;
        }
        if (null !== $this->changeLevel) {
            $res['change_level'] = $this->changeLevel;
        }
        if (null !== $this->newAddedTime) {
            $res['new_added_time'] = $this->newAddedTime;
        }
        if (null !== $this->headRegisterPlace) {
            $res['head_register_place'] = $this->headRegisterPlace;
        }
        if (null !== $this->dataTime) {
            $res['data_time'] = $this->dataTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return RtopRiskyCompany
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['company_id'])) {
            $model->companyId = $map['company_id'];
        }
        if (isset($map['change_score'])) {
            $model->changeScore = $map['change_score'];
        }
        if (isset($map['change_level'])) {
            $model->changeLevel = $map['change_level'];
        }
        if (isset($map['new_added_time'])) {
            $model->newAddedTime = $map['new_added_time'];
        }
        if (isset($map['head_register_place'])) {
            $model->headRegisterPlace = $map['head_register_place'];
        }
        if (isset($map['data_time'])) {
            $model->dataTime = $map['data_time'];
        }

        return $model;
    }
}
