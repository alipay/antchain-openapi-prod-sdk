<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryWeatherWarningRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'province' => 'province',
        'queryDate' => 'query_date',
        'city' => 'city',
    ];
    public function validate() {
        Model::validateRequired('province', $this->province, true);
        Model::validateRequired('city', $this->city, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->province) {
            $res['province'] = $this->province;
        }
        if (null !== $this->queryDate) {
            $res['query_date'] = $this->queryDate;
        }
        if (null !== $this->city) {
            $res['city'] = $this->city;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWeatherWarningRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['province'])){
            $model->province = $map['province'];
        }
        if(isset($map['query_date'])){
            $model->queryDate = $map['query_date'];
        }
        if(isset($map['city'])){
            $model->city = $map['city'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 省份行政编码
    /**
     * @var string
     */
    public $province;

    // 查询日期，格式：yyyy-MM-dd
    /**
     * @var string
     */
    public $queryDate;

    // 城市行政编码
    /**
     * @var string
     */
    public $city;

}
