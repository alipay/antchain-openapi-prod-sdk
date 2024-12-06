<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\INSURANCE_SAAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDataDisasterRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 行政区域代码
    /**
     * @var string
     */
    public $areaCode;

    // 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
    /**
     * @var string
     */
    public $disasterType;

    // 查询起始日期
    /**
     * @var string
     */
    public $startDate;

    // 查询截止日期
    /**
     * @var string
     */
    public $endDate;
    protected $_name = [
        'authToken'    => 'auth_token',
        'areaCode'     => 'area_code',
        'disasterType' => 'disaster_type',
        'startDate'    => 'start_date',
        'endDate'      => 'end_date',
    ];

    public function validate()
    {
        Model::validateRequired('areaCode', $this->areaCode, true);
        Model::validateRequired('disasterType', $this->disasterType, true);
        Model::validateRequired('startDate', $this->startDate, true);
        Model::validateRequired('endDate', $this->endDate, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->areaCode) {
            $res['area_code'] = $this->areaCode;
        }
        if (null !== $this->disasterType) {
            $res['disaster_type'] = $this->disasterType;
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
     *
     * @return QueryDataDisasterRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['area_code'])) {
            $model->areaCode = $map['area_code'];
        }
        if (isset($map['disaster_type'])) {
            $model->disasterType = $map['disaster_type'];
        }
        if (isset($map['start_date'])) {
            $model->startDate = $map['start_date'];
        }
        if (isset($map['end_date'])) {
            $model->endDate = $map['end_date'];
        }

        return $model;
    }
}
